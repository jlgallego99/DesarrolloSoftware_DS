/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;

/**
 *
 * @author jlgallego99
 */
public class Coche extends javax.swing.JFrame {
    
    double distanciaAcumulada;
    double distanciaActual;
    private static final DecimalFormat decimales = new DecimalFormat("#.###");
    Coche() {        
        
        initComponents();
        
        // Títulos del panel de cada parte del coche
        salpicadero.setBorder(BorderFactory.createTitledBorder("Salpicadero"));
        velocimetro.setBorder(BorderFactory.createTitledBorder("Velocímetro"));
        cuentakilometros.setBorder(BorderFactory.createTitledBorder("Cuentakilómetros"));
        cuentarrevoluciones.setBorder(BorderFactory.createTitledBorder("Cuentarrevoluciones"));
        distanciaAcumulada = 0.0;
        distanciaActual = 0.0;
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    

    
    public void ejecutar(double revoluciones,EstadoMotor estado){
        double velocidad = 2.0 * Math.PI * 0.15 * revoluciones * (60.0/1000.0);
        double distancia_recorrida = velocidad/3600.0;
        distanciaActual += distancia_recorrida;
        distanciaAcumulada += distancia_recorrida;
        
        if(estado == EstadoMotor.APAGADO){
            distanciaActual = 0.0;
        }
        
        rpm.setText(Double.toString(revoluciones));
        valor_velocimetro.setText(decimales.format(velocidad));
        contador_total.setText(decimales.format(distanciaAcumulada));
        contador_reciente.setText(decimales.format(distanciaActual));
    }
    
    /*
    public void start(){
        cocheHebra hilo = new cocheHebra();
        hilo.start();
    }
    
    public class cocheHebra extends Thread{
        @Override
        public void run(){
            while(true){
                setEstado(panel.getEstadoMotor());
            }
        }
    } */                        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salpicadero = new javax.swing.JPanel();
        velocimetro = new javax.swing.JPanel();
        valor_velocimetro = new javax.swing.JLabel();
        cuentakilometros = new javax.swing.JPanel();
        contador_reciente = new javax.swing.JLabel();
        contador_total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cuentarrevoluciones = new javax.swing.JPanel();
        rpm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        valor_velocimetro.setText("jLabel1");

        javax.swing.GroupLayout velocimetroLayout = new javax.swing.GroupLayout(velocimetro);
        velocimetro.setLayout(velocimetroLayout);
        velocimetroLayout.setHorizontalGroup(
            velocimetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(velocimetroLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(valor_velocimetro)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        velocimetroLayout.setVerticalGroup(
            velocimetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(velocimetroLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(valor_velocimetro)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        contador_reciente.setText("jLabel1");

        contador_total.setText("jLabel1");

        jLabel3.setText("Actual:");

        jLabel4.setText("Total:");

        javax.swing.GroupLayout cuentakilometrosLayout = new javax.swing.GroupLayout(cuentakilometros);
        cuentakilometros.setLayout(cuentakilometrosLayout);
        cuentakilometrosLayout.setHorizontalGroup(
            cuentakilometrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentakilometrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cuentakilometrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(cuentakilometrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contador_total)
                    .addComponent(contador_reciente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cuentakilometrosLayout.setVerticalGroup(
            cuentakilometrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentakilometrosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(cuentakilometrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contador_reciente)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(cuentakilometrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contador_total)
                    .addComponent(jLabel4))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        rpm.setText("jLabel1");

        javax.swing.GroupLayout cuentarrevolucionesLayout = new javax.swing.GroupLayout(cuentarrevoluciones);
        cuentarrevoluciones.setLayout(cuentarrevolucionesLayout);
        cuentarrevolucionesLayout.setHorizontalGroup(
            cuentarrevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentarrevolucionesLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(rpm)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        cuentarrevolucionesLayout.setVerticalGroup(
            cuentarrevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuentarrevolucionesLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(rpm)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout salpicaderoLayout = new javax.swing.GroupLayout(salpicadero);
        salpicadero.setLayout(salpicaderoLayout);
        salpicaderoLayout.setHorizontalGroup(
            salpicaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salpicaderoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salpicaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(velocimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cuentakilometros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cuentarrevoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        salpicaderoLayout.setVerticalGroup(
            salpicaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salpicaderoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(velocimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cuentakilometros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cuentarrevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salpicadero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salpicadero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Coche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contador_reciente;
    private javax.swing.JLabel contador_total;
    private javax.swing.JPanel cuentakilometros;
    private javax.swing.JPanel cuentarrevoluciones;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel rpm;
    private javax.swing.JPanel salpicadero;
    private javax.swing.JLabel valor_velocimetro;
    private javax.swing.JPanel velocimetro;
    // End of variables declaration//GEN-END:variables
}
