public class Main {

    /**
     * Método principal que ejecuta el programa
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        operativa_cuenta(cuenta1, 2300);
    }

    /**
     * Método que realiza operaciones sobre una cuenta
     * @param cuenta Cuenta sobre la que se opera
     * @param cantidad Cantidad a operar
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
