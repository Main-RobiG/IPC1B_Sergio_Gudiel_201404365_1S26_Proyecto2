package vista;

import modelo.Estudiante;
import controlador.ControladorUsuario;
import javax.swing.JOptionPane;

public class PanelEstudiantes extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PanelEstudiantes.class.getName());

    public PanelEstudiantes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnCrearEstudiante = new javax.swing.JButton();
        btnEditarEstudiante = new javax.swing.JButton();
        btnEliminarEstudiante = new javax.swing.JButton();
        btnInfoEstudiantes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearEstudiante.setText("Crear Estudiante");
        btnCrearEstudiante.addActionListener(this::btnCrearEstudianteActionPerformed);

        btnEditarEstudiante.setText("Editar Estudiante");
        btnEditarEstudiante.addActionListener(this::btnEditarEstudianteActionPerformed);

        btnEliminarEstudiante.setText("Eliminar Estudiante");
        btnEliminarEstudiante.addActionListener(this::btnEliminarEstudianteActionPerformed);

        btnInfoEstudiantes.setText("Info Estudiante");
        btnInfoEstudiantes.addActionListener(this::btnInfoEstudiantesActionPerformed);

        jLabel1.setText("Estudiantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInfoEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInfoEstudiantes)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnCrearEstudianteActionPerformed(java.awt.event.ActionEvent evt) {                                                   

        new FormEstudiante().setVisible(true);
    }                                                  

    private void btnEditarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {                                                    

        String codigo = JOptionPane.showInputDialog("Codigo del estudiante:");

        Estudiante e = ControladorUsuario.obtenerEstudiante(codigo);

        if (e != null) {
            new FormEstudiante(
                    e.getCodigo(),
                    e.getNombre(),
                    e.getPassword()
            ).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No existe");
        }
    }                                                   

    private void btnEliminarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {                                                      

        String cod = JOptionPane.showInputDialog("Codigo:");
        boolean ok = ControladorUsuario.eliminarEstudiante(cod);
        
        if (ok) {
            JOptionPane.showMessageDialog(this, "Eliminado");
        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }                                                     

    private void btnInfoEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {                                                   

        String lista = ControladorUsuario.obtenerEstudiantes();
        JOptionPane.showMessageDialog(this, lista);
    }                                                  

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCrearEstudiante;
    private javax.swing.JButton btnEditarEstudiante;
    private javax.swing.JButton btnEliminarEstudiante;
    private javax.swing.JButton btnInfoEstudiantes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
