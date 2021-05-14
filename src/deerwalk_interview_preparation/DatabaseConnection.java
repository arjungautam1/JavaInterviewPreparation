/**
 * @author Arjun Gautam
 * Project :JavaEssential
 * Date : 2021-05-14
 * Time : 16:10
 */
package deerwalk_interview_preparation;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/deerwalk", "root", "");

            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from hello");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1)+" "+ resultSet.getString(2));
            }
            con.close();


        } catch (Exception e) {
            System.out.println(e);

        }
    }

}
