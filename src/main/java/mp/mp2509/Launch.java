package mp.mp2509;

import eu.hansolo.fx.countries.LauncherDemoCountryPane;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.Objects;


public class Launch extends Application {
    public static Stage stage=null;
    @Override
    public void start(Stage stage)  throws Exception {
        try{
            Parent root = FXMLLoader.load (getClass().getResource("Ui.fxml"));
            Scene scene = new Scene(root);
            String css= this.getClass().getResource("application.css").toExternalForm();
            scene.getStylesheets().add(css);
            //scene.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());
            scene.setFill(Color.TRANSPARENT);
            stage.initStyle (StageStyle.TRANSPARENT);
            stage.setScene(scene);
            Launch.stage=stage;
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /*
      @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load (getClass().getResource("resources.Ui.fxml"));
        Scene scene = new Scene(root);
        //String css= getClass().getResource("stylesheet.css").toExternalForm();
        // scene.getStylesheets().add(css);
        scene.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle (StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }
     */

    public static void main(String[] args) {
        launch (args);
        }
}