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


        // BOTON REGISTRAR
        btnRegistro = new JButton("Registrar Turno");
        btnRegistro.setBounds(150,70,180,35);
        estiloBoton(btnRegistro);
        btnRegistro.setVisible(false);
        add(btnRegistro);

        // BOTON ACTIVOS
        btnActivos = new JButton("Turnos Activos");
        btnActivos.setBounds(150,120,180,35);
        estiloBoton(btnActivos);
        btnActivos.setVisible(false);
        add(btnActivos);

        // BOTON FINALIZAR
        btnFinalizar = new JButton("Finalizar Turno");
        btnFinalizar.setBounds(150,170,180,35);
        estiloBoton(btnFinalizar);
        btnFinalizar.setVisible(false);
        add(btnFinalizar);

        // BOTON SALIR
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150,220,180,35);
        estiloBoton(btnSalir);
        btnSalir.setVisible(false);
        add(btnSalir);


        //  2.2 - EVENTO LOGIN




        //  3.2 - FUNCIONES DEL MENU
       
        // REGISTRO
        btnRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,
                        "Se esta trabajando en ello.",
                        "Avance del Sistema",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // TURNOS ACTIVOS
        btnActivos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,
                        "Se esta trabajando en ello.",
                        "Avance del Sistema",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // FINALIZAR TURNO
        btnFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,
                        "Se esta trabajando en ello.",
                        "Avance del Sistema",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // SALIR DEL SISTEMA
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
    }

  
    //  1.2 - ESTILOS VISUALES
    

    public void estiloBoton(JButton boton) {

        boton.setBackground(botones);
        boton.setForeground(textoBoton);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
    }
    
    //  3.3 - MOSTRAR MENU

    public void mostrarMenu() {

        // OCULTAR LOGIN
        lblUsuario.setVisible(false);
        txtUsuario.setVisible(false);
        lblContra.setVisible(false);
        txtContra.setVisible(false);
        btnIngresar.setVisible(false);

        // MOSTRAR MENU
        btnRegistro.setVisible(true);
        btnActivos.setVisible(true);
        btnFinalizar.setVisible(true);
        btnSalir.setVisible(true);
    }


    // MAIN PRINCIPAL

    public static void main(String[] args) {

        HospitalGUI h = new HospitalGUI();
        h.setVisible(true);
    }
}