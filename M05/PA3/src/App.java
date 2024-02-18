/*
 * Name:    Zachary Barrett
 * Date:    02/18/2024
 * Purpose: Use scroll bars or sliders to change the color of the
 *          displayed text. Use one bar each for values of:
 *          red, green, blue, and opacity.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    // Initialize text to be colored and sliders
    protected Text coloredText = new Text("Show Colors");
    protected Slider rSlider = new Slider();
    protected Slider gSlider = new Slider();
    protected Slider bSlider = new Slider();
    protected Slider oSlider = new Slider();
    
    @Override
    public void start(Stage primaryStage) {
        // Create pane for colored text
        StackPane textPane = new StackPane(coloredText);
        textPane.setPadding(new Insets(10));
        coloredText.setFont(Font.font(24));

        // Create pane for sliders
        GridPane sliderPane = new GridPane();
        sliderPane.setAlignment(Pos.CENTER);
        sliderPane.setPadding(new Insets(10));
        sliderPane.add(new Label("Red"), 0, 0);
        sliderPane.add(rSlider, 1, 0);
        sliderPane.add(new Label("Green"), 0, 1);
        sliderPane.add(gSlider, 1, 1);
        sliderPane.add(new Label("Blue"), 0, 2);
        sliderPane.add(bSlider, 1, 2);
        sliderPane.add(new Label("Opacity"), 0, 3);
        sliderPane.add(oSlider, 1, 3);

        // Place textPane and sliderPane in a pane
        BorderPane mainPane = new BorderPane();
        mainPane.setTop(textPane);
        mainPane.setCenter(sliderPane);

        // Create min/max values for sliders
        rSlider.setMin(0.0);
        rSlider.setMax(1.0);
        gSlider.setMin(0.0);
        gSlider.setMax(1.0);
        bSlider.setMin(0.0);
        bSlider.setMax(1.0);
        oSlider.setMin(0.0);
        oSlider.setMax(1.0);
        oSlider.setValue(1);

        // Create slider listeners
        rSlider.valueProperty().addListener(ov -> changeColor());
        gSlider.valueProperty().addListener(ov -> changeColor());
        bSlider.valueProperty().addListener(ov -> changeColor());
        oSlider.valueProperty().addListener(ov -> changeColor());

        // Set the scene
        Scene scene = new Scene(mainPane);
        primaryStage.setTitle("Coloring Text");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    public void changeColor() {
        double red = rSlider.getValue();
        double green = gSlider.getValue();
        double blue = bSlider.getValue();
        double opacity = oSlider.getValue();
        coloredText.setFill(new Color(red, green, blue, opacity));
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
