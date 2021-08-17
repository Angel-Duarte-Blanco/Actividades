
package model_pkg;

import model_pkg.Conexion;
import views_pkg.MainFrame;


public class Reto_6_y_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion inst_connect = new Conexion();
        MainFrame inst_frame = new MainFrame();
        inst_connect.getConnection();
        inst_frame.setVisible(true);

    }
    
}
