package org.example;
import java.sql.*;

public class PostgresExample {
    public static void execute(){
        // JDBC URL, ユーザー名、パスワードを指定
        String url = "jdbc:postgresql://localhost:5432/playgrounddb";
        String user = "pompom";
        String password = "pompom";

        // 接続オブジェクト
        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");

            // 接続を確立
            connection = DriverManager.getConnection(url, user, password);
        }catch (Exception e){

        }
        try {
           // PreparedStatement preparedStatement = connection.prepareStatement("insert into all_data_types(json_col) values('{\"key\":\"value\"}')");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from all_data_types");


            ResultSet resultSet = preparedStatement.executeQuery();

            // 結果を処理
            while (resultSet.next()) {
                String text = resultSet.getString("json_col");


                System.out.println("text is " + text);
            }

            // リソースを閉じる
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 接続を閉じる
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}