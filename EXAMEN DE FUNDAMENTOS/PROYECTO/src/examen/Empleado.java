package examen;

public class Empleado extends Trabajador
{
    private String cargo;
    
 public Empleado(String nombres, String apellidos, int dni, String tipo, String cargo)
 {
    super(nombres,apellidos,dni,tipo);
    
    this.cargo =cargo;
 }
public String getCargo() 
 {
    return cargo;
 }
 public void setCargo(String cargo)
{
    this.cargo=cargo;
}
public void listarEmpleado()
    {
    System.out.println ("\nnombres Empleado: "+this.getNombres()+ 
    "\nApellidos: " +this.getApellidos()+
    "\nDni:  "+this.getDni()+
    "\nTipo: "+this.getTipo()+
    "\nCargo: "+this.getCargo());
  }
}
 
    

