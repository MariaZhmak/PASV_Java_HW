package homeWork.dataBase;

import homeWork.entities.User;
import homeWork.enums.Status;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUser {
    public static void main(String[] args) throws SQLException {

        String dbUser = "postgres";
        String dbPassword = "Moremore";
        String dbUrl = "jdbc:postgresql://localhost:5432/users";
        String dbDriver = "org.postgresql.Driver";

        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
//            System.out.println("SUCCESS" + conn);  // Проверка, что соединение успешно прошло
            Statement statement = conn.createStatement();
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS user_profile_list(\n" +
//                    "id SERIAL NOT NULL PRIMARY KEY,\n" +
//                    "first_name VARCHAR(100),\n" +
//                    "last_name VARCHAR(100),\n" +
//                    "email VARCHAR(100),\n" +
//                    "birth_date TIMESTAMP,\n" +
//                    "status VARCHAR(15) DEFAULT 'ACTIVE',\n" +
//                    "registered_date DATE NOT NULL DEFAULT CURRENT_DATE\n" +
//                    ");");
//
//            statement.executeUpdate("INSERT INTO user_profile_list (first_name, last_name, email, registered_date, status)\n" +
//                    "VALUES ('Anna', 'Apreleva', 'aapreleva@gmail.com', '2024-09-30', 'ACTIVE'),\n" +
//                    "('Ben', 'Borinov', 'bborinov@gmail.com', '2024-09-25', 'ACTIVE'),\n" +
//                    "('Cat', 'Caleva', 'ccaleva@gmail.com', '2024-09-28', 'ACTIVE'),\n" +
//                    "('Den', 'Denisov', 'ddenisov@gmail.com', '2024-09-12', 'ACTIVE'),\n" +
//                    "('Ivan', 'Ivanov', 'iivanov@gmail.com', '2024-09-23', 'ACTIVE'),\n" +
//                    "('Faina', 'Folieva', 'ffolieva@gmail.com', '2024-09-25', 'ACTIVE'),\n" +
//                    "('Gabby', 'Golovina', 'ggolovina@gmail.com', '2024-09-30', 'ACTIVE');");

            // Распечатывает результат в консоле
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM user_profile_list");
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt("id"));
//                System.out.println(resultSet.getString("first_name"));
//                System.out.println(resultSet.getString("last_name"));
//                System.out.println(resultSet.getString("email"));
//                System.out.println(resultSet.getDate("registered_date"));
//                System.out.println(resultSet.getString("status"));
//                System.out.println("======================================================================");
//            }

            ResultSet resultSet = statement.executeQuery("SELECT * FROM user_profile_list");

            List<User> userProfiles = new ArrayList<>();
            while (resultSet.next()) {
                User userProfile = new User();
                userProfile.setUserId(resultSet.getInt("id"));
                userProfile.setFirstName(resultSet.getString("first_name"));
                userProfile.setLastName(resultSet.getString("last_name"));
                userProfile.setEmail(resultSet.getString("email"));
                userProfile.setRegisteredDate(resultSet.getDate("registered_date").toLocalDate());
                userProfile.setStatus(Status.getStatus(resultSet.getString("status")));
                userProfiles.add(userProfile);
            }
            userProfiles.forEach(System.out::println);

        }


    }


}
