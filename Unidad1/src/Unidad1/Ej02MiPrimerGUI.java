package Unidad1;
//Importamos todas las clases que vamosa necesitar para nuestra GUI
import java.awt.EventQueue; // EventQueue para la gestión de eventos
import javax.swing.JFrame; // JFrame para crear la ventana
import javax.swing.JPanel; // JPanel para el panel dentro de la ventana
import javax.swing.border.EmptyBorder; // EmptyBorder para manejar los bordes del panel
import javax.swing.JLabel; // JLabel para mostrar texto
import javax.swing.JButton; // JButton para crear botones
import java.awt.event.ActionListener; // ActionListener para manejar eventos de acción
import java.awt.event.ActionEvent; // ActionEvent para eventos de acción
import javax.swing.SwingConstants; // SwingConstants para alinear componentes
import java.awt.Font; // Font para personalizar fuentes

public class Ej02MiPrimerGUI extends JFrame {

    private int contador = 0; // Inicializamos una variable "contador" para almacenar el conteo
    private static final long serialVersionUID = 1L; // ID de serialización para la clase JFrame
    private JPanel contentPane; // Panel principal de la GUI

     // Lanza la aplicación.
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ej02MiPrimerGUI frame = new Ej02MiPrimerGUI(); // Crea una instancia de la ventana
                    frame.setVisible(true); // Hace visible la ventana
                } catch (Exception e) {
                    e.printStackTrace(); // Captura y muestra de errores
                }
            }
        });
    }

     // Creamos el marco de la ventana.
    public Ej02MiPrimerGUI() {
        setTitle("Mi Primer Ventana GUI"); // Le damos un titulo a la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establecemos la operación de cierre por defecto
        setBounds(100, 100, 450, 300); // Definimos la posición y tamaño de la ventana
        contentPane = new JPanel(); // Inicializamos el panel principal
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // Establecemos el borde del panel

        setContentPane(contentPane); // Añadimos el panel a la ventana GUI
        contentPane.setLayout(null); // Establecer el administrador de diseño del panel a null

        // Creación y configuración de la etiqueta para mostrar el valor del contador
        JLabel lblContador = new JLabel("0");
        lblContador.setFont(new Font("Dialog", Font.BOLD, 23));
        lblContador.setHorizontalAlignment(SwingConstants.CENTER);
        lblContador.setBounds(184, 23, 70, 28);
        contentPane.add(lblContador);

        // Creación y configuración del botón para incrementar el contador
        JButton btnContar = new JButton("Incrementar");
        btnContar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contador++; // El contador incrementa su valor
                lblContador.setText("" + contador);
            }
        });
        btnContar.setBounds(12, 140, 128, 25);
        contentPane.add(btnContar);

        // Creación y configuracioń del botón para restablecer el contador a cero
        JButton btnReestablecer = new JButton("Reestablecer");
        btnReestablecer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contador = 0; // El contador se reestablece a cero
                lblContador.setText("" + contador);
            }
        });
        btnReestablecer.setBounds(152, 140, 128, 25);
        contentPane.add(btnReestablecer);

        // Creación y configuración del botón para decrementar el contador
        JButton btnDecrementar = new JButton("Decrementar");
        btnDecrementar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contador--; // El contador decrementa su valor
                lblContador.setText("" + contador);
            }
        });
        btnDecrementar.setBounds(292, 140, 128, 25);
        contentPane.add(btnDecrementar);
    }
}

/*
Fecha: Miercoles 31 de enero del 2024
Autor: Brian Azael Cumi Guzman
Email: LE22080698@merida.tecnm.mx
*/

