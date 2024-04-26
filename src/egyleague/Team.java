/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package egyleague;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Team {
    private int id;
    private String name;
    private int total_score;
    private String CaptianName;
    private int matchId;
    private String StadiumName;


    public Team(int id, String name, int total_score, String CaptianName, int matchId, String StadiumName) {
        this.id = id;
        this.name = name;
        this.total_score = total_score;
        this.CaptianName = CaptianName;
        this.matchId = matchId;
        this.StadiumName = StadiumName;
    }

   

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal_score(int total_score) {
        this.total_score = total_score;
    }

    public void setCaptian_Name(String CaptianName) {
        this.CaptianName = CaptianName;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotal_score() {
        return total_score;
    }

    public String getCaptianName() {
        return CaptianName;
    }

    public int getMatchId() {
        return matchId;
    }

    public String getStadiumName() {
        return StadiumName;
    }

    public void setStadiumName(String StadiumName) {
        this.StadiumName = StadiumName;
    }
    

    
}
