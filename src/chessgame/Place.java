/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;
import View.Game;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Place extends Parent {
	
		public static int thex ;
		public static int they;
	    public int positionX ;
	    public int positionY ;
	    private int couleur;
	    Rectangle carro;
	    public Game g ;
	   
	    public Place(){};
	    public Place(int x, int y, int c, final Piece[][] m)
	    {
	        positionX=x;
	        positionY=y;
	        couleur=c;
	        if(couleur==0){ carro = new Rectangle(50,50, Color.CHOCOLATE);}
	        else{
	        if(couleur==2){carro = new Rectangle(50,50, Color.YELLOW);}
	        else carro = new Rectangle(50,50, Color.BURLYWOOD);
	        }

	        carro.setArcHeight(5);
	        carro.setArcWidth(5);
	        
	        this.getChildren().add(carro);
	        
	        this.setTranslateX(positionX);
	        this.setTranslateY(positionY);
	        
	        this.setOnMouseClicked(new EventHandler<MouseEvent>() {  
                @Override
                public void handle(MouseEvent event) {
                  thex=positionX/50;
                  they=positionY/50;

                }
               
        });
	        


	    }
	
	
}
