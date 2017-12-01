package control;


import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {
	
	public AnchorPane page;
	public Scene scene;

	public static Stage sendStage;
	
	@FXML
    void getStarted(ActionEvent event) throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainFX.class.getResource("../vista/FreeSolo.fxml"));
		page = loader.load();
		
		Stage sendStage = new Stage();
        sendStage.setTitle("FreeSolo");
        Scene scene = new Scene(page);
        sendStage.setScene(scene);
        this.sendStage = sendStage;
        this.sendStage.show();

    }
	
	@FXML
    void cerrar(ActionEvent event) {
		System.exit(0);
    }

}
