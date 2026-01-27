package com.bl.csvdatahandling.generatecsvreportfromdatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.FileWriter;

public class StudentDBToCSV {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schooldb",
                "root",
                "admindisha26"
        );

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT id, name FROM student");

        FileWriter fw = new FileWriter("D:\\scenariospecifidir\\students_report.csv");
        fw.write("ID,Name\n");   // header

        while (rs.next()) {
            fw.write(
                    rs.getInt("id") + "," +
                    rs.getString("name") + "\n"
            );
        }

        fw.close();
        rs.close();
        st.close();
        con.close();

        System.out.println("Student CSV report generated");
    }
}
