package examen;
public class EmpleadoControlador
 {
    private Empleado empleado[];

    private int contador;

    public EmpleadoControlador(int size) {

        this.empleado = new Empleado[size];

        this.contador = 0;
    }

    public void agregar(String nombres, String apellidos, int dni, String tipo,String cargo) {

        this.empleado[this.contador] = new Empleado(nombres,apellidos,dni,tipo,cargo);

        this.contador++;
    }
    public void listar()
     {
         for(int i=0; i<this.contador; i++)
         {
             this.empleado[i].listarEmpleado();
         }
     }
}
    