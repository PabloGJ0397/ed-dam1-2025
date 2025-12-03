package features.listadoClientes;

public class Cliente {
    String nombre;
    String apellidos;
    String NIF;
    String direccion;
    String localidad;
    String provincia;
    String telefono;
    String email;

    // constructor para la clase cliente
    public Cliente(String nombre, String apellidos, String NIF, String direccion, String localidad, String provincia, String telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.telefono = telefono;
        this.email = email;
    }

    // getter and setter para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
