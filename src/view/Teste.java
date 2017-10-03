package view;

import beansCustomer.BeansCustomer;
import beansCustomer.BeansTabela;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.util.converter.BigDecimalStringConverter;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ConexaoBd;
import modelo.DaoCustomer;

public class Teste extends javax.swing.JFrame {

    ConexaoBd conex = new ConexaoBd();
    BeansCustomer mod = new BeansCustomer();
    DaoCustomer control = new DaoCustomer();

    public Teste() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCustomer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JtextFieldID = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxAtividade = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonPesquisarMedia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextFieldVlTotal = new javax.swing.JFormattedTextField();
        jButtonNovo = new javax.swing.JButton();
        jFormattedTextFieldCPF_CNPJ = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextFieldMedia = new javax.swing.JFormattedTextField();
        Consulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF/CNPJ:");

        JtextFieldID.setEnabled(false);
        JtextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextFieldIDActionPerformed(evt);
            }
        });

        jTextFieldNome.setEnabled(false);

        jLabel4.setText("O usuario é ativo?");

        jLabel5.setText("Valor Total:");

        jComboBoxAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        jComboBoxAtividade.setEnabled(false);
        jComboBoxAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtividadeActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Média do campo valor total apenas para os itens que este valor seja maior que 560 e o campo id_customer esteja entre 1500 e 2700:");

        jButtonPesquisarMedia.setText("Pesquisar usuarios");
        jButtonPesquisarMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarMediaActionPerformed(evt);
            }
        });

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF/CNPJ", "Status", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(jTableConsulta);

        jLabel8.setText("Usuarios utilizados no calculo da média");

        jFormattedTextFieldVlTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextFieldVlTotal.setEnabled(false);
        jFormattedTextFieldVlTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldVlTotalActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldCPF_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF_CNPJ.setEnabled(false);
        jFormattedTextFieldCPF_CNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPF_CNPJActionPerformed(evt);
            }
        });

        jLabel9.setText("Exemplo de consulta no Banco de dados:");

        jLabel10.setText("MÈDIA:");

        javax.swing.GroupLayout jPanelCustomerLayout = new javax.swing.GroupLayout(jPanelCustomer);
        jPanelCustomer.setLayout(jPanelCustomerLayout);
        jPanelCustomerLayout.setHorizontalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCustomerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JtextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldVlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))))
                    .addGroup(jPanelCustomerLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                                .addComponent(jButtonPesquisarMedia)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanelCustomerLayout.setVerticalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JtextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldVlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisarMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        Consulta.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Consulta.setText(" Consulta no Banco de Dados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(848, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JtextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextFieldIDActionPerformed

    }//GEN-LAST:event_JtextFieldIDActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (JtextFieldID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o ID do cliente");
        } else if (jFormattedTextFieldCPF_CNPJ.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o CPF ou CNPJ do cliente");
        } else if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o Nome do cliente");
        } else if (jFormattedTextFieldVlTotal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o Valor Total correspondente");
        } else {
            conex.conexao();
            mod.setId_customer(Integer.parseInt(JtextFieldID.getText()));
            mod.setNm_customer((String) jTextFieldNome.getText());
            mod.setCpf_cnpj((String) (jFormattedTextFieldCPF_CNPJ.getText()));
            mod.setIs_active((String) jComboBoxAtividade.getSelectedItem());
            mod.setVl_total(Float.parseFloat(jFormattedTextFieldVlTotal.getText()));

            control.Insert(mod);
            conex.desconecta();
            JtextFieldID.setText("");
            jFormattedTextFieldCPF_CNPJ.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldVlTotal.setText("");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtividadeActionPerformed

    }//GEN-LAST:event_jComboBoxAtividadeActionPerformed

    private void jButtonPesquisarMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarMediaActionPerformed

        conex.conexao();
        BeansCustomer model = control.BuscaMedia(mod);
        jFormattedTextFieldMedia.setText(String.valueOf(model.getMedia()));

        preencherTabela("select * from customer where vl_total > 560 and id_customer >1500 and id_customer < 2700");

    }//GEN-LAST:event_jButtonPesquisarMediaActionPerformed

    private void jFormattedTextFieldVlTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldVlTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldVlTotalActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        JtextFieldID.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCPF_CNPJ.setEnabled(true);
        jFormattedTextFieldVlTotal.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jComboBoxAtividade.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jFormattedTextFieldCPF_CNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPF_CNPJActionPerformed

    }//GEN-LAST:event_jFormattedTextFieldCPF_CNPJActionPerformed

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "CPF/CNPJ", "Status", "Valor Total"};
        conex.conexao();
        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getInt("id_customer"), conex.rs.getString("nm_customer"), conex.rs.getInt("cpf_cnpj"), conex.rs.getString("is_active"), conex.rs.getFloat("vl_total")});

            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Não ha usuario cadastrado com estas especificações");
        }

        BeansTabela modelo = new BeansTabela(dados, colunas);

        jTableConsulta.setModel(modelo);
        jTableConsulta.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTableConsulta.getColumnModel().getColumn(0).setResizable(false);
        jTableConsulta.getColumnModel().getColumn(1).setPreferredWidth(220);
        jTableConsulta.getColumnModel().getColumn(1).setResizable(false);
        jTableConsulta.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableConsulta.getColumnModel().getColumn(2).setResizable(false);
        jTableConsulta.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableConsulta.getColumnModel().getColumn(3).setResizable(false);
        jTableConsulta.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTableConsulta.getColumnModel().getColumn(4).setResizable(false);
        jTableConsulta.getTableHeader().setReorderingAllowed(false);
        jTableConsulta.setAutoResizeMode(jTableConsulta.AUTO_RESIZE_OFF);
        jTableConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conex.desconecta();
    }

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
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Consulta;
    private javax.swing.JTextField JtextFieldID;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisarMedia;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxAtividade;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF_CNPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldMedia;
    private javax.swing.JFormattedTextField jFormattedTextFieldVlTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

}
