/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author ALEJO
 */
public class validaciones {

    public boolean Validarcedula(String cedula) {
        boolean validado = false;

        if (cedula.matches("[0-9]*") == true) {

            int sumaimpares;
            int sumapares;
            int sumatotal;

            String digito1 = cedula.substring(0, 1);
            String digito2 = cedula.substring(1, 2);
            String digito3 = cedula.substring(2, 3);
            String digito4 = cedula.substring(3, 4);
            String digito5 = cedula.substring(4, 5);
            String digito6 = cedula.substring(5, 6);
            String digito7 = cedula.substring(6, 7);
            String digito8 = cedula.substring(7, 8);
            String digito9 = cedula.substring(8, 9);
            String digito10 = cedula.substring(9, 10);

            int d1 = Integer.parseInt(digito1);
            int d2 = Integer.parseInt(digito2);
            int d3 = Integer.parseInt(digito3);
            int d4 = Integer.parseInt(digito4);
            int d5 = Integer.parseInt(digito5);
            int d6 = Integer.parseInt(digito6);
            int d7 = Integer.parseInt(digito7);
            int d8 = Integer.parseInt(digito8);
            int d9 = Integer.parseInt(digito9);
            int d10 = Integer.parseInt(digito10);

            d1 = d1 * 2;
            if (d1 > 9) {
                d1 = d1 - 9;
            }
            d3 = d3 * 2;
            if (d3 > 9) {
                d3 = d3 - 9;
            }
            d5 = d5 * 2;
            if (d5 > 9) {
                d5 = d5 - 9;

            }
            d7 = d7 * 2;
            if (d7 > 9) {
                d7 = d7 - 9;
            }
            d9 = d9 * 2;
            if (d9 > 9) {
                d9 = d9 - 9;
            }
            sumaimpares = d1 + d3 + d5 + d7 + d9;
            sumapares = d2 + d4 + d6 + d8 + d10;
            sumatotal = sumapares + sumaimpares;
            int modd = sumatotal % 10;
            if (modd == 0 && cedula.length() == 10) {//metodo length
                // modd=1;
                //int verificar=10-modd;
                //System.out.println("Cedula  valida");
                validado = true;

                return validado;
            } else {
                // System.out.println("Cedula Invalida");
                validado = false;

                return validado;
            }
        } else {

            // System.out.println("Cedula Invalida");
        }

        return validado;

    }//final de validacion de cedula

    public boolean validarpalabras(String auxpalabra) {
        boolean correcto = false;
        if (auxpalabra.isBlank()) {
            JOptionPane.showMessageDialog(null, "EL CAMPO ESTA VACIO");
        }
        if (auxpalabra.matches("[a-zA-Z_ ]+")) {
            correcto = true;
        } else {
            JOptionPane.showMessageDialog(null, "NO ESTA PERMITIDO EN ESTE CAMPO");
        }
        return correcto;
    }//final de validarpalabras

    public boolean validarnumeros(String auxnumeros) {
        boolean cantidadcorrecta = false;
        if (auxnumeros.isBlank()) {
            JOptionPane.showMessageDialog(null, "EL CAMPO ESTA VACIO");
        }
        if (auxnumeros.matches("[0-9]+")) {
            cantidadcorrecta = true;
        } else {
            JOptionPane.showMessageDialog(null, "NO ESTA PERMITIDO EN ESTE CAMPO");
        }

        return cantidadcorrecta;
    }//final de validarnumeros

}//final de clase
