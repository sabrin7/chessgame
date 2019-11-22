/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import chessgame.Bishop;
import chessgame.Board;
import chessgame.Empty;
import chessgame.King;
import chessgame.Knight;
import chessgame.Pawn;
import chessgame.Piece;
import chessgame.Place;
import chessgame.Position;
import chessgame.Queen;
import chessgame.Rock;
import chessgame.couleur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author sabri
 */
public class Game extends Parent {
    
    private couleur testCoul=couleur.white;
	private BorderPane ro= new BorderPane();
    private static Stage stage;
public Game(Stage primaryStage) {
         stage=primaryStage;
final Piece[][] bord = new Piece[8][8];
final Board board = new Board(bord);

Position pp;
for(int i=0;i<8;i++) 
	for(int j=0;j<8;j++) {
		pp=new Position(i,j);
		Empty p=new Empty(pp );
		bord[i][j]=p;
		}
ro.getChildren().add(board);


//---------------------------------------------------------------------------

Position p=new Position(6,0);
final Pawn WhitePawn1= new Pawn(p, couleur.white);
bord[6][0]=WhitePawn1;
ro.getChildren().add(WhitePawn1.pawn);

WhitePawn1.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
		    WhitePawn1.selectionnerPiece(bord,board); 		
	  } }
	);

WhitePawn1.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 WhitePawn1.deselectionnerPiece(bord, board);
	 if(WhitePawn1.coul==testCoul) {
		 WhitePawn1.deplacer(Place.they,Place.thex, bord);
		 if(WhitePawn1.position.ligne==Place.they && WhitePawn1.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }
	 
	 }});

//-----------------------------------------------------------------------------

p=new Position(6,1);
final Pawn WhitePawn2= new Pawn(p, couleur.white);
bord[6][1]=WhitePawn2;
ro.getChildren().add(WhitePawn2.pawn);

WhitePawn2.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     WhitePawn2.selectionnerPiece(bord ,board);
	 } });

	WhitePawn2.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 WhitePawn2.deselectionnerPiece(bord, board);
	 if(WhitePawn2.coul==testCoul) {
		 WhitePawn2.deplacer(Place.they,Place.thex, bord);
		 if(WhitePawn2.position.ligne==Place.they && WhitePawn2.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 	}
	 } );

//-----------------------------------------------------------------------------

p=new Position(6,2);
final Pawn WhitePawn3= new Pawn(p, couleur.white);
bord[6][2]=WhitePawn3;
ro.getChildren().add(WhitePawn3.pawn);

