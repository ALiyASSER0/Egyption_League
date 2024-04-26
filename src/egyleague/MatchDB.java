package egyleague;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *
 * @author DELL
 */
public class MatchDB {
    private final Connection connection;

    public MatchDB(Connection connection) {
        this.connection = connection;
    }
    public Team getTeamById(int id) throws SQLException {
    try (Connection connection = getConnection()) {
        String sql = "SELECT * FROM teams WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            int total_score = resultSet.getInt("total_score");
            String Captian_Name = resultSet.getString("Captian_Name");
            
            // Get players for the team
            List<Player> players = getPlayersForTeam(id);

            // Create the Team instance and populate the players list
            Team team = new Team(id, name, total_score, Captian_Name);
            team.setPlayers(players);
            return team;
        }
    }
    return null;
}

    public List<Match> getMatchesForTeam(int teamId) throws SQLException {
        List<Match> matches = new ArrayList<>();
        String sql = "SELECT * FROM matches WHERE team1_id = ? OR team2_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, teamId);
            statement.setInt(2, teamId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
            int matchId = resultSet.getInt("match_id");
            Date matchDate = resultSet.getDate("match_date");
            int team1Id = resultSet.getInt("team1_id");
            int team2Id = resultSet.getInt("team2_id");
            String footballReferee = resultSet.getString("football_referee");
            int team1Score = resultSet.getInt("team1_score");
            int team2Score = resultSet.getInt("team2_score");
            String stadiumName = resultSet.getString("stadium_name");
            
            // Fetch the team instances for team1 and team2 using teamId
            Team team1 = getTeamById(team1Id);
            Team team2 = getTeamById(team2Id);

            // Create a Score instance using retrieved scores
            Score score = new Score(team1Score, team2Score);

            // Create a Match instance and add it to the list
            Match match = new Match(matchId, matchDate, team1, team2, footballReferee, score, stadiumName);
            matches.add(match);
        }
    }
    return matches;
}

    private Connection getConnection() {
    }
     }