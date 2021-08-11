import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.*;

public class Unit14Lab1 extends Application {
	TextField a;
	TextField b;
	TextField sum;
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setTitle("Calculator");
		GridPane rootNode = new GridPane();
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);
		rootNode.setPadding(new Insets(30));
		Scene scene = new Scene(rootNode, 300, 200);
		//static labels
		Label l1 = new Label("First Value: ");
		GridPane.setConstraints(l1, 0, 0);
		Label l2 = new Label("Second Value: ");
		GridPane.setConstraints(l2, 0, 1);
		Label l3 = new Label("Sum: ");
		GridPane.setConstraints(l3, 0, 2);
		//text fields
		a = new TextField();
		GridPane.setConstraints(a, 1, 0);
		b = new TextField();
		GridPane.setConstraints(b, 1, 1);
		sum = new TextField();
		GridPane.setConstraints(sum, 1, 2);
		sum.setEditable(false);
		//button	
		Button calculateButton = new Button("Calculate");
		GridPane.setConstraints(calculateButton, 1, 3);
		calculateButton.setOnAction(new CalculateHandler());
		//finish
		rootNode.getChildren().addAll(l1, l2, l3, a, b, sum, calculateButton);
		arg0.setScene(scene);
		arg0.show();
	}
	
	public class CalculateHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			sum.setText(Integer.toString(Integer.parseInt(a.getText()) + Integer.parseInt(b.getText())));
		}
		
	}

	public static void main(String[] args) {
		launch();
	}
}
