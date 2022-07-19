package examen;
public class DocenteControlador 
{   private Docente docente[];

    private int contador;

    public DocenteControlador(int size) {

        this.docente = new Docente[size];

        this.contador = 0;
    }

    public void agregar(String nombres, String apellidos, int dni, String tipo,int horasDeTrabajo) {

        this.docente[this.contador] = new Docente(nombres,apellidos,dni,tipo,horasDeTrabajo);

        this.contador++;
    }
    public void listar()
     {
         for(int i=0; i<this.contador; i++)
          {
             this.docente[i].listarDocente();
}    }    }     
