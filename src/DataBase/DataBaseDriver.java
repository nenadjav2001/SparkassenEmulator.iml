package DataBase;



import javax.swing.*;
import java.sql.*;




public class DataBaseDriver {


    public DataBaseDriver(){



    }

    public void addingDataToDatabase(String pins) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sparkassepins", "root", "root");

            // Verwende PreparedStatement, um SQL-Injection zu verhindern
            String sql = "INSERT INTO bank_konten (pins) VALUES (?)";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                // Setze die Werte für die Platzhalter
                preparedStatement.setString(1, pins);

                // Führe die Aktualisierung durch
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null , "Daten wurden Erfolgreich in die Datenbank geladen");
                } else {
                    JOptionPane.showMessageDialog(null , "Daten wurden nicht in die Datenbank geladen");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public boolean pinFinder(String pins){

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sparkassepins" , "root" , "root");
            String sql = "SELECT * FROM bank_konten WHERE pins = ? ";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setString(1, pins);

                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()){
                    JOptionPane.showMessageDialog(null , "Pin wurde gefunden er ist " + pins);


                } else {
                    JOptionPane.showMessageDialog(null , "Falscher-Pin");
                    return false;
                }


            }

        }catch (SQLException exception){
            exception.printStackTrace();

        }

        return false;


    }







}


