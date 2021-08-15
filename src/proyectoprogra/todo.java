package proyectoprogra;

import javax.swing.JOptionPane;

public class todo {

    Empleado t = new Empleado();
    Metricas m = new Metricas();
    Horarios h = new Horarios();
    Capacitaciones c = new Capacitaciones();
    Departamento d = new Departamento();
    Amonestaciones a = new Amonestaciones();
    Salario s = new Salario();
    Vacaciones v = new Vacaciones();

    todo arr[] = new todo[2];
    String e = "";

    public void llenarEmpleado() {
        t.setNombreEmpleado(JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado"));
        t.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Número de cedula")));
        t.setCorreoEmpleado(JOptionPane.showInputDialog(null, "Correo Electrónico"));
        t.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de telefono")));
        t.setIdEmpleado(Integer.parseInt(JOptionPane.showInputDialog(null, "ID del empleado")));
        t.setAntiguedad(Integer.parseInt(JOptionPane.showInputDialog(null, "Año en que entró a trabajar")));
    }

    public void agregarCapacitacion() {
        c.setLugar(JOptionPane.showInputDialog(null, "Lugar de la capacitación"));
        c.setFecha(JOptionPane.showInputDialog(null, "Fecha"));
        c.setHora(JOptionPane.showInputDialog(null, "Hora"));
        c.setTipoCap(JOptionPane.showInputDialog(null, "Detalles"));
    }

    public void definirHorarios() {
        h.setHoraEntrada(JOptionPane.showInputDialog(null, "Hora de entrada"));
        h.setHoraSalida(JOptionPane.showInputDialog(null, "Hora de salida"));
        h.setTipoHorario(Integer.parseInt(JOptionPane.showInputDialog(null, "Tipo de horario")));
    }

    public void departamento() {
        d.setPuesto(JOptionPane.showInputDialog(null, "Puesto del empleado"));
        d.setArea(JOptionPane.showInputDialog(null, "Area de trabajo"));
        d.setResponsabilidades(JOptionPane.showInputDialog(null, "Responsabilidades"));
        d.setProyecto(JOptionPane.showInputDialog(null, "Proyecto en progreso:"));
    }

    public void amonestacion() {
        int contador = a.getReincidencia();
        String rep;
        contador++;
        a.setFalta(JOptionPane.showInputDialog(null, "Detalles de fala"));
        a.setGravedad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la gravedad")));
        a.setReincidencia(contador);
        if (contador == 1) {
            rep = "Advertencia 1";
        } else if (contador == 2) {
            rep = "Advertencia 2";
        } else {
            rep = "Reprimienda";
        }
        if (rep.equals("Reprimienda")) {
            a.setReprimienda(JOptionPane.showInputDialog(null, "La reprimienda será"));
        } else {
            a.setReprimienda("");
        }

    }

    public void metrica() {
        m.setMetas(JOptionPane.showInputDialog(null, "Metas activas"));
        m.setCantidadVentas(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de ventas")));
        m.setEmpleadosAtentidos(Integer.parseInt(JOptionPane.showInputDialog("Numero de clientes atendidos")));
        m.setAtrasos(JOptionPane.showInputDialog(null, "Atrasos"));
    }

    public void salarios() {
        Double pago, extra, hora, salario, total, total2, total3;

        s.setHorasTrabajadas(Double.parseDouble(JOptionPane.showInputDialog(null, "Horas Trabajadas")));
        s.setSalarioHora(Double.parseDouble(JOptionPane.showInputDialog(null, "Salario por hora")));
        s.setBonos(Double.parseDouble(JOptionPane.showInputDialog(null, "Bonos")));

        //Suponiendo que trabaja en un horario de 8 horas al dia
        if (s.getHorasTrabajadas() <= 8) { //Si trabaja 8 o menos horas se le paga normal 
            pago = s.getSalarioHora() * s.getHorasTrabajadas();
            //Bonos
            total = pago + s.getBonos();
            JOptionPane.showMessageDialog(null, "El salario del empleado es de: " + total);

        } else if (s.getHorasTrabajadas() > 8) { //Si trabaja mas de 8 horas quiere decir que hizo horas extras
            hora = s.getHorasTrabajadas() - 8; //Se restan para saber cuantas horas extras trabajo
            salario = s.getSalarioHora() * 8; // Para sacar el salario base
            // Para sacar el salario con las horas extras que realizo el empleado.
            extra = s.getSalarioHora() * hora;
            pago = salario + extra;
            //Bonos
            total = pago + s.getBonos();
            s.setTotal(total);
            JOptionPane.showMessageDialog(null, "El salario bruto del empleado es de: " + total);
            if (total < 842000) {
                JOptionPane.showMessageDialog(null, "El salario neto sería " + total);
            } else if (total > 842000 && total < 1236000) {
                total2 = total - 842000;
                total3 = total2 * 0.9;
                total = total3 + 842000;
            } else if (total > 123600 && total < 2169000) {
                total2 = total - 1178600;
                total3 = total2 * 0.85;
                total = total3 + 1178600;
            } else if (total > 2169000 && total < 4337000) {
                total2 = total - 1971650;
                total3 = total2 * 0.8;
                total = total3 + 1971650;
            } else {
                total2 = total - 3706050;
                total3 = total2 * 0.75;
                total = total3 + 3706050;

            }
            JOptionPane.showMessageDialog(null, "El salario neto sería: " + total);

        }

    }

    public void vacaciones() {
        v.setDiasDisponibles(Integer.parseInt(JOptionPane.showInputDialog(null, "Dias de vacaciones")));
        v.setFechaEntrada(JOptionPane.showInputDialog(null, "Fecha de entrada"));
        v.setFechaSalida(JOptionPane.showInputDialog(null, "Fecha de salida"));

    }

    public void modificarEmpleado() {
        String nombre = JOptionPane.showInputDialog(null, "Digite el nombre del empleado que desea buscar: ");
        int x = 0;
        int y = 0;
        while (y == 0) {
            if (nombre.equals(arr[x].t.getNombreEmpleado())) {
                int opc = 8;
                int opc2 = 8;
                while (opc != 0) {
                    opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Nombre\n2. Cédula\n3. Correo\n"
                            + "4. Numero de Telefono\n5. ID\n6. Año de entrada"
                            + "7. Detalles de Empleado"));
                    switch (opc) {
                        case 1:
                            arr[x].t.setNombreEmpleado(JOptionPane.showInputDialog(null, "Ingrese el nombre nuevo del empleado"));
                            break;
                        case 2:
                            arr[x].t.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Número de cedula")));
                            break;
                        case 3:
                            arr[x].t.setCorreoEmpleado(JOptionPane.showInputDialog(null, "Correo Electrónico"));
                            break;
                        case 4:
                            arr[x].t.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de telefono")));
                            break;
                        case 5:
                            arr[x].t.setIdEmpleado(Integer.parseInt(JOptionPane.showInputDialog(null, "ID del empleado")));
                            break;
                        case 6:
                            arr[x].t.setAntiguedad(Integer.parseInt(JOptionPane.showInputDialog(null, "Año en que entró a trabajar")));
                            break;
                        case 7:
                            while (opc2 != 0) {
                                opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Capacitaciones\n2. Amonestaciones\n3. Departamento\n"
                                        + "4. Horarios\n5. Metricas\n 6. Vacaciones\n7. Salarios"));
                                switch (opc2) {
                                    case 1:
                                        arr[x].c.setLugar(JOptionPane.showInputDialog(null, "Lugar de la capacitación"));
                                        arr[x].c.setFecha(JOptionPane.showInputDialog(null, "Fecha"));
                                        arr[x].c.setHora(JOptionPane.showInputDialog(null, "Hora"));
                                        arr[x].c.setTipoCap(JOptionPane.showInputDialog(null, "Detalles"));
                                        break;
                                    case 2:
                                        int contador = a.getReincidencia();
                                        String rep;
                                        contador++;
                                        arr[x].a.setFalta(JOptionPane.showInputDialog(null, "Detalles de fala"));
                                        arr[x].a.setGravedad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la gravedad")));
                                        arr[x].a.setReincidencia(contador);
                                        if (contador == 1) {
                                            rep = "Advertencia 1";
                                        } else if (contador == 2) {
                                            rep = "Advertencia 2";
                                        } else {
                                            rep = "Reprimienda";
                                        }
                                        if (rep.equals("Reprimienda")) {
                                            arr[x].a.setReprimienda(JOptionPane.showInputDialog(null, "La reprimienda será"));
                                        } else {
                                            arr[x].a.setReprimienda("");
                                        }
                                        break;
                                    case 3:
                                        arr[x].d.setPuesto(JOptionPane.showInputDialog(null, "Puesto del empleado"));
                                        arr[x].d.setArea(JOptionPane.showInputDialog(null, "Area de trabajo"));
                                        arr[x].d.setResponsabilidades(JOptionPane.showInputDialog(null, "Responsabilidades"));
                                        arr[x].d.setProyecto(JOptionPane.showInputDialog(null, "Proyecto en progreso:"));
                                        break;
                                    case 4:
                                        arr[x].c.setLugar(JOptionPane.showInputDialog(null, "Lugar de la capacitación"));
                                        arr[x].c.setFecha(JOptionPane.showInputDialog(null, "Fecha"));
                                        arr[x].c.setHora(JOptionPane.showInputDialog(null, "Hora"));
                                        arr[x].c.setTipoCap(JOptionPane.showInputDialog(null, "Detalles"));
                                        break;
                                    case 5:
                                        arr[x].m.setMetas(JOptionPane.showInputDialog(null, "Metas activas"));
                                        arr[x].m.setCantidadVentas(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de ventas")));
                                        arr[x].m.setEmpleadosAtentidos(Integer.parseInt(JOptionPane.showInputDialog("Numero de clientes atendidos")));
                                        arr[x].m.setAtrasos(JOptionPane.showInputDialog(null, "Atrasos"));
                                        break;
                                    case 6:
                                        arr[x].v.setDiasDisponibles(Integer.parseInt(JOptionPane.showInputDialog(null, "Dias de vacaciones")));
                                        arr[x].v.setFechaEntrada(JOptionPane.showInputDialog(null, "Fecha de entrada"));
                                        arr[x].v.setFechaSalida(JOptionPane.showInputDialog(null, "Fecha de salida"));
                                        break;
                                    case 7:
                                        Double pago,extra,hora,salario,total,total2, total3;

                                        arr[x].s.setHorasTrabajadas(Double.parseDouble(JOptionPane.showInputDialog(null, "Horas Trabajadas")));
                                        arr[x].s.setSalarioHora(Double.parseDouble(JOptionPane.showInputDialog(null, "Salario por hora")));
                                        arr[x].s.setBonos(Double.parseDouble(JOptionPane.showInputDialog(null, "Bonos")));

                                        //Suponiendo que trabaja en un horario de 8 horas al dia
                                        if (arr[x].s.getHorasTrabajadas() <= 8) { //Si trabaja 8 o menos horas se le paga normal 
                                            pago = arr[x].s.getSalarioHora() * arr[x].s.getHorasTrabajadas();
                                            //Bonos
                                            total = pago + arr[x].s.getBonos();
                                            JOptionPane.showMessageDialog(null, "El salario del empleado es de: " + total);

                                        } else if (arr[x].s.getHorasTrabajadas() > 8) { //Si trabaja mas de 8 horas quiere decir que hizo horas extras
                                            hora = arr[x].s.getHorasTrabajadas() - 8; //Se restan para saber cuantas horas extras trabajo
                                            salario = arr[x].s.getSalarioHora() * 8; // Para sacar el salario base
                                            // Para sacar el salario con las horas extras que realizo el empleado.
                                            extra = arr[x].s.getSalarioHora() * hora;
                                            pago = salario + extra;
                                            //Bonos
                                            total = pago + arr[x].s.getBonos();
                                            s.setTotal(total);
                                            JOptionPane.showMessageDialog(null, "El salario bruto del empleado es de: " + total);
                                            if (total < 842000) {
                                                JOptionPane.showMessageDialog(null, "El salario neto sería " + total);
                                            } else if (total > 842000 && total < 1236000) {
                                                total2 = total - 842000;
                                                total3 = total2 * 0.9;
                                                total = total3 + 842000;
                                            } else if (total > 123600 && total < 2169000) {
                                                total2 = total - 1178600;
                                                total3 = total2 * 0.85;
                                                total = total3 + 1178600;
                                            } else if (total > 2169000 && total < 4337000) {
                                                total2 = total - 1971650;
                                                total3 = total2 * 0.8;
                                                total = total3 + 1971650;
                                            } else {
                                                total2 = total - 3706050;
                                                total3 = total2 * 0.75;
                                                total = total3 + 3706050;
                                            }
                                            JOptionPane.showMessageDialog(null, "El salario neto sería: " + total);
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    y++;
                }
            } else {
                x++;
            }

        }
    }

    public void agregarEmpleado() {
        int opt;
        byte count = 0;
        for (int x = 0; x < 2; x++) {
            todo t = new todo();
            if (count == 0) {
                t.llenarEmpleado();
            }
            opt = 8;
            while (opt != 0) {
                opt = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar Capacitacion  2.Definir Horario \n"
                        + "3.Definir Departamento  4.Métricas\n"
                        + "5.Amonestaciones        6.Definir Salario \n"
                        + "7.Vacaciones"));
                switch (opt) {
                    case 1:
                        t.agregarCapacitacion();
                        break;
                    case 2:
                        t.definirHorarios();
                        break;
                    case 3:
                        t.departamento();
                        break;
                    case 4:
                        t.metrica();
                        break;
                    case 5:
                        t.amonestacion();
                        break;
                    case 6:
                        t.salarios();
                        break;
                    case 7:
                        t.vacaciones();
                        break;
                    default:
                        break;
                }

            }
            arr[x] = t;
        }
    }

    public void mostarEmpleados() {
        int x;
        e = "";
        for (x = 0; x < 2; x++) {
            e = e + arr[x].t.getNombreEmpleado() + " " + arr[x].t.getCedula() + " " + arr[x].d.getPuesto() + " "
                    + arr[x].m.getCantidadVentas() + " Ventas" + " " + arr[x].s.getTotal() + "\n";
        }
        e = e + "\n";
        JOptionPane.showMessageDialog(null, "Info: \n" + e);
    }
}
