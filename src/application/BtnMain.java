package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BtnMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		VBox vBox = new VBox();
		vBox.setPrefWidth(700);
		vBox.setPrefHeight(400);
		vBox.setAlignment(Pos.CENTER);
		
		Button button = new Button("������");
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("�˸�â");
		alert.setContentText("java Fx������");
		alert.setHeaderText("�޽���");
		//alert.show();
		
		button.setOnAction(ee->{
			System.out.println("�������ϴ�.");
			alert.show();
		});
		
		vBox.getChildren().add(button);
		
		Label lb = new Label("���̴�");
		Font font = new Font(50);
		lb.setFont(font);
		Slider slider = new Slider();
		vBox.getChildren().add(lb);
		vBox.getChildren().add(slider);
		
		/*slider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				System.out.println(newValue);
			}
		});*/
		
		slider.valueProperty().addListener(
				(ObservableValue<? extends Number> observable, 
				Number oldValue, 
				Number newValue)->{
					lb.setText(newValue+"");
					lb.setFont(new Font(newValue.doubleValue()));
					//System.out.println(newValue);
				});
		
		Scene scene = new Scene(vBox);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
