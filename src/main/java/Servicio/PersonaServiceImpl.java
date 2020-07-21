package Servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

import Domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaService {

    @Override
    public List<Persona> obtenerPersonas() {
        List<Persona> personas = new ArrayList<>();
        Persona persona1 = new Persona("Sergio", "Villalba", "sergio@gmail.com", "3453");
        Persona persona2 = new Persona("Marisol", "Díaz", "srtref@gmail,com", "234234");
        personas.add(persona1);
        personas.add(persona2);
        return personas;
    }
    
}