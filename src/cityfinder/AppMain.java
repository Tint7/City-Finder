package cityfinder;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class AppMain extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("CityFinder.fxml"));
		Scene scence = new Scene(root);
		stage.setScene(scence);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
