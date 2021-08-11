import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.*;

public class JavaFXExercise4 extends Application {
	private TextField text;
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setTitle("Button Event");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		Scene scene = new Scene(rootNode, 300, 200);
		Button onButton = new Button("On");
		onButton.setOnAction(new OnHandler());
		Button offButton = new Button("Off");
		offButton.setOnAction(new OffHandler());
		text = new TextField("Push A Button");
		text.setEditable(false);
		rootNode.getChildren().addAll(onButton, offButton, text);
		arg0.setScene(scene);
		arg0.show();
	}
	
	public class OnHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			text.setText("On clicked");
		}
		
	}
	
	public class OffHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			text.setText("Off clicked");
		}
		
	}

	public static void main(String[] args) {
		launch();
	}
}
