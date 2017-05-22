package javaFx;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class FadeOut extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT); //Removes window decorations

        Button close = new Button("Fade away");
        close.setOnAction((actionEvent) ->  {
            Timeline timeline = new Timeline();
            KeyFrame key = new KeyFrame(Duration.millis(2000),
                           new KeyValue (stage.getScene().getRoot().opacityProperty(), 0)); 
            timeline.getKeyFrames().add(key);   
            timeline.setOnFinished((ae) -> System.exit(1)); 
            timeline.play();
        });

        Scene scene = new Scene(close, 300, 300);
        scene.setFill(Color.TRANSPARENT); //Makes scene background transparent
        stage.setScene(scene);
        stage.show();
    }

    public static void main (String[] args) {
        launch();
    }
}
