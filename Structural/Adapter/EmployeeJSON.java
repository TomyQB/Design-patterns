package Structural.Adapter;

public class EmployeeJSON {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private String gmail;
    
    public EmployeeJSON(String dni, String nombre, String apellidos, String gmail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.gmail = gmail;
    }

    public String getDNI() {
        return dni;
    }
    public void setDNI(String dni) {
        this.dni = dni;
    }
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
    public String getGmail() {
        return gmail;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

}
