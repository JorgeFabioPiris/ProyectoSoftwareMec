/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author Jorge Fabio
 */
public interface ClienteDao {
    void guardar(Cliente cliente);
    boolean modificarCliente(Cliente cliente);
    Cliente buscartClientePorCodigo(int codigo); 
    void eliminar(int codigo);
    List<Cliente> buscarClientePorFiltro(String filtro);
    
}
