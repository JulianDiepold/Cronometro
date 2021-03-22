
package Codigo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Ventana extends javax.swing.JFrame { 
    private Timer tiempo;
    private int centesimaSegundos=0, segundos=0, minutos=0, horas=0;
    
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            centesimaSegundos++;
            if(centesimaSegundos == 100){
                segundos++;
                centesimaSegundos = 0;
            }
            if(segundos == 60){
                minutos++;
                segundos = 0;
                
            }
            if(minutos == 60){
                horas++;
                minutos = 0;
            }
            
            actualizarEtiquetaTiempo();
        }
    }; 
    
    private void actualizarEtiquetaTiempo(){
        String texto = (horas<=9?"0":"")+horas+":"+(minutos<=9?"0":"")+minutos+":"+(segundos<=9?"0":"")+segundos+":"+(centesimaSegundos<=9?"0":"")+centesimaSegundos;
        
        etiquetaTiempo.setText(texto);
    }
    
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        tiempo = new Timer(10, acciones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        imagenCronometro = new javax.swing.JLabel();
        etiquetaCronometro = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        botonPausar = new javax.swing.JButton();
        botonDetener = new javax.swing.JButton();
        etiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronometro");
        setResizable(false);

        panel.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenCronometro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        imagenCronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cronometro.png"))); // NOI18N
        imagenCronometro.setAutoscrolls(true);
        panel.add(imagenCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 130));

        etiquetaCronometro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        etiquetaCronometro.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaCronometro.setText("Cronometro");
        panel.add(etiquetaCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 250, 40));

        etiquetaTiempo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        etiquetaTiempo.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTiempo.setText("00:00:00:00");
        panel.add(etiquetaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 290, 40));

        botonIniciar.setBackground(new java.awt.Color(0, 153, 0));
        botonIniciar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIniciar.setText("Iniciar");
        botonIniciar.setBorderPainted(false);
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        panel.add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 100, 30));

        botonPausar.setBackground(new java.awt.Color(0, 153, 0));
        botonPausar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonPausar.setText("Pausar");
        botonPausar.setBorderPainted(false);
        botonPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPausarActionPerformed(evt);
            }
        });
        panel.add(botonPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 100, 30));

        botonDetener.setBackground(new java.awt.Color(0, 153, 0));
        botonDetener.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonDetener.setText("Detener");
        botonDetener.setBorderPainted(false);
        botonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetenerActionPerformed(evt);
            }
        });
        panel.add(botonDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 100, 30));

        etiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        panel.add(etiquetaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 205));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPausarActionPerformed
        tiempo.stop();
        botonIniciar.setEnabled(true);
        botonPausar.setEnabled(false);
    }//GEN-LAST:event_botonPausarActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        tiempo.start();
        
        botonIniciar.setEnabled(false);
        botonIniciar.setText("Reanudar");
        botonPausar.setEnabled(true);
        botonDetener.setEnabled(true);
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetenerActionPerformed
        if(tiempo.isRunning()){
            tiempo.stop();
            botonIniciar.setEnabled(true);
            
        }
        botonIniciar.setText("Iniciar");
        botonPausar.setEnabled(false);
        botonDetener.setEnabled(false);
        
        horas = 0;
        minutos = 0;
        segundos = 0;
        centesimaSegundos = 0;
        
        actualizarEtiquetaTiempo();
    }//GEN-LAST:event_botonDetenerActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDetener;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonPausar;
    private javax.swing.JLabel etiquetaCronometro;
    private javax.swing.JLabel etiquetaFondo;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel imagenCronometro;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
