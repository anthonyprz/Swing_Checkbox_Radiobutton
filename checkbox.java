package com.zubiri.combobox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SeckBoxJframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeckBoxJframe frame = new SeckBoxJframe();
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
	public SeckBoxJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxUno = new JCheckBox("uno");
		chckbxUno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("el boton uno es el seleccionado");
			}
		});
		chckbxUno.setBounds(75, 65, 63, 23);
		contentPane.add(chckbxUno);
		
		JCheckBox chckbxDos = new JCheckBox("dos");
		chckbxDos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("el boton Dos es el seleccionado");
			}
		});
		chckbxDos.setBounds(75, 101, 63, 29);
		contentPane.add(chckbxDos);
		
		JButton btnSeleccion = new JButton("seleccion");
		btnSeleccion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxUno.isSelected()==true){
					System.out.println("el boton uno es el seleccionado");
				}
				else if(chckbxDos.isSelected()==true){
					System.out.println("el boton Dos es el seleccionado");
				}
				//else if((chckbxDos.isSelected()==true) && (chckbxDos.isSelected()==true)){
			//		System.out.println("los dos botones han sido seleccionados");
				//}
			}
		});
		btnSeleccion.setBounds(245, 85, 117, 25);
		contentPane.add(btnSeleccion);
	}

}
