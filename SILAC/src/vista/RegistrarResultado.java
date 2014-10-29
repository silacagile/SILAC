/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.EnsayoDAO;
import dao.PacienteDAO;
import dao.PostgresEnsayoDAO;
import dao.PostgresPacienteDAO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import modelo.Ensayo;
import modelo.Paciente;

/**
 *
 * @author Machis
 */
public class RegistrarResultado extends JFrame implements Printable {

    /**
     * Creates new form RegistrarResultado
     */
    public RegistrarResultado() {
        initComponents();

        disableComponents();

        addButtonFocus();
    }

    private void enableIDPaciente() {
        txtF_idPaciente.setEnabled(true);
        btn_buscarPaciente.setEnabled(true);
    }

    private void disableIDPaciente() {
        txtF_idPaciente.setEnabled(false);
        btn_buscarPaciente.setEnabled(false);
    }

    private void enableIDMuestra() {
        txtF_codMuestra.setEnabled(true);
        btn_buscarMuestra.setEnabled(true);
    }

    private void disableIDMuestra() {
        txtF_codMuestra.setEnabled(false);
        btn_buscarMuestra.setEnabled(false);
    }

    private void enableMuestra() {
        txtF_codMuestra.setEnabled(true);
        btn_buscarMuestra.setEnabled(true);
        btn_cambiarMuestra.setEnabled(true);
        cmb_tipoMuestra.setEnabled(true);
        cmb_solBuffer.setEnabled(true);
        cmb_instrumento.setEnabled(true);
        cmb_tipoTest.setEnabled(true);
        txtF_volumenMuestra.setEnabled(true);
        txtA_observaciones.setEnabled(true);
        btn_guardarMuestra.setEnabled(true);
    }

    private void disableMuestra() {
        txtF_codMuestra.setEnabled(false);
        btn_buscarMuestra.setEnabled(false);
        btn_cambiarMuestra.setEnabled(false);
        cmb_tipoMuestra.setEnabled(false);
        cmb_solBuffer.setEnabled(false);
        cmb_instrumento.setEnabled(false);
        cmb_tipoTest.setEnabled(false);
        txtF_volumenMuestra.setEnabled(false);
        txtA_observaciones.setEnabled(false);
        btn_guardarMuestra.setEnabled(false);
    }

    private void enableEnsayos() {
        rbtn_ensayo1.setEnabled(true);
        rbtn_ensayo2.setEnabled(true);
        rbtn_ensayo3.setEnabled(true);
        rbtn_ensayo4.setEnabled(true);
        rbtn_ensayo5.setEnabled(true);
        txtF_numExtraccion.setEnabled(true);
        txtF_Resultado.setEnabled(true);
        txtF_fechaExtraccion.setEnabled(true);
        txtF_tipoExtraccion.setEnabled(true);
        txtF_fechaGel.setEnabled(true);
        txtF_tipoGel.setEnabled(true);
        txtF_tipoExtraccion.setEnabled(true);
        txtF_resultadoFinal.setEnabled(true);
        btn_guardarEnsayo.setEnabled(true);
    }

    private void cleanEnsayos() {

        txtF_numExtraccion.setText("");
        txtF_Resultado.setText("");
        txtF_fechaExtraccion.setText("");
        txtF_tipoExtraccion.setText("");
        txtF_fechaGel.setText("");
        txtF_tipoGel.setText("");
        txtF_tipoExtraccion.setText("");
        txtF_resultadoFinal.setText("");
    }

    private void cleanMuestras() {
        txtF_codMuestra.setText("");
        txtF_volumenMuestra.setText("");
        txtA_observaciones.setText("");
    }

    private void disableEnsayos() {
        rbtn_ensayo1.setEnabled(false);
        rbtn_ensayo2.setEnabled(false);
        rbtn_ensayo3.setEnabled(false);
        rbtn_ensayo4.setEnabled(false);
        rbtn_ensayo5.setEnabled(false);
        txtF_numExtraccion.setEnabled(false);
        txtF_Resultado.setEnabled(false);
        txtF_fechaExtraccion.setEnabled(false);
        txtF_tipoExtraccion.setEnabled(false);
        txtF_fechaGel.setEnabled(false);
        txtF_tipoGel.setEnabled(false);
        txtF_tipoExtraccion.setEnabled(false);
        txtF_resultadoFinal.setEnabled(false);
        btn_guardarEnsayo.setEnabled(false);
    }

