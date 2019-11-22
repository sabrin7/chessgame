/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author sabri
 */

import controller.Gestion;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

public class PlayersFile {
    public static void ecrire()
 { PrintWriter fluxSortie = null;
 try
 {
 fluxSortie =
 new PrintWriter(new FileOutputStream("fichier.txt"));
 }
 catch(FileNotFoundException e)
 { System.out.println("Erreur d’ouverture fichier.txt.");
 System.exit(0);
 }
 
 Vector<Player> vec=Gestion.getAllPlayer();
        for(Player p:vec){
        fluxSortie.println(p);}
 System.out.println("Ecriture sur fichier");
 fluxSortie.close( );
 System.out.println("Fin du programme.");
 }
}