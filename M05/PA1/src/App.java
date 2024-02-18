import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
 public class App extends Application {
     @Override // Overide start method in Application class
     public void start(Stage primaryStage) {
        // New gridpane to easily hold and place four images
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);
         
        // Add images and normalize sizes
        Image image1 = new Image("./images/flag1.gif");
        Image image2 = new Image("./images/flag2.gif");
        Image image3 = new Image("./images/flag6.gif");
        Image image4 = new Image("./images/flag7.gif");

        // Add images to gridPane
        gridPane.add(new ImageView(image1), 0, 0);
        gridPane.add(new ImageView(image2), 0, 1);
        gridPane.add(new ImageView(image3), 1, 0);
        gridPane.add(new ImageView(image4), 1, 1);

        // Create scene
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("PA1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
