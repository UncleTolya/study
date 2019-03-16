package main.mysqlstudy;

import main.junitstudy.persons.Sex;
import main.junitstudy.persons.workers.Worker;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {
    static Connection connection;

    public static void main(String[] args) throws Exception {
        connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        String query = "select * from person";
        ResultSet set = statement.executeQuery(query);
        System.out.println("Select statement from DB has been complete");
        Worker worker = null;
        while (set.next()) {
            int id = set.getInt(1);
            String name = set.getString(2);
            int age = set.getInt(3);
            worker = new Worker(name, age, Sex.MALE);;
        }
        worker.beingSevere();
        System.out.printf("%s, say: i am %d years old!", worker.getName(), worker.getAge());
    }
}
