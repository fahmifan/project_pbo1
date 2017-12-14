package Game;

import java.awt.EventQueue;
import Game.GameParent;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainMenuPanel extends javax.swing.JFrame {
    
    public static MainMenuPanel mm;
    JLabel picture;
    protected String path = "angklung.jpg";
    public MainMenuPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        titleLable = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        chooseLvLable = new javax.swing.JLabel();
        easyBtn = new javax.swing.JButton();
        mediumBtn = new javax.swing.JButton();
        imageCombo = new javax.swing.JComboBox<>();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        titleLable.setForeground(new java.awt.Color(255, 255, 255));
        titleLable.setText("Sliding Puzzle Games");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleLable)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(titleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        chooseLvLable.setBackground(new java.awt.Color(255, 255, 255));
        chooseLvLable.setForeground(new java.awt.Color(255, 255, 255));
        chooseLvLable.setText("Tingkat Kesulitan");

        easyBtn.setText("Mudah");
        easyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyBtnActionPerformed(evt);
            }
        });

        mediumBtn.setText("Susah");
        mediumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumBtnActionPerformed(evt);
            }
        });

        imageCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "angklung", "egrang", "kaleci", "lodong", "panggal"}));
        imageCombo.setSelectedIndex(0);
        imageCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageComboActionPerformed(evt);
            }
        });

        icon.setForeground(new java.awt.Color(255, 255, 255));
        icon.setMaximumSize(new java.awt.Dimension(100, 100));
        icon.setMinimumSize(new java.awt.Dimension(100, 100));
        icon.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mediumBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(easyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(chooseLvLable)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(chooseLvLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(easyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mediumBtn)
                .addGap(18, 18, 18)
                .addComponent(imageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void easyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyBtnActionPerformed
        this.dispose();
        EventQueue.invokeLater(() -> {
            System.out.println("Easy btn : " + this.path);
            GameEasy puzzle = new GameEasy(this.path);
            puzzle.setVisible(true);
            System.out.println("Easy object : " + puzzle.path);
        });        
    }//GEN-LAST:event_easyBtnActionPerformed
    private void mediumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumBtnActionPerformed
        this.dispose();
        EventQueue.invokeLater(() -> {
            GameMedium puzzle = new GameMedium(this.path);
            puzzle.setVisible(true);
        });
    }//GEN-LAST:event_mediumBtnActionPerformed

    private void imageComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageComboActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        String imageName = (String)cb.getSelectedItem();
        this.path = imageName + ".jpg";
        updateLabel(this.path);
    }//GEN-LAST:event_imageComboActionPerformed
   
    protected void updateLabel(String name) {
        System.out.println("Image icon : " + name);
        try {
            ImageIcon icon = createImageIcon("image/resize/" + name);
            this.icon.setIcon(icon);
            this.icon.setToolTipText("Image of " + name.toLowerCase());
            if(icon != null) {
                this.icon.setText(null);
            } else {
                this.icon.setText("Image not found");
            }
        } catch(Exception e) {
            System.out.println("Cannot set icon");
        }
    }
    
    protected static ImageIcon createImageIcon(String path) {
        URL imageURL = MainMenuPanel.class.getResource(path);
        if(imageURL != null) {
            return new ImageIcon(imageURL);
        } else {
            System.err.println("Couldn't find file : " + path);
            return null;
        }
    }
            
    public static void main(String args[]) {
        if(mm == null) {
            mm = new MainMenuPanel();
            mm.setVisible(true);
            ComboBoxDemo cb = new ComboBoxDemo();
            return;
        } else {
            mm.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseLvLable;
    private javax.swing.JButton easyBtn;
    private javax.swing.JLabel icon;
    private javax.swing.JComboBox<String> imageCombo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mediumBtn;
    private javax.swing.JLabel titleLable;
    // End of variables declaration//GEN-END:variables
}
