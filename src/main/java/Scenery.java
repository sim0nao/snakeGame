import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Scenery {

    private Scene scene;
    private Group root = new Group();

    public Scenery (Stage primaryStage){
        this.scene = new Scene(root, Config.WIDTTH, Config.HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Snake Game");
        primaryStage.show();
    }

}
