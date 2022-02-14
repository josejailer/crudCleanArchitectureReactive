package co.com.bancolombia.model.publicacion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Publicacion {
    private long id;
    private  String titulo;
    private  String descripcion;
    private  String contenido;
}