package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Color;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(0, 128, 255));
		frmCalculadora.getContentPane().setForeground(new Color(255, 0, 0));
		frmCalculadora.getContentPane().setFont(new Font("Arial", Font.BOLD, 20));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 385, 500);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(202, 171, 0, 0);
		frmCalculadora.getContentPane().add(scrollPane);

		txtField = new JTextField();
		txtField.setForeground(new Color(255, 255, 255));
		txtField.setBackground(new Color(0, 0, 0));
		txtField.setFont(new Font("Arial", Font.BOLD, 18));
		txtField.setBounds(10, 22, 349, 36);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);

		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(255, 255, 255));
		btnC.setForeground(new Color(255, 0, 0));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
				txtField.setText(btnC.getText() + txtField.getText());
			}
		});
		btnC.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnC.setBounds(290, 69, 69, 47);
		frmCalculadora.getContentPane().add(btnC);

		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnsoma.setBackground(new Color(255, 255, 255));
		btnsoma.setForeground(new Color(255, 0, 0));
		btnsoma.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnsoma.setBounds(290, 127, 69, 36);
		frmCalculadora.getContentPane().add(btnsoma);

		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnsub.setBackground(new Color(255, 255, 255));
		btnsub.setForeground(new Color(255, 0, 0));
		btnsub.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnsub.setBounds(290, 174, 69, 36);
		frmCalculadora.getContentPane().add(btnsub);

		JButton btnmult = new JButton("x");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "*";
			}

		});
		btnmult.setBackground(new Color(255, 255, 255));
		btnmult.setForeground(new Color(255, 0, 0));
		btnmult.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnmult.setBounds(290, 221, 69, 36);
		frmCalculadora.getContentPane().add(btnmult);

		JButton btndiv = new JButton("÷");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setBackground(new Color(255, 255, 255));
		btndiv.setForeground(new Color(255, 0, 0));
		btndiv.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btndiv.setBounds(290, 268, 69, 36);
		frmCalculadora.getContentPane().add(btndiv);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btn8.getText());
			}
		});
		btn8.setBackground(new Color(255, 255, 255));
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btn8.setBounds(109, 127, 78, 36);
		frmCalculadora.getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btn5.getText());
			}
		});
		btn5.setBackground(new Color(255, 255, 255));
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btn5.setBounds(109, 174, 78, 36);
		frmCalculadora.getContentPane().add(btn5);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btn2.getText());
			}
		});
		btn2.setBackground(new Color(255, 255, 255));
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btn2.setBounds(109, 221, 78, 36);
		frmCalculadora.getContentPane().add(btn2);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btn0.getText());
			}
		});
		btn0.setBackground(new Color(255, 255, 255));
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btn0.setBounds(109, 268, 81, 36);
		frmCalculadora.getContentPane().add(btn0);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btn7.getText());
			}
		});
		btn7.setBackground(new Color(255, 255, 255));
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btn7.setBounds(10, 127, 78, 36);
		frmCalculadora.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btn4.getText());
			}
		});
		btn4.setBackground(new Color(255, 255, 255));
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btn4.setBounds(10, 174, 78, 36);
		frmCalculadora.getContentPane().add(btn4);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btn1.getText());
			}
		});
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btn1.setBounds(10, 221, 74, 36);
		frmCalculadora.getContentPane().add(btn1);

		JButton btnponto = new JButton(".");
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btnponto.getText());
			}
		});
		btnponto.setBackground(new Color(255, 255, 255));
		btnponto.setForeground(new Color(255, 0, 0));
		btnponto.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnponto.setBounds(10, 268, 78, 36);
		frmCalculadora.getContentPane().add(btnponto);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btn9.getText());
			}
		});
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btn9.setBounds(206, 127, 74, 36);
		frmCalculadora.getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btn6.getText());
			}
		});
		btn6.setBackground(new Color(255, 255, 255));
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btn6.setBounds(206, 174, 74, 36);
		frmCalculadora.getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText() + btn3.getText());
			}
		});
		btn3.setBackground(new Color(255, 255, 255));
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btn3.setBounds(206, 221, 74, 36);
		frmCalculadora.getContentPane().add(btn3);

		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2 = Double.parseDouble(txtField.getText());
				if (operacao.equals("+")) {
					resultado = numero1 + numero2;
					txtField.setText(String.valueOf(resultado));
				} else if (operacao.equals("-")) {
					resultado = numero1 - numero2;
					txtField.setText(String.valueOf(resultado));

				} else if (operacao.equals("*")) {
					resultado = numero1 * numero2;
					txtField.setText(String.valueOf(resultado));
				} else if (operacao.equals("/")) {
					resultado = numero1 / numero2;
					txtField.setText(String.valueOf(resultado));
				}
			}
		});
		btnigual.setBackground(new Color(255, 255, 255));
		btnigual.setForeground(new Color(255, 0, 0));
		btnigual.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		btnigual.setBounds(206, 268, 74, 36);
		frmCalculadora.getContentPane().add(btnigual);
	}
}
