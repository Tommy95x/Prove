package draganddrop;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DragAndDrop extends Application {

	@FXML
	Circle circle;
	
	
	@Override
	public void start(Stage primaryStage) {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("DragandDrop.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	@FXML
	public void dragOver(){
		System.out.println(circle.getLayoutX());
		System.out.println(circle.getLayoutY());
	}
	
	@FXML
	public void dragReleased(){
		System.out.println("Fine del drag and dorp le posizioni sono ");
		System.out.println(circle.getCenterX());
		System.out.println(circle.getCenterY());
	}
	
	@FXML
	public void dragEntered(){
		System.out.println("Inizio drag and drop");
		System.out.println(circle.getCenterX());
		System.out.println(circle.getCenterY());
	}
	
	
}
