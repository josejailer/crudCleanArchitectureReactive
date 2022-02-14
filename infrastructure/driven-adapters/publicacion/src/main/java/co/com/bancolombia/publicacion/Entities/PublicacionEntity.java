package co.com.bancolombia.publicacion.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;
import javax.persistence.*;
@Data
 @NoArgsConstructor
 @AllArgsConstructor
 @Builder
 @Table("publicaciones")

 public class PublicacionEntity implements Persistable<Long> {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
        private String titulo;
        private String descripcion;
        private String contenido;

    @Override
    public boolean isNew() {
        return true;
    }
}
