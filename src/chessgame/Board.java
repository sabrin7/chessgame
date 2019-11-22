/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;
import java.util.Arrays;

import javafx.scene.Parent;

public class Board extends Parent{
	   private final Place[] places;
	    
	    public void ChangeColor(int ligne, int colonne, Piece[][] m){
	        
	        Place pl=new Place(50*colonne, 50*ligne, 2, m);
	        this.getChildren().add(pl);
	        
	    }
	    
	    public void ReturnColor(int ligne, int colonne, Piece[][] m){
	        
	        Place p1=new Place(0,0,0,m);
	        if((ligne==1)||(ligne==3)||(ligne==5)||(ligne==7)){
	        if((colonne==1)||(colonne==3)||(colonne==5)||(colonne==7)){
	         p1=new Place(50*colonne, 50*ligne, 0,m);

	        }
	        else
	            p1=new Place(50*colonne, 50*ligne, 1,m);

	        }
	        
	        if((ligne==0)||(ligne==2)||(ligne==4)||(ligne==6)){
	        if((colonne==1)||(colonne==3)||(colonne==5)||(colonne==7)){
	         p1=new Place(50*colonne, 50*ligne, 1,m);

	        }
	        else
	            p1=new Place(50*colonne, 50*ligne, 0,m);

	        }
	                this.getChildren().add(p1);

	    }
	    
	    
	    public Board(Piece[][] m)
	    {
	    
	        
	        places = new Place[]{
	            new Place(0,0,0,m),new Place(0,100,0,m),new Place(0,200,0,m),new Place(0,300,0,m),
	            new Place(50,50,0,m),new Place(50,150,0,m),new Place(50,250,0,m),new Place(50,350,0,m),
	            new Place(100,0,0,m),new Place(100,100,0,m),new Place(100,200,0,m),new Place(100,300,0,m),
	            new Place(150,50,0,m),new Place(150,150,0,m),new Place(150,250,0,m),new Place(150,350,0,m),
	            new Place(200,0,0,m),new Place(200,100,0,m),new Place(200,200,0,m),new Place(200,300,0,m),
	            new Place(250,50,0,m),new Place(250,150,0,m),new Place(250,250,0,m),new Place(250,350,0,m),
	            new Place(300,0,0,m),new Place(300,100,0,m),new Place(300,200,0,m),new Place(300,300,0,m),
	            new Place(350,50,0,m),new Place(350,150,0,m),new Place(350,250,0,m),new Place(350,350,0,m),
	            
	            new Place(0,50,1,m),new Place(0,150,1,m),new Place(0,250,1,m),new Place(0,350,1,m),
	            new Place(50,0,1,m),new Place(50,100,1,m),new Place(50,200,1,m),new Place(50,300,1,m),
	            new Place(100,50,1,m),new Place(100,150,1,m),new Place(100,250,1,m),new Place(100,350,1,m),
	            new Place(150,0,1,m),new Place(150,100,1,m),new Place(150,200,1,m),new Place(150,300,1,m),
	            new Place(200,50,1,m),new Place(200,150,1,m),new Place(200,250,1,m),new Place(200,350,1,m),
	            new Place(250,0,1,m),new Place(250,100,1,m),new Place(250,200,1,m),new Place(250,300,1,m),
	            new Place(300,50,1,m),new Place(300,150,1,m),new Place(300,250,1,m),new Place(300,350,1,m),
	            new Place(350,0,1,m),new Place(350,100,1,m),new Place(350,200,1,m),new Place(350,300,1,m)
	            
	        
	    };
	     
	      this.getChildren().addAll(Arrays.asList(places)) ;
	        
	        
	    }

}
