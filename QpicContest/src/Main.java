import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
		
		
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Afo");
		Parent root = FXMLLoader.load(getClass().getResource("MainStage.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@Override
	public void stop(){
		System.exit(0);
	}

	public static void main(String[] args) {		
		launch(args);
	}
}


