package co.com.bancolombia.usecase.crudpublicacionservicio;

import co.com.bancolombia.model.publicacion.Publicacion;
import co.com.bancolombia.model.publicacion.gateways.PublicacionRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@AllArgsConstructor
public class CrudPublicacionServiceUseCase {

    private PublicacionRepository publicacionRepository;

    public  Mono<Publicacion>  create(Publicacion publicacion){
        return  publicacionRepository.create(publicacion);
    }
    public Mono<Publicacion> update(Publicacion publicacion){
        return  publicacionRepository.update(publicacion);
    }
    public Flux<Publicacion> getAll(){
        return  publicacionRepository.getAll();
    }
    public Mono<Publicacion> get(long number) {
        return publicacionRepository.get(number);
    }
    public  Mono<Void> delete(long number) {
        return publicacionRepository.delete(number);
    }
}
