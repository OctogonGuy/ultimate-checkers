package tech.octopusdragon.ultimatecheckers.window;

import tech.octopusdragon.ultimatecheckers.UltimateCheckersApplication;
import tech.octopusdragon.ultimatecheckers.model.PlayerType;

import javafx.scene.control.ChoiceDialog;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * A dialog that asks the player which player should be the starting player
 * @author Alex Gill
 *
 * @param <StartingPlayer>
 */
public class StartingPlayerDialog extends ChoiceDialog<PlayerType> {
	
	/**
	 * Creates the dialog
	 */
	public StartingPlayerDialog() {
		super(PlayerType.values()[0], PlayerType.values());
		this.setTitle("Starting Player Selection");
		this.setHeaderText("Who will go first?");
		this.setContentText("Starting Player:");

		this.getDialogPane().getScene().getStylesheets().add(
				StartingPlayerDialog.class.getResource(
				UltimateCheckersApplication.CSS_PATH).toExternalForm());
		
		((Stage)this.getDialogPane().getScene().getWindow()).getIcons().add(
				new Image(StartingPlayerDialog.class.getResourceAsStream(
				UltimateCheckersApplication.CHECK_IMAGE_PATH)));
	}

}
