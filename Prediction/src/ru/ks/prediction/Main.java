package ru.ks.prediction;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
	private static Pred p = new Pred();
	
	public static void main(String[] args) {
		Okno okno = new Okno();
		okno.setTitle("Предсказание на день");
		JOptionPane.showMessageDialog(okno, "Нажмите любую кнопку", null, JOptionPane.INFORMATION_MESSAGE);
		okno.setVisible(true);
		okno.setResizable(false);
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setSize(285, 305);
		okno.setLocationRelativeTo(null);
				
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		okno.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Prediction\\Image\\button.jpg"));
		btnNewButton.setBounds(10, 10, 80, 80);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnNewButton){
					p.vars();
				}
			}
		});
				
		JButton button = new JButton("");
		button.setBorder(null);
		button.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Prediction\\Image\\button.jpg"));
		button.setBounds(100, 10, 80, 80);
		panel.add(button);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==button){
					p.vars();
				}	
			}
		});
				
		JButton button_1 = new JButton("");
		button_1.setBorder(null);
		button_1.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Prediction\\Image\\button.jpg"));
		button_1.setBounds(190, 10, 80, 80);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==button_1){
					p.vars();
				}	
			}
		});
				
		JButton button_2 = new JButton("");
		button_2.setBorder(null);
		button_2.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Prediction\\Image\\button.jpg"));
		button_2.setBounds(10, 100, 80, 80);
		panel.add(button_2);
		button_2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==button_2){
					p.vars();
				}
			}
		});
				
		JButton button_3 = new JButton("");
		button_3.setBorder(null);
		button_3.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Prediction\\Image\\button.jpg"));
		button_3.setBounds(100, 100, 80, 80);
		panel.add(button_3);
		button_3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==button_3){
					p.vars();
				}	
			}
		});
				
		JButton button_4 = new JButton("");
		button_4.setBorder(null);
		button_4.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Prediction\\Image\\button.jpg"));
		button_4.setBounds(190, 100, 80, 80);
		panel.add(button_4);
		button_4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==button_4){
					p.vars();
				}	
			}
		});
			
		JButton button_5 = new JButton("");
		button_5.setBorder(null);
		button_5.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Prediction\\Image\\button.jpg"));
		button_5.setBounds(10, 190, 80, 80);
		panel.add(button_5);
		button_5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==button_5){
					p.vars();
				}	
			}
		});
			
		JButton button_6 = new JButton("");
		button_6.setBorder(null);
		button_6.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Prediction\\Image\\button.jpg"));
		button_6.setBounds(100, 190, 80, 80);
		panel.add(button_6);
		button_6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==button_6){
					p.vars();
				}	
			}
		});
				
		JButton button_7 = new JButton("");
		button_7.setBorder(null);
		button_7.setIcon(new ImageIcon("C:\\Users\\User\\workspace\\Prediction\\Image\\button.jpg"));
		button_7.setBounds(190, 190, 80, 80);
		panel.add(button_7);
		button_7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==button_7){
					p.vars();
				}	
			}
		});
	}
}
