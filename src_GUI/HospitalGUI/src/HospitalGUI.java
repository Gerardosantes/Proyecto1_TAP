import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class HospitalGUI extends JFrame {

    // LISTA DE EMPLEADOS
    static ArrayList<String> empleados = new ArrayList<>();

    // COLORES
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

        // CONFIGURACION VENTANA
        setTitle("Sistema Hospitalario");
        setSize(500,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // COLOR DE FONDO
        getContentPane().setBackground(fondo);

        // TITULO
        lblTitulo = new JLabel("HOSPITAL GENERAL");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setForeground(new Color(25, 25, 112));
        lblTitulo.setBounds(120,15,300,30);
        add(lblTitulo);

        // LOGIN
        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        lblUsuario.setBounds(120,70,100,30);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(200,70,120,30);
        add(txtUsuario);

        lblContra = new JLabel("Contraseña:");
        lblContra.setFont(new Font("Arial", Font.BOLD, 14));
        lblContra.setBounds(120,120,100,30);
        add(lblContra);

        txtContra = new JPasswordField();
        txtContra.setBounds(200,120,120,30);
        add(txtContra);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(170,180,140,35);
        btnIngresar.setBackground(botones);
        btnIngresar.setForeground(textoBoton);
        btnIngresar.setFocusPainted(false);
        btnIngresar.setFont(new Font("Arial", Font.BOLD, 14));
        add(btnIngresar);

        // BOTONES MENU
        btnRegistro = new JButton("Registrar Turno");
        btnRegistro.setBounds(150,70,180,35);
        estiloBoton(btnRegistro);
        btnRegistro.setVisible(false);
        add(btnRegistro);

        btnActivos = new JButton("Turnos Activos");
        btnActivos.setBounds(150,120,180,35);
        estiloBoton(btnActivos);
        btnActivos.setVisible(false);
        add(btnActivos);

        btnFinalizar = new JButton("Finalizar Turno");
        btnFinalizar.setBounds(150,170,180,35);
        estiloBoton(btnFinalizar);
        btnFinalizar.setVisible(false);
        add(btnFinalizar);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150,220,180,35);
        estiloBoton(btnSalir);
        btnSalir.setVisible(false);
        add(btnSalir);

        // LOGIN
        btnIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String usuario = txtUsuario.getText();
                String contra = txtContra.getText();

                if(usuario.equals("admin") && contra.equals("1234")) {

                    JOptionPane.showMessageDialog(null,
                            "Bienvenido " + usuario);

                    mostrarMenu();

                } else {

                    JOptionPane.showMessageDialog(null,
                            "Usuario o contraseña incorrectos");

                }
            }
        });

        // REGISTRO
        btnRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nombre = JOptionPane.showInputDialog("Nombre:");

                String[] areas = {
                    "Médica",
                    "Enfermería",
                    "Administrativa",
                    "Diagnóstico",
                    "Apoyo"
                };

                String puesto = (String) JOptionPane.showInputDialog(
                        null,
                        "Seleccione el área:",
                        "Áreas Hospitalarias",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        areas,
                        areas[0]);

                String hora = "";

                do {

                    hora = JOptionPane.showInputDialog(
                            "Ingrese la hora en formato 24 horas\nEjemplo: 08:00 o 14:50");

                    if(!hora.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {

                        JOptionPane.showMessageDialog(null,
                                "Formato incorrecto.\nUse HH:MM");

                    }

                } while(!hora.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]"));

                String datos = "Nombre: " + nombre +
                        " | Área: " + puesto +
                        " | Hora Entrada: " + hora;

                empleados.add(datos);

                JOptionPane.showMessageDialog(null,
                        "Turno registrado correctamente");
            }
        });
        // TURNOS ACTIVOS
        btnActivos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 if (empleados.isEmpty()) {
                     JOptionPane.showMessageDialog(
                    null,
                    "No hay turnos activos."
            );
                    } else {

            JTextArea area = new JTextArea();

            area.setEditable(false);
            area.setFont(new Font("Arial", Font.PLAIN, 14));

            area.append("===== TURNOS ACTIVOS =====\n\n");

            for (int i = 0; i < empleados.size(); i++) {

                area.append((i + 1) + ". " + empleados.get(i) + "\n\n");

            }

            JScrollPane scroll = new JScrollPane(area);

            scroll.setPreferredSize(new Dimension(450, 250));

            JOptionPane.showMessageDialog(
                    null,
                    scroll,
                    "Turnos Activos (" + empleados.size() + ")",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
});



        // FINALIZAR TURNO
        btnFinalizar.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 if (empleados.isEmpty()) {
                     JOptionPane.showMessageDialog(
                    null,
                    "No hay turnos activos registrados."
                              );
                     return;
                     }
                 String[] listaEmpleados = empleados.toArray(new String[0]);
                 String seleccionado = (String) JOptionPane.showInputDialog(
                null,
                         "Seleccione el turno a finalizar:",
                          "Finalizar Turno",
                          JOptionPane.QUESTION_MESSAGE,
                            null,
                             listaEmpleados,
                             listaEmpleados[0]
                         
                         );

        if (seleccionado != null) {

            int opcion = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea finalizar este turno?\n\n" + seleccionado,
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION
            );

            if (opcion == JOptionPane.YES_OPTION) {

                empleados.remove(seleccionado);

                JOptionPane.showMessageDialog(
                        null,
                        "Turno finalizado correctamente."
                );
            }
        }
    }
});

        // SALIR
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }
        });
    }

    // ESTILO BOTONES
    public void estiloBoton(JButton boton) {

        boton.setBackground(botones);
        boton.setForeground(textoBoton);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Arial", Font.BOLD, 14));

    }

    // MOSTRAR MENU
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

    // MAIN
    public static void main(String[] args) {

        HospitalGUI h = new HospitalGUI();
        h.setVisible(true);

    }
}