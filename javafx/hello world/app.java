import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class app extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        // removes windo borders
        primaryStage.initStyle(StageStyle.UNDECORATED);

        Button btn = new Button();
        btn.setText("close window");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                // System.out.println("Hello World!");
                primaryStage.close();
            }

        });
        
        Button toggleFSbtn = new Button();
        toggleFSbtn.setText("fullscreen");
        toggleFSbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("fullscreen now");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(toggleFSbtn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}