WhitePawn3.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     WhitePawn3.selectionnerPiece(bord,board);
	 } });

	WhitePawn3.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 WhitePawn3.deselectionnerPiece(bord, board);
	 if(WhitePawn3.coul==testCoul) {
		 WhitePawn3.deplacer(Place.they,Place.thex, bord);
		 if(WhitePawn3.position.ligne==Place.they && WhitePawn3.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------

p=new Position(6,3);
final Pawn WhitePawn4= new Pawn(p, couleur.white);
bord[6][3]=WhitePawn4;
ro.getChildren().add(WhitePawn4.pawn);
WhitePawn4.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     WhitePawn4.selectionnerPiece(bord,board);
	 } });

	WhitePawn4.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 WhitePawn4.deselectionnerPiece(bord, board);
	 if(WhitePawn4.coul==testCoul) {
		 WhitePawn4.deplacer(Place.they,Place.thex, bord);
		 if(WhitePawn4.position.ligne==Place.they && WhitePawn4.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(6,4);
final Pawn WhitePawn5= new Pawn(p, couleur.white);
bord[6][4]=WhitePawn5;
ro.getChildren().add(WhitePawn5.pawn);


WhitePawn5.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     WhitePawn5.selectionnerPiece(bord,board);
	 } });

	 WhitePawn5.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 WhitePawn5.deselectionnerPiece(bord, board);
	 if(WhitePawn5.coul==testCoul) {
		 WhitePawn5.deplacer(Place.they,Place.thex, bord);
		 if(WhitePawn5.position.ligne==Place.they && WhitePawn5.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(6,5);
final Pawn WhitePawn6= new Pawn(p, couleur.white);
bord[6][5]=WhitePawn6;
ro.getChildren().add(WhitePawn6.pawn);

WhitePawn6.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     WhitePawn6.selectionnerPiece(bord,board);
	 } });
	 WhitePawn6.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 WhitePawn6.deselectionnerPiece(bord, board);
	 if(WhitePawn6.coul==testCoul) {
		 WhitePawn6.deplacer(Place.they,Place.thex, bord);
		 if(WhitePawn6.position.ligne==Place.they && WhitePawn6.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(6,6);
final Pawn WhitePawn7= new Pawn(p, couleur.white);
bord[6][6]=WhitePawn7;
ro.getChildren().add(WhitePawn7.pawn);

WhitePawn7.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     WhitePawn7.selectionnerPiece(bord,board);
	 } });
	 WhitePawn7.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 WhitePawn7.deselectionnerPiece(bord, board);
	 if(WhitePawn7.coul==testCoul) {
		 WhitePawn7.deplacer(Place.they,Place.thex, bord);
		 if(WhitePawn7.position.ligne==Place.they && WhitePawn7.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(6,7);
final Pawn WhitePawn8= new Pawn(p, couleur.white);
bord[6][7]=WhitePawn8;
ro.getChildren().add(WhitePawn8.pawn);

WhitePawn8.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     WhitePawn8.selectionnerPiece(bord,board);
	 } });
	 WhitePawn8.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 WhitePawn8.deselectionnerPiece(bord, board);
	 if(WhitePawn8.coul==testCoul) {
		 WhitePawn8.deplacer(Place.they,Place.thex, bord);
		 if(WhitePawn8.position.ligne==Place.they && WhitePawn8.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(7,4);
final King kingW= new King(p,couleur.white);
bord[7][4]=kingW;
ro.getChildren().add(kingW.king);

kingW.king.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     kingW.selectionnerPiece(bord,board);
	     }  });
	kingW.king.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 kingW.deselectionnerPiece(bord,board);
	 if(kingW.coul==testCoul) {
		 kingW.deplacer(Place.they,Place.thex, bord);
		 if(kingW.position.ligne==Place.they && kingW.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(7,3);
final Queen queenW=new Queen(p,couleur.white);
bord[7][3]=queenW;
ro.getChildren().add(queenW.queen);

queenW.queen.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     queenW.selectionnerPiece(bord,board);
	 } });

	queenW.queen.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	queenW.deselectionnerPiece(bord,board);
	 if(queenW.coul==testCoul) {
		 queenW.deplacer(Place.they,Place.thex, bord);
		 if(queenW.position.ligne==Place.they && queenW.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(7,2);
final Bishop bishopW=new Bishop(p,couleur.white);
bord[7][2]=bishopW;
ro.getChildren().add(bishopW.bishop);

bishopW.bishop.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     bishopW.selectionnerPiece(bord,board);
	 } });

	bishopW.bishop.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 bishopW.deselectionnerPiece(bord,board);
	 if(bishopW.coul==testCoul) {
		 bishopW.deplacer(Place.they,Place.thex, bord);
		 if(bishopW.position.ligne==Place.they && bishopW.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(7,5);
final Bishop bishopB=new Bishop(p, couleur.white);
bord[7][5]=bishopB;
ro.getChildren().add(bishopB.bishop);

bishopB.bishop.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     bishopB.selectionnerPiece(bord,board);
	 } });

	bishopB.bishop.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 bishopB.deselectionnerPiece(bord,board);
	 if(bishopB.coul==testCoul) {
		 bishopB.deplacer(Place.they,Place.thex, bord);
		 if(bishopB.position.ligne==Place.they && bishopB.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(7,1);
final Knight knightB=new Knight(p, couleur.white);
bord[7][1]=knightB;
ro.getChildren().add(knightB.knight);

knightB.knight.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     knightB.selectionnerPiece(bord,board);
	 } });

	knightB.knight.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 knightB.deselectionnerPiece(bord,board);
	 if(knightB.coul==testCoul) {
		 knightB.deplacer(Place.they,Place.thex, bord);
		 if(knightB.position.ligne==Place.they && knightB.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(7,6);
final Knight knightW=new Knight(p, couleur.white);
bord[7][6]=knightW;
ro.getChildren().add(knightW.knight);

knightW.knight.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     knightW.selectionnerPiece(bord,board);
	 } });

	knightW.knight.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	knightW.deselectionnerPiece(bord,board);
	 if(knightW.coul==testCoul) {
		 knightW.deplacer(Place.they,Place.thex, bord);
		 if(knightW.position.ligne==Place.they && knightW.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(7,0);
final Rock rockW=new Rock(p, couleur.white);
bord[7][0]=rockW;
ro.getChildren().add(rockW.rock);
rockW.rock.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     rockW.selectionnerPiece(bord,board);
	 } });

	rockW.rock.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 rockW.deselectionnerPiece(bord,board);
	 if(rockW.coul==testCoul) {
		 rockW.deplacer(Place.they,Place.thex, bord);
		 if(rockW.position.ligne==Place.they && rockW.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(7,7);
final Rock rockB=new Rock(p, couleur.white);
bord[7][7]=rockB;
ro.getChildren().add(rockB.rock);
rockB.rock.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     rockB.selectionnerPiece(bord,board);
	 } });

	rockB.rock.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 rockB.deselectionnerPiece(bord,board);
	 if(rockB.coul==testCoul) {
		 rockB.deplacer(Place.they,Place.thex, bord);
		 if(rockB.position.ligne==Place.they && rockB.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(1,0);
final Pawn BlackPawn01=new Pawn(p,couleur.black);
bord[1][0]=BlackPawn01;
ro.getChildren().add(BlackPawn01.pawn);
BlackPawn01.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	          BlackPawn01.selectionnerPiece(bord,board);
	 } });
	BlackPawn01.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 BlackPawn01.deselectionnerPiece(bord,board);
	 if(BlackPawn01.coul==testCoul) {
		 BlackPawn01.deplacer(Place.they,Place.thex, bord);
		 if(BlackPawn01.position.ligne==Place.they && BlackPawn01.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 
	 }});
