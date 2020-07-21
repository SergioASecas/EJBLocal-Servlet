package Servicio;

import java.util.List;
import javax.ejb.Local;
import Domain.Persona;

@Local
public interface PersonaService {
    
    public List<Persona> obtenerPersonas();

}