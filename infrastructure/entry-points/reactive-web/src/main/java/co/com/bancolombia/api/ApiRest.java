package co.com.bancolombia.api;
import co.com.bancolombia.model.publicacion.Publicacion;
import co.com.bancolombia.usecase.crudpublicacionservicio.CrudPublicacionServiceUseCase;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import io.swagger.annotations.Api;

import java.util.List;

@RestController
@RequestMapping(value = "/api/publicacion", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Api(tags = "Publicaciones", description = "EnPoints Para la Gestión de Publicaciones" )
public class ApiRest {
    private static  final Logger logger =  LoggerFactory.getLogger(ApiRest.class);

    private final CrudPublicacionServiceUseCase crudPublicacionServiceUseCase;

    @PostMapping()
    public Mono<Publicacion> create(@RequestBody Publicacion publicacion ) {
         logger.info(publicacion.toString());
        return  crudPublicacionServiceUseCase.create(publicacion);
    }

    @GetMapping()
    public Flux<Publicacion> getAll() {
        return  crudPublicacionServiceUseCase.getAll();
    }

    @GetMapping(path = "/{id}")
    public Mono<Publicacion> findById(@PathVariable long id) {
        return  crudPublicacionServiceUseCase.get(id);
    }

    @PutMapping()
    public Mono<Publicacion> update(@RequestBody Publicacion publicacion) {
        return  crudPublicacionServiceUseCase.update(publicacion);
    }

    @DeleteMapping(path = "/{id}")
    public Mono<Void> delete(@PathVariable long id) {
        return  crudPublicacionServiceUseCase.delete(id);
    }
}
