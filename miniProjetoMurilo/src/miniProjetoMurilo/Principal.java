package miniProjetoMurilo;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Principal {
	
	public static void display(ArrayList<Object> languages) {

	    System.out.print("ArrayList: ");
	    for(Object language : languages) {
	      System.out.print(language + ", ");
	    }
	  }
	
	  public static void main(String[] args) {
		  
		  MyFrame frame = new MyFrame();

	    /*ArrayList<Object> armazem = new ArrayList<>();
	    
	    Tangivel mate1 = new Tangivel();
	    mate1.setNome("Rebeca ");
	    mate1.setAnotacoes("do mau");
	    mate1.setValor(666);
	    armazem.add(mate1.getNome());
	    armazem.add("Python");
	    armazem.add("JavaScript");

	    display(armazem);
	    
	    if (armazem.size() <= armazem.size() +1)
	    {   
	    Tangivel user = new Tangivel();
	    System.out.println("Please enter a name");
	    JTextField text = new JTextField();
	    text.setText(null);;
	    user.setNome(text.getText());
	    // add this user to the list
	    armazem.add(user);
	    }*/

	  }
		
		
		
		
		
		/*JFrame janela = new JFrame();
		
		janela.setSize(300,200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			
		janela.setVisible(true);
*/
	}
