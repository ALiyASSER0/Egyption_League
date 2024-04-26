/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package egyleague;

/**
 *
 * @author dell
 */
public class teamPlayer {
    private int id;
    private int playerId ;

    public teamPlayer(int id, int playerId) {
        this.id = id;
        this.playerId = playerId;
    }

    public int getId() {
        return id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    
    
}
