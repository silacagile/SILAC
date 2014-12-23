/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.RegistrarResultado;

/**
 *
 * @author Jorge Aguirre
 */
public class Utils {
    
    private static SecureRandom random = new SecureRandom();
    public static DateFormat df = new SimpleDateFormat(Constantes.DATEFORMAT);

    public static boolean esDouble(String entrada) {
        boolean respuesta;

        try {
            respuesta = Double.parseDouble(entrada) >= 0;
        } catch (NumberFormatException nfe) {
            System.err.println(nfe);
            respuesta = false;
        }

        return respuesta;
    }

    public static Calendar formatoFecha(String fecha) {
        Calendar cal = new GregorianCalendar();
        
        try {
            Date date = df.parse(fecha);
            cal.setTime(date);
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarResultado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cal;
    }
    
    public static String nextSessionId() {
        return new BigInteger(130, random).toString(32);
    }
}
