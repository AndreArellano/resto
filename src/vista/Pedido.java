
package vista;

import modelo.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Pedido extends javax.swing.JFrame {
    Conexion conexion;
    /**
     * Creates new form JFCrud
     */
    public Pedido() {
        initComponents();
        conexion = new Conexion();
        
         try {
           Connection acceDB = conexion.getConexion(); 
            //Connection acceDB1 = conexion.getConexion();
            PreparedStatement ps = acceDB.prepareStatement("select ci from mesero");
            //PreparedStatement ps1 = acceDB.prepareStatement("select idcomida from comida");
            PreparedStatement ps2 = acceDB.prepareStatement("select nromesa from mesa");
            
            ResultSet rs = ps.executeQuery();
           //ResultSet rs1 = ps1.executeQuery();
            ResultSet rs2 = ps2.executeQuery();
            
            cboxMesero.addItem("Selecione mesero");
            
            cboxMesa.addItem("Selecione mesa");
            while(rs.next()){
                //System.out.print("wow");
                cboxMesero.addItem(rs.getString("ci"));
     
            }
            while(rs2.next()){
                cboxMesa.addItem(rs2.getString("nromesa"));
            }
            
            cargarcbx();
            //rs.close();
            //rs1.close();
            //rs2.close();
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btnNuevoPedido = new javax.swing.JButton();
        btnAgregarOrden = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        cboxMesero = new javax.swing.JComboBox<>();
        cboxMesa = new javax.swing.JComboBox<>();
        cboxProducto = new javax.swing.JComboBox<>();
        btnPlato = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro pedido");

        btnNuevoPedido.setText("Nuevo Pedido");
        btnNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPedidoActionPerformed(evt);
            }
        });

        btnAgregarOrden.setText("Agregar orden a pedido");
        btnAgregarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarOrdenActionPerformed(evt);
            }
        });

        txtBusqueda.setForeground(new java.awt.Color(0, 0, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PLATO", "CANTIDAD", "SUBTOTAL"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel5.setText("CANTIDAD");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel6.setText("PRECIO");

        jLabel7.setText("TOTAL");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        cboxMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMesaActionPerformed(evt);
            }
        });

        btnPlato.setText("Elegir plato");
        btnPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(txtCantidad)))
                            .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnAgregarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cboxMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboxMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cboxMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboxMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNuevoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(btnAgregarOrden)
                .addGap(42, 42, 42)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarcbx(){
       conexion = new Conexion();
        
         try {
            Connection acceDB = conexion.getConexion();
            PreparedStatement ps1 = acceDB.prepareStatement("select idcomida,precio from comida");
            ResultSet rs1 = ps1.executeQuery();
            cboxProducto.addItem("Selecione producto");
             while(rs1.next()){
                 cboxProducto.addItem(rs1.getString("idcomida"));
                 
             }
             rs1.close();
        }   
         catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    void actualizarPedido(int pedido){
       
        DefaultTableModel modelo= new DefaultTableModel();
        modelo.addColumn("Comida");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Subtotal");
        //modelo.addColumn("Hora de inicio");

        jTable1.setModel(modelo);

        String []datos = new String [3];
            try {
                Connection acceDB = conexion.getConexion();
                //aumentar nombre del plato
                 PreparedStatement ps1 = acceDB.prepareStatement( "SELECT idcomida,cantidad, subtotal FROM producto_pedido where idpedido="+pedido);
                ResultSet rs = ps1.executeQuery();

                while(rs.next()){
                    datos[0]=rs.getString(1);
                    datos[1]=rs.getString(2);
                    datos[2]=rs.getString(3);
                    modelo.addRow(datos);
                }
                jTable1.setModel(modelo);
            } catch (SQLException ex) {

            }
    }
    
    void actualizarTotal(int pedido){
       
            try {
                Connection acceDB = conexion.getConexion();
                //aumentar nombre del plato
                 PreparedStatement ps1 = acceDB.prepareStatement( "SELECT sum(subtotal)as total FROM producto_pedido where idpedido="+pedido);
                ResultSet rs = ps1.executeQuery();

                if(rs.next()){
                    double total = rs.getDouble("total");
                    //double precio = rs1.getDouble("precio");
                    String tot = String.valueOf(total);
                    txtTotal.setText( tot);
                    System.out.println(tot);
                }            
                
            } catch (SQLException ex) {

            }
    }
    
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPedidoActionPerformed
       //registar nuevo pedido en tabla pedido

       String mesa = (String) cboxMesa.getSelectedItem();
       String  mesero = (String) cboxMesero.getSelectedItem();
       String rptaRegistro ="";
       
       
       System.out.println(" "+ mesero);
       try {
            Connection accesoDB = conexion.getConexion();
            String sql = "INSERT INTO pedido ( ci, idmesa,fechapedido) VALUES (?,?,?);";
            CallableStatement ps = accesoDB.prepareCall(sql);
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
            
            ps.setString(1, mesero);
            ps.setString(2, mesa);
            ps.setDate(3, sqlDate);
            System.out.println(" "+ mesero);
            //actualizar mesa
           int numFAfectas = ps.executeUpdate();
            
            if(numFAfectas>0){
                rptaRegistro="Registro exitoso.";
              try{
                Connection accesoD = conexion.getConexion();
                String sql1 = "update mesa set disponibilidad=? where nromesa=?;";

                CallableStatement pss = accesoD.prepareCall(sql1);
                pss.setInt(1,1);
                pss.setString(2, mesa);
                pss.executeUpdate();
                //System.out.println("exito" );
              }catch (Exception e){
                  System.err.println(e);
              }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnNuevoPedidoActionPerformed

    private void btnAgregarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarOrdenActionPerformed
        // registrar platon al pedido
        /* obtener el ultimo pedido(ver desabilitar boton de nuevo pedidow0)
        recuperar id de plato(precio?), nombre 
        pedir cantidad 
        insertar idpedido, idplato, cantidad y calcular subtotal
        mostrar en tabla
        */
       
        //txtIdProducto.setText((String) cboxProducto.getSelectedItem());
        String plato = (String) cboxProducto.getSelectedItem();
        double precio = Double.parseDouble(txtPrecio.getText());
        double cantidad = Double.parseDouble(txtCantidad.getText());
        double subtotal = precio * cantidad;
        //System.out.println(precio +" p "+cantidad +" can "+ subtotal+" sub ");

        
        Connection accesoDB = conexion.getConexion();
        PreparedStatement ps1;
        String rptaRegistro="";
        try {
            ps1 = accesoDB.prepareStatement("select max(idpedido)as id from pedido  ");
            ResultSet rs1 = ps1.executeQuery();
            if(rs1.next()){
                int pedido = rs1.getInt("id");
                System.out.println(pedido);
            
                //inseratar a la tabla producto_pedido
                String sql2 = "INSERT INTO producto_pedido (idpedido,idcomida, cantidad, subtotal ) VALUES (?,?,?,?)";
                CallableStatement ps;
                ps = accesoDB.prepareCall(sql2);
                ps.setInt(1, pedido);
                ps.setString(2, plato);
                ps.setDouble(3, cantidad);
                ps.setDouble(4, subtotal);
            
                System.out.println(plato +" platon "+cantidad +" can "+ subtotal+" sub ");
                int numFAfectas = ps.executeUpdate();

                if(numFAfectas>0){
                    rptaRegistro="Registro plato exitoso.";
                    actualizarPedido(pedido);
                    actualizarTotal(pedido);
                }
                
            }
        } catch (SQLException e2) {
            System.err.println(e2+"e2 ");
        }
           // ps.setString(1, id);
            
        
    }//GEN-LAST:event_btnAgregarOrdenActionPerformed

    private void btnPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatoActionPerformed
       // Elegir pedido
       String plato = (String) cboxProducto.getSelectedItem();
       //consulta para obtener el precio del plato
       Connection acceDB = conexion.getConexion();
       PreparedStatement ps1;
       try{
            ps1 = acceDB.prepareStatement("select precio from comida where idcomida="+plato);
            //txtPrecio.setText ()
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next()){
                double precio = rs1.getDouble("precio");
                String pre = String.valueOf(precio);
                txtPrecio.setText( pre);
                  //rs1.setString(2,plato);
                System.out.println(precio);
            }
       }
       catch(Exception e) {
           System.out.println(e);
       }
    }//GEN-LAST:event_btnPlatoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void cboxMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxMesaActionPerformed

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
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarOrden;
    public javax.swing.JButton btnNuevoPedido;
    private javax.swing.JButton btnPlato;
    private javax.swing.JComboBox<String> cboxMesa;
    public javax.swing.JComboBox<String> cboxMesero;
    private javax.swing.JComboBox<String> cboxProducto;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField txtBusqueda;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}