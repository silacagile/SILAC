/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Utilitarios.Utils;
import controlador.EnsayoCtrl;
import controlador.MuestraCtrl;
import controlador.PacienteCtrl;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import modelo.Ensayo;
import modelo.Muestra;
import modelo.Paciente;

/**
 *
 * @author Machis
 */
public class RegistrarResultado extends JFrame implements Printable {

    private final MuestraCtrl muestraCtrl;
    private final PacienteCtrl pacienteCtrl;
    private final EnsayoCtrl ensayoCtrl;
     private List<Paciente> listaPacientes;
    private DefaultComboBoxModel pacientes;

    /**
     * Creates new form RegistrarResultado
     */
    public RegistrarResultado() {
        initComponents();
        muestraCtrl = new MuestraCtrl();
        pacienteCtrl = new PacienteCtrl();
        ensayoCtrl = new EnsayoCtrl();
        setLocationRelativeTo(null);
        disableComponents();
        date_gel.setFormat(2);
        addButtonFocus();
        setComboBoxPacientes();
    }

    private void enableIDPaciente() {
        //txtF_idPaciente.setEnabled(true);
        cmb_Pacientes.setEnabled(true);
        btn_buscarPaciente.setEnabled(true);
    }

    private void enableCambiarPaciente() {
        btn_cambiarPaciente.setEnabled(true);
    }

    private void disableIDPaciente() {
        //txtF_idPaciente.setEnabled(false);
        cmb_Pacientes.setEnabled(false);
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

    private void resetCombos() {
        cmb_instrumento.setSelectedIndex(0);
        cmb_solBuffer.setSelectedIndex(0);
        cmb_tipoMuestra.setSelectedIndex(0);
        cmb_tipoTest.setSelectedIndex(0);
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
        txtF_resultadoFinal.setEnabled(true);
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
        txtF_resultadoFinal.setEnabled(false);
        btn_guardarMuestra.setEnabled(false);
    }

    private void enableEnsayos() {
        rbtn_ensayo1.setEnabled(true);
        rbtn_ensayo2.setEnabled(true);
        rbtn_ensayo3.setEnabled(true);
        rbtn_ensayo4.setEnabled(true);
        rbtn_ensayo5.setEnabled(true);
        ftxt_numExtraccion.setEnabled(true);
        txtF_Resultado.setEnabled(true);
        date_extraccion.setEnabled(true);
        txtF_tipoExtraccion.setEnabled(true);
        date_gel.setEnabled(true);
        txtF_tipoGel.setEnabled(true);
        txtF_tipoExtraccion.setEnabled(true);
        txtF_resultadoFinal.setEnabled(true);
        btn_guardarEnsayo.setEnabled(true);
    }

    private void cleanEnsayos() {
        ftxt_numExtraccion.setText("");
        txtF_Resultado.setText("");
        txtF_tipoExtraccion.setText("");
        date_extraccion.setSelectedDate(new GregorianCalendar());
        date_gel.setSelectedDate(new GregorianCalendar());
        txtF_tipoGel.setText("");
    }

    private void cleanMuestras() {
        txtF_codMuestra.setText("");
        txtF_volumenMuestra.setText("");
        txtA_observaciones.setText("");
        txtF_resultadoFinal.setText("");
    }

    private void disableEnsayos() {
        rbtn_ensayo1.setEnabled(false);
        rbtn_ensayo2.setEnabled(false);
        rbtn_ensayo3.setEnabled(false);
        rbtn_ensayo4.setEnabled(false);
        rbtn_ensayo5.setEnabled(false);
        ftxt_numExtraccion.setEnabled(false);
        txtF_Resultado.setEnabled(false);
        date_extraccion.setEnabled(false);
        txtF_tipoExtraccion.setEnabled(false);
        date_gel.setEnabled(false);
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
        ftxt_numExtraccion.setEnabled(true);
        txtF_Resultado.setEnabled(true);
        date_extraccion.setEnabled(true);
        txtF_tipoExtraccion.setEnabled(true);
        date_gel.setEnabled(true);
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
        txtF_idPaciente.setVisible(false);
        btn_cambiarPaciente.setEnabled(false);
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
        ftxt_numExtraccion.setEnabled(false);
        txtF_Resultado.setEnabled(false);
        date_extraccion.setEnabled(false);
        txtF_tipoExtraccion.setEnabled(false);
        date_gel.setEnabled(false);
        txtF_tipoGel.setEnabled(false);
        txtF_tipoExtraccion.setEnabled(false);
        txtF_resultadoFinal.setEnabled(false);
        btn_guardarEnsayo.setEnabled(false);
        txtA_observaciones.setEnabled(false);
        btn_guardarMuestra.setEnabled(false);
    }
    
    private void setComboBoxPacientes() {

        pacientes = new DefaultComboBoxModel();
        listaPacientes = pacienteCtrl.getAllPacientes();
        System.out.println(listaPacientes.size());
        for (int i = 0; i < listaPacientes.size(); i++) {
            pacientes.addElement(listaPacientes.get(i).getIdPaciente());
        }

        cmb_Pacientes.setModel(pacientes);
        cmb_Pacientes.setMaximumRowCount(4);
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
        label_fecha = new javax.swing.JLabel();
        label_tipo = new javax.swing.JLabel();
        txtF_tipoGel = new javax.swing.JTextField();
        txtF_tipoExtraccion = new javax.swing.JTextField();
        btn_guardarEnsayo = new javax.swing.JButton();
        label_Resultado = new javax.swing.JLabel();
        txtF_Resultado = new javax.swing.JTextField();
        ftxt_numExtraccion = new javax.swing.JFormattedTextField();
        date_extraccion = new datechooser.beans.DateChooserCombo();
        date_gel = new datechooser.beans.DateChooserCombo();
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
        label_mensajeMuestra = new javax.swing.JLabel();
        cmb_Pacientes = new javax.swing.JComboBox();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        txtF_volumenMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_volumenMuestraActionPerformed(evt);
            }
        });
        txtF_volumenMuestra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtF_volumenMuestraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtF_volumenMuestraKeyTyped(evt);
            }
        });

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

        label_NumExtraccion.setText("Número de Extracción:");

        label_extraccion.setText("Extracción :");

        label_gel.setText("Gel :");

        label_fecha.setText("Fecha");

        label_tipo.setText("Tipo");

        txtF_tipoGel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtF_tipoGelKeyPressed(evt);
            }
        });

        txtF_tipoExtraccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtF_tipoExtraccionKeyPressed(evt);
            }
        });

        btn_guardarEnsayo.setText("Guardar Ensayo");
        btn_guardarEnsayo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarEnsayoActionPerformed(evt);
            }
        });

        label_Resultado.setText("Resultado :");

        txtF_Resultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtF_ResultadoKeyPressed(evt);
            }
        });

        ftxt_numExtraccion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftxt_numExtraccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ftxt_numExtraccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftxt_numExtraccionKeyTyped(evt);
            }
        });

        date_extraccion.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    date_extraccion.setFormat(2);

    date_gel.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));

javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
jPanel2.setLayout(jPanel2Layout);
jPanel2Layout.setHorizontalGroup(
    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ensayoInfo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_Resultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtF_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_NumExtraccion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_fecha)
                        .addGap(148, 148, 148)
                        .addComponent(label_tipo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftxt_numExtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_guardarEnsayo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_extraccion)
                    .addComponent(label_gel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_extraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_gel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtF_tipoExtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_tipoGel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btn_guardarEnsayo))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_ensayoInfo)
                            .addComponent(label_NumExtraccion)
                            .addComponent(ftxt_numExtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Resultado)
                            .addComponent(txtF_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label_tipo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addComponent(label_fecha, javax.swing.GroupLayout.Alignment.TRAILING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(label_extraccion)
                .addComponent(txtF_tipoExtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(date_extraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_gel)
                        .addComponent(txtF_tipoGel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(date_gel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(14, Short.MAX_VALUE))
    );

    label_NumExtraccion.getAccessibleContext().setAccessibleName("Número de Extracción");

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

    label_mensajeMuestra.setText("Introduzca Codigo Muesrta");

    cmb_Pacientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtn_ensayo1)
                                .addComponent(rbtn_ensayo2)
                                .addComponent(rbtn_ensayo3)
                                .addComponent(rbtn_ensayo4)
                                .addComponent(rbtn_ensayo5))
                            .addGap(18, 18, 18)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label_ensayos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(label_volumen)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtF_volumenMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(label_resultadoFinal)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap(20, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_codMuestra)
                        .addComponent(label_solBuffer)
                        .addComponent(label_tipoTest)
                        .addComponent(label_idPaciente))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmb_tipoTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_solBuffer, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtF_codMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_buscarMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_cambiarMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label_mensajeMuestra)
                                    .addContainerGap(171, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_tipoMuestra)
                                        .addComponent(label_instrumento))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(59, 59, 59)
                                            .addComponent(cmb_instrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtF_resultadoFinal)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(59, 59, 59)
                                                    .addComponent(cmb_tipoMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(43, 43, 43)
                                                    .addComponent(txtF_idPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE)))
                                            .addContainerGap())))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(cmb_Pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_buscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(btn_cambiarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label_pacienteControl)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_guardarMuestra)
                        .addComponent(label_observaciones))
                    .addGap(0, 0, Short.MAX_VALUE))))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(label_idPaciente)
                .addComponent(btn_buscarPaciente)
                .addComponent(btn_cambiarPaciente)
                .addComponent(label_pacienteControl)
                .addComponent(cmb_Pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(label_codMuestra)
                .addComponent(txtF_codMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_buscarMuestra)
                .addComponent(btn_cambiarMuestra)
                .addComponent(label_mensajeMuestra))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_solBuffer)
                    .addComponent(cmb_solBuffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tipoMuestra)
                    .addComponent(cmb_tipoMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_idPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(label_tipoTest)
                .addComponent(cmb_tipoTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_instrumento)
                    .addComponent(cmb_instrumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_volumen)
                    .addComponent(txtF_volumenMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_resultadoFinal))
                .addComponent(txtF_resultadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGap(47, 47, 47))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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


    private void cmb_instrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_instrumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_instrumentoActionPerformed

    private void rbtn_ensayo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ensayo1ActionPerformed
        updateVistaEnsayo();
    }//GEN-LAST:event_rbtn_ensayo1ActionPerformed

    private void rbtn_ensayo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ensayo2ActionPerformed
        updateVistaEnsayo();
    }//GEN-LAST:event_rbtn_ensayo2ActionPerformed

    private void txtF_resultadoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_resultadoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_resultadoFinalActionPerformed

    private void btn_guardarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarMuestraActionPerformed
        if (validarCamposMuestra()) {
            Muestra muestra = new Muestra();

            muestra.setIdPaciente(cmb_Pacientes.getSelectedItem().toString());
            muestra.setIdMuestra(txtF_codMuestra.getText());
            muestra.setTipoMuestra(cmb_tipoMuestra.getSelectedItem().toString());
            muestra.setTipoTest(cmb_tipoTest.getSelectedItem().toString());
            muestra.setSolucionBuffer(cmb_solBuffer.getSelectedItem().toString());
            muestra.setInstrumento(cmb_instrumento.getSelectedItem().toString());
            muestra.setVolMuestra(Double.parseDouble(txtF_volumenMuestra.getText()));
            muestra.setResultadoFinal(txtF_resultadoFinal.getText());
            muestra.setObservaciones(txtA_observaciones.getText());

            if ((muestraCtrl.buscarMuestra(muestra.getIdPaciente(), muestra.getIdMuestra())) == null) {
                System.out.println("Antes de entrar al insert Nueva Muestra");
                muestraCtrl.insertarMuestra(muestra);
            } else {
                System.out.println("Antes de entrar al insert Existe Muestra");
                muestraCtrl.updateMuestra(muestra);
            }

            JOptionPane.showMessageDialog(this,
                    "Se ha guardado la muestra : " + muestra.getIdMuestra() + " correctamente!");

            enableEnsayos();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un valor válido\n!"
                    + "en el campo de volumen de la muestra!",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_guardarMuestraActionPerformed

    private boolean validarCamposMuestra() {
        return Utils.esDouble(txtF_volumenMuestra.getText());
    }


    private void btn_buscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPacienteActionPerformed

        Paciente paciente = pacienteCtrl.buscarPaciente(cmb_Pacientes.getSelectedItem().toString());
        if (paciente == null) {
            label_pacienteControl.setText("No existe el paciente con el ID : " + txtF_idPaciente.getText());
            label_pacienteControl.setForeground(Color.red);
            disableComponents();
        } else {
            label_pacienteControl.setText("Paciente ID : " + cmb_Pacientes.getSelectedItem().toString());
            label_pacienteControl.setForeground(Color.blue);
            enableCambiarPaciente();
            enableIDMuestra();
            disableIDPaciente();
        }
    }//GEN-LAST:event_btn_buscarPacienteActionPerformed

    private void cmb_tipoMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoMuestraActionPerformed

    }//GEN-LAST:event_cmb_tipoMuestraActionPerformed
