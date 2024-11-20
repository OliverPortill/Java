import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Calculadora() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operation = request.getParameter("operation");

        double result = 0;
        String operationText = "";
        boolean error = false;

        try {
            // Verifica que los valores num1, num2 y operation no sean nulos o vacíos
            if (num1 != null && num2 != null && !num1.isEmpty() && !num2.isEmpty() && operation != null && !operation.isEmpty()) {
                double n1 = Double.parseDouble(num1);
                double n2 = Double.parseDouble(num2);

                switch (operation) {
                    case "+":
                        result = n1 + n2;
                        operationText = "Suma";
                        break;
                    case "-":
                        result = n1 - n2;
                        operationText = "Resta";
                        break;
                    case "*":
                        result = n1 * n2;
                        operationText = "Multiplicación";
                        break;
                    case "/":
                        if (n2 != 0) {
                            result = n1 / n2;
                            operationText = "División";
                        } else {
                            error = true;
                            operationText = "Error: División por cero";
                        }
                        break;
                    default:
                        error = true;
                        operationText = "Operación inválida";
                        break;
                }
            } else {
                error = true;
                operationText = "Entrada inválida";
            }
        } catch (NumberFormatException e) {
            error = true;
            operationText = "Error en los números";
        }

        // Pasamos los valores a la vista
        request.setAttribute("result", error ? null : result);
        request.setAttribute("operation", operationText);
        request.setAttribute("error", error ? operationText : null);
        request.setAttribute("display", request.getParameter("display"));

        // Redirige de vuelta a la página de la calculadora
        request.getRequestDispatcher("/calculadora.jsp").forward(request, response);
    }
}
