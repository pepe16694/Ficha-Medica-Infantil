package GUI;

import Logic.System;
import Logic.Child;
import Logic.Growth;
import java.time.LocalDate;
import javax.swing.JOptionPane;
public class vIngresoHijo extends javax.swing.JFrame {

   
    
    System sistema;
    
    public vIngresoHijo(System sist) {
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

        titulo = new javax.swing.JLabel();
        nomb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ingresoNombre = new javax.swing.JTextField();
        ingresoEdad = new javax.swing.JTextField();
        ingresoAltura = new javax.swing.JTextField();
        ingresoPeso = new javax.swing.JTextField();
        ingresoPerimetro = new javax.swing.JTextField();
        jButtonIngresar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de Hijo/a");

        titulo.setText("Ingreso de Hijo/a");

        nomb.setText("Nombre:");

        jLabel1.setText("Edad:");

        jLabel2.setText("Altura:");

        jLabel3.setText("Peso:");

        jLabel4.setText("Perimetro Craneal:");

        ingresoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoAlturaActionPerformed(evt);
            }
        });

        ingresoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoPesoActionPerformed(evt);
            }
        });

        jButtonIngresar.setText("Ingresar");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIngresar)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(nomb))
                                            .addGap(110, 110, 110))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addGap(122, 122, 122)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ingresoPerimetro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ingresoPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ingresoAltura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ingresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ingresoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(255, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ingresoPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomb)
                            .addComponent(ingresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ingresoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ingresoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ingresoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresar)
                    .addComponent(jButtonCancelar))
                .addGap(23, 23, 23))
        );

        setBounds(0, 0, 569, 396);
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoAlturaActionPerformed

    private void ingresoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoPesoActionPerformed
        // TODO add your handling code here:
        // veo que hallan llenado los campos compento
        if (ingresoNombre.getText().isEmpty()|| ingresoEdad.getText().isEmpty()||ingresoPeso.getText().isEmpty()|| ingresoAltura.getText().isEmpty()|| ingresoPerimetro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Atención!", JOptionPane.ERROR_MESSAGE);
        }else{
            //chequeo que hallan ingresado correctamente lso datos
            try {
                int edad = Integer.parseInt(ingresoEdad.getText());
                int peso = Integer.parseInt(ingresoPeso.getText());
                int altura = Integer.parseInt(ingresoAltura.getText());
                int perimetro = Integer.parseInt(ingresoPerimetro.getText());
                if (sistema.validarNumeros(edad, 0, 18)) {
                    String nombre = ingresoNombre.getText();
                    Child ch = new Child();
                    ch.setName(nombre);
                    ch.setAge(edad);
                    sistema.registerChild(ch);
                    Growth gr = new Growth(ch, altura, peso, perimetro);
                    sistema.registrarCrecimiento(gr);
                    
                    ingresoAltura.setText("");
                    ingresoNombre.setText("");
                    ingresoEdad.setText("");
                    ingresoPeso.setText("");
                    ingresoPerimetro.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "La edad debe ser un número entre el 0 y 18.", "Atención!", JOptionPane.ERROR_MESSAGE);
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "La datos erroneso.", "Atención!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ingresoPesoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ingresoAltura;
    private javax.swing.JTextField ingresoEdad;
    private javax.swing.JTextField ingresoNombre;
    private javax.swing.JTextField ingresoPerimetro;
    private javax.swing.JTextField ingresoPeso;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nomb;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
