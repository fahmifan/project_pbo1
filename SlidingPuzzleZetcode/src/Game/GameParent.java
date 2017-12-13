/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fahmi-irfan
 */
public class GameParent extends javax.swing.JFrame {
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel easyLable;
    private javax.swing.JButton hide;
    protected javax.swing.JLabel hintImage;
    private javax.swing.JPanel leftMenu;
    private javax.swing.JPanel puzzlePanel;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables

    protected BufferedImage source;
    protected ArrayList<MyButton> buttons;
    protected Image image;
    protected MyButton lastButton;
    protected int width, height;
    protected final int DESIRED_WIDTH = 300;
    protected BufferedImage resized;
    protected int grid;
    public String path;

    ArrayList<Point> solution = new ArrayList();
        
    public GameParent(int grid, String path) {
        this.grid = grid;
        this.path = path;
        initComponents();
        initUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftMenu = new javax.swing.JPanel();
        easyLable = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        hintImage = new javax.swing.JLabel();
        hide = new javax.swing.JButton();
        show = new javax.swing.JButton();
        puzzlePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(410, 310));
        setPreferredSize(new java.awt.Dimension(400, 310));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 311));

        leftMenu.setBackground(new java.awt.Color(0, 102, 204));
        leftMenu.setPreferredSize(new java.awt.Dimension(100, 210));

        easyLable.setForeground(new java.awt.Color(255, 255, 255));
        easyLable.setText("Hint");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        hintImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/image/resize/" + this.path))); // NOI18N

        hide.setText("Hide");
        hide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hideActionPerformed(evt);
            }
        });

        show.setText("Show");
        show.setAlignmentY(0.0F);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftMenuLayout = new javax.swing.GroupLayout(leftMenu);
        leftMenu.setLayout(leftMenuLayout);
        leftMenuLayout.setHorizontalGroup(
            leftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(easyLable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(hintImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(leftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        leftMenuLayout.setVerticalGroup(
            leftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(easyLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hintImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(hide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(19, 19, 19))
        );

        puzzlePanel.setAlignmentX(0.0F);
        puzzlePanel.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout puzzlePanelLayout = new javax.swing.GroupLayout(puzzlePanel);
        puzzlePanel.setLayout(puzzlePanelLayout);
        puzzlePanelLayout.setHorizontalGroup(
            puzzlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );
        puzzlePanelLayout.setVerticalGroup(
            puzzlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(puzzlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
            .addComponent(puzzlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        if(MainMenuPanel.mm == null) {
            MainMenuPanel mm = new MainMenuPanel();
            mm.setVisible(true);
        } else {
            MainMenuPanel.mm.setVisible(true);
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void hideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hideActionPerformed
        hintImage.setVisible(false);
    }//GEN-LAST:event_hideActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        hintImage.setVisible(true);
    }//GEN-LAST:event_showActionPerformed

    public void setGrid(int grid) {
        this.grid = grid;
    }
    public int getGrid() {
        return this.grid;
    }
    
//    This will get string path of image and return it to use in source and hint image
    protected String getStringPath(String string) {
//        Combobox goes here
        return "a path";
    }
    
    protected void gameSolution() {
        for(int i = 0; i < this.grid; i++) {
            for(int j = 0; j < this.grid; j ++) {
                solution.add(new Point(i,j));
            }
        }
    }
    protected void initUI() {
        gameSolution();
        
        buttons = new ArrayList();

        puzzlePanel.setBorder(BorderFactory.createLineBorder(Color.gray));
        int rows = getGrid();
        int cols = getGrid();
        puzzlePanel.setLayout( new GridLayout(this.grid,this.grid,0,0) );

        try {
            source = loadImage();
            int h = getNewHeight(source.getWidth(), source.getHeight());
            
            // Resize image into game canvas size
            resized = resizeImage(source, DESIRED_WIDTH, h,
                    BufferedImage.TYPE_INT_ARGB);

        } catch (IOException ex) {
            Logger.getLogger(GamePuzzle.class.getName()).log(
                    Level.SEVERE, null, ex);
        }

        width = resized.getWidth(null);
        height = resized.getHeight(null);

        add(puzzlePanel, BorderLayout.CENTER);

        for (int i = 0; i < this.grid; i++) {
            
            for (int j = 0; j < this.grid; j++) {

                image = createImage(new FilteredImageSource(resized.getSource(),
                        new CropImageFilter(j * width / this.grid, i * height / this.grid,
                                width / this.grid, height / this.grid)));
                MyButton button = new MyButton(image);
                button.putClientProperty("position", new Point(i, j));

                if (i == (this.grid-1) && j == (this.grid-1)) {
                    lastButton = new MyButton();
                    lastButton.setBorderPainted(false);
                    lastButton.setContentAreaFilled(false);
                    lastButton.setLastButton();
                    lastButton.putClientProperty("position", new Point(i, j));
                } else {
                    buttons.add(button);
                }
            }
        }

        Collections.shuffle(buttons);
        buttons.add(lastButton);
        int grids = this.grid*this.grid;
        for (int i = 0; i < grids; i++) {

            MyButton btn = buttons.get(i);
            puzzlePanel.add(btn);
            btn.setBorder(BorderFactory.createLineBorder(Color.gray));
            btn.addActionListener(new ClickAction());
        }

        pack();
        setTitle("Puzzle");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private int getNewHeight(int w, int h) {

        double ratio = DESIRED_WIDTH / (double) w;
        int newHeight = (int) (h * ratio);
        return newHeight;
    }
    
    private BufferedImage loadImage() throws IOException {

        BufferedImage bimg;
//        bimg = ImageIO.read(this.getClass().getResource("image/angklung.jpg"));
        System.out.println("Load image path : " + this.path);
//        bimg = ImageIO.read(this.getClass().getResource("image/" + this.path));
        bimg = ImageIO.read(this.getClass().getResource("image/" + this.path));
        return bimg;
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int width,
        int height, int type) throws IOException {

        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();

        return resizedImage;
    }

    private class ClickAction extends AbstractAction {
        public int grid = GameParent.this.grid;
        @Override
        public void actionPerformed(ActionEvent e) {
            
            checkButton(e);
            checkSolution();
        }

        private void checkButton(ActionEvent e) {

            int lidx = 0;
            for (MyButton button : buttons) {
                if (button.isLastButton()) {
                    lidx = buttons.indexOf(button);
                }
            }
            
            JButton button = (JButton) e.getSource();
            int bidx = buttons.indexOf(button);

            if ((bidx - 1 == lidx) || (bidx + 1 == lidx)
                    || (bidx - (this.grid) == lidx) || (bidx + (this.grid) == lidx)) {
                Collections.swap(buttons, bidx, lidx);
                updateButtons();
            }
        }

        private void updateButtons() {

            puzzlePanel.removeAll();

            for (JComponent btn : buttons) {

                puzzlePanel.add(btn);
            }

            puzzlePanel.validate();
        }
    }
    
    private void checkSolution() {

        ArrayList<Point> current = new ArrayList();

        for (JComponent btn : buttons) {
            current.add((Point) btn.getClientProperty("position"));
        }

        if (compareList(solution, current)) {
            JOptionPane.showMessageDialog(puzzlePanel, "Angklung",
                "Angklung adalah alat musik multitonal (bernada ganda) yang secara tradisional berkembang dalam masyarakat Sunda di Pulau Jawa bagian barat. Alat musik ini dibuat dari bambu, dibunyikan dengan cara digoyangkan (bunyi disebabkan oleh benturan badan pipa bambu) sehingga menghasilkan bunyi yang bergetar dalam susunan nada 2, 3, sampai 4 nada dalam setiap ukuran, baik besar maupun kecil.", JOptionPane.INFORMATION_MESSAGE);            
        }
    }

    public static boolean compareList(List ls1, List ls2) {
        return ls1.toString().contentEquals(ls2.toString());
    }
}
