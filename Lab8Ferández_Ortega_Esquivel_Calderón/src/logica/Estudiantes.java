package logica;



public class Estudiantes {
	private String nombre;
    private String cedula;
    private String carrera;
    private double indiceAcademico;
    private String sexo;

    public Estudiantes(String nombre, String cedula, String carrera, double indiceAcademico, String sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.carrera = carrera;
        this.indiceAcademico = indiceAcademico;
        this.sexo = sexo;
    }

    public double getIndiceAcademico() {
        return indiceAcademico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }
}
