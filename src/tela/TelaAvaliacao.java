/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.awt.Image;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Avaliacao;
import modelo.Imagem;


/**
 *
 * @author LAB-07
 */
public class TelaAvaliacao extends javax.swing.JFrame {

    private List<Avaliacao> avaliacoes= new ArrayList<>();
    private Map < String , String > imagens; 
    private List<Imagem> listImg;
    //private  boolean go ;
    
    String urlImagem="";
    int contador = 0;
    
    
 /******* inicialzações de sockets*************/
    private Socket sockecliente ;
    private PrintWriter enviarProServidor;
    private ObjectOutputStream objetoClienteParaServ;
    
    
    
    
 /******* inicialzações de sockets*************/

    
    private  Avaliacao avaliacao = new Avaliacao();
    private Imagem imgem = new Imagem();
    
    public TelaAvaliacao() {
        initComponents();
        preencherImagem ();
       
        
    }
    
    
    // alimnta o tabela hash
     private void preencherImagem () {
         imagens=new HashMap < String , String >() ;
         
         imagens.put("imgJPG","/Imagem/imgJPG.jpg" );
         imagens.put("imgPNG","/Imagem/imgPNG.png" );
         
         //---------------------------------------------
         
         listImg =  new ArrayList<>();
         listImg.add(new Imagem("imgJPG","/Imagem/imgJPG.png" ));
         listImg.add(new Imagem("imgPNG","/Imagem/imgPNG.png"));
         
         
         
    }
    
