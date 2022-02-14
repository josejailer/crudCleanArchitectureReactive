package co.com.bancolombia.model.publicacion.gateways;

import co.com.bancolombia.model.publicacion.Publicacion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface PublicacionRepository {
    Mono<Publicacion> create(Publicacion publicacion);
    Flux<Publicacion> getAll();
    Mono<Publicacion> get(long number);
    Mono<Publicacion> update(Publicacion publicacion);
    Mono<Void> delete(long number);
}
