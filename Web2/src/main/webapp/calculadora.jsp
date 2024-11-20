<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
 	<link rel="icon" href="https://cdn.icon-icons.com/icons2/272/PNG/512/Calculator_30001.png  " type="image/x-icon">
    <link rel="stylesheet" href="bootstrap.min.css">
    <script>
        // Función para actualizar el valor en el display
        function appendToDisplay(value) {
            let display = document.getElementById('display');
            if (display.value === "0") {
                display.value = value;
            } else {
                display.value += value;
            }
        }

        // Función para borrar el contenido del display
        function clearDisplay() {
            document.getElementById('display').value = "";
        }

        // Función para manejar la operación cuando se presiona "="
        function processResult() {
            let display = document.getElementById('display').value;
            // Si el display tiene un valor, lo dividimos en dos números y una operación
            let parts = display.match(/(\d+)([+\-*/])(\d+)/); // Divide el string en números y operadores
            if (parts) {
                document.getElementById('num1').value = parts[1];
                document.getElementById('operation').value = parts[2];
                document.getElementById('num2').value = parts[3];
                document.getElementById('calculatorForm').submit(); // Enviar el formulario
            } else {
                alert("Error: Entrada no válida");
            }
        }
    </script>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Calculadora 1.0</h1>

        <!-- Mostrar mensaje de error si existe -->
        <%
            String error = (String) request.getAttribute("error");
            if (error != null) {
        %>
        <div class="alert alert-danger">
            <strong><%= error %></strong>
        </div>
        <%
            }
        %>

        <!-- Mostrar el resultado de la operación -->
        <%
            Double result = (Double) request.getAttribute("result");
            if (result != null) {
                String operation = (String) request.getAttribute("operation");
        %>
        <div class="alert alert-info">
            <strong>Resultado:</strong> <%= result %> (<%= operation %>)
        </div>
        <%
            }
        %>

        <form id="calculatorForm" action="Calculadora" method="POST">
            <input type="text" id="display" name="display" class="form-control mb-3 text-right" value="<%= request.getAttribute("display") != null ? request.getAttribute("display") : "" %>" disabled>

            <div class="row g-2 mb-3">
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('7')">7</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('8')">8</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('9')">9</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-danger w-100" onclick="clearDisplay()">C</button>
                </div>
            </div>

            <div class="row g-2 mb-3">
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('4')">4</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('5')">5</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('6')">6</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('+')">+</button>
                </div>
            </div>

            <div class="row g-2 mb-3">
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('1')">1</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('2')">2</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('3')">3</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('-')">-</button>
                </div>
            </div>

            <div class="row g-2 mb-3">
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('0')">0</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('*')">*</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-primary w-100" onclick="appendToDisplay('/')">/</button>
                </div>
                <div class="col-3">
                    <button type="button" class="btn btn-outline-success w-100" onclick="processResult()">=</button>
                </div>
            </div>

            <!-- Campos ocultos para enviar los números y la operación -->
            <input type="hidden" id="num1" name="num1" value="">
            <input type="hidden" id="num2" name="num2" value="">
            <input type="hidden" id="operation" name="operation" value="">
        </form>
    </div>
</body>
</html>
