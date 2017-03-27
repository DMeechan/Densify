import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController extends Stage {
	private final StackPane pane = new StackPane();
	private ChooserController chooserController;
	private DisplayerController displayerController;

	public MainController() {

		
		loadScene();
		loadChooserController();
		show();
		System.out.println("test");

	}

	public void loadChooserController() {
		FXMLLoader chooserFXMLLoader = new FXMLLoader(getClass().getResource("Chooser.fxml"));
		//
		//pane.getChildren().remove(node);
		//
		try {
			pane.getChildren().add(chooserFXMLLoader.load());
		} catch (IOException e) {
			Main.outputError(e);
		}
		chooserController = chooserFXMLLoader.getController();


		if (chooserController != null) {
			chooserController.sceneActiveProperty().addListener(v -> {
				if (!chooserController.isSceneActive()) {
					loadDisplayerController();
				}
			});
		}
	}

	public void loadDisplayerController() {

		if (displayerController != null) {
			displayerController.sceneActiveProperty().addListener(v -> {
				if (!displayerController.isSceneActive()) {
					loadChooserController();
				}
			});
		}
	}
	
	private void loadScene() {
		setScene(new Scene(pane, 350, 400));
		this.show();
		
		// ensure the window closes correctly
		this.setOnCloseRequest(v -> {
			Platform.exit();
			System.exit(0);
		});
		
		this.setTitle("Densify");
		this.setResizable(false);
		
		// try to load application icon
		// this implementation makes the file handling platform-agnostic
		// so the icon should work on different platforms
		// (however, setting the icon Dock icon on Mac requires making additional calls)
		try {
			this.getIcons().add(new Image(this.getClass().getResourceAsStream("icon.png")));
			
		} catch (Exception e) {
			System.out.println("Error: application icon not found");
			Main.outputError(e);
		}
	}
	
}