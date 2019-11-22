/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author sabri
 */

import Beans.Player;
import Beans.PlayersFile;
import controller.Gestion;
import java.util.Vector;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author sabri
 */
public class ChessGame extends Application {
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    
 @Override
    public void start( Stage primaryStage) {
        
        PlayersFile f=new PlayersFile();
        f.ecrire();
        primaryStage.setTitle("Chess Game");
        Scene scene = new Scene(new SignUp(primaryStage), 800, 800);
        primaryStage.show();
                }
}
      