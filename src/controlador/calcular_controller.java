package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import modelos.Prueba;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
//import modelos.SchoolGradingSystem;

public class calcular_controller {

    @FXML
    private TextField tfcantidad;

    @FXML
    private Button btcalcular;

    @FXML
    private TextArea txaIngresar;

    @FXML
    private TextArea txaMostrar;

    @FXML
    void boton_calcular(ActionEvent event) throws IOException {
        String n = tfcantidad.getText();
        String registros = txaIngresar.getText();
        System.out.println(registros);
        calcular(n, registros);

        /*
        Nota: Omitir este código aqui comentado
        FXMLLoader vista = new FXMLLoader(getClass().getResource("/vistas/vista2.fxml"));
        Parent root1 = vista.load();

        Node fuente =  (Node)event.getSource();
        Scene scena1 = fuente.getScene();
        Stage stag =  (Stage)scena1.getWindow();
        Scene scena2 =  new Scene(root1);
        stag.setScene(scena2);
        stag.show();*/
                
    }

    private void calcular(String n, String registros){
       Prueba p1 =  new Prueba();
       p1.llenarMatriz(registros,Integer.parseInt(n));
       /*String dato1 = String.valueOf(p1.suma1()); 
       String dato2 = String.valueOf(p1.suma2()); 
       String dato3 = String.valueOf(p1.suma3()); 
       String dato4 = String.valueOf(p1.suma4()); 
       txaMostrar.setText(dato1 +"\n"+dato2 +"\n"+dato3+"\n"+dato4);*/
       txaMostrar.setText(String.format("%s \n%s \n%s \n%s",p1.suma1(),p1.suma2(),p1.suma3(),p1.suma2()));

        
    }

}
