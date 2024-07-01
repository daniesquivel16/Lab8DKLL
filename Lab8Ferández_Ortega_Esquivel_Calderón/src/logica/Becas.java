package logica;
import java.util.ArrayList;

public class Becas {
	private static final int MAX_ESTUDIANTES = 100;
    private ArrayList<Estudiantes> estudiantes;

    public Becas() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiantes estudiante) {
        if (estudiantes.size() < MAX_ESTUDIANTES) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("No se puede agregar más estudiantes. Límite alcanzado.");
        }
    }

    public ArrayList<String> obtenerEstudiantesBecados() {
        ArrayList<String> estudiantesBecados = new ArrayList<>();

        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getIndiceAcademico() >= 2.0) {
                estudiantesBecados.add(estudiante.getNombre());
            }
        }

        return estudiantesBecados;
    }
public static List<Beca> buscarPorCarrera(String carrera) {
        return becas.stream()
                .filter(beca -> beca.getCarrera().equalsIgnoreCase(carrera))
                .collect(Collectors.toList());
    }

    public static List<Beca> buscarPorSexo(String sexo) {
        return becas.stream()
                .filter(beca -> beca.getSexo().equalsIgnoreCase(sexo))
                .collect(Collectors.toList());
    }

    public static List<Beca> buscarPorCarreraYSexo(String carrera, String sexo) {
        return becas.stream()
                .filter(beca -> beca.getCarrera().equalsIgnoreCase(carrera) && beca.getSexo().equalsIgnoreCase(sexo))
                .collect(Collectors.toList());
    }
}
