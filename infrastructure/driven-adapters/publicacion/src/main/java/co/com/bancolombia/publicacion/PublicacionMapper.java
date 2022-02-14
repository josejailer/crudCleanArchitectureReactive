package co.com.bancolombia.publicacion;

import co.com.bancolombia.model.publicacion.Publicacion;
import co.com.bancolombia.publicacion.Entities.PublicacionEntity;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface PublicacionMapper {
    Publicacion toModel(PublicacionEntity publicacionEntity);
    PublicacionEntity toData(Publicacion publicacion);

}
