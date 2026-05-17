import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HospitalGUI extends JFrame {

    //  1.1 - DISEÑO Y ESTILOS


    // COLORES DEL SISTEMA
    Color fondo = new Color(220, 235, 250);
    Color botones = new Color(70, 130, 180);
    Color textoBoton = Color.WHITE;

    // COMPONENTES LOGIN
    JLabel lblTitulo, lblUsuario, lblContra;
    JTextField txtUsuario;
    JPasswordField txtContra;
    JButton btnIngresar;

    // COMPONENTES MENU
    JButton btnRegistro, btnActivos, btnFinalizar, btnSalir;

    public HospitalGUI() {

        // CONFIGURACION DE VENTANA
        setTitle("Sistema Hospitalario - Avance de Interfaz");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // COLOR DE FONDO
        getContentPane().setBackground(fondo);

        // TITULO PRINCIPAL
        lblTitulo = new JLabel("HOSPITAL GENERAL");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setForeground(Color.BLACK);
        lblTitulo.setBounds(120,15,300,30);
        add(lblTitulo);
        
        //  2.1 - LOGIN Y VALIDACION




        //  3.1 - MENU PRINCIPAL



        //  2.2 - EVENTO LOGIN




        //  3.2 - FUNCIONES DEL MENU


  
    //  1.2 - ESTILOS VISUALES
    

    public void estiloBoton(JButton boton) {

        boton.setBackground(botones);
        boton.setForeground(textoBoton);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
    }
    
    //  3.3 - MOSTRAR MENU




    // MAIN PRINCIPAL

    public static void main(String[] args) {

        HospitalGUI h = new HospitalGUI();
        h.setVisible(true);
    }
}