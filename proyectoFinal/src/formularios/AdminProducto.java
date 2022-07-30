package formularios;

import dao.DaoProducto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

public class AdminProducto extends javax.swing.JInternalFrame {

    private final String columnas[] = {"Código", "Nombre", "Referencia", "Temperatura", "Valor Base"};
    private final DefaultTableModel miTabla = new DefaultTableModel(columnas, 0);

    public AdminProducto() {
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
            fila[4] = (long) objProducto.getValorBase();
            miTabla.addRow(fila);
        });

        tablaAdminProductos.setModel(miTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        panelCabeceraAdminPro = new javax.swing.JPanel();
        lblCodigoAdminPro = new javax.swing.JLabel();
        txtCajaCodigoAdminPro = new javax.swing.JTextField();
        lblReferenciaAdminPro = new javax.swing.JLabel();
        txtCajaReferenciaAdminPro = new javax.swing.JTextField();
        lblValorBaseAdminPro = new javax.swing.JLabel();
        txtCajaValorBaseAdminPro = new javax.swing.JTextField();
        lblTemperaturaAdminPro = new javax.swing.JLabel();
        txtCajaTemperaturaAdminPro = new javax.swing.JTextField();
        lblNombreAdminPro = new javax.swing.JLabel();
        txtCajaNombreAdminPro = new javax.swing.JTextField();
        panelCuerpoAdminPro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdminProductos = new javax.swing.JTable();
        btnActualizarAdminPro = new javax.swing.JButton();
        btnEliminarAdminPro = new javax.swing.JButton();

        setClosable(true);
        setTitle("Administrar Productos");

        panelCabeceraAdminPro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCodigoAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCodigoAdminPro.setText("CODIGO: ");

        txtCajaCodigoAdminPro.setEditable(false);
        txtCajaCodigoAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblReferenciaAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblReferenciaAdminPro.setText("REFERENCIA: ");

        txtCajaReferenciaAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblValorBaseAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValorBaseAdminPro.setText("VALOR BASE: ");

        txtCajaValorBaseAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblTemperaturaAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTemperaturaAdminPro.setText("TEMPERATURA: ");

        txtCajaTemperaturaAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblNombreAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreAdminPro.setText("NOMBRE: ");

        txtCajaNombreAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelCabeceraAdminProLayout = new javax.swing.GroupLayout(panelCabeceraAdminPro);
        panelCabeceraAdminPro.setLayout(panelCabeceraAdminProLayout);
        panelCabeceraAdminProLayout.setHorizontalGroup(
            panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraAdminProLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigoAdminPro)
                    .addComponent(lblValorBaseAdminPro)
                    .addComponent(lblNombreAdminPro))
                .addGap(3, 3, 3)
                .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCabeceraAdminProLayout.createSequentialGroup()
                        .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCajaValorBaseAdminPro, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtCajaCodigoAdminPro))
                        .addGap(18, 18, 18)
                        .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTemperaturaAdminPro)
                            .addComponent(lblReferenciaAdminPro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCajaReferenciaAdminPro, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtCajaTemperaturaAdminPro)))
                    .addComponent(txtCajaNombreAdminPro))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelCabeceraAdminProLayout.setVerticalGroup(
            panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraAdminProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoAdminPro)
                    .addComponent(txtCajaCodigoAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReferenciaAdminPro)
                    .addComponent(txtCajaReferenciaAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorBaseAdminPro)
                    .addComponent(txtCajaValorBaseAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperaturaAdminPro)
                    .addComponent(txtCajaTemperaturaAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCabeceraAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCajaNombreAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreAdminPro))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelCuerpoAdminPro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaAdminProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaAdminProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAdminProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAdminProductos);

        btnActualizarAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnActualizarAdminPro.setText("ACTUALIZAR");
        btnActualizarAdminPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAdminProActionPerformed(evt);
            }
        });

        btnEliminarAdminPro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEliminarAdminPro.setText("ELIMINAR");
        btnEliminarAdminPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdminProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoAdminProLayout = new javax.swing.GroupLayout(panelCuerpoAdminPro);
        panelCuerpoAdminPro.setLayout(panelCuerpoAdminProLayout);
        panelCuerpoAdminProLayout.setHorizontalGroup(
            panelCuerpoAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoAdminProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panelCuerpoAdminProLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnActualizarAdminPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarAdminPro)
                .addGap(56, 56, 56))
        );
        panelCuerpoAdminProLayout.setVerticalGroup(
            panelCuerpoAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoAdminProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuerpoAdminProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarAdminPro)
                    .addComponent(btnEliminarAdminPro))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabeceraAdminPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCuerpoAdminPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCabeceraAdminPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoAdminPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaAdminProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAdminProductosMouseClicked
        //*****************************************************************
        //definicion de variables
        //*****************************************************************
        Integer filaSeleccionada;
        String cajaNombre, cajaReferencia;
        Long cajaCodigo;
        Double cajaTemperatura, cajaValorBase;
        //*****************************************************************
        filaSeleccionada = tablaAdminProductos.getSelectedRow();

        cajaCodigo = Long.parseLong(miTabla.getValueAt(filaSeleccionada, 0).toString());
        cajaNombre = miTabla.getValueAt(filaSeleccionada, 1).toString();
        cajaReferencia = miTabla.getValueAt(filaSeleccionada, 2).toString();
        cajaTemperatura = Double.parseDouble(miTabla.getValueAt(filaSeleccionada, 3).toString());
        cajaValorBase = Double.parseDouble(miTabla.getValueAt(filaSeleccionada, 4).toString());

        txtCajaCodigoAdminPro.setText(cajaCodigo.toString());
        txtCajaNombreAdminPro.setText(cajaNombre);
        txtCajaReferenciaAdminPro.setText(cajaReferencia);
        txtCajaTemperaturaAdminPro.setText(cajaTemperatura.toString());
        txtCajaValorBaseAdminPro.setText(cajaValorBase.toString());

    }//GEN-LAST:event_tablaAdminProductosMouseClicked

    private void limpiarTabla() {
        for (int i = 0; i < tablaAdminProductos.getRowCount(); i++) {
            miTabla.removeRow(i);
            i -= 1;
        }
    }

    private void limpiarCajas() {
        txtCajaCodigoAdminPro.setText("");
        txtCajaNombreAdminPro.setText("");
        txtCajaReferenciaAdminPro.setText("");
        txtCajaTemperaturaAdminPro.setText("");
        txtCajaValorBaseAdminPro.setText("");
    }

    private void btnEliminarAdminProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdminProActionPerformed
        //***********************************************************
        //definicion de variables
        //************************************************************
        Long cajaCodigo;
        DaoProducto objDaoProducto;
        Producto objProducto;
        //*************************************************************
        //*************************************************************
        //creacion de objetos
        //*************************************************************
        objDaoProducto = new DaoProducto();
        objProducto = new Producto();
        //*************************************************************
        cajaCodigo = Long.parseLong(txtCajaCodigoAdminPro.getText());

        objProducto.setCodProducto(cajaCodigo);

        if (objDaoProducto.borrar(objProducto)) {
            JOptionPane.showMessageDialog(panelCuerpoAdminPro, "EXITO: registro eliminado correctamente.");
            limpiarTabla();
            cargarDatosTabla();
            limpiarCajas();
        } else {
            JOptionPane.showMessageDialog(panelCuerpoAdminPro, "ERROR: registro NO eliminado correctamente.");
        }
    }//GEN-LAST:event_btnEliminarAdminProActionPerformed

    private void btnActualizarAdminProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAdminProActionPerformed
        //******************************************************
        //definicion de variables
        //******************************************************
        String cajaNombre, cajaReferencia;
        Double cajaTemperatura, cajaValorBase;
        DaoProducto objDaoProducto;
        Producto objProducto;
        Long cajaCodigo;
        //******************************************************
        //******************************************************
        //capturar datos
        //******************************************************
        cajaNombre = txtCajaNombreAdminPro.getText();
        cajaReferencia = txtCajaReferenciaAdminPro.getText();
        cajaTemperatura = Double.parseDouble(txtCajaTemperaturaAdminPro.getText());
        cajaValorBase = Double.parseDouble(txtCajaValorBaseAdminPro.getText());
        cajaCodigo = Long.parseLong(txtCajaCodigoAdminPro.getText());
        //******************************************************
        if (cajaNombre.isEmpty() || cajaReferencia.isEmpty() || cajaTemperatura == 0 || cajaValorBase == 0) {
            JOptionPane.showMessageDialog(panelCuerpoAdminPro, "Todos los valores son obligatorios.");
        } else {
            //****************************************************
            //creacion de objetos
            //****************************************************
            objDaoProducto = new DaoProducto();
            objProducto = new Producto();
            //****************************************************
            objProducto.setNombre(cajaNombre);
            objProducto.setId(cajaReferencia);
            objProducto.setTemperatura(cajaTemperatura);
            objProducto.setValorBase(cajaValorBase);
            objProducto.setCodProducto(cajaCodigo);

            if (objDaoProducto.actualizar(objProducto)) {
                JOptionPane.showMessageDialog(panelCuerpoAdminPro, "EXITO: Registro actualizado correctamente.");
                limpiarTabla();
                cargarDatosTabla();
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(panelCuerpoAdminPro, "ERROR: Registro NO FUE actualizado correctamente.");
            }

        }
    }//GEN-LAST:event_btnActualizarAdminProActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarAdminPro;
    private javax.swing.JButton btnEliminarAdminPro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblCodigoAdminPro;
    private javax.swing.JLabel lblNombreAdminPro;
    private javax.swing.JLabel lblReferenciaAdminPro;
    private javax.swing.JLabel lblTemperaturaAdminPro;
    private javax.swing.JLabel lblValorBaseAdminPro;
    private javax.swing.JPanel panelCabeceraAdminPro;
    private javax.swing.JPanel panelCuerpoAdminPro;
    private javax.swing.JTable tablaAdminProductos;
    private javax.swing.JTextField txtCajaCodigoAdminPro;
    private javax.swing.JTextField txtCajaNombreAdminPro;
    private javax.swing.JTextField txtCajaReferenciaAdminPro;
    private javax.swing.JTextField txtCajaTemperaturaAdminPro;
    private javax.swing.JTextField txtCajaValorBaseAdminPro;
    // End of variables declaration//GEN-END:variables
}
