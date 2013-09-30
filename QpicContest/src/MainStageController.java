import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class MainStageController {
	
	@FXML
	private TextField argument;
	
	@FXML
	private TextArea answer_field;
	
	@FXML
	private Button button;
	
	@FXML
	private void showAnswer(){
		int n = Integer.parseInt(argument.getText());
		String str = Afo.afo(n);
		answer_field.setText(str);
	}
}
