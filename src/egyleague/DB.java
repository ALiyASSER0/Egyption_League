/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package egyleague;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DB {

    private final String url;
    private final String user;
    private final String password;

    public DB(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void insertTeam(Team team) throws SQLException {
        try (Connection connection = getConnection()) {
            String sql = "INSERT INTO teams (id, name, total_score, CaptianName,matchId,StadiumName) VALUES (?, ?, ?, ?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, team.getId());
            statement.setString(2, team.getName());
            statement.setInt(3, team.getTotal_score());
            statement.setString(4, team.getCaptianName());
            statement.setInt(5, team.getMatchId());
            statement.setString(6, team.getStadiumName());
            statement.executeUpdate();
        }

    }

    public void insertPlayer(players player) throws SQLException {
        {

            try (Connection connection = getConnection()) {
                String sql = "INSERT INTO Players (playerId, name,number, age, score,rank,role) VALUES (?,?,?, ?, ?,?,?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, player.getPlayerId());
                statement.setString(2, player.getName());
                statement.setInt(3, player.getNumber());
                statement.setInt(4, player.getAge());
                statement.setInt(5, player.getScore());
                statement.setInt(6, player.getRank());
                statement.setString(7, player.getRole());

                statement.executeUpdate();
            
            

            }
        }

    }


}

