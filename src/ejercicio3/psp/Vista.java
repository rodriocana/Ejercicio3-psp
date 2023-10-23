/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio3.psp;

import java.awt.Color;

public class Vista extends javax.swing.JFrame {

    boolean boton;

    boolean borrar;

    private Lista<Empleado> listaEmpleados;

    public Vista() {
        super("Gestion de empleados");
        initComponents();

        listaEmpleados = new Lista<>();

        ocultarPaneles();
        ocultarTxtField();
        OcultarBotones();

    }

    public void mostrarPaneles() {

        PanelNombre.setText("Nombre: ");
        ApellidoPanel1.setText("Apellido: ");
        FechaPanel.setText("Fecha de alta: ");
        SueldoPanel.setText("Sueldo: ");
        NumeroPanel.setText("Numero de empleado");

        PanelNombre.setVisible(true);
        ApellidoPanel1.setVisible(true);
        FechaPanel.setVisible(true);
        SueldoPanel.setVisible(true);
        NumeroPanel.setVisible(true);

    }

    public void ocultarPaneles() {

        PanelNombre.setVisible(false);
        ApellidoPanel1.setVisible(false);
        FechaPanel.setVisible(false);
        SueldoPanel.setVisible(false);
        NumeroPanel.setVisible(false);

    }

    public void mostrarTxtField() {

        txtApellido.setVisible(true);
        txtNombre.setVisible(true);
        txtSueldo.setVisible(true);
        txtNumeroEmple.setVisible(true);
        txtFechaAlta.setVisible(true);

    }

    public void ocultarTxtField() {

        txtApellido.setVisible(false);
        txtNombre.setVisible(false);
        txtSueldo.setVisible(false);
        txtNumeroEmple.setVisible(false);
        txtFechaAlta.setVisible(false);
    }

    public void mostrarBotones() {

        btnSiguiente.setVisible(true);
        btnRetroceder.setVisible(true);

    }

    public void activarCampos() {

        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtSueldo.setEnabled(true);
        txtFechaAlta.setEnabled(true);
        txtNumeroEmple.setEnabled(true);

    }

    public void ColorearCampos() {

        txtNombre.setDisabledTextColor(Color.black);
        txtApellido.setDisabledTextColor(Color.black);
        txtSueldo.setDisabledTextColor(Color.black);
        txtFechaAlta.setDisabledTextColor(Color.black);
        txtNumeroEmple.setDisabledTextColor(Color.black);

    }

    public void desactivarCampos() {

        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtSueldo.setEnabled(false);
        txtFechaAlta.setEnabled(false);
        txtNumeroEmple.setEnabled(false);

    }

    public void borrarCampos() {

        txtNombre.setText("");
        txtApellido.setText("");
        txtSueldo.setText("");
        txtFechaAlta.setText("");
        txtNumeroEmple.setText("");
    }

    public void OcultarBotones() {

        btnSiguiente.setVisible(false);
        btnRetroceder.setVisible(false);
    }

    public void visualizarEmpleados() {

        txtNombre.setText(listaEmpleados.visualizar().getNombre());
        txtApellido.setText(listaEmpleados.visualizar().getApellido());
        txtFechaAlta.setText(listaEmpleados.visualizar().getFechaDeAlta().getTime().toString());
        txtSueldo.setText(Float.toString(listaEmpleados.visualizar().getSueldo()));
        txtNumeroEmple.setText(Integer.toString(listaEmpleados.visualizar().getNumeroEmpleado()));

    }

