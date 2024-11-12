package segregaciondeinterfaces;

public interface SesionUsuario {

    void iniciarSesion(Usuario usuario);

    void cerrarSesion(Usuario usuario);
}

// Por normal general con clases usuario servicio, se deben implementar interfaces en vez de enfocarse en clases concretas
// ya que las interfaces permiten una mayor flexibilidad y escalabilidad en el código.
// y estas interfaces pueden ser implementadas por clases concretas que se encarguen de la lógica de negocio.
// teniendo en cuenta que las interfaces deben ser lo más generales posibles para que puedan ser implementadas por cualquier clase concreta.

