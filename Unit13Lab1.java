import javafx.application.Application;
import javafx.stage.Stage;
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

public class Unit13Lab1 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setTitle("Loan Calculator");
		GridPane rootNode = new GridPane();
		Scene scene = new Scene(rootNode, 300, 200);
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);
		rootNode.setPadding(new Insets(15));
		Label l1 = new Label("Annual Interest Rate: ");
		GridPane.setConstraints(l1, 0, 0);
		Label l2 = new Label("Number of Years:");
		GridPane.setConstraints(l2, 0, 1);
		Label l3 = new Label("Loan Amount: ");
		GridPane.setConstraints(l3, 0, 2);
		Label l4 = new Label("Monthly Payment: ");
		GridPane.setConstraints(l4, 0, 3);
		Label l5 = new Label("Total Payment: ");
		GridPane.setConstraints(l5, 0, 4);
		TextField t1 = new TextField();
		GridPane.setConstraints(t1, 1, 0);
		TextField t2 = new TextField();
		GridPane.setConstraints(t2, 1, 1);
		TextField t3 = new TextField();
		GridPane.setConstraints(t3, 1, 2);
		TextField t4 = new TextField();
		GridPane.setConstraints(t4, 1, 3);
		TextField t5 = new TextField();
		GridPane.setConstraints(t5, 1, 4);
		Button b1 = new Button("Calculate");
		GridPane.setHalignment(b1, HPos.RIGHT);
		rootNode.add(b1, 1, 5);
		rootNode.getChildren().addAll(l1, l2, l3, l4, l5, t1, t2, t3, t4, t5);
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
