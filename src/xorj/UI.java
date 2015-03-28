/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xorj;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author crashdemons <crashdemons -at- github.com>
 */
public class UI extends javax.swing.JFrame {
    public ArrayList<FileEntry> files = new ArrayList<FileEntry>();
    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        jScrollPane1.setViewportView(graphPanel1);
        jbScan.setVisible(false);
        jProgressBar1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filePanel1 = new xorj.FilePanel();
        graphPanel1 = new xorj.GraphPanel();
        jsFiles = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jbExtract = new javax.swing.JButton();
        jbScan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbClearFiles = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        filePanel1.setLayout(new java.awt.GridLayout(0, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XorJ");

        jButton1.setText("+");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Filename");

        jLabel2.setText("Starting position");

        jLabel3.setText("Ending position");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Visual representation:");

        jButton2.setText("Refresh visual");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbExtract.setText("Xor/Extract");
        jbExtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExtractActionPerformed(evt);
            }
        });

        jbScan.setText("Scan for text");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Files:");

        jbClearFiles.setText("Clear files");
        jbClearFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearFilesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsFiles)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbClearFiles))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jbScan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbExtract)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jbClearFiles))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbScan)
                        .addComponent(jbExtract))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addFileTest();
        updateGraph();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        updateGraph();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void prep(){
        jbExtract.setEnabled(false);
        jProgressBar1.setValue(0);
        jProgressBar1.setVisible(true);
    }
    private void deprep(){
        jProgressBar1.setVisible(false);
        jbExtract.setEnabled(true);
    }
    
    private void jbExtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExtractActionPerformed
        prep();
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(FileEntry.dir);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Binaries", "bin", "dat");
        chooser.setFileFilter(filter);
        int retval = chooser.showSaveDialog(this);
        if (retval != JFileChooser.APPROVE_OPTION) { deprep(); return; }
        FileEntry.dir=chooser.getCurrentDirectory();
        String outfile=chooser.getSelectedFile().getAbsolutePath();
        jProgressBar1.setValue(1);
        
        try{
            Decoder dec = new Decoder();
            dec.setSaveFile(outfile);
            dec.setParameters(files);
            jProgressBar1.setValue(10);
            
            boolean read;
            do{
                read=dec.readAll();
                dec.xorAll();
                dec.write();
            }while(read);
            jProgressBar1.setValue(99);
            dec.clearParameters();
            dec=null;
            
        }catch(Exception e){System.out.println("Exception");}
        deprep();
    }//GEN-LAST:event_jbExtractActionPerformed

    private void jbClearFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearFilesActionPerformed
        // TODO add your handling code here:
        filePanel1.removeAll();
        files.clear();
        repaintFiles();
        updateGraph();
    }//GEN-LAST:event_jbClearFilesActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    
    
    private void repaintFiles(){
        filePanel1.invalidate();
        filePanel1.repaint();
        jsFiles.invalidate();
        jsFiles.repaint();
    }
    
    public void addFileTest(){
        jScrollPane1.setViewportView(graphPanel1);
        FileEntry fe = new FileEntry();
        boolean check=fe.select();
        System.out.println(check);
        if(!check){ fe=null; return; }
        fe.ui=this;
        filePanel1.add(fe);
        files.add(fe);
        jsFiles.setViewportView(filePanel1);
        repaintFiles();
    }
    public void removeFileEntry(FileEntry fe){
        filePanel1.remove(fe);
        files.remove(fe);
        fe=null;
        repaintFiles();
        updateGraph();
    }
    public void updateGraph(){
        ArrayList<FileBar> bars=new ArrayList<FileBar>();
        int maxwidth=graphPanel1.WIDTH;
        long maxsize=0;
        for(FileEntry fe : files){//create bars and determine maximum width/size for scaling
            FileBar fb = new FileBar(fe);
            if(fb.size>maxsize) maxsize=fb.size;
            bars.add(fb);
        }
        int max_xselected=0;
        for(FileBar fb : bars){//scale the bars, and determine the max alignment position.
            fb.setScale(maxwidth, maxsize);
            if(fb.xselected>max_xselected) max_xselected=fb.xselected;
        }
        for(FileBar fb : bars){//shift the bars to align the selection start point.
            int d=max_xselected-fb.xselected;
            fb.shift(d);
        }
        graphPanel1.renderList(bars);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private xorj.FilePanel filePanel1;
    private xorj.GraphPanel graphPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbClearFiles;
    private javax.swing.JButton jbExtract;
    private javax.swing.JButton jbScan;
    private javax.swing.JScrollPane jsFiles;
    // End of variables declaration//GEN-END:variables
}