//-----------------------------------------------------------------------------


p=new Position(1,1);
final Pawn BlackPawn02=new Pawn(p,couleur.black);
bord[1][1]=BlackPawn02;
ro.getChildren().add(BlackPawn02.pawn);

BlackPawn02.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackPawn02.selectionnerPiece(bord,board);
	 } });
	BlackPawn02.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 BlackPawn02.deselectionnerPiece(bord,board);
	 if(BlackPawn02.coul==testCoul) {
		 BlackPawn02.deplacer(Place.they,Place.thex, bord);
		 if(BlackPawn02.position.ligne==Place.they && BlackPawn02.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(1,2);
final Pawn BlackPawn03=new Pawn(p,couleur.black);
bord[1][2]=BlackPawn03;
ro.getChildren().add(BlackPawn03.pawn);

BlackPawn03.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackPawn03.selectionnerPiece(bord,board);
	 } });
	BlackPawn03.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 BlackPawn03.deselectionnerPiece(bord,board);
	 if(BlackPawn03.coul==testCoul) {
		 BlackPawn03.deplacer(Place.they,Place.thex, bord);
		 if(BlackPawn03.position.ligne==Place.they && BlackPawn03.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(1,3);
final Pawn BlackPawn04=new Pawn(p,couleur.black);
bord[1][3]=BlackPawn04;
ro.getChildren().add(BlackPawn04.pawn);

BlackPawn04.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackPawn04.selectionnerPiece(bord,board);
	 } });
	BlackPawn04.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	BlackPawn04.deselectionnerPiece(bord,board);
	 if(BlackPawn04.coul==testCoul) {
			BlackPawn04.deplacer(Place.they,Place.thex, bord);
		 if(BlackPawn04.position.ligne==Place.they && BlackPawn04.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(1,4);
final Pawn BlackPawn05=new Pawn(p,couleur.black);
bord[1][4]=BlackPawn05;
ro.getChildren().add(BlackPawn05.pawn);
BlackPawn05.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackPawn05.selectionnerPiece(bord,board);
	 } });
	BlackPawn05.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	BlackPawn05.deselectionnerPiece(bord,board);
	 if(BlackPawn05.coul==testCoul) {
			BlackPawn05.deplacer(Place.they,Place.thex, bord);
		 if(BlackPawn05.position.ligne==Place.they && BlackPawn05.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(1,5);
final Pawn BlackPawn06=new Pawn(p,couleur.black);
bord[1][5]=BlackPawn06;
ro.getChildren().add(BlackPawn06.pawn);

BlackPawn06.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackPawn06.selectionnerPiece(bord,board);
	 } });
	BlackPawn06.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 BlackPawn06.deselectionnerPiece(bord,board);
	 if(BlackPawn06.coul==testCoul) {
			BlackPawn06.deplacer(Place.they,Place.thex, bord);
		 if(BlackPawn06.position.ligne==Place.they && BlackPawn06.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(1,6);
final Pawn BlackPawn07=new Pawn(p,couleur.black);
bord[1][6]=BlackPawn07;
ro.getChildren().add(BlackPawn07.pawn);

BlackPawn07.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	    BlackPawn07.selectionnerPiece(bord,board);
	 } });
	BlackPawn07.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	BlackPawn07.deselectionnerPiece(bord,board);
	 if(BlackPawn07.coul==testCoul) {
			BlackPawn07.deplacer(Place.they,Place.thex, bord);
		 if(BlackPawn07.position.ligne==Place.they && BlackPawn07.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(1,7);
final Pawn BlackPawn08=new Pawn(p,couleur.black);
bord[1][7]=BlackPawn08;
ro.getChildren().add(BlackPawn08.pawn);

BlackPawn08.pawn.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackPawn08.selectionnerPiece(bord,board);
	 } });
	BlackPawn08.pawn.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 BlackPawn08.deselectionnerPiece(bord,board);
	 if(BlackPawn08.coul==testCoul) {
			BlackPawn08.deplacer(Place.they,Place.thex, bord);
		 if(BlackPawn08.position.ligne==Place.they && BlackPawn08.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(0,4);
final King king=new King(p,couleur.black);
bord[0][4]=king;
ro.getChildren().add(king.king);
king.king.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     king.selectionnerPiece(bord,board);
	 } });
	king.king.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 king.deselectionnerPiece(bord,board);
	 if(king.coul==testCoul) {
		 king.deplacer(Place.they,Place.thex, bord);
		 if(king.position.ligne==Place.they && king.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(0,3);
final Queen queen=new Queen(p,couleur.black);
bord[0][3]=queen;
ro.getChildren().add(queen.queen);
queen.queen.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     queen.selectionnerPiece(bord,board);
	 } });
	queen.queen.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 queen.deselectionnerPiece(bord,board);
	 if(queen.coul==testCoul) {
		 queen.deplacer(Place.they,Place.thex, bord);
		 if(queen.position.ligne==Place.they && queen.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});
