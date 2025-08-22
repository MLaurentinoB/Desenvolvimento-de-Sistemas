
	package view;

	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;

	public class FormularioAluno extends JFrame{
		private JLabel lbNomeSistema;
		private JLabel lbNome;
		private JTextField txNome;
		private JButton btExibir;
		private JLabel lbDisciplina;
		private JTextField txDisciplina;
		private JLabel lbNota1;
		private JTextField txNota1;
		private JLabel lbNota2;
		private JTextField txNota2;
		private JLabel lbNota3;
		private JTextField txNota3;
		private JLabel lbNota4;
		private JTextField txNota4;

		
		public FormularioAluno() {
			
			setTitle("media notas");
			setSize(500,450); //largura altura
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			setLayout(null); //sem gerenciador de layout
			getContentPane().setBackground(Color.GRAY);
			
			lbNomeSistema = new JLabel();
			lbNomeSistema.setText("Sistema de media de notas");
			lbNomeSistema.setBounds(150,50,200,30);//x y w h
			add(lbNomeSistema);
			
			lbNome = new JLabel();
			lbNome.setText("Nome");
			lbNome.setBounds(50,100,100,30);//x y w h
			add(lbNome);
			
			txNome = new JTextField();
			txNome.setBounds(130,100,150,30);		
			add(txNome);
			//disciplina
			lbDisciplina = new JLabel();
			lbDisciplina.setText("Disciplina");
			lbNome.setBounds(50,100,100,30);//x y w h
			add(lbNome);
			
			txDisciplina = new JTextField();
			txDisciplina.setBounds(130,100,150,30);		
			add(txDisciplina);
			// notas
			lbNota1 = new JLabel();
			lbNota1.setText("nota 1");
			lbNota1.setBounds(50,150,100,30);//x y w h
			add(lbNota1);
			
			txNota1 = new JTextField();
			txNota1.setBounds(130,150,150,30);		
			add(txNota1);
			
			lbNota2 = new JLabel();
			lbNota2.setText("nota 2");
			lbNota2.setBounds(50,200,100,30);//x y w h
			add(lbNota2);
			
			txNota2 = new JTextField();
			txNota2.setBounds(130,200,150,30);		
			add(txNota2);
			
			lbNota3 = new JLabel();
			lbNota3.setText("nota 3");
			lbNota3.setBounds(50,250,100,30);//x y w h
			add(lbNota3);
			
			txNota3 = new JTextField();
			txNota3.setBounds(130,250,150,30);		
			add(txNota3);
			
			lbNota4 = new JLabel();
			lbNota4.setText("nota 4");
			lbNota4.setBounds(50,300,100,30);//x y w h
			add(lbNota4);
			
			txNota4 = new JTextField();
			txNota4.setBounds(130,300,150,30);		
			add(txNota4);
			btExibir = new JButton();
			btExibir.setText("Exibir Dados");
			btExibir.setBounds(130,350,120,30);
			btExibir.setForeground(Color.WHITE); //cor do texto
			btExibir.setBackground(Color.BLACK); //cor do fundo do botão
			//Adicionar Evento
			btExibir.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String nome = txNome.getText();
					String disciplina = txDisciplina.getText();
					double nota1 = Double.parseDouble(txNota1.getText());
					double nota2 = Double.parseDouble(txNota2.getText());
					double nota3 = Double.parseDouble(txNota3.getText());
					double nota4 = Double.parseDouble(txNota4.getText());
					double media = (nota1+nota2+nota3+nota4)/4;
					JOptionPane.showMessageDialog(null,
							"\nNome: "+ nome+ 
							"\nDisciplina: "+ disciplina+
							"\nMédia: "+ media
							
							);
					
					//int x = Integer.parseInt(txNome.getText());
					//double y = Double.parseDouble(txNome.getText());				
				}
			});		
					
			add(btExibir);		
			
			setVisible(true);//ÚLTIMA LINHA DO CONSTRUTOR
		}	
	}

