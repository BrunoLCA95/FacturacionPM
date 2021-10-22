package practicap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;


public class Conexion {
    
    private static final String base = "practicap"+"?serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "skypea95";
    private static final String url = "jdbc:mysql://localhost:3306/" + base;
    private static Connection con = null;
    static Statement sentencia;
    static ResultSet resultado;
    
    public static Connection getConection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
            sentencia=con.createStatement();
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }
    
    public static void insertarDato(String q){
        try {
            sentencia.executeUpdate(q);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    public static ArrayList<String> llenar_combo(String columna, String tabla){

        ArrayList<String> lista = new ArrayList<String>();
        try {

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection conectar;
            conectar = Conexion.getConection();
            String sql = "SELECT "+columna+" FROM practicap."+tabla+";";
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMD = rs.getMetaData();


            while (rs.next()) {

                lista.add(resultado.getString(columna));
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        
        return lista;
        
    }
    
    

    
    
    
}