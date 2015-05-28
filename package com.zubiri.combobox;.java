package com.zubiri.combobox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class comboboxJframe extends JFrame {

	private JPanel contentPane;
	 String opciones[] = { "A", "B", "C", "D","E", "F", "G", "H","I", "J" };
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comboboxJframe frame = new comboboxJframe();
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
	public comboboxJframe() {
		super("combobox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		setContentPane(contentPane);
		 contentPane.setLayout(null);
		
		 JComboBox comboBox1 = new JComboBox(opciones);
		 comboBox1.setBounds(98, 12, 293, 24);
		 comboBox1.setMaximumRowCount(5);
		 contentPane.add(comboBox1);
		  
		    JButton btnAceptar = new JButton("aceptar");
		    btnAceptar.addMouseListener(new MouseAdapter() {
		    	@Override
		    	public void mouseClicked(MouseEvent e) {
		    		String seleccion = (String) comboBox1.getSelectedItem();
		    		System.out.println(seleccion);
		    	}
		    });
		    btnAceptar.setBounds(83, 187, 111, 25);
		    contentPane.add(btnAceptar);
		    
			
		    
		    JButton btnCancelar = new JButton("cancelar");
		    btnCancelar.addMouseListener(new MouseAdapter() {
		    	@Override
		    	public void mouseClicked(MouseEvent e) {
		    		String seleccion = (String) comboBox1.getSelectedItem();
		    		System.out.println("abortado");
		    	}
		    });
		    btnCancelar.setBounds(258, 187, 117, 25);
		    contentPane.add(btnCancelar);
	}
	
	
}
