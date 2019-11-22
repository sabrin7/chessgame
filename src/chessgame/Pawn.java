/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

/**
 *
 * @author sabri
 */

import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pawn extends Piece {
	public ImageView pawn;
	
	
	public Pawn(Position p,couleur coul) {
		super.coul=coul;
		super.position=p;
		super.valeur=1;
	
		super.selected=false;
        if(this.coul==couleur.white){ super.image=new Image("images/white-pawn.png"); }
        if(this.coul==couleur.black){ super.image=new Image("images/black-pawn.png"); }
        pawn =new ImageView(image);
        pawn.setFitHeight(50);
        pawn.setFitWidth(50);
        pawn.setTranslateY(position.ligne*50);
        pawn.setTranslateX(position.colonne*50);
	}
        
        
         //  @Override
        public void deselectionnerPiece(final Piece[][] m, Board b){
            List<Position> l=deplacementPrimaire(m);		
            for(Position ppp : l){
                            b.ReturnColor(ppp.ligne, ppp.colonne, m);
            }
        }
        
    //    @Override
        public void selectionnerPiece(final Piece[][] m, Board b){
            List<Position> l=deplacementPrimaire(m);
            for(Position ppp : l){

                            b.ChangeColor(ppp.ligne, ppp.colonne, m);
                            
                } 

	}	
	public List<Position> deplacementPrimaire(Piece[][] m){
		List<Position> l=new ArrayList<Position>();		

		if(this.coul==couleur.black && m[position.ligne+1][position.colonne].coul==couleur.none) {
			Position p=new Position(position.ligne+1,position.colonne);
			l.add(p);
			if((this.position.ligne==1 )&& m[position.ligne+2][position.colonne].coul==couleur.none) {
				Position pp=new Position(position.ligne+2,position.colonne);
				l.add(pp);
			}
			
			
		}
		 if(this.coul==couleur.white && m[position.ligne-1][position.colonne].coul==couleur.none) {		
			Position p=new Position(position.ligne-1,position.colonne);
			l.add(p);
			if(this.position.ligne==6 && m[position.ligne-2][position.colonne].coul==couleur.none) {
				Position pp=new Position(position.ligne-2,position.colonne);
				l.add(pp);
			}
		}
			
		
		if (position.ligne<7 && this.coul==couleur.black ) {	
			if(position.colonne<7 && m[position.ligne+1][position.colonne+1].coul==couleur.white) {		
					Position p=new Position(position.ligne+1,position.colonne+1);
					l.add(p);	
			}
			if(position.colonne>0 && m[position.ligne+1][position.colonne-1].coul==couleur.white) {		
				Position p=new Position(position.ligne+1,position.colonne-1);
				l.add(p);	
		    }
		}
			
		if (position.ligne>0 && this.coul==couleur.white) {	
			if(position.colonne<7 && m[position.ligne-1][position.colonne+1].coul==couleur.black) {		
					Position p=new Position(position.ligne-1,position.colonne+1);
					l.add(p);	
			}
			if(position.colonne>0 && m[position.ligne-1][position.colonne-1].coul==couleur.black) {		
				Position p=new Position(position.ligne-1,position.colonne-1);
				l.add(p);	
			}
			
		}
				
		
            
		
		return l ;
		
	}
	public List<Position> show() {
		List<Position> l=new ArrayList<Position>();
		return l;
		
	}
	
	  
	public void deplacer(int posl,int posc, Piece[][] m) {
            Empty e=new Empty();
		List<Position> liste=deplacementPrimaire(m);
		for(int i=0; i< liste.size();i++)
		{
			Position v=(Position)liste.get(i);
			if((v.ligne==posl)&&(v.colonne==posc)) {
                                m[position.ligne][position.colonne]=e;
				this.position.ligne=posl;
				this.position.colonne=posc;
                                m[position.ligne][position.colonne]=this;
                                this.pawn.setTranslateX(position.colonne*50);
                                this.pawn.setTranslateY(position.ligne*50);
                                
				break;
			}
		}	
		
}

	public Position getPos() {
		return this.position;
	}
}