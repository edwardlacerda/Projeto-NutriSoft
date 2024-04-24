package nutrisoft;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author eddie
 */
public class Recomendacao extends javax.swing.JFrame {

    /**
     * Creates new form recomendacao
     */
    public Recomendacao() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        panel_principal = new javax.swing.JPanel();
        label_edwardlacerda = new javax.swing.JLabel();
        label_titulo = new javax.swing.JLabel();
        panel_calorias = new javax.swing.JPanel();
        label_caloriasDiarias = new javax.swing.JLabel();
        txt_calorias = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        panel_resultado = new javax.swing.JPanel();
        label_carboidrato = new javax.swing.JLabel();
        label_proteina = new javax.swing.JLabel();
        label_gordura = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_principal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        label_edwardlacerda.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        label_edwardlacerda.setText("Designed by Edward Lacerda");

        label_titulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        label_titulo.setText("Recomendações");

        panel_calorias.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_caloriasDiarias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_caloriasDiarias.setText("Calorias diárias (kcal):");

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_caloriasLayout = new javax.swing.GroupLayout(panel_calorias);
        panel_calorias.setLayout(panel_caloriasLayout);
        panel_caloriasLayout.setHorizontalGroup(
            panel_caloriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_caloriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_caloriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_caloriasLayout.createSequentialGroup()
                        .addComponent(label_caloriasDiarias)
                        .addGap(32, 32, 32)
                        .addComponent(txt_calorias, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panel_caloriasLayout.setVerticalGroup(
            panel_caloriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_caloriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_caloriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_caloriasDiarias)
                    .addComponent(txt_calorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panel_resultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_carboidrato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_carboidrato.setText("Carboidratos (50%):");

        label_proteina.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_proteina.setText("Proteína (25%):");

        label_gordura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_gordura.setText("Gordura (25%):");

        javax.swing.GroupLayout panel_resultadoLayout = new javax.swing.GroupLayout(panel_resultado);
        panel_resultado.setLayout(panel_resultadoLayout);
        panel_resultadoLayout.setHorizontalGroup(
            panel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_gordura)
                    .addComponent(label_proteina)
                    .addComponent(label_carboidrato))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_resultadoLayout.setVerticalGroup(
            panel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultadoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(label_carboidrato)
                .addGap(18, 18, 18)
                .addComponent(label_proteina)
                .addGap(18, 18, 18)
                .addComponent(label_gordura)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_edwardlacerda)
                    .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label_titulo)
                        .addComponent(panel_calorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_titulo)
                .addGap(18, 18, 18)
                .addComponent(panel_calorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(label_edwardlacerda)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        String dadosUser = txt_calorias.getText();
        boolean validacao = dadosUser.matches("[0-9]{3,8}[.][0-9]{0,5}|[0-9]{3,8}");
       
        if (txt_calorias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo calorias está vazio!");
            txt_calorias.setText(null);
        } else if (validacao == false) {
            JOptionPane.showMessageDialog(null, "Número inválido!");
            txt_calorias.setText(null);
        } else {
            double calorias = Double.parseDouble(txt_calorias.getText());
            double carboidratos = ((calorias * 0.5) / 4);
            double proteinas = ((calorias * 0.25) / 4);
            double gordura = ((calorias * 0.25) / 9);

            DecimalFormat df = new DecimalFormat("#.00");

            label_carboidrato.setText("Carboidratos (50%) : " + df.format(carboidratos) + " gramas.");
            label_proteina.setText("Proteína (25%): " + df.format(proteinas) + " gramas.");
            label_gordura.setText("Gordura (25%): " + df.format(gordura) + " gramas.");
        }

    }//GEN-LAST:event_btn_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(Recomendacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recomendacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recomendacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recomendacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recomendacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel label_caloriasDiarias;
    private javax.swing.JLabel label_carboidrato;
    private javax.swing.JLabel label_edwardlacerda;
    private javax.swing.JLabel label_gordura;
    private javax.swing.JLabel label_proteina;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panel_calorias;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_resultado;
    private javax.swing.JTextField txt_calorias;
    // End of variables declaration//GEN-END:variables
}
