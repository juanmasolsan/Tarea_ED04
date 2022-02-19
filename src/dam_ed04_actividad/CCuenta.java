/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 *
 * @author juanma
 */
public class CCuenta {

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parametros
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parametros
     * @param nom Nombre del usuario
     * @param cue Numero de cuenta
     * @param sal Saldo
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Assigna el nombre de la cuenta
     * @param nom Nuevo nombre de la cuenta
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre de la cuenta
     * @return Nombre de la cuenta
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Obtiene el saldo de la cuenta
     * @return Saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta
     * @param cantidad que se intenta introducir en la cuenta
     * @throws Exception en caso de ser menor a cero
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad en la cuenta
     * @param cantidad que se intenta retirar de la cuenta
     * @throws Exception en caso de que la cantidad sea inferior o igual a cero
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el numero/identificador de la cuenta
     * @return el numero/identificador de la cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Obtiene el nombre de la cuenta
     * @return el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Assigna el nombre de la cuenta
     * @param nombre El nuevo nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo de interes
     * @return el tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Assigna un nuevo tipo de interes
     * @param tipoInterés el nuevo tipo de interes
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