    public void cambiarBoton(boolean boton) {

        if (boton == false) {

            btnRetroceder.setText("Aceptar");
            btnSiguiente.setText("Cancelar");

        } else {

            btnSiguiente.setText("Siguiente");
            btnRetroceder.setText("Anterior");

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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PanelNombre = new javax.swing.JLabel();
        FechaPanel = new javax.swing.JLabel();
        SueldoPanel = new javax.swing.JLabel();
        NumeroPanel = new javax.swing.JLabel();
        ApellidoPanel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFechaAlta = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        txtNumeroEmple = new javax.swing.JTextField();
        btnCrearEmpleado = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnModificar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 239));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Agency FB", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GESTIÓN DE EMPLEADOS");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PanelNombre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        PanelNombre.setForeground(new java.awt.Color(255, 255, 255));
        PanelNombre.setText("Prueba");

        FechaPanel.setBackground(new java.awt.Color(255, 255, 255));
        FechaPanel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        FechaPanel.setForeground(new java.awt.Color(255, 255, 255));
        FechaPanel.setText("Prueba");

        SueldoPanel.setBackground(new java.awt.Color(255, 255, 255));
        SueldoPanel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SueldoPanel.setForeground(new java.awt.Color(255, 255, 255));
        SueldoPanel.setText("Prueba");

        NumeroPanel.setBackground(new java.awt.Color(255, 255, 255));
        NumeroPanel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        NumeroPanel.setForeground(new java.awt.Color(255, 255, 255));
        NumeroPanel.setText("Prueba");

        ApellidoPanel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ApellidoPanel1.setForeground(new java.awt.Color(255, 255, 255));
        ApellidoPanel1.setText("Prueba");

        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtApellido.setCaretColor(new java.awt.Color(255, 255, 255));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtFechaAlta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtFechaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaAltaActionPerformed(evt);
            }
        });

        txtSueldo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        txtNumeroEmple.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtNumeroEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroEmpleActionPerformed(evt);
            }
        });

        btnCrearEmpleado.setText("CREAR");
        btnCrearEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), null));
        btnCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpleadoActionPerformed(evt);
            }
        });

        btnVisualizar.setText("VISUALIZAR EMPLEADOS");
        btnVisualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), null));
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnModificar1.setText("MODIFICAR/BORRAR");
        btnModificar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), null));
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SueldoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumeroPanel)
                            .addComponent(PanelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApellidoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRetroceder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSiguiente))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtApellido)
                                .addComponent(txtNumeroEmple)
                                .addComponent(txtSueldo)
                                .addComponent(txtFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(198, 198, 198))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoPanel1))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaPanel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SueldoPanel))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroPanel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnRetroceder))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed

        mostrarPaneles();
        mostrarTxtField();
        mostrarBotones();

        try {

            visualizarEmpleados();

            if (btnRetroceder.getText() == "Modificar") {

            }
        } catch (Exception e) {

            System.err.println("Error! - Debe ingresar introducir datos para modificar o borrar.");
        }

        btnRetroceder.setText("Borrar");
        btnSiguiente.setText("Modificar");
    }//GEN-LAST:event_btnModificar1ActionPerformed

    //BOTON RETROCEDER Y ACEPTAR
    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed

        if (btnRetroceder.getText() == "Aceptar") {

            try {

                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                float sueldo = (Float.parseFloat(txtSueldo.getText()));
                int numeroEmple = Integer.parseInt(txtNumeroEmple.getText());

                //txtFechaAlta.setText(listaEmpleados.visualizar().getFechaDeAlta().getTime().toString());
                Empleado emplee = new Empleado(nombre, apellido, (int) sueldo, numeroEmple);
                listaEmpleados.insertar(emplee);

                System.out.println("El empleado ha sido creado");

                borrarCampos();

            } catch (Exception e) {

                System.err.println("Tienes que introducir valores en los TextField");

            }

        }

        if (btnRetroceder.getText() == "Borrar") {

            try {

                listaEmpleados.borrarNodo();
                System.out.println("El empleado ha sido borrado");
            } catch (Exception e) {

                System.err.println("No hay empleados para borrar");
            }

        }

        if (btnRetroceder.getText() == "Anterior") {

            try {

                listaEmpleados.visualizarAnterior();
                visualizarEmpleados();
            } catch (Exception e) {

                System.err.println("no hay mas empleados anteriores para mostrar");
            }

        }


    }//GEN-LAST:event_btnRetrocederActionPerformed

    //BOTON AVANZAR-SIGUIENTE Y CANCELAR
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        if (btnSiguiente.getText() == "Cancelar") {

            borrarCampos();
            ocultarPaneles();
            ocultarTxtField();
            OcultarBotones();
        }

        if (btnSiguiente.getText() == "Modificar") {

            System.out.println("Hay que modificar el campo");
        }

        if (btnSiguiente.getText() == "Siguiente") {

            listaEmpleados.avanzar();
            visualizarEmpleados();
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed

        mostrarPaneles();
        mostrarTxtField();
        mostrarBotones();
        desactivarCampos();
        ColorearCampos();

        try {

            visualizarEmpleados();

        } catch (Exception e) {
            System.err.println("Error! - Debe ingresar introducir datos para visualizar.");
        }

        cambiarBoton(boton = true);


    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoActionPerformed

        mostrarPaneles();
        mostrarTxtField();
        mostrarBotones();
        borrarCampos();
        activarCampos();

        cambiarBoton(boton = false);


    }//GEN-LAST:event_btnCrearEmpleadoActionPerformed

    private void txtNumeroEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroEmpleActionPerformed

    }//GEN-LAST:event_txtNumeroEmpleActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed

    }//GEN-LAST:event_txtSueldoActionPerformed

    private void txtFechaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaAltaActionPerformed

    }//GEN-LAST:event_txtFechaAltaActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed

    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Vista menu = new Vista();
                menu.setVisible(true);
                menu.setTitle("Gestión de Empleados");

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoPanel1;
    private javax.swing.JLabel FechaPanel;
    private javax.swing.JLabel NumeroPanel;
    private javax.swing.JLabel PanelNombre;
    private javax.swing.JLabel SueldoPanel;
    private javax.swing.JButton btnCrearEmpleado;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtFechaAlta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroEmple;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables

}
