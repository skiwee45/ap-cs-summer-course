import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFXExercise3 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		GridPane rootNode = new GridPane();
		Scene scene = new Scene(rootNode, 300, 200);
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);
		rootNode.setPadding(new Insets(30));
		Label fn = new Label("First Name");
		GridPane.setConstraints(fn, 0, 0);
		Label mi = new Label("MI:");
		GridPane.setConstraints(mi, 0, 1);
		Label ln = new Label("Last Name");
		GridPane.setConstraints(ln, 0, 2);
		TextField t1 = new TextField();
		GridPane.setConstraints(t1, 1, 0);
		TextField t2 = new TextField();
		t2.setPrefColumnCount(1);
		GridPane.setConstraints(t2, 1, 1);
		TextField t3 = new TextField();
		GridPane.setConstraints(t3, 1, 2);
		Button b1 = new Button("Add Name");
		GridPane.setHalignment(b1, HPos.RIGHT);
		rootNode.add(b1, 1, 3);
		rootNode.getChildren().addAll(fn, mi, ln, t1, t2, t3);
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
