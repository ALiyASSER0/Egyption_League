/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package egyleague;

/**
 *
 * @author dell
 */
public class players {
    private int playerId ;
    private String name;
    private int number;
    private int age ;
    private int score;
    private int rank;
    private String role;

    public players(int playerId, String name, int number, int age, int score, int rank, String role) {
        this.playerId = playerId;
        this.name = name;
        this.number = number;
        this.age = age;
        this.score = score;
        this.rank = rank;
        this.role = role;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public int getRank() {
        return rank;
    }

    public String getRole() {
        return role;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}
