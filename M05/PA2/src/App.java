/*
 * Name:    Zachary Barrett
 * Date:    02/18/2024
 * Program: App.java
 * Purpose: Write a program that displays the color of a circle as
 *          black when the mouse button is pressed, and white when
 *          the mouse button is released.
 */

import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.paint.Color;


public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create pane
        StackPane stackPane = new StackPane();

        // Create a circle
        Circle circle = new Circle(100);
        circle.setFill(Color.rgb(255, 255, 255));
        circle.setStroke(Color.rgb(0, 0, 0));
        stackPane.getChildren().add(circle);

        // Handle mouse button
        // When mouse button is pressed, fill the circle black
        stackPane.setOnMousePressed(e -> {
            circle.setFill(Color.rgb(0, 0, 0));
        });
        // When mouse button is released, fill the circle white
        stackPane.setOnMouseReleased(e -> {
            circle.setFill(Color.rgb(255, 255, 255));
        });

        // Create scene
        Scene scene = new Scene(stackPane, 300, 300);
        primaryStage.setTitle("Coloring a Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
