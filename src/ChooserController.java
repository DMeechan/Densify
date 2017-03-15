import javafx.beans.property.BooleanProperty;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ChooserController implements Initializable {
	private BooleanProperty sceneActive;
	
	public ChooserController() {
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public BooleanProperty getSceneActive() {
		return this.sceneActive;
	}

	public void setSceneActive(BooleanProperty sceneActive) {
		this.sceneActive = sceneActive;
	}
}