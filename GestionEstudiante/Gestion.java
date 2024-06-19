import java.util.ArrayList;

public class Gestion {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado con éxito: " + estudiante);
    }

    public String listarEstudiantes() {
        StringBuilder sb = new StringBuilder();
        if (estudiantes.isEmpty()) {
            sb.append("No hay estudiantes registrados.");
        } else {
            sb.append("Lista de estudiantes registrados:\n");
            for (Estudiante estudiante : estudiantes) {
                sb.append(estudiante).append("\n");
            }
        }
        return sb.toString();
    }

    public Estudiante buscarEstudiantePorCodigo(String codigo) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(codigo)) {
                return estudiante;
            }
        }
        return null; // Retorna null si no encuentra al estudiante
    }
}