     protected ImageIcon createImageIcon(String path,String description) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL, description);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
}
                   
     private void mostrarImagem(){
        
           
               
        urlImagem = imagens.get(listImg.get(contador).getDescricao());
                      
          
        // colocar a imagem no label
        ImageIcon icon = new ImageIcon(getClass().getResource(urlImagem));
        Image image = icon.getImage().getScaledInstance(jLabelImagemTela.getWidth(),jLabelImagemTela.getHeight(), Image.SCALE_DEFAULT);
        jLabelImagemTela.setIcon( new ImageIcon(image));
        jButtonIniciar.setEnabled(false);
       
      // Image image = icon.getImage().getScaledInstance(jLabelImagemTela.getWidth(),jLabelImagemTela.getHeight(), Image.SCALE_DEFAULT);
      
       
        
    }
    
     private void limparCampo () {
         //jTextFieldAvaliador.setText("");
         
         if (jRadioButtobOtimo.isSelected()==true){
             jRadioButtobOtimo.setSelected(false);
             
             repaint();
         }
         if (jRadioButtonBom.isSelected()==true){
             jRadioButtonBom.setSelected(false);
             repaint();
         }
         
         if (jRadioButtonPessimo.isSelected()==true){
             jRadioButtonPessimo.setSelected(false);
             repaint();
         }
         
         if (jRadioButtonIrritante.isSelected()==true){
             jRadioButtonPessimo.setSelected(false);
             repaint();
         }
         
         if (jRadioButtonMuitoIrritante.isSelected()==true){
             jRadioButtonPessimo.setSelected(false);
             repaint();
         }
     }
     
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEscalas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAvaliador = new javax.swing.JTextField();
        jButtonIniciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtobOtimo = new javax.swing.JRadioButton();
        jRadioButtonBom = new javax.swing.JRadioButton();
        jRadioButtonPessimo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonIrritante = new javax.swing.JRadioButton();
        jRadioButtonMuitoIrritante = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonGravar = new javax.swing.JButton();
        jButtonVotar = new javax.swing.JButton();
        jLabelImagemTela = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Avaliador:");

        jTextFieldAvaliador.setEnabled(false);
        jTextFieldAvaliador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAvaliadorActionPerformed(evt);
            }
        });

        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grade de Escalas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        grupoEscalas.add(jRadioButtobOtimo);
        jRadioButtobOtimo.setText("Imperceptivél");
        jRadioButtobOtimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtobOtimoActionPerformed(evt);
            }
        });

        grupoEscalas.add(jRadioButtonBom);
        jRadioButtonBom.setText("Perceptíveis , mas não irritante");
        jRadioButtonBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBomActionPerformed(evt);
            }
        });

        grupoEscalas.add(jRadioButtonPessimo);
        jRadioButtonPessimo.setText("Levimente irritante");
        jRadioButtonPessimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPessimoActionPerformed(evt);
            }
        });

        jLabel2.setText("5");

        jLabel3.setText("4");

        jLabel4.setText("3");

        grupoEscalas.add(jRadioButtonIrritante);
        jRadioButtonIrritante.setText("Irritante");

        grupoEscalas.add(jRadioButtonMuitoIrritante);
        jRadioButtonMuitoIrritante.setText("Muito irritante");
        jRadioButtonMuitoIrritante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMuitoIrritanteActionPerformed(evt);
            }
        });

        jLabel5.setText("2");

        jLabel6.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonBom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonMuitoIrritante)
                            .addComponent(jRadioButtonIrritante)
                            .addComponent(jRadioButtobOtimo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonPessimo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtobOtimo)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonBom)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPessimo)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonIrritante)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMuitoIrritante)
                    .addComponent(jLabel6))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jButtonGravar.setText("Gravar");
        jButtonGravar.setEnabled(false);
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonVotar.setText("Votar");
        jButtonVotar.setEnabled(false);
        jButtonVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVotarActionPerformed(evt);
            }
        });

        jLabelImagemTela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVotar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIniciar)
                        .addGap(140, 140, 140)
                        .addComponent(jButtonGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                        .addComponent(jButtonSair)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAvaliador))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelImagemTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAvaliador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIniciar)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelImagemTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonVotar)
                    .addComponent(jButtonSair))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtobOtimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtobOtimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtobOtimoActionPerformed

    private void jRadioButtonBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonBomActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        JOptionPane.showMessageDialog(null, avaliacao.getImagem()+""+avaliacao.getVotos().toString() +""+avaliacao.getAvaliadores().toString());
        jButtonIniciar.setEnabled(true);
        contador=0;
       
        try {
            sockecliente = new Socket("127.0.0.1",5000);
            enviarProServidor = new PrintWriter(sockecliente.getOutputStream());
            
            objetoClienteParaServ = new ObjectOutputStream(sockecliente.getOutputStream());
            enviarProServidor.print(avaliacao.getImagem());
            enviarProServidor.print(avaliacao.getAvaliadores());
            enviarProServidor.print(avaliacao.getVotos());
            
           // for (Avaliacao ava : avaliacoes) {
            //    Serializable obj = (Serializable) ava;
             //   objetoClienteParaServ.writeObject(obj); 
               // objetoClienteParaServ.flush();
          //  }
          
            
           // objetoClienteParaServ.flush();
           // enviarProServidor.flush();
            
            enviarProServidor.close();
          //  objetoClienteParaServ.close();
            
        } catch (Exception ex){
            ex.getMessage();
        }
        
        
        
           
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVotarActionPerformed
        
 /**********VARIAVEIS************************/
        Integer nota=0;
        contador++;
         
  /******************************************/
       if (jTextFieldAvaliador.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Campo nome esta vazio",null, JOptionPane.ERROR_MESSAGE);
           jTextFieldAvaliador.setText("Digite seu nome aqui .....");
           contador=contador-1;
       }
       else if (contador < listImg.size()){
                limparCampo(); 
              
                
                imgem.setUrlImg(imagens.get(listImg.get(contador).getUrlImg()));
                imgem.setDescricao(listImg.get(contador).getDescricao());
                avaliacao.getAvaliadores().add(jTextFieldAvaliador.getText());
                avaliacao.setImagem(imgem);
                
                if (jRadioButtobOtimo.isSelected()){
                    nota=5;
                }
                if (jRadioButtonBom.isSelected()){
                    nota=4;
                }

                if (jRadioButtonPessimo.isSelected()){
                    nota=3;
                }
                
                if (jRadioButtonIrritante.isSelected()){
                    nota=2;
                }
                if (jRadioButtonMuitoIrritante.isSelected()){
                    nota=1;
                }

              avaliacao.getVotos().add(nota);
              
             
              
              
                  mostrarImagem();
                  
                 // JOptionPane.showMessageDialog(null,"next"+ contador);
                
              }else{
                  jButtonGravar.setEnabled(true);
                  jButtonVotar.setEnabled(false);
                  jTextFieldAvaliador.setEnabled(false);
                  jTextFieldAvaliador.setText("");
                  //jButtonGravar.setEnabled(false);
                  
              }
   
         avaliacoes.add(avaliacao);
        
    }//GEN-LAST:event_jButtonVotarActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
       jButtonVotar.setEnabled(true);
       jTextFieldAvaliador.setEnabled(true);
       jButtonGravar.setEnabled(false);
       
       mostrarImagem();
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jRadioButtonPessimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPessimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPessimoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldAvaliadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAvaliadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAvaliadorActionPerformed

    private void jRadioButtonMuitoIrritanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMuitoIrritanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMuitoIrritanteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAvaliacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoEscalas;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVotar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelImagemTela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtobOtimo;
    private javax.swing.JRadioButton jRadioButtonBom;
    private javax.swing.JRadioButton jRadioButtonIrritante;
    private javax.swing.JRadioButton jRadioButtonMuitoIrritante;
    private javax.swing.JRadioButton jRadioButtonPessimo;
    private javax.swing.JTextField jTextFieldAvaliador;
    // End of variables declaration//GEN-END:variables
}
