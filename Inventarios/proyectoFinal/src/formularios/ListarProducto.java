package formularios;

import dao.DaoProducto;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

public class ListarProducto extends javax.swing.JInternalFrame {
    
    private final String columnas[] = {"Código", "Nombre", "Referencia", "Temperatura", "Valor Base"};
    private final DefaultTableModel miTabla = new DefaultTableModel(columnas, 0);
    
    public ListarProducto() {
        initComponents();
        cargarDatosTabla();
    }
    
    private void cargarDatosTabla() {
        //************************************************************
        //definicion variables
        //************************************************************
        List<Producto> arregloProductos;
        DaoProducto objDaoProducto;
        //*************************************************************
        //*************************************************************
        //creacion de objetos
        //*************************************************************
        objDaoProducto = new DaoProducto();
        //*************************************************************
        arregloProductos = objDaoProducto.consultar();
        
        arregloProductos.forEach(objProducto -> {
            Object[] fila = new Object[5];
            fila[0] = objProducto.getCodProducto();
            fila[1] = objProducto.getNombre();
            fila[2] = objProducto.getId();
            fila[3] = objProducto.getTemperatura();
            fila[4] = (long)objProducto.getValorBase();
            miTabla.addRow(fila);
        });
        
        tablaProductos.setModel(miTabla); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabeceraListarPro = new javax.swing.JPanel();
        lblListadoProductos = new javax.swing.JLabel();
        panelCuerpoListarPro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        panelBotonesListarPro = new javax.swing.JPanel();
        btnCancelarListarPro = new javax.swing.JButton();

        setClosable(true);
        setTitle("Listado Productos");

        panelCabeceraListarPro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblListadoProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListadoProductos.setText("LISTADO DE PRODUCTOS");

        javax.swing.GroupLayout panelCabeceraListarProLayout = new javax.swing.GroupLayout(panelCabeceraListarPro);
        panelCabeceraListarPro.setLayout(panelCabeceraListarProLayout);
        panelCabeceraListarProLayout.setHorizontalGroup(
            panelCabeceraListarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraListarProLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(lblListadoProductos)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        panelCabeceraListarProLayout.setVerticalGroup(
            panelCabeceraListarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraListarProLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblListadoProductos)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelCuerpoListarPro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout panelCuerpoListarProLayout = new javax.swing.GroupLayout(panelCuerpoListarPro);
        panelCuerpoListarPro.setLayout(panelCuerpoListarProLayout);
        panelCuerpoListarProLayout.setHorizontalGroup(
            panelCuerpoListarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelCuerpoListarProLayout.setVerticalGroup(
            panelCuerpoListarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoListarProLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBotonesListarPro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCancelarListarPro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCancelarListarPro.setText("CANCELAR");
        btnCancelarListarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarListarProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesListarProLayout = new javax.swing.GroupLayout(panelBotonesListarPro);
        panelBotonesListarPro.setLayout(panelBotonesListarProLayout);
        panelBotonesListarProLayout.setHorizontalGroup(
            panelBotonesListarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesListarProLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btnCancelarListarPro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesListarProLayout.setVerticalGroup(
            panelBotonesListarProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesListarProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarListarPro)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabeceraListarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCuerpoListarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBotonesListarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCabeceraListarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoListarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelBotonesListarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarListarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarListarProActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarListarProActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarListarPro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListadoProductos;
    private javax.swing.JPanel panelBotonesListarPro;
    private javax.swing.JPanel panelCabeceraListarPro;
    private javax.swing.JPanel panelCuerpoListarPro;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
