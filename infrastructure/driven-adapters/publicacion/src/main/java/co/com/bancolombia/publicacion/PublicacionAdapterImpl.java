package co.com.bancolombia.publicacion;

import co.com.bancolombia.model.publicacion.Publicacion;
import co.com.bancolombia.model.publicacion.gateways.PublicacionRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
@Repository
@AllArgsConstructor
public class PublicacionAdapterImpl implements PublicacionRepository {
    private PublicacionAdapterRepository publicacionAdapterRepository;
    private PublicacionMapper publicacionMapper;

        @Override
        public Mono<Publicacion> create(Publicacion publicacion) {
            return  publicacionAdapterRepository.save(publicacionMapper.toData(publicacion))
                    .map(publicacionMapper::toModel) ;
        }
        @Override
        public Flux<Publicacion> getAll() {
            return publicacionAdapterRepository.findAll().map(publicacionMapper::toModel);
        }
        @Override
        public Mono<Publicacion> get(long number) {
            return  publicacionAdapterRepository.findById(number).map(publicacionMapper::toModel);
        }
        @Override
        public Mono<Publicacion> update(Publicacion publicacion) {
             return this.publicacionAdapterRepository.findById(publicacion.getId())
                    .flatMap(p -> {
                        p.setContenido(publicacion.getContenido());
                        p.setDescripcion(publicacion.getDescripcion());
                        p.setTitulo(publicacion.getTitulo());
                        return this.publicacionAdapterRepository.save(p);
                     }).map(publicacionMapper::toModel) ;

          /*  return  publicacionAdapterRepository.save(publicacionMapper.toData(publicacion))
                    .map(publicacionMapper::toModel) ;*/
        }
        @Override
        public Mono<Void> delete(long number) {
            return  publicacionAdapterRepository.deleteById(number);
        }

}
