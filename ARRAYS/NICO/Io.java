package ARRAYS.NICO;
import java.io.Console;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Io {

    // Funciones de impresión
    public static void sop(String s) {
        System.out.println(s);
    }

    public static void Sop(String s) {
        sop(s);
    }

    // Estado de conexión
    public static String estadoConexion(Connection conn) {
        if (conn == null) return "OFF";
        return "ON";
    }

    // Prueba si se puede conectar a la base de datos
    public static boolean esConexion(String url, String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        if (conn == null) {
            return false;
        }
        cerrarConexion(conn);
        return true;
    }

    // Obtener conexión
    public static Connection getConexion(String url, String user, String pass) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    // Cerrar conexión
    public static boolean cerrarConexion(Connection conn) {
        boolean dev = true;
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                dev = false;
            }
        }
        return dev;
    }

    // Padding de texto
    public static String PADL(String texto, int longitud) {
        if (texto.length() > longitud) {
            return texto.substring(0, longitud);
        } else {
            while (texto.length() < longitud) {
                texto += " ";
            }
            return texto;
        }
    }

    // Leer carácter oculto
    public static char leerCaracterOculto() {
        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("No se puede acceder a la consola.");
        }
        char[] texto = console.readPassword("Ingrese un carácter: ");
        if (texto.length == 0) {
            throw new RuntimeException("No se ingresó ningún carácter.");
        }
        return texto[0];
    }

    // Leer un carácter simple
    public static char getch() {
        try {
            System.out.print("Ingrese un carácter: ");
            return (char) System.in.read();
        } catch (IOException e) {
            throw new RuntimeException("Error al leer el carácter.", e);
        }
    }

    // Limpiar pantalla
    public static void cls() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {
            System.err.println("Error al limpiar la pantalla: " + ex.getMessage());
        }
    }

    // Esperar entrada o tiempo
    public static void inkey(int seconds) {
        Thread thread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(seconds);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        thread.start();
        try {
            while (thread.isAlive()) {
                if (System.in.available() > 0) {
                    System.in.read(); // Consume la tecla presionada
                    thread.interrupt();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Devolver fecha actual
    public static String DTOC() {
        Calendar c1 = Calendar.getInstance();
        int dia = c1.get(Calendar.DAY_OF_MONTH);
        int mes = c1.get(Calendar.MONTH) + 1; // Enero es 0
        int anio = c1.get(Calendar.YEAR);
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }
} // Fin clase Io
