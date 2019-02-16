package java_swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Implementa herança da classe JFrame
public class HelloSwing extends JFrame{
	//Construtor da Classe
	public HelloSwing() {
		super("Minha Janela");
		
		//Definir dimensão
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Criar objeto JLabel
		//JLabel jLabel = new JLabel("Hello Java's Visual World!");
		JButton botaoNorte = new JButton("North");
		JButton botaoSul = new JButton("South");
		JButton botaoLeste = new JButton("East");
		JButton botaoOeste = new JButton("West");
		JButton botaoCentro = new JButton("Centro");
		

		//Adicionar ao Frame
		add(botaoNorte,BorderLayout.NORTH);
		add(botaoSul,BorderLayout.SOUTH);
		add(botaoLeste,BorderLayout.EAST);
		add(botaoOeste,BorderLayout.WEST);
		add(botaoCentro,BorderLayout.CENTER);
		
		botaoCentro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click Botão Centro!");
				
			}
		});
		
		//Habilitar visibilidade do frame apos inicializar componentes
		setVisible(true);
		System.out.println(botaoNorte.getHeight());
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloSwing();
	}

}
