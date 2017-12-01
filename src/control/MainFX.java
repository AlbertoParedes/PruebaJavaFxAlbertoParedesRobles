package control;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainFX extends Application {
/**
 * @author	Alberto Paredes
 * @version 1.0
 * 
 */
	private Stage openStage;
	private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		this.openStage = primaryStage;
		this.openStage.setTitle("AddressApp");

		initRootLayout();
		//showPersonOverview();
	}



	private void initRootLayout() {
		// TODO Auto-generated method stub
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/Login.fxml"));
			rootLayout = (BorderPane) loader.load();

			Scene scene = new Scene(rootLayout);
			openStage.setScene(scene);
			openStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Returns the main stage.
	 * @return openStage
	 */
	public Stage getPrimaryStage() {
		return openStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
