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

public class King extends Piece {
	public ImageView king;
	
	public King(Position p,couleur coul) {
		super.coul=coul;
		super.position=p;
		super.valeur=100;
		
		super.selected=false;
        if(this.coul==couleur.white){ super.image=new Image("images/white-king.png"); }
        if(this.coul==couleur.black){ super.image=new Image("images/black-king.png"); }
        king=new ImageView(image);
        king.setFitHeight(50);
        king.setFitWidth(50);
        king.setTranslateY(position.ligne*50);
        king.setTranslateX(position.colonne*50);
       
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
		if (i<7) {
			if (m[i+1][j].coul!= this.coul) {Position pp=new Position(i+1,j);l.add(pp);}
			if(j<7 && m[i+1][j+1].coul != this.coul) {Position p=new Position(i+1,j+1);l.add(p);}
			if(j>0 && m[i+1][j-1].coul != this.coul) {Position p=new Position(i+1,j-1);l.add(p);}

		}
		if (i>0) {
			if(m[i-1][j].coul != this.coul) {Position pp=new Position(i-1,j);l.add(pp);}
			if(j<7 && m[i-1][j+1].coul != this.coul) {Position p=new Position(i-1,j+1);l.add(p);}
			if(j>0 && m[i-1][j+1].coul != this.coul) {Position p=new Position(i-1,j-1);l.add(p);}

		}
		if(j<7 && m[i][j+1].coul != this.coul) {	Position p=new Position(i,j+1);l.add(p);}
		if(j>0 && m[i][j-1].coul != this.coul) {	Position p=new Position(i,j-1);l.add(p);}
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
                            this.king.setTranslateX(position.colonne*50);
                            this.king.setTranslateY(position.ligne*50);
                            
			break;
		}
	}	
	
}
	
}
