package move;

import java.sql.Time;
import java.time.Duration;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MoveObjcet extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		BorderPane box = new BorderPane();
		Pane pane = new Pane();
		ImageView im = new ImageView(new Image(getClass().getResourceAsStream("Omino bianco.jpg")));
		pane.getChildren().addAll(im);
		box.setCenter(pane);
		Button b = new Button("Start");
		b.setOnAction(event ->{
			
			final Animation animation = new Transition() {
				{
					setDelay(Duration.ofSeconds(2);
				}
			     protected void interpolate(double frac) {
			    	 while(true){
			    		 System.out.println("Prova");
			    		 im.setTranslateX(Math.round(frac)*im.getX());
			    		 im.setTranslateY(Math.round(frac)*im.getY());
			     }
				}
			 
			 };
			 animation.play();
		});
		box.setTop(b);
		
		Scene scene = new Scene(box);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
