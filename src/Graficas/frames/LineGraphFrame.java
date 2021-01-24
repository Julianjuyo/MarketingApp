package Graficas.frames;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import Graficas.main.Graph;

public class LineGraphFrame extends javax.swing.JFrame 
{
    boolean isSaved; 
    String currentSavePath;
    Color backColor;
    Color lineColor;
    DefaultListModel<Integer> modelListX = new DefaultListModel<Integer>();
    DefaultListModel<Integer> modelListY = new DefaultListModel<Integer>();
    
    public LineGraphFrame() 
    {
        initComponents();
        backColor = Color.GRAY;
        lineColor = Color.BLACK;
        isSaved = false;
        currentSavePath = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        xList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        yList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addXButton = new javax.swing.JButton();
        addYButton = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();
        widthBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        heightBox = new javax.swing.JTextField();
        removeXButton = new javax.swing.JButton();
        removeYButton = new javax.swing.JButton();
        backColorButton = new javax.swing.JButton();
        lineColorButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graphics98 - Line Graph Editor");

        xList.setModel(modelListX);
        xList.addListSelectionListener(new ListSelectionListener() 
            {

                @Override
                public void valueChanged(ListSelectionEvent arg0) 
                {
                    if (!arg0.getValueIsAdjusting())
                    {
                        removeXButton.setEnabled(true);
                    }
                }
            });
            add(xList);

            setVisible(true);
            jScrollPane2.setViewportView(xList);

            yList.setModel(modelListY);
            yList.addListSelectionListener(new ListSelectionListener() 
                {

                    @Override
                    public void valueChanged(ListSelectionEvent arg0) 
                    {
                        if (!arg0.getValueIsAdjusting())
                        {
                            removeYButton.setEnabled(true);
                        }
                    }
                });
                add(yList);

                setVisible(true);
                jScrollPane1.setViewportView(yList);

                jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
                jLabel1.setText("X");

                jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
                jLabel2.setText("Y");

                addXButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                addXButton.setText("Add");
                addXButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        addXButtonActionPerformed(evt);
                    }
                });

                addYButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                addYButton.setText("Add");
                addYButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        addYButtonActionPerformed(evt);
                    }
                });

                generateButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
                generateButton.setText("Generate");
                generateButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        generateButtonActionPerformed(evt);
                    }
                });

                widthBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                widthBox.setText("10");

                jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
                jLabel3.setText("Width");

                jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
                jLabel4.setText("Height");

                heightBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                heightBox.setText("10");

                removeXButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                removeXButton.setText("Remove");
                removeXButton.setEnabled(false);
                removeXButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        removeXButtonActionPerformed(evt);
                    }
                });

                removeYButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                removeYButton.setText("Remove");
                removeYButton.setEnabled(false);
                removeYButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        removeYButtonActionPerformed(evt);
                    }
                });

                backColorButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                backColorButton.setText("<html> Edit background color </html>");
                backColorButton.setBackground(Color.GRAY);
                backColorButton.setForeground(Color.WHITE);
                backColorButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        backColorButtonActionPerformed(evt);
                    }
                });

                lineColorButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                lineColorButton.setText("Edit line color");
                lineColorButton.setBackground(Color.BLACK);
                lineColorButton.setForeground(Color.WHITE);
                lineColorButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        lineColorButtonActionPerformed(evt);
                    }
                });

                cancelButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                cancelButton.setText("Back");
                cancelButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cancelButtonActionPerformed(evt);
                    }
                });

                jMenu1.setText("File");

                openMenuItem.setText("Open");
                openMenuItem.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        openMenuItemActionPerformed(evt);
                    }
                });
                jMenu1.add(openMenuItem);

                saveMenuItem.setText("Save");
                saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        saveMenuItemActionPerformed(evt);
                    }
                });
                jMenu1.add(saveMenuItem);

                saveAsMenuItem.setText("Save as");
                saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        saveAsMenuItemActionPerformed(evt);
                    }
                });
                jMenu1.add(saveAsMenuItem);

                jMenuBar1.add(jMenu1);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addXButton))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addYButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(heightBox)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(widthBox, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addComponent(jLabel4))
                                            .addGap(18, 18, 18)
                                            .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lineColorButton)
                                                .addComponent(backColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(removeXButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(removeYButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addXButton)
                                    .addComponent(addYButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(removeYButton)
                                    .addComponent(removeXButton)
                                    .addComponent(cancelButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(widthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(heightBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lineColorButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        LineGraphViewFrame lineView = new LineGraphViewFrame(Integer.parseInt(widthBox.getText()) * 10, Integer.parseInt(heightBox.getText()) * 10, convertListToArray(modelListY), convertListToArray(modelListX), backColor, lineColor);
    }//GEN-LAST:event_generateButtonActionPerformed

    private void addXButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addXButtonActionPerformed
        try
        {
            int x = Integer.parseInt(JOptionPane.showInputDialog("X:"));
            modelListX.addElement(x);
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }//GEN-LAST:event_addXButtonActionPerformed

    private void addYButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYButtonActionPerformed
        try
        {
            int y = Integer.parseInt(JOptionPane.showInputDialog("Y:"));
            modelListY.addElement(y);
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }//GEN-LAST:event_addYButtonActionPerformed

    private void removeXButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeXButtonActionPerformed
        if(xList.getSelectedValue() != null)
        {
            modelListX.removeElementAt(xList.getSelectedIndex());
        }
    }//GEN-LAST:event_removeXButtonActionPerformed

    private void removeYButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeYButtonActionPerformed
        if(yList.getSelectedValue() != null)
        {
            modelListY.removeElementAt(yList.getSelectedIndex());
        }
    }//GEN-LAST:event_removeYButtonActionPerformed

    private void backColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backColorButtonActionPerformed
        try
        {
            JColorChooser colorChooser = new JColorChooser();
        
            backColor = colorChooser.showDialog(null, "Choose a color", backColor);
            backColorButton.setBackground(backColor);
            System.out.println(toHex(backColor));
        }
        catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_backColorButtonActionPerformed

    private void lineColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineColorButtonActionPerformed
        try
        {
            JColorChooser colorChooser = new JColorChooser();
        
            lineColor = colorChooser.showDialog(null, "Choose a color", lineColor);
            lineColorButton.setBackground(lineColor);
            System.out.println(toHex(lineColor));
        }
        catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_lineColorButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        MainFrame mainFrame = new MainFrame();
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        try 
        {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.gph98", "gph98");
            fileChooser.addChoosableFileFilter(filter);
            fileChooser.setFileFilter(filter);
            fileChooser.showSaveDialog(this);
            
            Graph graph = new Graph(Graph.LINE_GRAPH_MODE, Integer.parseInt(widthBox.getText()), Integer.parseInt(heightBox.getText()), backColor, lineColor, modelListX, modelListY);
            
            currentSavePath = fileChooser.getSelectedFile().getAbsolutePath() + ".gph98";
            
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File(currentSavePath)));
            os.writeObject(graph);
            os.close();
            isSaved = true;
        } 
        catch (Exception ex) 
        {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        try 
        {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.gph98", "gph98");
            fileChooser.setFileFilter(filter);
            
            fileChooser.showOpenDialog(this);

            Graph graph = null;
            
            currentSavePath = fileChooser.getSelectedFile().getAbsolutePath();
            
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(currentSavePath));
            graph = (Graph) os.readObject();
            os.close();
            setUpFile(graph);
            isSaved = true;
        } 
        catch (Exception ex) 
        {
            System.err.println("Error, " + ex);
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        if(isSaved)
        {
            try 
            {
                Graph graph = new Graph(Graph.LINE_GRAPH_MODE, Integer.parseInt(widthBox.getText()), Integer.parseInt(heightBox.getText()), backColor, lineColor, modelListX, modelListY);

                ObjectOutputStream os;
                os = new ObjectOutputStream(new FileOutputStream(new File(currentSavePath)));
                os.writeObject(graph);
                os.close();
            } 
            catch (Exception ex) 
            {
                System.err.println("Error, " + ex);
            }
            
        }
        else
        {
            try 
            {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.gph98", "gph98");
                fileChooser.addChoosableFileFilter(filter);
                fileChooser.setFileFilter(filter);
                fileChooser.showSaveDialog(this);

                Graph graph = new Graph(Graph.LINE_GRAPH_MODE, Integer.parseInt(widthBox.getText()), Integer.parseInt(heightBox.getText()), backColor, lineColor, modelListX, modelListY);

                currentSavePath = fileChooser.getSelectedFile().getAbsolutePath() + ".gph98";
                
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File(currentSavePath)));
                os.writeObject(graph);
                os.close();
                isSaved = true;
            } 
            catch (Exception ex) 
            {
                System.err.println("Error, " + ex);
            }
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void setUpFile(Graph graph)
    {
        if(graph.getMode() == Graph.LINE_GRAPH_MODE)
        {    
            widthBox.setText(String.valueOf(graph.getWidth()));
            heightBox.setText(String.valueOf(graph.getHeight()));
            
            modelListX = graph.getxList();
            modelListY = graph.getyList();
            
            xList.setModel(modelListX);
            yList.setModel(modelListY);
            
            backColor = graph.getBackColor();
            lineColor = graph.getLineColor();
            
            backColorButton.setBackground(backColor);
            lineColorButton.setBackground(lineColor);
        }
        else
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "Error file not suported in this editor try in the 'LineGraphEditor'");
        }
    }
    
    private int[] convertListToArray(DefaultListModel<Integer> model)
    {
        int[] array = new int[model.getSize()];
        
        for(int i = 0; i < model.getSize(); i++)
        {
            array[i] = model.getElementAt(i);
        }
        
        return array;
    }
    
    private String toHex(Color color)
    {
        String hex = Integer.toHexString(color.getRGB() & 0xffffff);
        if (hex.length() < 6)
        {
            hex = "0" + hex;
        }
        hex = "#" + hex;
        return hex;
    } 
    
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(LineGraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LineGraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LineGraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LineGraphFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LineGraphFrame();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addXButton;
    private javax.swing.JButton addYButton;
    private javax.swing.JButton backColorButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField heightBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lineColorButton;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JButton removeXButton;
    private javax.swing.JButton removeYButton;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextField widthBox;
    private javax.swing.JList<Integer> xList;
    private javax.swing.JList<Integer> yList;
    // End of variables declaration//GEN-END:variables
}