//-----------------------------------------------------------------------------


p=new Position(0,2);
final Bishop BlackBishopB=new Bishop(p,couleur.black);
bord[0][2]=BlackBishopB;
ro.getChildren().add(BlackBishopB.bishop);

BlackBishopB.bishop.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	    BlackBishopB.selectionnerPiece(bord,board);
	 } });
	BlackBishopB.bishop.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	BlackBishopB.deselectionnerPiece(bord,board);
	 if(BlackBishopB.coul==testCoul) {
			BlackBishopB.deplacer(Place.they,Place.thex, bord);
		 if(BlackBishopB.position.ligne==Place.they && BlackBishopB.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(0,5);
final Bishop BlackBishopW=new Bishop(p,couleur.black);
bord[0][5]=BlackBishopW;
ro.getChildren().add(BlackBishopW.bishop);
BlackBishopW.bishop.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackBishopW.selectionnerPiece(bord,board);
	 } });
	BlackBishopW.bishop.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 BlackBishopW.deselectionnerPiece(bord,board);
	 if(BlackBishopW.coul==testCoul) {
			BlackBishopW.deplacer(Place.they,Place.thex, bord);
		 if(BlackBishopW.position.ligne==Place.they && BlackBishopW.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});

//-----------------------------------------------------------------------------


