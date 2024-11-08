package calculadoraGui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculadoraGui {
    private Calculadora c;
    private String operacion = "", numero1, numero2;
    private JFrame ventana;
    private JTextField display;

    public CalculadoraGui() {
        c = new Calculadora();
        ventana = new JFrame("Calculadora 1.0");
        ventana.setLayout(new GridLayout(6, 4));
        ventana.setBounds(100, 50, 400, 600);
        display = new JTextField(30);

        // Botones
        JButton bSiete = new JButton("7");
        JButton bOcho = new JButton("8");
        JButton bNueve = new JButton("9");
        JButton bDivision = new JButton("/");
        JButton bCuatro = new JButton("4");
        JButton bCinco = new JButton("5");
        JButton bSeis = new JButton("6");
        JButton bProducto = new JButton("x");
        JButton bUno = new JButton("1");
        JButton bDos = new JButton("2");
        JButton bTres = new JButton("3");
        JButton bResta = new JButton("-");
        JButton bCero = new JButton("0");
        JButton bCalcular = new JButton("=");
        JButton bSuma = new JButton("+");
        JButton bLimpiar = new JButton("C");

        // Añadir botones a la ventana
        ventana.add(display);
        ventana.add(bNueve);
        ventana.add(bOcho);
        ventana.add(bSiete);
        ventana.add(bDivision);
        ventana.add(bSeis);
        ventana.add(bCinco);
        ventana.add(bCuatro);
        ventana.add(bProducto);
        ventana.add(bTres);
        ventana.add(bDos);
        ventana.add(bUno);
        ventana.add(bResta);
        ventana.add(bCero);
        ventana.add(bCalcular);
        ventana.add(bSuma);
        ventana.add(bLimpiar);

        // Añadir action listeners
        bNueve.addActionListener(e -> digitar("9"));
        bOcho.addActionListener(e -> digitar("8"));
        bSiete.addActionListener(e -> digitar("7"));
        bSeis.addActionListener(e -> digitar("6"));
        bCinco.addActionListener(e -> digitar("5"));
        bCuatro.addActionListener(e -> digitar("4"));
        bTres.addActionListener(e -> digitar("3"));
        bDos.addActionListener(e -> digitar("2"));
        bUno.addActionListener(e -> digitar("1"));
        bCero.addActionListener(e -> digitar("0"));
        
        bSuma.addActionListener(e -> operar("+"));
        bResta.addActionListener(e -> operar("-"));
        bProducto.addActionListener(e -> operar("x"));
        bDivision.addActionListener(e -> operar("/"));
        bCalcular.addActionListener(e -> operar("="));
        bLimpiar.addActionListener(e -> limpiar());

        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CalculadoraGui();
    }

    private void digitar(String n) {
        display.setText(display.getText() + n);
    }

    private void operar(String op) {
        if (op.equals("=")) {
            numero2 = display.getText();
            float n1 = Float.valueOf(numero1);
            float n2 = Float.valueOf(numero2);
            c.setNumeros(n1, n2);
            String valor = "";

            switch (operacion) {
                case "+":
                    valor = String.valueOf(c.getSuma());
                    break;
                case "-":
                    valor = String.valueOf(c.getResta());
                    break;
                case "x":
                    valor = String.valueOf(c.getProducto());
                    break;
                case "/":
                    try {
                        valor = String.valueOf(c.getDivision());
                    } catch (ArithmeticException e) {
                        valor = "Error";
                    }
                    break;
            }
            display.setText(valor);
            operacion = "";
            numero1 = "";
            numero2 = "";
        } else {
            operacion = op.equals("x") ? "*" : op; // Cambiar 'x' por '*'
            numero1 = display.getText();
            display.setText("");
        }
    }

    private void limpiar() {
        display.setText("");
        numero1 = "";
        numero2 = "";
        operacion = "";
    }
}
