package examen;

public class Main {
    public static void main(String args[])
    {
        DocenteControlador  docenteControlador = new DocenteControlador(2);
        docenteControlador.agregar("alejandra","Perez", 56985666, "docente", 2);
        docenteControlador.agregar("alejandro","Ramirez", 65546672,"docente", 2);
    
        System.out.println("------------- Lista de Docente -------------");
        docenteControlador.listar();
    }
    
}