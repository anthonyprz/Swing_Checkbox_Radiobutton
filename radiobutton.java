package com.zubiri.combobox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RadioButonJframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButonJframe frame = new RadioButonJframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RadioButonJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		 JRadioButton male = new JRadioButton("male");
		 male.setBounds(154, 10, 59, 23);
	     JRadioButton female = new JRadioButton("Female");
	     female.setBounds(223, 10, 76, 23);
	     ButtonGroup bG = new ButtonGroup();
	     bG.add(male);
	     bG.add(female);
	     contentPane.setLayout(null);
	   //  this.setSize(100,200);
	   //  getContentPane().setLayout( new FlowLayout());
	     getContentPane().add(male);
	     getContentPane().add(female);
	     male.setSelected(true);
	     
	     JButton btnAccion = new JButton("accion");
	     btnAccion.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent e) {
	     		if(male.isSelected()==true)
	     		{
	     		 System.out.println("Seleccionó male");
	     		}
	     		else if (female.isSelected()==true){
	     			System.out.println("seleccionó female");
	     		}
	     	}
	     	
	     	
	     });
	     btnAccion.setBounds(164, 47, 117, 25);
	     contentPane.add(btnAccion);
	     this.setVisible(true);
	   
	    
	}

}
