/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.components;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author Acer
 */
public class slidePanel extends javax.swing.JPanel {

	/**
	 * Creates new form slidePanel
	 */
	public int getAnimate() {
		return animate;
	}

	public void setAnimate(int animate) {
		this.animate = animate;
	}

	public slidePanel() {
		initComponents();
		list = new ArrayList<>();
		timer = new Timer(0, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				animate();
			}
		});

	}

	private final List<Component> list;
	private final Timer timer;
	private Component comExit;
	private Component comShow;
	private int currentShowing;
	private boolean animateRight;
	private int animate = 1;

	public void init(Component... com) {
		if (com.length > 0) {
			for (Component c : com) {
				list.add(c);
				c.setSize(getSize());
				c.setVisible(false);
				this.add(c);
			}
			//  get first componect to show on panel when init
			Component show = list.get(0);
			show.setVisible(true);
			show.setLocation(0, 0);
		}
	}

	public void show(int index) {
		if (!timer.isRunning()) {
			if (list.size() > 2 && index < list.size() && index != currentShowing) {
				comShow = list.get(index);
				comExit = list.get(currentShowing);
				animateRight = index < currentShowing;
				currentShowing = index;
				comShow.setVisible(true);
				if (animateRight) {
					comShow.setLocation(0, -getHeight());
				} else {
					comShow.setLocation(0, getHeight());
				}
				timer.start();
			}
		}
	}

	private void animate() {
		if (animateRight) {
			if (comShow.getLocation().y < 0) {
				comShow.setLocation(0, comShow.getLocation().y + animate);
				comExit.setLocation(0, comExit.getLocation().y + animate);
			} else {
				//  Stop animate
				comShow.setLocation(0, 0);
				timer.stop();
				comExit.setVisible(false);
			}
		} else {
			if (comShow.getLocation().y > 0) {
				comShow.setLocation(0, comShow.getLocation().y - animate);
				comExit.setLocation(0, comExit.getLocation().y - animate);
			} else {
				comShow.setLocation(0, 0);
				timer.stop();
				comExit.setVisible(false);
			}
		}
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                );
        }// </editor-fold>//GEN-END:initComponents


        // Variables declaration - do not modify//GEN-BEGIN:variables
        // End of variables declaration//GEN-END:variables
}