datechooser.beans.DateChooserCombo today = new datechooser.beans.DateChooserCombo();
    private boolean validarFechaExtrac()
    {
        boolean res = false;
        int todayYear = Integer.valueOf(today.getText().substring(6)) + 2000;
        int todayMonth = Integer.valueOf(today.getText().substring(3, 5));
        int todayDay = Integer.valueOf(today.getText().substring(0, 2));
        
        int selectYear = Integer.valueOf(date_extraccion.getText().substring(6));
        int selectMonth = Integer.valueOf(date_extraccion.getText().substring(3, 5));
        int selectDay = Integer.valueOf(date_extraccion.getText().substring(0, 2));
        System.out.println("selected " + selectDay  + " " + selectMonth + " " + selectYear);
        System.out.println("Today " + todayDay + " " + todayMonth + " " + todayYear);
        
        if(selectYear <= todayYear)
        {
            if(selectYear == todayYear)
            {
                if(selectMonth <= todayMonth)
                {
                    if(selectMonth == todayMonth)
                    {
                        if(selectDay <= todayDay)
                        {
                            res = true;
                        }
                    }
                    else{
                        res = true;
                    }
                }
            }
            else{
                res = true;
            }
        }
        return res;
    }
    
    private boolean validarFechaGel()
    {
        boolean res = false;
        int todayYear = Integer.valueOf(today.getText().substring(6)) + 2000;
        int todayMonth = Integer.valueOf(today.getText().substring(3, 5));
        int todayDay = Integer.valueOf(today.getText().substring(0, 2));
        
        int selectYear = Integer.valueOf(date_gel.getText().substring(6));
        int selectMonth = Integer.valueOf(date_gel.getText().substring(3, 5));
        int selectDay = Integer.valueOf(date_gel.getText().substring(0, 2));
        System.out.println("selected " + selectDay  + " " + selectMonth + " " + selectYear);
        System.out.println("Today " + todayDay + " " + todayMonth + " " + todayYear);
        
        if(selectYear <= todayYear)
        {
            if(selectYear == todayYear)
            {
                if(selectMonth <= todayMonth)
                {
                    if(selectMonth == todayMonth)
                    {
                        if(selectDay <= todayDay)
                        {
                            res = true;
                        }
                    }
                    else{
                        res = true;
                    }
                }
            }
            else{
                res = true;
            }
        }
        return res;
    }
    private void btn_guardarEnsayoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarEnsayoActionPerformed

        String id_ensayo = getId_Ensayo();
        if (!camposEmpty()) {
            if(validarFechaExtrac() && validarFechaGel()){
                Ensayo ensayo = getEnsayo();
                ensayo.setIdEnsayo(id_ensayo);
                limit_ftxt = 0;
                if (ensayoCtrl.buscarEnsayo(cmb_Pacientes.getSelectedItem().toString(),
                        txtF_codMuestra.getText(), id_ensayo) != null) {
                    ensayoCtrl.updateEnsayo(ensayo);
                    JOptionPane.showMessageDialog(this, "Se ha actualizado el Ensayo : " + id_ensayo + "\ncorrectatmente");
                } else {
                    ensayoCtrl.insertarEnsayo(ensayo);
                    JOptionPane.showMessageDialog(this, "Se ha guardado el Ensayo : " + id_ensayo + " \ncorrectamente");
                }
            }else
                JOptionPane.showMessageDialog(this, "Por Favor, Ingrese una Fecha Valida", "Error de Formulario", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Por Favor ingrese todos los campos", "Error de Formulario", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_guardarEnsayoActionPerformed

    private void rbtn_ensayo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ensayo3ActionPerformed
        updateVistaEnsayo();
    }//GEN-LAST:event_rbtn_ensayo3ActionPerformed

    private void rbtn_ensayo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ensayo4ActionPerformed
        updateVistaEnsayo();
    }//GEN-LAST:event_rbtn_ensayo4ActionPerformed

    private void rbtn_ensayo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ensayo5ActionPerformed
        updateVistaEnsayo();
    }//GEN-LAST:event_rbtn_ensayo5ActionPerformed

    private void btn_cambiarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarPacienteActionPerformed
        int opcion = JOptionPane.showConfirmDialog(new Frame(),
                "¿Seguro que desea cambiar de Paciente?\n"
                + "Todos los cambios no guardados se perderán",
                "PRECAUCIÓN",
                JOptionPane.WARNING_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            disableComponents();
            cleanEnsayos();
            cleanMuestras();
            enableIDPaciente();
        }

    }//GEN-LAST:event_btn_cambiarPacienteActionPerformed

    private void btn_cambiarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarMuestraActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro que desea cambiar de muestra?\n"
                + "Todos los cambios no guardados se perderán", "PRECAUCIÓN",
                JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            cleanEnsayos();
            cleanMuestras();
            disableEnsayos();
            disableMuestra();
            enableIDMuestra();
            resetCombos();
            rbtn_ensayo1.setSelected(true);
        }
    }//GEN-LAST:event_btn_cambiarMuestraActionPerformed


    private void btn_buscarMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarMuestraActionPerformed

        if (txtF_codMuestra.getText().equals("")) {
            label_mensajeMuestra.setText("Ingrese un código válido!");
            label_mensajeMuestra.setForeground(Color.red);
        } else {
            Muestra muestra = muestraCtrl.buscarMuestra(
                    cmb_Pacientes.getSelectedItem().toString(), txtF_codMuestra.getText());
            if (muestra == null) {
                int opcion = JOptionPane.showConfirmDialog(this,
                        "El código de muestra no existe\n"
                        + "¿Desea crear una nueva muestra?", "ATENCIÓN!",
                        JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.OK_OPTION) {
                    enableMuestra();
                    disableIDMuestra();
                    label_mensajeMuestra.setText("Muestra Codigo: "
                            + txtF_codMuestra.getText());
                    label_mensajeMuestra.setForeground(Color.blue);
                    rbtn_ensayo1.setSelected(true);
                    updateVistaEnsayo();
                } else {
                    txtF_codMuestra.requestFocus();
                    txtF_codMuestra.selectAll();
                    label_mensajeMuestra.setText("Introduzca Código Muestra");
                    label_mensajeMuestra.setForeground(Color.black);
                }
            } else {
                enableEnsayos();
                cmb_solBuffer.setSelectedItem(muestra.getSolucionBuffer());
                cmb_tipoMuestra.setSelectedItem(muestra.getTipoMuestra());
                cmb_tipoTest.setSelectedItem(muestra.getTipoTest());
                cmb_instrumento.setSelectedItem(muestra.getInstrumento());
                txtF_volumenMuestra.setText(Double.toString(muestra.getVolMuestra()));
                txtF_resultadoFinal.setText(muestra.getResultadoFinal());
                txtA_observaciones.setText(muestra.getObservaciones());

                enableMuestra();
                disableIDMuestra();
                label_mensajeMuestra.setText("Muestra Codigo: "
                        + txtF_codMuestra.getText());
                label_mensajeMuestra.setForeground(Color.blue);
                rbtn_ensayo1.setSelected(true);
                updateVistaEnsayo();

            }

        }
    }//GEN-LAST:event_btn_buscarMuestraActionPerformed
    int limit_ftxt = 0; //controla que el input sea max de 5 digitos
    private void ftxt_numExtraccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxt_numExtraccionKeyTyped
        limit_ftxt = ftxt_numExtraccion.getText().length();
        if (!Character.isDigit(evt.getKeyChar()) || !(limit_ftxt < 5)) {
            evt.consume();
            return;
        }
        limit_ftxt++;
    }//GEN-LAST:event_ftxt_numExtraccionKeyTyped

    private void ftxt_numExtraccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxt_numExtraccionKeyPressed
        if (evt.getKeyCode() == 8 && limit_ftxt != 0) //el cod 8 es delete
        {
            limit_ftxt -= 1;
        }
        ftxt_numExtraccion.setBackground(Color.white);
    }//GEN-LAST:event_ftxt_numExtraccionKeyPressed

    private void txtF_ResultadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtF_ResultadoKeyPressed
        txtF_Resultado.setBackground(Color.white);
    }//GEN-LAST:event_txtF_ResultadoKeyPressed

    private void txtF_tipoExtraccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtF_tipoExtraccionKeyPressed
        txtF_tipoExtraccion.setBackground(Color.white);
    }//GEN-LAST:event_txtF_tipoExtraccionKeyPressed

    private void txtF_tipoGelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtF_tipoGelKeyPressed
        txtF_tipoGel.setBackground(Color.white);
    }//GEN-LAST:event_txtF_tipoGelKeyPressed

    private void txtF_volumenMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_volumenMuestraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_volumenMuestraActionPerformed

    private void getDatos(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_getDatos
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_getDatos

    private void txtF_idPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_idPacienteActionPerformed

    }//GEN-LAST:event_txtF_idPacienteActionPerformed
