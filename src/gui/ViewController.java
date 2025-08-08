package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private Button btMyButton;
	
	public void onMyButtonClick() {
		Alerts.showAlert("Primeiro Alert title", "Cabeçalho", "conteúdo", AlertType.INFORMATION);
	}

}
