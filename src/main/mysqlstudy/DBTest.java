package main.mysqlstudy;

import main.junitstudy.persons.Sex;
import main.junitstudy.persons.workers.Worker;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
    static Connection connection;
    static Statement statement;

    public static void main(String[] args) throws Exception {
        connection = DBConnection.getConnection();
        statement = connection.createStatement();
        testStatementClass();
        soutEmployeeOrderByLnameAndFname();

    }

    public static void testStatementClass() throws SQLException {
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
        System.out.println();
    }

    public static void soutEmployeeOrderByLnameAndFname() throws SQLException {
        String query = "select emp_id, fname, lname from employee order by lname, fname";
        ResultSet set = statement.executeQuery(query);
        System.out.println("Select statement from DB has been complete");
        while (set.next()) {
            int id = set.getInt("emp_id");
            String fname = set.getString("fname");
            String lname = set.getString("lname");
            System.out.println(id + "\t" + fname + "\t" + lname);
        }
        System.out.println();
    }
}
