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

public class Knight extends Piece{
    public ImageView knight;


	public Knight(Position p,couleur coul) {
		super.coul=coul;
		super.position=p;
		super.valeur=3;
		
		  super.selected=false;
          if(this.coul==couleur.white){ super.image=new Image("images/white-knight.png"); }
          if(this.coul==couleur.black){ super.image=new Image("images/black-knight.png"); }
          knight =new ImageView(image);
          knight.setFitHeight(50);
          knight.setFitWidth(50);
          knight.setTranslateY(position.ligne*50);
          knight.setTranslateX(position.colonne*50);}
         
          
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
		if (i<7) {
			if(j<6 && m[i+1][j+2].coul!=this.coul) {Position p=new Position(i+1,j+2);l.add(p);}
			if(j>1 && m[i+1][j-2].coul!=this.coul) {Position p=new Position(i+1,j-2);l.add(p);}

		}
		if (i<6) {
			if(j<7 && m[i+2][j+1].coul!=this.coul) {Position p=new Position(i+2,j+1);l.add(p);}
			if(j>0 && m[i+2][j-1].coul!=this.coul) {Position p=new Position(i+2,j-1);l.add(p);}

		}
		if (i>0) {
			if(j<6 && m[i-1][j+2].coul!=this.coul) {Position p=new Position(i-1,j+2);l.add(p);}
			if(j>1 && m[i-1][j-2].coul!=this.coul) {Position p=new Position(i-1,j-2);l.add(p);}

		}
		if (i>1) {
			if(j<7 && m[i-2][j+1].coul!=this.coul) {Position p=new Position(i-2,j+1);l.add(p);}
			if(j>0 && m[i-2][j-1].coul!=this.coul) {Position p=new Position(i-2,j-1);l.add(p);}

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
                            this.knight.setTranslateX(position.colonne*50);
                            this.knight.setTranslateY(position.ligne*50);
                            
			break;
		}
	}	
	
}
}
