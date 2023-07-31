package practice.week5_day4.jdbc;

import java.sql.*;

public class JdbcTest {

    /**
     * 1000원 이상 산 group singer를 구하는 SELECT 문을 JDBC로 실행해보자.
     * group_singer에 새로운 singer "르세라핌"을 넣어 INSERT 문을 JDBC로 실행해보자.     *
     * */

    //RDB, MySQL 접근 정보
    private static final String DB_URL = "jdbc:mysql://localhost:3306/supercoding";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1976128";

    public static void main(String[] args) {
        //Connection
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement();
        ){
            String stringSQL = "SELECT * "+
                                "FROM group_singer G "+
                                "   JOIN buy_history B "+
                                "   ON G.mem_id=B.mem_id "+
                                "WHERE price > 1000; ";
            ResultSet resultSet = statement.executeQuery(stringSQL);

            while(resultSet.next()){
                String memId = resultSet.getString("mem_id");
                String memName = resultSet.getString("mem_name");
                long price = resultSet.getLong("price");

                System.out.println("mem_id: "+memId+" mem_name: "+memName+" price "+price);
            }

            String stringSQL2 = "INSERT INTO group_singer(mem_id, mem_name, mem_number, addr, phone, height, debut_date) "+
                    "VALUES('M1212', '르세라핌', 5, '서울', 0101231234, 172, '2022-12-06');";
            statement.executeUpdate(stringSQL2);

        } catch (SQLException e){
            throw new RuntimeException(e);
        }


    }
}
