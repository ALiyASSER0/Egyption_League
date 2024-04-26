/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package egyleague;

public class EgyLeague {

    public static void main(String[] args) {

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/egyptianleague";
        String user = "root";
        String password = "";

        // Create a DatabaseHandler instance
        DB databaseHandler = new DB(url, user, password);

        try {
          //   Insert a new team
           //   Team newTeam = new Team(1, "Team A", 23,"mohamed");
           // databaseHandler.insertTeam(newTeam);
          
            // Retrieve a team by ID
            //Team retrievedTeam = databaseHandler.getTeamById(1);
            if (retrievedTeam != null) {
                System.out.println("Retrieved Team: " + retrievedTeam.getName());
            } else {
                System.out.println("Team not found");
            }

            // Perform other database operations for players, matches, scores, etc.
            
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}

        
   