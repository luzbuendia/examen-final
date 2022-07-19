package examen;

public class Docente extends Trabajador
{
    private int horasDeTrabajo;
    
public Docente(String nombres, String apellidos, int dni, String tipo, int horasDeTrabajo)
{
    super(nombres,apellidos,dni,tipo);
    
    this.horasDeTrabajo=horasDeTrabajo;
}
public int getHoras() 
{
    return horasDeTrabajo;
}
public void setCargo(int horasDeTrabajo)
{
    this.horasDeTrabajo=horasDeTrabajo;
}
public void listarDocente()
    {
      System.out.println ("\nnombres de Docente: "+this.getNombres()+ 
    "\nApellidos: " +this.getApellidos()+
    "\nDni:  "+this.getDni()+
    "\nTipo: "+this.getTipo()+
    "\nHoras De trabajo: "+this.getHoras());
    }
}
   
    

