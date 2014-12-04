/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;

/**
 *
 * @author Jorge Aguirre
 */
public class Principal extends javax.swing.JFrame {

    private final Usuario usuario;

    /**
     * Creates new form Principal
     * @param usuario
     */
    public Principal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        Rol rol = this.usuario.getPersona().getRol();
        
        if(rol == Rol.ADMINISTRADOR){
        }
        
        if (rol == Rol.ANALISTA) {
            btn_RegPaciente.setVisible(false);
        }
        
        if (rol == Rol.SECRETARIA) {
            btn_Informe.setVisible(false);
            btn_RegMuestra.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        btn_RegPaciente = new javax.swing.JButton();
        btn_RegMuestra = new javax.swing.JButton();
        btn_Informe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_RegPaciente.setText("Registrar Paciente");
        btn_RegPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegPacienteActionPerformed(evt);
            }
        });

        btn_RegMuestra.setText("Registrar Muestra");
        btn_RegMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegMuestraActionPerformed(evt);
            }
        });

        btn_Informe.setText("Informe");
        btn_Informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_RegPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(btn_RegMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Informe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btn_RegPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_RegMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_Informe, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegMuestraActionPerformed
        new RegistrarResultado().setVisible(true);
    }//GEN-LAST:event_btn_RegMuestraActionPerformed

    private void btn_RegPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegPacienteActionPerformed
        new RegistroPaciente().setVisible(true);
    }//GEN-LAST:event_btn_RegPacienteActionPerformed

    private void btn_InformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformeActionPerformed
        new Informe().setVisible(true);
    }//GEN-LAST:event_btn_InformeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Informe;
    private javax.swing.JButton btn_RegMuestra;
    private javax.swing.JButton btn_RegPaciente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
