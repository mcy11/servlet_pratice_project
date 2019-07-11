package model.impl;

import dao.UserRelDao;
import model.UserRel;

import java.sql.*;

/**
 * @author mcy
 * @date 2019/7/11
 */
public class UserRelDaoImpl implements UserRelDao {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    static final String DB_URL = "jdbc:mysql://localhost:3306/pratice_db?serverTimezone=GMT&characterEncoding=utf8";
    @Override
    public int insert(UserRel userRel) {
        Connection connection = null;
        PreparedStatement statement = null;
        Integer line = null;
        try {
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);
            //获取数据库连接
            connection = DriverManager.getConnection(DB_URL,"root","");
            //构造sql
            String sql = "INSERT INTO user_rel (user_name,leading_name) VALUES (?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,userRel.getUserName());
            statement.setString(2,userRel.getLeadingName());
            //执行sql
            line = statement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            //释放连接资源
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return line;
    }
}
