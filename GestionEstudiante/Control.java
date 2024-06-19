import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
/**
 * Write a description of class Control here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Control {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnListar;

    @FXML
    private Button btnSalir;

    @FXML
    private Label lblCodigo;

    @FXML
    private Label lblEdad;

    @FXML
    private Label lblGestionestudiante;

    @FXML
    private Label lblNombre;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextArea txtareaResultados;

    @FXML
    private TextField txtnombre;

    private Gestion gestion = new Gestion();

    @FXML
    void AgregarEstudiante(ActionEvent event) {
        String nombre = txtnombre.getText();
        String codigo = txtCodigo.getText();
        int edad = Integer.parseInt(txtEdad.getText());

        Estudiante estudiante = new Estudiante(nombre, "", edad, codigo);
        gestion.agregarEstudiante(estudiante);
        txtareaResultados.setText("Estudiante agregado: " + estudiante);
    }

    @FXML
    void BuscarEstudiante(ActionEvent event) {
        String codigo = txtCodigo.getText();
        Estudiante estudiante = gestion.buscarEstudiantePorCodigo(codigo);
        if (estudiante != null) {
            txtareaResultados.setText("Estudiante encontrado: " + estudiante);
        } else {
            txtareaResultados.setText("Estudiante no encontrado");
        }
    }

    @FXML
    void ListarEstudiante(ActionEvent event) {
        txtareaResultados.setText(gestion.listarEstudiantes());
    }

    @FXML
    void Salir(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    void initialize() {
        assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert btnBuscar != null : "fx:id=\"btnBuscar\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert btnListar != null : "fx:id=\"btnListar\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert btnSalir != null : "fx:id=\"btnSalir\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert lblCodigo != null : "fx:id=\"lblCodigo\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert lblEdad != null : "fx:id=\"lblEdad\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert lblGestionestudiante != null : "fx:id=\"lblGestionestudiante\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert txtareaResultados != null : "fx:id=\"txtareaResultados\" was not injected: check your FXML file 'SCGestion.fxml'.";
        assert txtnombre != null : "fx:id=\"txtnombre\" was not injected: check your FXML file 'SCGestion.fxml'.";

    }

}