    private void enableComponents() {
        txtF_codMuestra.setEnabled(true);
        cmb_tipoMuestra.setEnabled(true);
        cmb_solBuffer.setEnabled(true);
        cmb_instrumento.setEnabled(true);
        cmb_tipoTest.setEnabled(true);
        txtF_volumenMuestra.setEnabled(true);
        rbtn_ensayo1.setEnabled(true);
        rbtn_ensayo2.setEnabled(true);
        rbtn_ensayo3.setEnabled(true);
        rbtn_ensayo4.setEnabled(true);
        rbtn_ensayo5.setEnabled(true);
        txtF_numExtraccion.setEnabled(true);
        txtF_Resultado.setEnabled(true);
        txtF_fechaExtraccion.setEnabled(true);
        txtF_tipoExtraccion.setEnabled(true);
        txtF_fechaGel.setEnabled(true);
        txtF_tipoGel.setEnabled(true);
        txtF_tipoExtraccion.setEnabled(true);
        txtF_resultadoFinal.setEnabled(true);
        btn_guardarEnsayo.setEnabled(true);
        txtA_observaciones.setEnabled(true);
        btn_guardarMuestra.setEnabled(true);
    }

    /**
     * Desabilita todos los componentes de la interfaz
     */
    public void disableComponents() {
        txtF_codMuestra.setEnabled(false);
        btn_buscarMuestra.setEnabled(false);
        btn_cambiarMuestra.setEnabled(false);
        cmb_tipoMuestra.setEnabled(false);
        cmb_solBuffer.setEnabled(false);
        cmb_instrumento.setEnabled(false);
        cmb_tipoTest.setEnabled(false);
        txtF_volumenMuestra.setEnabled(false);
        rbtn_ensayo1.setEnabled(false);
        rbtn_ensayo2.setEnabled(false);
        rbtn_ensayo3.setEnabled(false);
        rbtn_ensayo4.setEnabled(false);
        rbtn_ensayo5.setEnabled(false);
        txtF_numExtraccion.setEnabled(false);
        txtF_Resultado.setEnabled(false);
        txtF_fechaExtraccion.setEnabled(false);
        txtF_tipoExtraccion.setEnabled(false);
        txtF_fechaGel.setEnabled(false);
        txtF_tipoGel.setEnabled(false);
        txtF_tipoExtraccion.setEnabled(false);
        txtF_resultadoFinal.setEnabled(false);
        btn_guardarEnsayo.setEnabled(false);
        txtA_observaciones.setEnabled(false);
        btn_guardarMuestra.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroupEnsayos = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        label_codMuestra = new javax.swing.JLabel();
        txtF_codMuestra = new javax.swing.JTextField();
        label_solBuffer = new javax.swing.JLabel();
        label_instrumento = new javax.swing.JLabel();
        cmb_instrumento = new javax.swing.JComboBox();
        label_volumen = new javax.swing.JLabel();
        txtF_volumenMuestra = new javax.swing.JTextField();
        label_tipoTest = new javax.swing.JLabel();
        cmb_tipoTest = new javax.swing.JComboBox();
        label_ensayos = new javax.swing.JLabel();
        label_observaciones = new javax.swing.JLabel();
        label_tipoMuestra = new javax.swing.JLabel();
        cmb_tipoMuestra = new javax.swing.JComboBox();
        cmb_solBuffer = new javax.swing.JComboBox();
        rbtn_ensayo1 = new javax.swing.JRadioButton();
        rbtn_ensayo2 = new javax.swing.JRadioButton();
        rbtn_ensayo3 = new javax.swing.JRadioButton();
        rbtn_ensayo4 = new javax.swing.JRadioButton();
        rbtn_ensayo5 = new javax.swing.JRadioButton();
        label_resultadoFinal = new javax.swing.JLabel();
        txtF_resultadoFinal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        label_ensayoInfo = new javax.swing.JLabel();
        label_NumExtraccion = new javax.swing.JLabel();
        label_extraccion = new javax.swing.JLabel();
        label_gel = new javax.swing.JLabel();
        txtF_numExtraccion = new javax.swing.JTextField();
        txtF_fechaExtraccion = new javax.swing.JTextField();
        txtF_fechaGel = new javax.swing.JTextField();
        label_fecha = new javax.swing.JLabel();
        label_tipo = new javax.swing.JLabel();
        txtF_tipoGel = new javax.swing.JTextField();
        txtF_tipoExtraccion = new javax.swing.JTextField();
        btn_guardarEnsayo = new javax.swing.JButton();
        label_Resultado = new javax.swing.JLabel();
        txtF_Resultado = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtA_observaciones = new javax.swing.JTextArea();
        btn_guardarMuestra = new javax.swing.JButton();
        label_idPaciente = new javax.swing.JLabel();
        txtF_idPaciente = new javax.swing.JTextField();
        btn_buscarPaciente = new javax.swing.JButton();
        btn_buscarMuestra = new javax.swing.JButton();
        btn_cambiarPaciente = new javax.swing.JButton();
        btn_cambiarMuestra = new javax.swing.JButton();
        label_pacienteControl = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SILAC");
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        label_codMuestra.setText("Cod. Muestra: ");

        txtF_codMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_codMuestraActionPerformed(evt);
            }
        });

        label_solBuffer.setText("Solución Buffer : ");

        label_instrumento.setText("Instrumento Utilizado :");

        cmb_instrumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cytobrush", "Endocervix brush", "Hisopo común", "Hisopo BBL Culture Swab EZII" }));
        cmb_instrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_instrumentoActionPerformed(evt);
            }
        });

        label_volumen.setText("Volumen Muestra [ ml ] : ");

        label_tipoTest.setText("Tipo Test :");

        cmb_tipoTest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B-Globina", "PGMY", "INNOLiPA", "GP5+/6+", "EIA", "pU", "HPV16", "HPV18" }));

        label_ensayos.setText("Ensayos Preliminares :");

        label_observaciones.setText("Observaciones :");

        label_tipoMuestra.setText("Tipo de Muestra ");

        cmb_tipoMuestra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ginecólogo", "Automuestreo" }));
        cmb_tipoMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipoMuestraActionPerformed(evt);
            }
        });

        cmb_solBuffer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EasyFix", "Acetato" }));

        buttonGroupEnsayos.add(rbtn_ensayo1);
        rbtn_ensayo1.setSelected(true);
        rbtn_ensayo1.setText("Ensayo 1");
        rbtn_ensayo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_ensayo1ActionPerformed(evt);
            }
        });

        buttonGroupEnsayos.add(rbtn_ensayo2);
        rbtn_ensayo2.setText("Ensayo 2");
        rbtn_ensayo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_ensayo2ActionPerformed(evt);
            }
        });

        buttonGroupEnsayos.add(rbtn_ensayo3);
        rbtn_ensayo3.setText("Ensayo 3");
        rbtn_ensayo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_ensayo3ActionPerformed(evt);
            }
        });

        buttonGroupEnsayos.add(rbtn_ensayo4);
        rbtn_ensayo4.setText("Ensayo 4");
        rbtn_ensayo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_ensayo4ActionPerformed(evt);
            }
        });

        buttonGroupEnsayos.add(rbtn_ensayo5);
        rbtn_ensayo5.setText("Ensayo 5");
        rbtn_ensayo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_ensayo5ActionPerformed(evt);
            }
        });

        label_resultadoFinal.setText("RESULTADO FINAL :");

        txtF_resultadoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_resultadoFinalActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Información Ensayo")));

        label_ensayoInfo.setText("Ensayo 1 :");

        label_NumExtraccion.setText("Número de Extracción");

        label_extraccion.setText("Extracción :");

        label_gel.setText("Gel :");

        txtF_fechaExtraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_fechaExtraccionActionPerformed(evt);
            }
        });

        label_fecha.setText("Fecha");

        label_tipo.setText("Tipo");

        btn_guardarEnsayo.setText("Guardar Ensayo");
        btn_guardarEnsayo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarEnsayoActionPerformed(evt);
            }
        });

        label_Resultado.setText("Resultado :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_guardarEnsayo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_gel)
                                    .addComponent(label_extraccion))
                                .addGap(38, 38, 38))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_ensayoInfo)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(label_Resultado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtF_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label_NumExtraccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(txtF_numExtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtF_fechaGel, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(txtF_fechaExtraccion))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtF_tipoGel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtF_tipoExtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(label_fecha)
                                .addGap(73, 73, 73)
                                .addComponent(label_tipo)
                                .addGap(88, 88, 88))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_ensayoInfo)
                            .addComponent(label_NumExtraccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_fecha)
                            .addComponent(label_tipo)
                            .addComponent(label_Resultado)
                            .addComponent(txtF_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtF_fechaExtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtF_tipoExtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_extraccion))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtF_fechaGel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtF_tipoGel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_gel)))
                    .addComponent(txtF_numExtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btn_guardarEnsayo))
        );

        txtA_observaciones.setColumns(20);
        txtA_observaciones.setLineWrap(true);
        txtA_observaciones.setRows(5);
        jScrollPane4.setViewportView(txtA_observaciones);

        btn_guardarMuestra.setText("Guardar Muestra");
        btn_guardarMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarMuestraActionPerformed(evt);
            }
        });

        label_idPaciente.setText("ID Paciente : ");

        txtF_idPaciente.setName("idTF"); // NOI18N
        txtF_idPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_idPacienteActionPerformed(evt);
            }
        });
        txtF_idPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                getDatos(evt);
            }
        });

        btn_buscarPaciente.setText("Buscar");
        btn_buscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarPacienteActionPerformed(evt);
            }
        });

        btn_buscarMuestra.setText("Buscar");
        btn_buscarMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarMuestraActionPerformed(evt);
            }
        });

        btn_cambiarPaciente.setText("Cambiar Paciente");
        btn_cambiarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarPacienteActionPerformed(evt);
            }
        });

        btn_cambiarMuestra.setText("Cambiar Muestra");
        btn_cambiarMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarMuestraActionPerformed(evt);
            }
        });

        label_pacienteControl.setText("Introduzca ID Paciente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_resultadoFinal)
                                            .addComponent(rbtn_ensayo1)
                                            .addComponent(rbtn_ensayo2)
                                            .addComponent(rbtn_ensayo3)
                                            .addComponent(rbtn_ensayo4)
                                            .addComponent(rbtn_ensayo5)))
                                    .addComponent(txtF_resultadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_ensayos, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_observaciones, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_guardarMuestra)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(label_volumen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtF_volumenMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_codMuestra)
                            .addComponent(label_solBuffer)
                            .addComponent(label_tipoTest)
                            .addComponent(label_idPaciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_tipoTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_solBuffer, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtF_codMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscarMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtF_idPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_tipoMuestra)
                                    .addComponent(label_instrumento))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(cmb_tipoMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(cmb_instrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btn_cambiarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_pacienteControl))
                                    .addComponent(btn_cambiarMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_idPaciente)
                    .addComponent(txtF_idPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarPaciente)
                    .addComponent(btn_cambiarPaciente)
                    .addComponent(label_pacienteControl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_codMuestra)
                    .addComponent(txtF_codMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarMuestra)
                    .addComponent(btn_cambiarMuestra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_solBuffer)
                        .addComponent(cmb_solBuffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_tipoMuestra)
                        .addComponent(cmb_tipoMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_tipoTest)
                    .addComponent(cmb_tipoTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_instrumento)
                        .addComponent(cmb_instrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_volumen)
                    .addComponent(txtF_volumenMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_observaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_guardarMuestra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_ensayos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbtn_ensayo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtn_ensayo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtn_ensayo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtn_ensayo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtn_ensayo5)
                        .addGap(7, 7, 7)
                        .addComponent(label_resultadoFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtF_resultadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtF_codMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_codMuestraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_codMuestraActionPerformed


    private void getDatos(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getDatos
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_getDatos

    private void cmb_instrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_instrumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_instrumentoActionPerformed

    private void rbtn_ensayo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ensayo1ActionPerformed
        PostgresEnsayoDAO bd_ensayo = new PostgresEnsayoDAO();
        String id_ensayo = getId_Ensayo();
        Ensayo ensayo = bd_ensayo.findEnsayo(txtF_idPaciente.getText(), txtF_codMuestra.getText(), id_ensayo);

        if (ensayo != null) {

        }
    }//GEN-LAST:event_rbtn_ensayo1ActionPerformed

    private void rbtn_ensayo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ensayo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_ensayo2ActionPerformed

    private void txtF_resultadoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_resultadoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_resultadoFinalActionPerformed

    private void txtF_fechaExtraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_fechaExtraccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_fechaExtraccionActionPerformed

    private void btn_guardarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarMuestraActionPerformed
        enableEnsayos();
    }//GEN-LAST:event_btn_guardarMuestraActionPerformed


    private void txtF_idPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_idPacienteActionPerformed
    }//GEN-LAST:event_txtF_idPacienteActionPerformed

    private void btn_buscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPacienteActionPerformed
        PacienteDAO pacienteDAO = new PostgresPacienteDAO();
        Paciente paciente = pacienteDAO.findPaciente(txtF_idPaciente.getText());
        if (paciente == null) {
            label_pacienteControl.setText("No existe el paciente con el ID : " + txtF_idPaciente.getText());
            label_pacienteControl.setForeground(Color.red);
            disableComponents();
        } else {
            label_pacienteControl.setText("Paciente ID : " + txtF_idPaciente.getText());
            label_pacienteControl.setForeground(Color.blue);
            enableIDMuestra();
            disableIDPaciente();
        }
    }//GEN-LAST:event_btn_buscarPacienteActionPerformed

    private void cmb_tipoMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoMuestraActionPerformed

    }//GEN-LAST:event_cmb_tipoMuestraActionPerformed

    private void btn_guardarEnsayoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarEnsayoActionPerformed
        EnsayoDAO bd_ensayo = new PostgresEnsayoDAO();
        String id_ensayo = getId_Ensayo();
        Ensayo ensayo = getEnsayo();
        ensayo.setIdEnsayo(id_ensayo);
        if (bd_ensayo.findEnsayo(txtF_idPaciente.getText(),
                txtF_codMuestra.getText(), id_ensayo) != null) {
            bd_ensayo.updateEnsayo(ensayo);
        } else {
            bd_ensayo.insertEnsayo(ensayo);
        }
    }//GEN-LAST:event_btn_guardarEnsayoActionPerformed

    private void rbtn_ensayo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ensayo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_ensayo3ActionPerformed

    private void rbtn_ensayo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ensayo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_ensayo4ActionPerformed

    private void rbtn_ensayo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ensayo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_ensayo5ActionPerformed

    private void btn_cambiarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarPacienteActionPerformed
        disableComponents();
        enableIDPaciente();
    }//GEN-LAST:event_btn_cambiarPacienteActionPerformed

    private void btn_cambiarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarMuestraActionPerformed
        cleanEnsayos();
        cleanMuestras();
        disableEnsayos();
        disableMuestra();
        enableIDMuestra();
    }//GEN-LAST:event_btn_cambiarMuestraActionPerformed

    private void btn_buscarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarMuestraActionPerformed
        disableIDMuestra();
        enableMuestra();

    }//GEN-LAST:event_btn_buscarMuestraActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarResultado().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarMuestra;
    private javax.swing.JButton btn_buscarPaciente;
    private javax.swing.JButton btn_cambiarMuestra;
    private javax.swing.JButton btn_cambiarPaciente;
    private javax.swing.JButton btn_guardarEnsayo;
    private javax.swing.JButton btn_guardarMuestra;
    private javax.swing.ButtonGroup buttonGroupEnsayos;
    private javax.swing.JComboBox cmb_instrumento;
    private javax.swing.JComboBox cmb_solBuffer;
    private javax.swing.JComboBox cmb_tipoMuestra;
    private javax.swing.JComboBox cmb_tipoTest;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel label_NumExtraccion;
    private javax.swing.JLabel label_Resultado;
    private javax.swing.JLabel label_codMuestra;
    private javax.swing.JLabel label_ensayoInfo;
    private javax.swing.JLabel label_ensayos;
    private javax.swing.JLabel label_extraccion;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_gel;
    private javax.swing.JLabel label_idPaciente;
    private javax.swing.JLabel label_instrumento;
    private javax.swing.JLabel label_observaciones;
    private javax.swing.JLabel label_pacienteControl;
    private javax.swing.JLabel label_resultadoFinal;
    private javax.swing.JLabel label_solBuffer;
    private javax.swing.JLabel label_tipo;
    private javax.swing.JLabel label_tipoMuestra;
    private javax.swing.JLabel label_tipoTest;
    private javax.swing.JLabel label_volumen;
    private javax.swing.JRadioButton rbtn_ensayo1;
    private javax.swing.JRadioButton rbtn_ensayo2;
    private javax.swing.JRadioButton rbtn_ensayo3;
    private javax.swing.JRadioButton rbtn_ensayo4;
    private javax.swing.JRadioButton rbtn_ensayo5;
    private javax.swing.JTextArea txtA_observaciones;
    private javax.swing.JTextField txtF_Resultado;
    private javax.swing.JTextField txtF_codMuestra;
    private javax.swing.JTextField txtF_fechaExtraccion;
    private javax.swing.JTextField txtF_fechaGel;
    private javax.swing.JTextField txtF_idPaciente;
    private javax.swing.JTextField txtF_numExtraccion;
    private javax.swing.JTextField txtF_resultadoFinal;
    private javax.swing.JTextField txtF_tipoExtraccion;
    private javax.swing.JTextField txtF_tipoGel;
    private javax.swing.JTextField txtF_volumenMuestra;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @param graphics
     * @param pageFormat
     * @param pageIndex
     * @return
     * @throws PrinterException
     */
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex == 0) {
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            this.printAll(graphics);
            return PAGE_EXISTS;
        } else {
            return NO_SUCH_PAGE;
        }
    }

    /**
     * Devuelve el id del ensayo que esta seleccionado en el radiobutton
     *
     * @return
     */
    private String getId_Ensayo() {
        String res = "1";
        if (rbtn_ensayo2.isSelected()) {
            res = "2";
        }
        if (rbtn_ensayo3.isSelected()) {
            res = "3";
        }
        if (rbtn_ensayo4.isSelected()) {
            res = "4";
        }
        if (rbtn_ensayo5.isSelected()) {
            res = "5";
        }
        return res;
    }

    private Ensayo getEnsayo() {
        Ensayo res = new Ensayo();
        res.setIdMuestra(txtF_codMuestra.getText());
        res.setIdPaciente(txtF_idPaciente.getText());
        res.setFechaExtraccion(txtF_fechaExtraccion.getText());
        res.setFechaGel(txtF_fechaGel.getText());
        res.setNumeroExtraccion(Integer.parseInt(txtF_numExtraccion.getText()));
        res.setTipoExtraccion(txtF_tipoExtraccion.getText());
        res.setTipoGel(txtF_tipoGel.getText());
        res.setResultado(txtF_resultadoFinal.getText());
        return res;
    }

    private void addButtonFocus() {
        btn_buscarPaciente.registerKeyboardAction(btn_buscarPaciente.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);

        btn_buscarPaciente.registerKeyboardAction(btn_buscarPaciente.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);

        btn_guardarEnsayo.registerKeyboardAction(btn_guardarEnsayo.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);

        btn_guardarEnsayo.registerKeyboardAction(btn_guardarEnsayo.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);

        btn_guardarMuestra.registerKeyboardAction(btn_guardarMuestra.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);

        btn_guardarMuestra.registerKeyboardAction(btn_guardarMuestra.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);
        
        btn_cambiarPaciente.registerKeyboardAction(btn_cambiarPaciente.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);

        btn_cambiarPaciente.registerKeyboardAction(btn_cambiarPaciente.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);
        
        btn_buscarMuestra.registerKeyboardAction(btn_buscarMuestra.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);

        btn_buscarMuestra.registerKeyboardAction(btn_buscarMuestra.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);
        
        btn_cambiarMuestra.registerKeyboardAction( btn_cambiarMuestra.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);

         btn_cambiarMuestra.registerKeyboardAction( btn_cambiarMuestra.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);

    }
}
