package nutrisoft;

import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author eddie
 */
public class GastoCalorico extends javax.swing.JFrame {

    /**
     * Creates new form gastoCalorico
     */
    public GastoCalorico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp_genero = new javax.swing.ButtonGroup();
        panel_GastoCalorico = new javax.swing.JPanel();
        label_edwardlacerda1 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JLabel();
        panel_principal = new javax.swing.JPanel();
        radio_mulher = new javax.swing.JRadioButton();
        radio_homem = new javax.swing.JRadioButton();
        label_peso = new javax.swing.JLabel();
        label_altura = new javax.swing.JLabel();
        label_idade = new javax.swing.JLabel();
        label_nivelAtividade = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        txt_peso = new javax.swing.JTextField();
        txt_altura = new javax.swing.JTextField();
        txt_idade = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        panel_resultado = new javax.swing.JPanel();
        label_gastoBasal = new javax.swing.JLabel();
        label_gastoTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_edwardlacerda1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        label_edwardlacerda1.setText("Designed by Edward Lacerda");

        txt_titulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_titulo.setText("Cálculo de Gasto Calórico");

        panel_principal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        grp_genero.add(radio_mulher);
        radio_mulher.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_mulher.setText("Mulher");
        radio_mulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_mulherActionPerformed(evt);
            }
        });

        grp_genero.add(radio_homem);
        radio_homem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_homem.setText("Homem");
        radio_homem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_homemActionPerformed(evt);
            }
        });

        label_peso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_peso.setText("Peso (Kg):");

        label_altura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_altura.setText("Altura (Cm):");

        label_idade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_idade.setText("Idade:");

        label_nivelAtividade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_nivelAtividade.setText("Nível de atividade");

        btn_calcular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        txt_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesoActionPerformed(evt);
            }
        });

        combobox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentário", "Leve (exercício leve 1 a 3 dias/semanas)", "Ativo (exercício pesado 5 a 6 dias/semanas)", "extremamente ativo (exercício pesado diário)" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_principalLayout.createSequentialGroup()
                        .addComponent(radio_mulher)
                        .addGap(27, 27, 27)
                        .addComponent(radio_homem))
                    .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_principalLayout.createSequentialGroup()
                            .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_peso)
                                .addComponent(label_nivelAtividade)
                                .addComponent(label_idade)
                                .addComponent(label_altura))
                            .addGap(20, 20, 20)
                            .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_idade, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(txt_peso)
                                .addComponent(txt_altura)
                                .addComponent(combobox, 0, 1, Short.MAX_VALUE)))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_mulher)
                    .addComponent(radio_homem))
                .addGap(18, 18, 18)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_peso)
                    .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_altura)
                    .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_idade)
                    .addComponent(txt_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nivelAtividade)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_resultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_gastoBasal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_gastoBasal.setText("Gasto Basal:");

        label_gastoTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_gastoTotal.setText("Gasto Total:");

        javax.swing.GroupLayout panel_resultadoLayout = new javax.swing.GroupLayout(panel_resultado);
        panel_resultado.setLayout(panel_resultadoLayout);
        panel_resultadoLayout.setHorizontalGroup(
            panel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultadoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_gastoBasal)
                    .addComponent(label_gastoTotal))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        panel_resultadoLayout.setVerticalGroup(
            panel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultadoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(label_gastoBasal)
                .addGap(29, 29, 29)
                .addComponent(label_gastoTotal)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_GastoCaloricoLayout = new javax.swing.GroupLayout(panel_GastoCalorico);
        panel_GastoCalorico.setLayout(panel_GastoCaloricoLayout);
        panel_GastoCaloricoLayout.setHorizontalGroup(
            panel_GastoCaloricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_GastoCaloricoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_GastoCaloricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_edwardlacerda1)
                    .addGroup(panel_GastoCaloricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_titulo)
                        .addComponent(panel_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panel_GastoCaloricoLayout.setVerticalGroup(
            panel_GastoCaloricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_GastoCaloricoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txt_titulo)
                .addGap(18, 18, 18)
                .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_edwardlacerda1)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_GastoCalorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_GastoCalorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

    private void radio_mulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_mulherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_mulherActionPerformed

    private void txt_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesoActionPerformed


    }//GEN-LAST:event_txt_pesoActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed

        double peso = Double.parseDouble(txt_peso.getText());
        double altura = Double.parseDouble(txt_altura.getText());
        double idade = Integer.parseInt(txt_idade.getText());
        double calcBasal = 0;
        double total = 0;

        String userPeso = txt_peso.getText();
        String userAltura = txt_altura.getText();
        String userIdade = txt_idade.getText();

        boolean validacao = userPeso.matches("[0-9]{2,8}[.][0-9]{0,5}|[0-9]{2,8}");
        boolean validacao2 = userAltura.matches("[0-9]{2,8}[.][0-9]{0,5}|[0-9]{2,8}");
        boolean validacao3 = userIdade.matches("[0-9]{2,8}[.][0-9]{0,5}|[0-9]{2,8}");

        if (txt_altura.getText().isEmpty() || txt_peso.getText().isEmpty() || txt_idade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Os campos estão vazios!");
            txt_altura.setText(null);
            txt_peso.setText(null);
            txt_idade.setText(null);

        } else if (validacao == false || validacao2 == false || validacao3 == false) {
            JOptionPane.showMessageDialog(null, "Valores inválidos\nUtilize formatação sem pontuação");
            txt_altura.setText(null);
            txt_peso.setText(null);
            txt_idade.setText(null);
        } else {
            if (radio_homem.isSelected()) {
                calcBasal = 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);
            } else if (radio_mulher.isSelected()) {
                calcBasal = 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
            }
            String nivelAtv = combobox.getSelectedItem().toString();

            if (nivelAtv.contains("Sedentário")) {
                total = (calcBasal * 1.2);
            }
            if (nivelAtv.contains("Leve")) {
                total = (calcBasal * 1.357);
            }
            if (nivelAtv.contains("Moderado")) {
                total = (calcBasal * 1.55);
            }
            if (nivelAtv.contains("Ativo")) {
                total = (calcBasal * 1.725);
            }
            if (nivelAtv.contains("Extremamente ativo")) {
                total = (calcBasal * 1.9);
            }

            DecimalFormat df = new DecimalFormat("#.00");
            label_gastoBasal.setText("Gasto basal: " + df.format(calcBasal) + " calorias.");
            label_gastoTotal.setText("Gasto total: " + df.format(total)+ " calorias.");

        }


    }//GEN-LAST:event_btn_calcularActionPerformed

    private void radio_homemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_homemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_homemActionPerformed

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
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GastoCalorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.ButtonGroup grp_genero;
    private javax.swing.JLabel label_altura;
    private javax.swing.JLabel label_edwardlacerda1;
    private javax.swing.JLabel label_gastoBasal;
    private javax.swing.JLabel label_gastoTotal;
    private javax.swing.JLabel label_idade;
    private javax.swing.JLabel label_nivelAtividade;
    private javax.swing.JLabel label_peso;
    private javax.swing.JPanel panel_GastoCalorico;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_resultado;
    private javax.swing.JRadioButton radio_homem;
    private javax.swing.JRadioButton radio_mulher;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_idade;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
