package examen;

public abstract class Trabajador
{
        protected String nombres;
    
        protected String apellidos;
    
        protected double dni;
    
        protected String tipo;
    
        public Trabajador(String nombres, String apellidos, double dni, String tipo) {
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.dni = dni;
            this.tipo=tipo;
        }
    
        protected String getNombres() {
            return nombres;
        }
    
        protected String getApellidos() {
            return apellidos;
        }
    
        protected double getDni() {
            return dni;
        }
    
        protected String getTipo() {
            return tipo;
        }
    
        public abstract double sueldo();
    
        public abstract double porcentajeComision();
}
    