int lim = 0;
    private void txtF_volumenMuestraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtF_volumenMuestraKeyPressed
         if (evt.getKeyCode() == 8 && lim != 0) //el cod 8 es delete
        {
            lim -= 1;
        }
    }//GEN-LAST:event_txtF_volumenMuestraKeyPressed

    private void txtF_volumenMuestraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtF_volumenMuestraKeyTyped
        lim = txtF_volumenMuestra.getText().length();
        if (!Character.isDigit(evt.getKeyChar()) || !(lim < 3)) {
            evt.consume();
            return;
        }
        lim++;
    }//GEN-LAST:event_txtF_volumenMuestraKeyTyped

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
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JComboBox cmb_Pacientes;
    private javax.swing.JComboBox cmb_instrumento;
    private javax.swing.JComboBox cmb_solBuffer;
    private javax.swing.JComboBox cmb_tipoMuestra;
    private javax.swing.JComboBox cmb_tipoTest;
    private datechooser.beans.DateChooserCombo date_extraccion;
    private datechooser.beans.DateChooserCombo date_gel;
    private javax.swing.JFormattedTextField ftxt_numExtraccion;
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
    private javax.swing.JLabel label_mensajeMuestra;
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
    private javax.swing.JTextField txtF_idPaciente;
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
        res.setIdPaciente(cmb_Pacientes.getSelectedItem().toString());
        res.setFechaExtraccion(date_extraccion.getText().replace('-', '/'));
        res.setFechaGel(date_gel.getText().replace('-', '/'));
        res.setNumeroExtraccion(Integer.parseInt(ftxt_numExtraccion.getText()));
        res.setTipoExtraccion(txtF_tipoExtraccion.getText());
        res.setTipoGel(txtF_tipoGel.getText());
        res.setResultado(txtF_Resultado.getText());
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

        btn_cambiarMuestra.registerKeyboardAction(btn_cambiarMuestra.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);

        btn_cambiarMuestra.registerKeyboardAction(btn_cambiarMuestra.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);

    }

    private void updateVistaEnsayo() {

        setBackgroundCampos();
        String id_ensayo = getId_Ensayo();
        Ensayo ensayo = ensayoCtrl.buscarEnsayo(cmb_Pacientes.getSelectedItem().toString(),
                txtF_codMuestra.getText(), id_ensayo);
        label_ensayoInfo.setText("Ensayo " + id_ensayo + ":");
        if (ensayo != null) {
            ftxt_numExtraccion.setText(String.valueOf(ensayo.getNumeroExtraccion()));
            txtF_Resultado.setText(ensayo.getResultado());
            txtF_tipoGel.setText(ensayo.getTipoGel());
            txtF_tipoExtraccion.setText(ensayo.getTipoExtraccion());
            date_extraccion.setSelectedDate(Utils.
                    formatoFecha(ensayo.getFechaExtraccion()));
            date_gel.setSelectedDate(Utils.formatoFecha(ensayo.getFechaGel()));
        } else {
            cleanEnsayos();
        }
    }

    private boolean camposEmpty() {
        boolean res = false;
        if (ftxt_numExtraccion.getText().trim().isEmpty()) {
            res = true;
            ftxt_numExtraccion.setBackground(Color.red);
        }
        if (txtF_Resultado.getText().trim().isEmpty()) {
            res = true;
            txtF_Resultado.setBackground(Color.red);
        }
        if (txtF_tipoExtraccion.getText().trim().isEmpty()) {
            res = true;
            txtF_tipoExtraccion.setBackground(Color.red);
        }
        if (txtF_tipoGel.getText().trim().isEmpty()) {
            res = true;
            txtF_tipoGel.setBackground(Color.red);
        }
        return res;
    }

    private void setBackgroundCampos() {
        ftxt_numExtraccion.setBackground(Color.white);
        txtF_Resultado.setBackground(Color.white);
        txtF_tipoExtraccion.setBackground(Color.white);
        txtF_tipoGel.setBackground(Color.white);
    }
}
