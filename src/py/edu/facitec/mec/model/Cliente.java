/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.model;

/**
 *
 * @author Jorge Fabio
 */
public class Cliente {
    
    //atriburos
    private int codigo;
    private String nombres;
    private String apellidos;
    private String direccion;
    
    private Ciudad ciudad;
    
    private Double credito;
    private int estado;
    
    //constructores 
    public Cliente(){
        this.codigo = 0;
        this.nombres = "";
        this.apellidos = "";
        this.direccion = "";
        this.ciudad = new Ciudad();
        this.credito = 0d;        
        this.estado = 0;
    }
   
    public Cliente(int codigo, String nombres, String apellidos, String direccion, Double credito){
        super();
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.credito = credito;
    }
        
    public Cliente( String nombres, String apellidos, String direccion, Double credito){
        super();
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.credito = credito;
    }

    public Cliente(int codigo, String nombres, String apellidos, String direccion, Ciudad ciudad, Double credito, int estado) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.credito = credito;
        this.estado = estado;
    }
    //metodos

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
