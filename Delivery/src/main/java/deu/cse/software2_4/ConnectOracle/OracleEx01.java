/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.ConnectOracle;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tlatl
 */
public class OracleEx01 {

    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@sedb.deu.ac.kr:1521:orcl";
    String user = "A20163345";
    String password = "20163345";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@sedb.deu.ac.kr:1521:orcl";
        String user = "A20163345";
        String password = "20163345";
        try {
            Class.forName(driver);
            System.out.println("jdbc driver 로딩 성공");
            DriverManager.getConnection(url, user, password);
            System.out.println("오라클 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc driver 로딩 실패");
        } catch (SQLException e) {
            System.out.println("오라클 연결 실패");
        }
    }
}

