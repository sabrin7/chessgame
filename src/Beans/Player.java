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
public class Player {
    private int id;
    private String username;
    private String password;
    
    public Player(int id, String username, String password) {
        this.id=id;
        this.username = username;
        this.password = password;
    }

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", username=" + username + ", password=" + password + '}';
    }
    
    
    
}
