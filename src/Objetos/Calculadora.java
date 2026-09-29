package Objetos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    // Componentes visuales
    private JTextField visor;
    
    // Variables de estado para la lógica matemática
    private double primerNumero = 0;
    private char operacionActual = ' ';
    private boolean nuevaEntrada = true; // Para saber si limpiar el visor al presionar el siguiente número

    public Calculadora() {
        // 1. Configuración de la ventana principal
        setTitle("Calculadora Java");
        setSize(320, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setLayout(new BorderLayout(10, 10)); // Espaciado entre la pantalla y los botones

        // 2. Visor / Pantalla
        visor = new JTextField("0");
        visor.setEditable(false);
        visor.setHorizontalAlignment(JTextField.RIGHT);
        visor.setFont(new Font("Consolas", Font.BOLD, 28));
        visor.setPreferredSize(new Dimension(300, 60));
        visor.setBackground(Color.WHITE);
        add(visor, BorderLayout.NORTH);

        // 3. Panel de botones (cuadrícula 4x4)
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 6, 6));

        // Array con la distribución del teclado
        String[] etiquetas = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String texto : etiquetas) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.BOLD, 20));
            boton.setFocusPainted(false); // Quita el recuadro punteado al hacer clic
            boton.addActionListener(this); // Conecta el botón al escuchador de eventos
            panelBotones.add(boton);
        }

        add(panelBotones, BorderLayout.CENTER);

        // Hace visible la ventana
        setVisible(true);
    }

    // 4. Lógica de los clics
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        // Caso: Se presionó un dígito (0 al 9)
        if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
            if (nuevaEntrada || visor.getText().equals("0")) {
                visor.setText(comando);
                nuevaEntrada = false;
            } else {
                visor.setText(visor.getText() + comando);
            }
        }
        // Caso: Botón Limpiar (C)
        else if (comando.equals("C")) {
            visor.setText("0");
            primerNumero = 0;
            operacionActual = ' ';
            nuevaEntrada = true;
        }
        // Caso: Botón Igual (=)
        else if (comando.equals("=")) {
            if (operacionActual != ' ') {
                double segundoNumero = Double.parseDouble(visor.getText());
                double resultado = calcular(primerNumero, segundoNumero, operacionActual);

                // Mostramos como entero si no tiene decimales significativos
                if (resultado == (long) resultado) {
                    visor.setText(String.format("%d", (long) resultado));
                } else {
                    visor.setText(String.valueOf(resultado));
                }

                operacionActual = ' ';
                nuevaEntrada = true;
            }
        }
        // Caso: Operadores (+, -, *, /)
        else {
            primerNumero = Double.parseDouble(visor.getText());
            operacionActual = comando.charAt(0);
            nuevaEntrada = true;
        }
    }

    // Función auxiliar para operaciones aritméticas
    private double calcular(double num1, double num2, char op) {
        switch (op) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': 
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(this, "Error: División por cero", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return 0;
                }
                return num1 / num2;
            default: return num2;
        }
    }

    // Punto de entrada del programa
    public static void main(String[] args) {
        // Ejecuta la interfaz gráfica en el hilo seguro de eventos de Swing
        SwingUtilities.invokeLater(() -> new Calculadora());
    }
}