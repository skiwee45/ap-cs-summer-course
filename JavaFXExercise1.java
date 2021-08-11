import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.*;

public class JavaFXExercise1 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setTitle("Adding a text field");
		FlowPane rootNode = new FlowPane();
		Scene scene = new Scene(rootNode, 300, 200);
		TextField tf1 = new TextField("This is some default text");
		tf1.setPrefColumnCount(10);
		TextField tf2 = new TextField();
		tf2.setText("I love JavaFX");
		TextField tf3 = new TextField();
		tf3.setPromptText("Please fill out this text field");
		rootNode.getChildren().addAll(tf1, tf2, tf3);
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
