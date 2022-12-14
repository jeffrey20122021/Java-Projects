package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import utilidades.Propiedades;

public abstract class Conexion {

    private String usuario;
    private String clave;
    private String url;
    private String driver;
    protected Connection objConexion;

    public Conexion() {
       // String nombreArchivo = "variablesBD";
        usuario = "root";
        clave = "misionTic2022";
        url = "jdbc:mysql://localhost:3306/bd_productos";
        driver = "com.mysql.cj.jdbc.Driver";

        /*usuario = Propiedades.leer(nombreArchivo, "nombre_usuario").replaceAll("\"", "");
        clave = Propiedades.leer(nombreArchivo, "clave_usuario").replaceAll("\"", "");
        url = Propiedades.leer(nombreArchivo, "url_conexion").replaceAll("\"", "");
        driver = Propiedades.leer(nombreArchivo, "driver").replaceAll("\"", "");*/
        
        activar();
    }

    private void activar() {
        try {
            Class.forName(driver);
            objConexion = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
