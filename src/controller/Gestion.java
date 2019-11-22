/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Beans.Player;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sabri
 */
public class Gestion {
    
    private static Connection obtenirCnx(){
    Connection con = null;
    String url="jdbc:oracle:thin:@desktop-bO7ll38:1521:XE";
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Pilote charge");
        
        con=DriverManager.getConnection(url,"ab", "ab");
        
        
        System.out.println("connection marche");
        return con;
    
    }
    catch(Exception ex){
    System.out.println(ex.getMessage());
    return null;
    }
    }
    public static void setPlayer(String sql){
    Statement sta;
        try {
            sta = obtenirCnx().createStatement();
           sta.executeQuery(sql);
           sta.executeQuery("commit");
        } catch (SQLException ex) {
            Logger.getLogger(Gestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public static Vector<Player> getAllPlayer(){
    try{
    String sql="select * from player";
    Statement sta=obtenirCnx().createStatement();
    ResultSet res= sta.executeQuery(sql);
    
    Vector<Player> vec= new Vector<Player>();
    while(res.next()){
    Player p= new Player( res.getInt("id"),res.getString("username"), res.getString("password"));
    vec.add(p);
    }
    return vec;
    }
    catch(Exception e){
    System.out.println(e.getMessage());
    return null;
    }
    }
    
}
