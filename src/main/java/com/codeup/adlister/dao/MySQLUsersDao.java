package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class MySQLUsersDao implements Users{
    private Connection connection = null;
    private PreparedStatement stmt = null;

    public MySQLUsersDao(Config config) {
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

        }catch (SQLException e){
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    @Override
    public User findByUsername(String username) {
//        PreparedStatement stmt = null;
        User user = new User();

        try{
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            user.setId(rs.getLong("id"));
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));

        }catch (SQLException e){
            throw new RuntimeException("Can not find user",e);
        }
        return  user;

    }

    @Override
    public Long insert(User user) {
        String sql = "INSERT INTO users(username, email, password) VALUES(?,?,?)";
        long id = 0;
        try{
        PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, user.getUsername());
        stmt.setString(2, user.getPassword());
        stmt.setString(3, user.getEmail());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        rs.next();
         id = rs.getLong(1);

        }catch (SQLException e){
            throw new RuntimeException("Error creating User.", e);
        } return id;
    }

    private String createInsertQuery(User user) {
        String sql = "CREATE USER (user_id, username, password, email) VALUES (?,?,?,?)";
        return sql;
    }
}
