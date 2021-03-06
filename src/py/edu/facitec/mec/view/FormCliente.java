/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.view;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import py.edu.facitec.mec.controller.ClienteController;
import py.edu.facitec.mec.controller.ClienteControllerImpl;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author Jorge Fabio
 */
public class FormCliente extends javax.swing.JFrame {

    /**
     * Creates new form FormCliente2
     */
    
    ClienteController clienteController;
    boolean estadoModificacion;
    public FormCliente() {
        initComponents();
        this.clienteController = new ClienteControllerImpl();
        estadoModificacion = false;
        estadoInicial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfCredito = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre(s):");

        jLabel3.setText("Apellido(s):");

        jLabel4.setText("Direccion:");

        jLabel5.setText("Credito:");

        tfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodigoFocusLost(evt);
            }
        });
        tfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCodigoKeyPressed(evt);
            }
        });

        tfNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombresFocusGained(evt);
            }
        });
        tfNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNombresKeyPressed(evt);
            }
        });

        tfApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfApellidosFocusGained(evt);
            }
        });
        tfApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfApellidosKeyPressed(evt);
            }
        });

        tfDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDireccionFocusGained(evt);
            }
        });
        tfDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDireccionKeyPressed(evt);
            }
        });

        tfCredito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCreditoFocusGained(evt);
            }
        });
        tfCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCreditoKeyPressed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        btnConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConsultarKeyPressed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarKeyPressed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        btnModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnModificarKeyPressed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        btnEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEliminarKeyPressed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalirKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfNombres)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfApellidos)
                            .addComponent(tfDireccion)
                            .addComponent(tfCredito)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        consultarClientePorCodito(Integer.parseInt(tfCodigo.getText()));
        estadoModificar();
        estadoModificacion = true;
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean validar = validarCampos();
        if(validar){
            guardar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        boolean validar = validarCampos();
        if(validar){
            modificar();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea salir?", "Aviso", 2);
        if (opcion == JOptionPane.YES_OPTION) {
            dispose();
        }else{
            btnSalir.requestFocus();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tfCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyPressed
        if (tfCodigo.getText().isEmpty()) {
            moverConEnter(evt, tfNombres);
        }else{
            btnConsultar.requestFocus();
        }

    }//GEN-LAST:event_tfCodigoKeyPressed

    private void tfNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombresKeyPressed
        moverConEnter(evt, tfApellidos);
    }//GEN-LAST:event_tfNombresKeyPressed

    private void tfApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidosKeyPressed
        moverConEnter(evt, tfDireccion);
    }//GEN-LAST:event_tfApellidosKeyPressed

    private void tfDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDireccionKeyPressed
        moverConEnter(evt, tfCredito);
    }//GEN-LAST:event_tfDireccionKeyPressed

    private void tfCreditoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCreditoKeyPressed
        if (estadoModificacion) {
            moverConEnter(evt, btnModificar);
        }else{
            moverConEnter(evt, btnGuardar);
        }
        
    }//GEN-LAST:event_tfCreditoKeyPressed

    private void btnConsultarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConsultarKeyPressed
        hacerClicConEnter(evt, btnConsultar);
    }//GEN-LAST:event_btnConsultarKeyPressed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed
        hacerClicConEnter(evt, btnGuardar);
    }//GEN-LAST:event_btnGuardarKeyPressed

    private void btnModificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnModificarKeyPressed
        hacerClicConEnter(evt, btnModificar);
    }//GEN-LAST:event_btnModificarKeyPressed

    private void btnEliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEliminarKeyPressed
        hacerClicConEnter(evt, btnEliminar);
    }//GEN-LAST:event_btnEliminarKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        hacerClicConEnter(evt, btnCancelar);
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void btnSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirKeyPressed
        hacerClicConEnter(evt, btnSalir);
    }//GEN-LAST:event_btnSalirKeyPressed

    private void tfCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodigoFocusLost
        if (tfCodigo.getText().isEmpty()) {
            tfNombres.requestFocus();
            estadoInsertar();
        }else{
            btnConsultar.requestFocus();
        }
    }//GEN-LAST:event_tfCodigoFocusLost

    private void tfNombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombresFocusGained
        tfNombres.selectAll();
    }//GEN-LAST:event_tfNombresFocusGained

    private void tfApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidosFocusGained
        tfApellidos.selectAll();
    }//GEN-LAST:event_tfApellidosFocusGained

    private void tfDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDireccionFocusGained
        tfDireccion.selectAll();
    }//GEN-LAST:event_tfDireccionFocusGained

    private void tfCreditoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCreditoFocusGained
        tfCredito.selectAll();
    }//GEN-LAST:event_tfCreditoFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCredito;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombres;
    // End of variables declaration//GEN-END:variables

    private void consultarClientePorCodito(int codigo) {
        
        if (codigo != 0 ) {
            
            Cliente cliente = clienteController.buscarClientePorCodigo(codigo);
            
            if (cliente != null) {
                tfNombres.setText(cliente.getNombres());
                tfApellidos.setText(cliente.getApellidos());
                tfDireccion.setText(cliente.getDireccion());
                tfCredito.setText(cliente.getCredito()+"");
            }else{
                JOptionPane.showMessageDialog(this, "No existe cliente con este codigo", "Aviso", 1);
                tfCodigo.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debes digitar un numero", "Aviso", 2);
        }
    }

    private void guardar() {
        Cliente clie = new Cliente(tfNombres.getText(), tfApellidos.getText(), tfDireccion.getText(), Double.parseDouble(tfCredito.getText()));
        clienteController.registrarCliente(clie);
        JOptionPane.showMessageDialog(this, "Cliente Nuevo guardado con exito", "Aviso", 2);
        limpiar();
    }

    private void modificar() {
        
        Cliente clie = new Cliente(Integer.parseInt(tfCodigo.getText()), tfNombres.getText(), tfApellidos.getText(), tfDireccion.getText(), Double.parseDouble(tfCredito.getText()));
        
        boolean result = clienteController.modificarCliente(clie);
        
        if(result){
            
            JOptionPane.showMessageDialog(this, "Cliente actualizado con exito", "Aviso", 1);
        }
        
        limpiar();
    }

    private void eliminar() {
        
        int opcion = JOptionPane.showConfirmDialog(this, "Eliminar?", "Aviso", JOptionPane.YES_NO_OPTION);
        
        if (opcion == JOptionPane.YES_OPTION) {
            
            clienteController.eliminarCliente( Integer.parseInt( tfCodigo.getText() ) );
            
        }
        limpiar();
    }

    private void limpiar() {
        tfCodigo.requestFocus();
        tfCodigo.setText("");
        tfNombres.setText("");
        tfApellidos.setText("");
        tfDireccion.setText("");
        tfCredito.setText("");
        estadoModificacion = false;
        estadoInicial();
    }

    private void moverConEnter(java.awt.event.KeyEvent evt, JComponent source) {
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            source.requestFocus();
        }
    }
    
    private void hacerClicConEnter(java.awt.event.KeyEvent evt, JButton buttom){
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            buttom.doClick();
        }
    }
    
    private void estadoInicial() {
        tfCodigo.setEnabled(true);
        tfNombres.setEnabled(false);
        tfApellidos.setEnabled(false);
        tfDireccion.setEnabled(false);
        tfCredito.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    private void estadoInsertar(){
        tfCodigo.setEnabled(false);
        tfNombres.setEnabled(true);
        tfApellidos.setEnabled(true);
        tfDireccion.setEnabled(true);
        tfCredito.setEnabled(true);
        btnConsultar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(true);
    }
    
    private void estadoModificar(){
        tfCodigo.setEnabled(false);
        tfNombres.setEnabled(true);
        tfApellidos.setEnabled(true);
        tfDireccion.setEnabled(true);
        tfCredito.setEnabled(true);
        btnConsultar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }
    
    private boolean validarCampos(){
        boolean valido = false;
        if(tfNombres.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo Nombres es obligatorio", "Aviso", 1);
            tfNombres.requestFocus();
        }else if(tfApellidos.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo Apellidos es obligatorio", "Aviso", 1);
            tfApellidos.requestFocus();
        }else if(tfDireccion.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo Direccion es obligatorio", "Aviso", 1);
            tfDireccion.requestFocus();
        }else if(tfCredito.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo Credito es obligatorio", "Aviso", 1);
            tfCredito.requestFocus();
        }else{
            valido = true;
        }
        return valido;
    }
}
