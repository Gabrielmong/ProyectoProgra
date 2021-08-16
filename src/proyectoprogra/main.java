package proyectoprogra;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        int opt = 8;
        todo t = new todo();
        while (opt != 4) {

            opt = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar Empleados (2)  2. Mostrar Empleados \n"
                    + "3. Editar Empleados             4. Salir "));

            switch (opt) {
                case 1:
                    t.agregarEmpleado();
                    break;
                case 2:
                    t.mostarEmpleados();
                    break;
                case 3:
                    t.modificarEmpleado();
                    
                    break;
                default:
                    break;
            }
        }
    }

}
