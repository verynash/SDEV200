/*
 * Author:  Zachary Barrett
 * Date:    02/24/2024
 * This program compares the update speeds of batch and non-batch 
 * updates. It also utilizes DBConnectionPanel to connect to a 
 * database and confirm success to the user.
 */

import java.sql.*;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application { 
    // Create blocks within the pane
    private Label lbUpdateSuccess = new Label("Awaiting Update");
    private Button btnConnectToDatabase = new Button("Connect to Database");
    private TextArea taUpdateData = new TextArea();
    private String batchUpdateString = "";
    private String nonBatchUpdateString = "";
    private Button btnBatchUpdate = new Button("Batch Update");
    private Button btnNonBatchUpdate = new Button("Non-Batch Update");
    private String jdbcURL = "com.mysql.cj.jdbc.Driver";
    private String databaseURL  = "jdbc:mysql://localhost/javabook";
    

    @Override
    public void start(Stage primaryStage) {
        // Create a pane
        GridPane pane = new GridPane();
        
        
        // Place blocks in pane
        pane.add(lbUpdateSuccess, 0, 0);
        pane.add(btnConnectToDatabase, 1, 0);
        pane.add(taUpdateData, 0, 1);
        pane.add(btnBatchUpdate, 0, 2);
        pane.add(btnNonBatchUpdate, 1, 2);
        
        // Add properties for positioning to pane
        taUpdateData.setEditable(false);
        pane.setHgap(5);
        GridPane.setHalignment(lbUpdateSuccess, HPos.CENTER);
        GridPane.setHalignment(btnConnectToDatabase, HPos.RIGHT);
        GridPane.setHalignment(btnBatchUpdate, HPos.RIGHT);
        GridPane.setColumnSpan(taUpdateData, 2);
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(50);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(50);
        pane.getColumnConstraints().addAll(col1,col2);

        // Create scene
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise35_01");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Handle button clicks
        btnConnectToDatabase.setOnMouseClicked(e -> {
            DatabaseConnection(jdbcURL, databaseURL);
        });
        btnBatchUpdate.setOnMouseClicked(e -> {
            BatchUpdate();
        });
        btnNonBatchUpdate.setOnMouseClicked(e -> {
            NonBatchUpdate();
        });
    }

    public void DatabaseConnection(String JDBC, String URL) {
        DBConnectionPanel dbConnectionPanel = new DBConnectionPanel(JDBC, URL);
        Button btnCloseDialog = new Button("Close Dialog");
        VBox vBox = new VBox(dbConnectionPanel, btnCloseDialog);

        Scene scene2 = new Scene(vBox);
        Stage stage = new Stage();
        stage.setTitle("Connect to DB");
        stage.setScene(scene2);
        stage.show();

        btnCloseDialog.setOnMouseClicked(e -> {
            stage.close();
        });

    }

    public void BatchUpdate() {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost/javabook", "root", "");

            // Create a statement
            Statement statement = connection.createStatement();

            // Add batch statements
            for (int i = 0; i < 1000; i++) {
                int num1 = (int)(Math.random()*100);
                int num2 = (int)(Math.random()*100);
                int num3 = (int)(Math.random()*100);
                statement.addBatch("insert into temp " +
                "values (" + num1 + ", " + num2 +
                ", " + num3 + ")");
            }
            
            long startTime = System.nanoTime();
            // Execute batch
            statement.executeBatch();

            // Calculate duration
            long stopTime = System.nanoTime();
            long duration = stopTime - startTime;
            // Update display
            lbUpdateSuccess.setText("Batch update successful");
            batchUpdateString = "Batch update completed \n" +
                "The elapsed time is " + duration + "\n\n";
            taUpdateData.setText(batchUpdateString +
                nonBatchUpdateString);
        }
        catch (Exception ex) {
            lbUpdateSuccess.setText("Batch update failed.");
        }
    }
    
    public void NonBatchUpdate() {
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            Connection connection = DriverManager.getConnection
            ("jdbc:mysql://localhost/javabook", "root", "");
            
            // Create a statement
            Statement statement = connection.createStatement();
            
            long startTime = System.nanoTime();
            // Execute update
            for (int i = 0; i < 1000; i++) {
                int num1 = (int)(Math.random() * 100);
                int num2 = (int)(Math.random() * 100);
                int num3 = (int)(Math.random() * 100);
                statement.executeUpdate("insert into temp " +
                "values (" + num1 + ", " + num2 +
                ", " + num3 + ")");
                
            }

            // Calculate duration
            long stopTime = System.nanoTime();
            long duration = stopTime - startTime;

            // Update display
            lbUpdateSuccess.setText("Non-batch update successful");
            nonBatchUpdateString = "Non-Batch update completed \n" +
                "The elapsed time is " + duration;
            taUpdateData.setText(batchUpdateString +
                nonBatchUpdateString);
        }
        catch (Exception ex) {
            lbUpdateSuccess.setText("Non-batch update failed.");
        }
    }
    
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
