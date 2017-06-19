package es;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BoBox extends Application {

	@Override
	public void start(Stage primaryStage) {
		VBox box = new VBox();
		ImageView[] im = new ImageView[4];
		Button b = new Button("Press");
		for(int i = 0;i<2;i++){
			im[i] = new ImageView(new Image(getClass().getResourceAsStream("Omino bianco.jpg")));
			box.getChildren().add(i, im[i]);
			System.out.println(im[i].getX()+" "+ im[i].getY());
			System.out.println(box.getChildren().get(i)+ " "+box.getChildren().get(i));
			System.out.println(im[i].equals(box.getChildren().get(i)));
		}
		box.getChildren().add(b);
		b.setOnAction(e -> {
			box.getChildren().remove(0);
		});
		primaryStage.setScene(new Scene(box));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
