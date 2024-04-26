/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package egyleague;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Match {
     private int id;
    private Date date;
    private Team team1;
    private Team team2;
    private String footballReferee;
    private Score score;
    private String stadiumName;

   public Match(int id, Date date, Team team1, Team team2, String footballReferee, Score score, String stadiumName) {
        this.id = id;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.footballReferee = footballReferee;
        this.score = score;
        this.stadiumName = stadiumName;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public String getFootballReferee() {
        return footballReferee;
    }

    public Score getScore() {
        return score;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public void setFootballReferee(String footballReferee) {
        this.footballReferee = footballReferee;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }
    
}
