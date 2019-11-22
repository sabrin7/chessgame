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

public class Bishop extends Piece{
	public ImageView bishop;
	
	public Bishop(Position p ,couleur coul) {
		super.coul=coul;
		super.position=p;
		super.valeur=3;
		
		   super.selected=false;
           if(this.coul==couleur.white){ super.image=new Image("images/white-bishop.png"); }
           if(this.coul==couleur.black){ super.image=new Image("images/black-bishop.png"); }
           bishop =new ImageView(image);
           bishop.setFitHeight(50);
           bishop.setFitWidth(50);
           bishop.setTranslateY(position.ligne*50);
           bishop.setTranslateX(position.colonne*50);
          
	}
	
	
	           
        @Override
        public void selectionnerPiece(final Piece[][] m, Board b){
            List<Position>l=deplacementPrimaire(m);
            for(Position ppp : l){
                            b.ChangeColor(ppp.ligne, ppp.colonne, m);
                }}
        
        @Override
        public void deselectionnerPiece(final Piece[][] m, Board b){
            List<Position> l=deplacementPrimaire(m);		
            for(Position ppp : l){
                            b.ReturnColor(ppp.ligne, ppp.colonne, m);
            }
        }
         

		

	public List<Position> deplacementPrimaire(Piece[][] m){
		List<Position> l=new ArrayList<Position>();
		int i=position.ligne;
		int j=position.colonne;
		while(  i<7 &&  j<7 ) {
			i++;j++;
			if(m[i][j].coul==this.coul )
				break;
			else if((coul==couleur.white && m[i][j].coul==couleur.black)||(coul==couleur.black && m[i][j].coul==couleur.white)) {
				Position p=new Position(i,j);
				l.add(p);
				break;
					}
			else {
			Position p=new Position(i,j);
			l.add(p);
				}
			
		}
		i=position.ligne;
		j=position.colonne;
		
		while( i<7 && 0<j) {
			i++;j--;
			if(m[i][j].coul==this.coul)
				break;
			else if((coul==couleur.white && m[i][j].coul==couleur.black)||(coul==couleur.black && m[i][j].coul==couleur.white)) {
				Position p=new Position(i,j);
				l.add(p);
				break;
					}
			else {
			Position p=new Position(i,j);
			l.add(p);}
		}
		i=position.ligne;
		j=position.colonne;
		while(0<i  && j<7 ) {
			i--;j++;
			if(m[i][j].coul==this.coul)
				break;
			else if((coul==couleur.white && m[i][j].coul==couleur.black)||(coul==couleur.black && m[i][j].coul==couleur.white)) {
				Position p=new Position(i,j);
				l.add(p);
				break;
					}
			else {
			Position p=new Position(i,j);
			l.add(p);}
		}
		i=position.ligne;
		j=position.colonne;
		while(0<i && 0<j ) {
			i--;j--;
			if(m[i][j].coul==this.coul)
				break;
			else if((coul==couleur.white && m[i][j].coul==couleur.black)||(coul==couleur.black && m[i][j].coul==couleur.white)) {
				Position p=new Position(i,j);
				l.add(p);
				break;
					}
			else {
			Position p=new Position(i,j);
			l.add(p);}
		}
		
	return l;
	
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
                            this.bishop.setTranslateX(position.colonne*50);
                            this.bishop.setTranslateY(position.ligne*50);
                            
			break;
		}
	}	
	
}	
}
