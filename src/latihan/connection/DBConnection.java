package latihan.connection;

//import sql lib


//---------------------------------------------------
//MAKE SURE EVERYTHING SAME WITH YOUR CONFIGURATION!!
//---------------------------------------------------
//EXPLAIN ALL OF THESE SYNTAX LINE BY LINE!!!
//---------------------------------------------------

public class DBConnection {
    private String url;
    private String username;
    private String password;

    //make constructor
    public DBConnection(//fill the params) {
        //todo here...
    }

    public void displayData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM ...";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                //set the result based on your table atribute
                //E.g : int id = resultSet.getInt("id");
                //todo here...

                // Display the retrieved data
                //todo here...
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load JDBC driver");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection error");
            e.printStackTrace();
        }
    }
}
