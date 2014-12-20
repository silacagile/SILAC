/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Muestra;

/**
 *
 * @author Marcelo
 */
public class TratamientoPanel extends javax.swing.JPanel {

    private final Muestra muestra;

    /**
     * Creates new form TratamientoPanel
     * @param muestra
     */
    public TratamientoPanel(Muestra muestra) {
        this.muestra = muestra;
        initComponents();
        this.setVisible(true);
        
        setCamposMuestra();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_MuestraId = new javax.swing.JLabel();
        lbl_ResFinal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Tratamiento = new javax.swing.JTextArea();
        btn_Guardar = new javax.swing.JButton();
        lbl_MuestraVal = new javax.swing.JLabel();
        lbl_ResFinalVal = new javax.swing.JLabel();

        lbl_MuestraId.setText("Muestra :");

        lbl_ResFinal.setText("Resultado Final :");

        txt_Tratamiento.setColumns(20);
        txt_Tratamiento.setRows(5);
        jScrollPane1.setViewportView(txt_Tratamiento);

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        lbl_MuestraVal.setText("jLabel1");

        lbl_ResFinalVal.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_MuestraId)
                        .addGap(60, 60, 60)
                        .addComponent(lbl_MuestraVal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_ResFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_ResFinalVal)))
                .addContainerGap(300, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Guardar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MuestraId)
                    .addComponent(lbl_MuestraVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ResFinal)
                    .addComponent(lbl_ResFinalVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Guardar)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        System.out.println("abc");
    }//GEN-LAST:event_btn_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_MuestraId;
    private javax.swing.JLabel lbl_MuestraVal;
    private javax.swing.JLabel lbl_ResFinal;
    private javax.swing.JLabel lbl_ResFinalVal;
    private javax.swing.JTextArea txt_Tratamiento;
    // End of variables declaration//GEN-END:variables

    private void setCamposMuestra() {
        lbl_MuestraVal.setText(muestra.getIdMuestra());
        String resFinal = muestra.getResultadoFinal();
        
        if (resFinal != null && !resFinal.equalsIgnoreCase("")) {
            setEditarTratamientos(true);
            lbl_ResFinalVal.setText(resFinal);
        } else {
            setEditarTratamientos(false);
            lbl_ResFinalVal.setText("NA");
        }
    }

    private void setEditarTratamientos(boolean value) {
        txt_Tratamiento.setEditable(value);
        btn_Guardar.setEnabled(value);
    }
}