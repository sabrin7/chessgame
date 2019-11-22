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

import java.util.List;

import javafx.scene.Parent;
import javafx.scene.image.Image;

public abstract class Piece extends Parent {
	public couleur coul;
	protected int valeur;
	public Position position;
	
	
	
    public boolean selected;
    public Image image;

    
    abstract void deselectionnerPiece(final Piece[][] m, Board b);
    abstract void selectionnerPiece(final Piece[][] m, Board b);
    
	public abstract void deplacer(int positionLigne,int positionColonne,Piece[][] m);
	public abstract List<Position> deplacementPrimaire(Piece[][] m);
	public abstract List<Position> show();
	

}
