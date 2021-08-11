import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.*;
import javafx.stage.*;

public class JavaFXExercise2 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		FlowPane rootNode = new FlowPane(Orientation.VERTICAL);
		Scene scene = new Scene(rootNode, 300, 200);
		rootNode.setAlignment(Pos.CENTER);
		ToggleButton b1 = new ToggleButton("Lol");
		ToggleButton b2 = new ToggleButton("lollllll");
		rootNode.getChildren().addAll(b1, b2);
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
