package com.ar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Conexion {
    private String jdbcURL = "jdbc:mysql://localhost:3306/bd_peliculas";
    private String jdbcUsername = "root";
    private String jdbcPassword = "admin";

    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e);
        }
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    public List<Pelicula> getPelicula() {
        List<Pelicula> peliculas = new ArrayList<>();
        String sql = "SELECT * FROM peliculas";

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.setId(rs.getInt("id"));
                pelicula.setTitulo(rs.getString("titulo"));
                pelicula.setGenero(rs.getString("genero"));
                pelicula.setDuracion(rs.getString("duracion"));
                pelicula.setImagen(rs.getString("imagen"));
                peliculas.add(pelicula);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return peliculas;
    }

    public void addPelicula(Pelicula pelicula) throws SQLException {
        String sql = "INSERT INTO peliculas (titulo, genero, duracion, imagen) VALUES (?, ?, ?, ?)";
        Connection conn = getConnection();
        try (
                PreparedStatement stmt = conn.prepareStatement(sql)) {  
            stmt.setString(1, pelicula.getTitulo());
            stmt.setString(2, pelicula.getGenero());
            stmt.setString(3, pelicula.getDuracion());
            stmt.setString(4, pelicula.getImagen());
            stmt.executeUpdate();
        } finally {
            conn.close();
        }
    }

    public void deletePelicula(int id) throws SQLException {
        String sql = "DELETE FROM peliculas WHERE id = ?";
        Connection conn = getConnection();
        try (
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } finally {
            conn.close();
        }
    }
}