p=new Position(0,1);
final Knight BlackKnightW=new Knight(p,couleur.black);
bord[0][1]=BlackKnightW;
ro.getChildren().add(BlackKnightW.knight);
BlackKnightW.knight.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackKnightW.selectionnerPiece(bord,board);
	 } });
	BlackKnightW.knight.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 BlackKnightW.deselectionnerPiece(bord,board);
	 if(BlackKnightW.coul==testCoul) {
			BlackKnightW.deplacer(Place.they,Place.thex, bord);
		 if(BlackKnightW.position.ligne==Place.they && BlackKnightW.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }

	 }});


//-----------------------------------------------------------------------------

p=new Position(0,6);
final Knight BlackKnightB=new Knight(p,couleur.black);
bord[0][6]=BlackKnightB;
ro.getChildren().add(BlackKnightB.knight);
BlackKnightB.knight.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackKnightB.selectionnerPiece(bord,board);
	 } });
	BlackKnightB.knight.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	 BlackKnightB.deselectionnerPiece(bord,board);
	 if(BlackKnightB.coul==testCoul) {
		 BlackKnightB.deplacer(Place.they,Place.thex, bord);	
		 if(BlackKnightB.position.ligne==Place.they && BlackKnightB.position.colonne==Place.thex) {
		    if(testCoul==couleur.white) testCoul=couleur.black ;
		    
		    else if (testCoul==couleur.black) testCoul=couleur.white ;
		 }
	 }
	

	 }});

//-----------------------------------------------------------------------------


p=new Position(0,0);
final Rock BlackRockB=new Rock(p,couleur.black);
bord[0][0]=BlackRockB;
ro.getChildren().add(BlackRockB.rock);
BlackRockB.rock.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackRockB.selectionnerPiece(bord,board);
	 } });
	BlackRockB.rock.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	     BlackRockB.deselectionnerPiece(bord,board);
	     if(BlackRockB.coul==testCoul) {
	 	 	BlackRockB.deplacer(Place.they,Place.thex, bord);
			 if(BlackRockB.position.ligne==Place.they && BlackRockB.position.colonne==Place.thex) {
			    if(testCoul==couleur.white) testCoul=couleur.black ;
			    
			    else if (testCoul==couleur.black) testCoul=couleur.white ;
			 }
		 }
    
	 }});
//-----------------------------------------------------------------------------


p=new Position(0,7);
final Rock BlackRockW=new Rock(p,couleur.black);
bord[0][7]=BlackRockW;
ro.getChildren().add(BlackRockW.rock);
BlackRockW.rock.setOnMousePressed(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	          BlackRockW.selectionnerPiece(bord,board);

	 } });
	BlackRockW.rock.setOnMouseReleased(new EventHandler<MouseEvent>(){
	 @Override
	 public void handle(MouseEvent me){
	      BlackRockW.deselectionnerPiece(bord,board);
	      if(BlackRockW.coul==testCoul) {
			 	BlackRockW.deplacer(Place.they,Place.thex, bord);
	 		 if(BlackRockW.position.ligne==Place.they && BlackRockW.position.colonne==Place.thex) {
	 		    if(testCoul==couleur.white) testCoul=couleur.black ;
	 		    
	 		    else if (testCoul==couleur.black) testCoul=couleur.white ;
	 		 }
	 	 }

	}});
//------------------------------------------------------------------------------

        Button retour=new Button();
        retour.setTranslateX(280);
         retour.setText("Return");
         retour.setMinWidth(100);
         retour.setMinHeight(40);
         retour.setTextFill(Color.CHOCOLATE);
         
         
retour.setOnAction(new EventHandler<ActionEvent>() {
    @Override public void handle(ActionEvent e) {
        Stage nouveauStage;
                nouveauStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                Scene scene = new Scene(new SignUp(nouveauStage), 400, 450);
                nouveauStage.show();
        
        }
});
ro.setBottom(retour);
Scene scene=new Scene(ro, 400,450, Color.CHOCOLATE);
stage.setScene(scene);

}
}