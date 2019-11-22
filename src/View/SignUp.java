/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Beans.Player;
import controller.Gestion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author sabri
 */
public class SignUp extends Parent{
    
    private BorderPane root= new BorderPane();
    private static Stage stage;
 public SignUp(Stage primaryStage) {
         stage=primaryStage;
         HBox hbox=new HBox();
         VBox vbox1=new VBox();
         VBox vbox2=new VBox();
         Label create_user= new Label();
         create_user.setMinWidth(200);
         create_user.setMinHeight(50);
         create_user.setText("Create User");
         create_user.setFont(Font.font("SansSerif", 30));
         create_user.setTranslateX(100);
         create_user.setTranslateY(10);
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
         Label confirm_password=new Label();
         confirm_password.setMinWidth(200);
         confirm_password.setMinHeight(50);
         confirm_password.setTranslateX(35);
         confirm_password.setText("Confirm Password");
         vbox1.setTranslateY(100);
         vbox1.getChildren().add(username);
         vbox1.getChildren().add(password);
         vbox1.getChildren().add(confirm_password);
         final TextField usernameF=new TextField();
         usernameF.setMinWidth(200);
         usernameF.setMinHeight(50);
         final TextField passwordF=new TextField();
         passwordF.setMinWidth(200);
         passwordF.setMinHeight(50);
         TextField confirm_passwordF=new TextField();
         confirm_passwordF.setMinWidth(200);
         confirm_passwordF.setMinHeight(50);
         vbox2.setTranslateY(100);
         vbox2.getChildren().add(usernameF);
         vbox2.getChildren().add(passwordF);
         vbox2.getChildren().add(confirm_passwordF);
         
         
         Button sign_up= new Button();
         sign_up.setTranslateX(50);
         sign_up.setTranslateY(50);
         sign_up.setText("Sign Up");
         sign_up.setMinWidth(100);
         sign_up.setMinHeight(50);
         
         sign_up.setOnAction(new EventHandler<ActionEvent>(){
 @Override
 public void handle(ActionEvent me){
     Player p=new Player(usernameF.getText(),passwordF.getText());  
     String sql= "insert into player (username, password)values('"+p.getUsername()+"','"+p.getPassword()+"')";
         Gestion.setPlayer(sql);
    Stage nouveauStage;
                nouveauStage = (Stage) ((Node) me.getSource()).getScene().getWindow();
                Scene scene = new Scene(new MainWindow(nouveauStage), 400, 450);
                nouveauStage.show();
 } }); 
         Button log_in= new Button();
         log_in.setTranslateX(50);
         log_in.setTranslateY(75);
         log_in.setText("Log In");
         log_in.setMinWidth(100);
         log_in.setMinHeight(50);
         
         log_in.setOnAction(new EventHandler<ActionEvent>(){
 @Override
 public void handle(ActionEvent me){
     Stage nouveauStage;
                nouveauStage = (Stage) ((Node) me.getSource()).getScene().getWindow();
                Scene scene = new Scene(new MainWindow(nouveauStage), 800, 800);
                nouveauStage.show();
                
 } });
         
 //}
         
         vbox2.getChildren().add(sign_up);
         vbox2.getChildren().add(log_in);
         hbox.getChildren().add(vbox1);
         hbox.getChildren().add(vbox2);
         root.setTop(create_user);
         root.getChildren().add(hbox);
         Scene scene=new Scene(root, 400,450, Color.DEEPSKYBLUE);
stage.setScene(scene);
 }
    
}
