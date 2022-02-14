package co.com.bancolombia.publicacion;

import co.com.bancolombia.publicacion.Entities.PublicacionEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PublicacionAdapterRepository  extends ReactiveCrudRepository<PublicacionEntity, Long> {

}
