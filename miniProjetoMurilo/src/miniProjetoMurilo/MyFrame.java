package miniProjetoMurilo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	JTextField text;
	JButton button;
	JButton submit;
	JCheckBox caixota;
	JComboBox caixinha;
	
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		String[] tiposTangiveis = {"Móveis", "Imoveis"};
		caixinha = new JComboBox(tiposTangiveis);
		caixinha.addActionListener(this);
		
		
		text = new JTextField();
		text.setPreferredSize(new Dimension(600,40));
		text.setFont(new Font("Consolas", Font.PLAIN,35));
		text.setForeground(new Color(0x00FF00));
		text.setBackground(Color.black);
		text.setCaretColor(Color.white);
		text.setText("Seu nome, porra");
		
		button = new JButton("Karalho menó");
		button.addActionListener(this);
		
		button = new JButton("Karalho menó");
		button.addActionListener(this);
		
		submit = new JButton("Submeta-se mortal");
		submit.addActionListener(this);
		
		caixota = new JCheckBox();
		caixota.setText("Verdade mesmo? Mentiroso FDP");
		
		this.add(caixinha);
		this.add(button);
		this.add(text);
		this.add(submit);
		this.add(caixota);
		this.pack();
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("bem vindo, seu merda "+ text.getText());
			button.setEnabled(false);
			text.setEditable(false);
		}
		else if(e.getSource()==submit) {
			if(caixota.isSelected()==false){
				System.out.println("Mentiroso dos infernos");
			}
			else if(caixota.isSelected()==true){
				System.out.println("Para de mentir, cuzão");			
			}
			
		}	
		else if(e.getSource()==caixinha) {
			
			
		}
	}
}
