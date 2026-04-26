package vista;

import controlador.ControladorCurso;
import javax.swing.JOptionPane;

public class FormNotas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormNotas.class.getName());

    public FormNotas(String curso, String estudiante) {
    initComponents();
    txtCurso.setText(curso);
    txtEstudiante.setText(estudiante);
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCurso = new javax.swing.JTextField();
        txtEstudiante = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAsignarNota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCurso.addActionListener(this::txtCursoActionPerformed);

        txtEstudiante.addActionListener(this::txtEstudianteActionPerformed);

        jLabel1.setText("Codigo del curso");

        jLabel2.setText("Codigo del estudiante");

        jLabel3.setText("Nota");

        btnAsignarNota.setText("Asignar Notas");
        btnAsignarNota.addActionListener(this::btnAsignarNotaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCurso)
                    .addComponent(txtEstudiante)
                    .addComponent(txtNota, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAsignarNota)
                .addGap(71, 276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAsignarNota)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstudianteActionPerformed

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

    private void btnAsignarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarNotaActionPerformed

        String curso = txtCurso.getText().trim();
        String estudiante = txtEstudiante.getText().trim();
        String notaTexto = txtNota.getText().trim();
        
        double nota;

        if (curso.isEmpty() || estudiante.isEmpty() || notaTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
            return;
        }
        
        try {
            nota = Double.parseDouble(notaTexto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nota inválida");
            return;
        }
        
        if (nota < 0 || nota > 100) {
            JOptionPane.showMessageDialog(this, "La nota debe estar entre 0 y 100");
            return;
        }
        
        boolean ok = ControladorCurso.asignarNota(curso, estudiante, nota);
        
        if (ok) {
            JOptionPane.showMessageDialog(this, "Nota asignada correctamente");
            dispose(); // cierra ventana
        } else {
            JOptionPane.showMessageDialog(this, "Error: curso o estudiante no válido");
        }
    }//GEN-LAST:event_btnAsignarNotaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtEstudiante;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables

}

