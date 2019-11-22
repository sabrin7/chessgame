/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

import java.util.ArrayList;
import java.util.List;



public class Empty extends Piece{

	public Empty() {}
	public Empty(Position p) {
		super.coul=couleur.none;
		super.position=p;
		super.valeur=3;
		
	    super.selected=false;
	}
	public void deplacer(int positionLigne,int positionColonne, Piece[][] m) {}
	public List<Position> show(){
		List<Position> l=new ArrayList<Position>();
	return l;
	}
	
	public List<Position> deplacementPrimaire(Piece[][] m){
		
		List<Position> l=new ArrayList<Position>();
		return l;

	}
	
    @Override
    void deselectionnerPiece(Piece[][] m, Board b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void selectionnerPiece(Piece[][] m, Board b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
