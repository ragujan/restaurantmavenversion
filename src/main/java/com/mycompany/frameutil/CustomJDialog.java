/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.frameutil;

import com.mycompany.frameutil.MainTheme;
import com.mycompany.frameutil.RoundedPanel;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Acer
 */
public abstract class CustomJDialog extends javax.swing.JDialog {

	/**
	 * Creates new form NewJDialog
	 */
	public CustomJDialog(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		//this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		//this.setVisible(true);
		setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));

		//	jLabel2.setText(message);
		//jLabel2.setForeground(Color.WHITE);
		//jLabel1.setText(title);
		roundedPanel1.setBackground(MainTheme.thirdColor);
		roundedPanel2.setBackground(MainTheme.fourthColor);
		jLabel1.setForeground(MainTheme.secondColor);
		jPanel2.setBackground(MainTheme.secondColor);
	
		//	this.setVisible(true);

	}

	public CustomJDialog(java.awt.Frame parent, String message) {
		this(parent, true);
		
	}

	public abstract void actionConfirmed();

	public abstract void actionCancelled();
	int x = 0;
	int y = 0;

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                roundedPanel1 = new RoundedPanel();
                roundedPanel2 = new RoundedPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setUndecorated(true);

                roundedPanel1.setBackground(new java.awt.Color(153, 153, 153));
                roundedPanel1.setRoundBottomLeft(7);
                roundedPanel1.setRoundBottomRight(7);
                roundedPanel1.setRoundTopLeft(7);
                roundedPanel1.setRoundTopRight(7);

                roundedPanel2.setBackground(new java.awt.Color(51, 51, 51));
                roundedPanel2.setRoundTopLeft(7);
                roundedPanel2.setRoundTopRight(7);
                roundedPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                        public void mouseDragged(java.awt.event.MouseEvent evt) {
                                roundedPanel2MouseDragged(evt);
                        }
                });
                roundedPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                roundedPanel2MousePressed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("RAG");
                jLabel1.setToolTipText("");

                javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
                roundedPanel2.setLayout(roundedPanel2Layout);
                roundedPanel2Layout.setHorizontalGroup(
                        roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                roundedPanel2Layout.setVerticalGroup(
                        roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundedPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 829, Short.MAX_VALUE)
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 307, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
                roundedPanel1.setLayout(roundedPanel1Layout);
                roundedPanel1Layout.setHorizontalGroup(
                        roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(roundedPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                roundedPanel1Layout.setVerticalGroup(
                        roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundedPanel1Layout.createSequentialGroup()
                                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void roundedPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel2MouseDragged
		// TODO add your handling code here:
		int xx = evt.getXOnScreen();
		int yy = evt.getYOnScreen();
		this.setLocation(xx - x, yy - y);
        }//GEN-LAST:event_roundedPanel2MouseDragged

        private void roundedPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel2MousePressed
		// TODO add your handling code here:
		x = evt.getX();
		y = evt.getY();
        }//GEN-LAST:event_roundedPanel2MousePressed

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
			java.util.logging.Logger.getLogger(CustomJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CustomJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CustomJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CustomJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				CustomJDialog dialog = new CustomJDialog(new javax.swing.JFrame(), true) {
					@Override
					public void actionConfirmed() {
					}

					@Override
					public void actionCancelled() {
					}
				};
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel2;
        private RoundedPanel roundedPanel1;
        private RoundedPanel roundedPanel2;
        // End of variables declaration//GEN-END:variables
}
