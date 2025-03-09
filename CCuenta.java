public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto vacío
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo inicial de la cuenta
     * @param tipo Tipo de interés aplicado
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * @return saldo actual
     */
    public double estado() {
        return saldo;
    }

    /**
     * Método para ingresar dinero en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o si no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo -= cantidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
