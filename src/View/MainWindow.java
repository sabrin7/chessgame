/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author sabri
 */
public class MainWindow extends Parent {
    private BorderPane root=new BorderPane();
    private static Stage firstStage;
    public MainWindow(Stage primaryStage) {
        firstStage=primaryStage;
        
        HBox hhbox=new HBox();
        HBox box= new HBox();
         HBox hbox=new HBox();
         VBox vbox1=new VBox();
         VBox vbox2=new VBox();
         Label player1= new Label();
         player1.setMinWidth(200);
         player1.setMinHeight(50);
         player1.setText("Player 1");
         player1.setFont(Font.font("SansSerif", 30));
         player1.setTranslateX(150);
         player1.setTranslateY(10);
         hhbox.getChildren().add(player1);
         Label username=new Label();
         username.setMinWidth(200);
         username.setMinHeight(50);
         username.setText("Username");
         username.setTranslateX(50);
         Label password=new Label();
         password.setMinWidth(200);
         password.setMinHeight(50);
         password.setTranslateX(50);
         password.setText("Password");
         
         vbox1.setTranslateY(100);
         vbox1.getChildren().add(username);
         vbox1.getChildren().add(password);
         final TextField usernameF=new TextField();
         usernameF.setMinWidth(200);
         usernameF.setMinHeight(50);
         final TextField passwordF=new TextField();
         passwordF.setMinWidth(200);
         passwordF.setMinHeight(50);
         vbox2.setTranslateY(100);
         vbox2.getChildren().add(usernameF);
         vbox2.getChildren().add(passwordF);
         
         hbox.getChildren().add(vbox1);
         hbox.getChildren().add(vbox2);
         box.getChildren().add(hbox);
         
         //---------------------------------------------------------------------
         
         HBox hboxx=new HBox();
         VBox vboxx1=new VBox();
         VBox vboxx2=new VBox();
         
         Label player2= new Label();
         player2.setMinWidth(200);
         player2.setMinHeight(50);
         player2.setText("Player 2");
         player2.setFont(Font.font("SansSerif", 30));
         player2.setTranslateX(350);
         player2.setTranslateY(10);
         hhbox.getChildren().add(player2);
         Label username1=new Label();
         username1.setMinWidth(200);
         username1.setMinHeight(50);
         username1.setText("Username");
         username1.setTranslateX(50);
         Label password1=new Label();
         password1.setMinWidth(200);
         password1.setMinHeight(50);
         password1.setTranslateX(50);
         password1.setText("Password");
         
         vboxx1.setTranslateY(100);
         vboxx1.getChildren().add(username1);
         vboxx1.getChildren().add(password1);
         final TextField usernameF1=new TextField();
         usernameF1.setMinWidth(200);
         usernameF1.setMinHeight(50);
         final TextField passwordF1=new TextField();
         passwordF1.setMinWidth(200);
         passwordF1.setMinHeight(50);
         vboxx2.setTranslateY(100);
         vboxx2.getChildren().add(usernameF1);
         vboxx2.getChildren().add(passwordF1);
         
         Button jouer= new Button();
         jouer.setTranslateX(25);
         jouer.setTranslateY(75);
         jouer.setText("Jouer");
         jouer.setMinWidth(150);
         jouer.setMinHeight(50);
         
         jouer.setOnAction(new EventHandler<ActionEvent>(){
 @Override
 public void handle(ActionEvent me){
     Stage nouveauStage;
     
                nouveauStage = (Stage) ((Node) me.getSource()).getScene().getWindow();
                Scene scene = new Scene(new Game(nouveauStage), 400, 450);
                nouveauStage.show();
                
 } });
         Button b= new Button();
         b.setTranslateX(25);
         b.setTranslateY(100);
         b.setText("Return");
         b.setMinWidth(150);
         b.setMinHeight(50);
         
b.setOnAction(new EventHandler<ActionEvent>() {
    @Override public void handle(ActionEvent e) {
        Stage nouveauStage;
                nouveauStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                Scene scene = new Scene(new SignUp(nouveauStage), 400, 450);
                nouveauStage.show();
        
        }
});
         vboxx1.getChildren().add(jouer);
         vboxx1.getChildren().add(b);
         hboxx.getChildren().add(vboxx1);
         hboxx.getChildren().add(vboxx2);
         box.getChildren().add(hboxx); 
         
         root.setTop(hhbox);
         root.getChildren().add(box); 
     
        Scene scene=new Scene(root, 1000,500,Color.DEEPSKYBLUE );
        primaryStage.setScene(scene);
        
    }
}
