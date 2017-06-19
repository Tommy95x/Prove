package draganddrop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DragAndDrop extends Application {

	Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		stage=primaryStage;
		HBox box = new HBox();
		Scene scene = new Scene(box);
		Image im = new Image(getClass().getResourceAsStream("Omino bianco.jpg"));
		Immagine view = new Immagine(im);
		Tooltip.install(view, new Tooltip("prova"));
		box.getChildren().addAll(view);
		view.getBox(box);
		/*box.setOnDragEntered(event ->{
			box.getChildren().add(new Immagine(im));
		});*/
		box.setOnMouseDragReleased(event ->{
			box.getChildren().add(new Immagine(im));
		});
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void setNew(Scene scene) {
		stage.setScene(scene);
		stage.show();
		System.out.println("End");
	}
	
}
