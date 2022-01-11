package sspc.gob.mx.psr.dto;

import lombok.Data;
import sspc.gob.mx.psr.model.Municipio;

@Data
public class MunicipioDto {
    public Long id;
    public String nombre;
    public String descripcion;
    private String estado;
    public boolean activo;


    public MunicipioDto(Municipio municipio) {
        this.id = municipio.id;
        this.nombre = municipio.nombre;
        this.descripcion = municipio.descripcion;
        this.estado = municipio.getEstado().getNombre();
        this.activo = municipio.activo;
    }

}
