package Structural.Adapter;

public class Adapter implements Employee {

    private EmployeeJSON instance;

    public Adapter(EmployeeJSON instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getDNI();
    }

    @Override
    public String getName() {
        return instance.getNombre();
    }

    @Override
    public String getLastName() {
        return instance.getApellidos();
    }

    @Override
    public String getEmail() {
        return instance.getGmail();
    }

    public String toString() {
        return "EmployeeBDA [email=" + instance.getGmail() + ", id=" + instance.getDNI() + ", lastName=" + instance.getApellidos() + ", name=" + instance.getNombre() + "]";
    }
    
}
