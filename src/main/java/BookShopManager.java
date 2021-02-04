
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class BookShopManager extends javax.swing.JFrame {

    private int updateRowNumber;
    
    public BookShopManager() throws FileNotFoundException, IOException {
        initComponents();
        setTableHeaderBold();
        setBackground();
        setComboBox();
        setTableFromFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookInformationTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bookId = new javax.swing.JTextField();
        bookName = new javax.swing.JTextField();
        bookPrice = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        availabilityComboBox = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        bookWriter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Shop Manager");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book Shop Manager");

        bookInformationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Book Writer", "Availability", "Price/Book", "Entry Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookInformationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookInformationTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookInformationTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Add New Book");

        bookId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookId.setText("New Book ID");
        bookId.setToolTipText("Book ID");
        bookId.setName(""); // NOI18N
        bookId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookIdMouseClicked(evt);
            }
        });
        bookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdActionPerformed(evt);
            }
        });

        bookName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookName.setText("Book Name");
        bookName.setToolTipText("Book Name");
        bookName.setName(""); // NOI18N
        bookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameActionPerformed(evt);
            }
        });

        bookPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookPrice.setText("Price/Book");
        bookPrice.setToolTipText("Price Per Book");
        bookPrice.setName(""); // NOI18N
        bookPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookPriceActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitButton.setText("Submit New Book Info");
        submitButton.setToolTipText("Click Here To Submit ");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateButton.setText("Update Edited Info");
        updateButton.setToolTipText("Update Information");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        availabilityComboBox.setToolTipText("Available/Not Available");
        availabilityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityComboBoxActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setText("Delete Selected Info");
        deleteButton.setToolTipText("Delete Information");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        bookWriter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookWriter.setText("Book Writer");
        bookWriter.setToolTipText("Book Writer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bookId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(bookPrice)
                            .addComponent(bookWriter))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(availabilityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateButton)
                        .addGap(253, 253, 253)
                        .addComponent(deleteButton)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(bookId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bookWriter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(availabilityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       try {
            FileManager fileReadWrite = new FileManager();
            ArrayList<Books> allDetails = fileReadWrite.read();
            
            Books book = new Books();
            CurrentDateTime date = new CurrentDateTime();
            

            String id = bookId.getText().toString();
            book.setId(id);
            String name = bookName.getText().toString();  
            book.setName(name);
            String writer = bookWriter.getText().toString(); 
            book.setWriter(writer);
            String price = bookPrice.getText().toString();
            book.setPrice(price);
            String availability = availabilityComboBox.getSelectedItem().toString();
            book.setAvilability(availability);
            book.setDateTime(date.getDate()+" "+date.getTime());
            
            allDetails.set(updateRowNumber,book);
            
            int idx = 0;
            
            for(Books books : allDetails)
                fileReadWrite.update(books,idx++);
            
            DefaultTableModel model = (DefaultTableModel) bookInformationTable.getModel();
            model.setRowCount(0);
            setTableFromFile();
            JOptionPane.showMessageDialog(null, "Information Updated Successfully!!", "Confirmation Message", 1);
            resetAllInputBox();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookShopManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BookShopManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        Books book = new Books();
        CurrentDateTime date = new CurrentDateTime();

        String id = bookId.getText().toString();
        book.setId(id);
        String name = bookName.getText().toString();  
        book.setName(name);
        String writer = bookWriter.getText().toString(); 
        book.setWriter(writer);
        String price = bookPrice.getText().toString();
        book.setAvilability(price);
        String availability = availabilityComboBox.getSelectedItem().toString();
        book.setPrice(availability);
        book.setDateTime(date.getDate()+" "+date.getTime());

        FileManager fileReadWrite = new FileManager();

        try {
            fileReadWrite.write(book);
        } catch (IOException ex) {
            Logger.getLogger(BookShopManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            DefaultTableModel model = (DefaultTableModel) bookInformationTable.getModel();
            model.setRowCount(0);
            setTableFromFile();
            JOptionPane.showMessageDialog(null, "Information Successfully Added To The List!!", "Confirmation Message", 1);
            resetAllInputBox();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookShopManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_submitButtonActionPerformed

    private void bookIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdMouseClicked

    private void bookPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookPriceActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            FileManager fileReadWrite = new FileManager();
            ArrayList<Books> allDetails = fileReadWrite.read();
            int deleteRowNumber = bookInformationTable.getSelectedRow();
            
            System.out.println(deleteRowNumber);
            allDetails.remove(deleteRowNumber);
            System.out.println(allDetails.size());
            
            int idx = 0;
            if(!allDetails.isEmpty()){  
                for(Books book : allDetails)
                    fileReadWrite.update(book,idx++);
            }
            else{
                fileReadWrite.update(null,-1);
            }
            
            DefaultTableModel model = (DefaultTableModel) bookInformationTable.getModel();
            model.setRowCount(0);
            setTableFromFile();
            JOptionPane.showMessageDialog(null, "Information Deleted Successfully!!", "Confirmation Message", 1);
            resetAllInputBox();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookShopManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BookShopManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void bookInformationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookInformationTableMouseClicked
        
        updateRowNumber = bookInformationTable.getSelectedRow();
            
        DefaultTableModel model = (DefaultTableModel) bookInformationTable.getModel();
          
        bookId.setText((String) model.getValueAt(updateRowNumber, 0));
        bookName.setText((String) model.getValueAt(updateRowNumber, 1));
        bookWriter.setText((String) model.getValueAt(updateRowNumber, 2));
        bookPrice.setText((String) model.getValueAt(updateRowNumber, 3));
        availabilityComboBox.setSelectedItem(model.getValueAt(updateRowNumber, 4).toString());
    }//GEN-LAST:event_bookInformationTableMouseClicked

    private void bookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdActionPerformed

    private void availabilityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availabilityComboBoxActionPerformed

    private void bookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameActionPerformed

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
            java.util.logging.Logger.getLogger(BookShopManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookShopManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookShopManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookShopManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BookShopManager().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(BookShopManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> availabilityComboBox;
    private javax.swing.JTextField bookId;
    private javax.swing.JTable bookInformationTable;
    private javax.swing.JTextField bookName;
    private javax.swing.JTextField bookPrice;
    private javax.swing.JTextField bookWriter;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void setComboBox() {
        availabilityComboBox.setModel(new DefaultComboBoxModel(BookAvailability.values()));
    }

    private void setTableFromFile() throws FileNotFoundException {
        FileManager fileReadWrite = new FileManager();
        ArrayList<Books> allDetails = fileReadWrite.read();
        DefaultTableModel model = (DefaultTableModel) bookInformationTable.getModel();

        for (Books book : allDetails) {
            model.addRow(new Object[]{
                book.getId(),
                book.getName(),
                book.getWriter(),
                book.getAvilability(),
                book.getPrice(),
                book.getDateTime()
            });
        }
    }

    private void resetAllInputBox() {
        bookId.setText("Book Id");
        bookName.setText("Book Name");
        bookWriter.setText("Book Writer");
        bookPrice.setText("Price");
        setComboBox();
    }

    private void setTableHeaderBold() {
       bookInformationTable.getTableHeader().setFont(new Font(bookInformationTable.getFont().toString(), Font.BOLD, 12));
    }

    private void setBackground() throws IOException {
    }
}
