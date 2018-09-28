package frames;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculadoraFrame extends JFrame {

	private JButton botao1;
	private JButton botao2;
	private JButton botao3;
	private JButton botao4;
	private JButton botao5;
	private JButton botao6;
	private JButton botao7;
	private JButton botao8;
	private JButton botao9;
	private JButton botao0;
	private JTextField fieldDisplay;
	private JButton botaoDivisao;
	private JButton botaoMultiplicacao;
	private JButton linhaV;
	private JButton botaoSubtracao;
	private JButton botaoSoma;
	private JButton botaoIgual;
	private JButton linhaH;
	private JButton botaoFechar;
	private JButton botaoCE;
	private JButton botaoC;
	private JButton botaoVirgula;

	private double doubleTotal = 0, doubleTSoma = 0, doubleTSubtracao = 0, doubleTMultiplicacao = 1, doubleTDivisao = 1;
	private String stringSoma = "", stringSubtracao = "", stringMultiplicacao = "", stringDivisao = "",
			stringArmazena = "", stringArmazenaAux = "", auxDevolve = "";

	private int intAuxMulDiv = 0, intAuxOp = 0, intOperacoes = 0, intContadorOperacoes = 0, intAcionaIgual;

	public CalculadoraFrame() {
		try {
			mostra();
			fieldDisplay.setEditable(false);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void mostra() throws Exception {

		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(new Color(204, 204, 204));
		this.setSize(277, 334);
		this.setLocation(330, 103);
		this.setTitle("Calculadora - Igual a Calc. do Win");
		this.setResizable(false);

		botao1 = new JButton("1");
		botao1.setBounds(new Rectangle(14, 109, 45, 30));
		this.getContentPane().add(botao1, null);
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				stringArmazena += "1";
				fieldDisplay.setText(stringArmazena);

			}
		});

		botao2 = new JButton("2");
		botao2.setBounds(new Rectangle(77, 109, 45, 30));
		this.getContentPane().add(botao2, null);
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				stringArmazena += "2";
				fieldDisplay.setText(stringArmazena);
			}
		});

		botao3 = new JButton("3");
		botao3.setBounds(new Rectangle(137, 109, 45, 30));
		this.getContentPane().add(botao3, null);
		botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stringArmazena += "3";
				fieldDisplay.setText(stringArmazena);
			}
		});

		botao4 = new JButton("4");
		botao4.setBounds(new Rectangle(14, 145, 45, 30));
		this.getContentPane().add(botao4, null);
		botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stringArmazena += "4";
				fieldDisplay.setText(stringArmazena);
			}
		});

		botao5 = new JButton("5");
		botao5.setBounds(new Rectangle(77, 145, 45, 30));
		this.getContentPane().add(botao5, null);
		botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stringArmazena += "5";
				fieldDisplay.setText(stringArmazena);
			}
		});

		botao6 = new JButton("6");
		botao6.setBounds(new Rectangle(137, 145, 45, 30));
		this.getContentPane().add(botao6, null);
		botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stringArmazena += "6";
				fieldDisplay.setText(stringArmazena);
			}
		});

		botao7 = new JButton("7");
		botao7.setBounds(new Rectangle(14, 182, 45, 30));
		this.getContentPane().add(botao7, null);
		botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stringArmazena += "7";
				fieldDisplay.setText(stringArmazena);
			}
		});

		botao8 = new JButton("8");
		botao8.setBounds(new Rectangle(77, 182, 45, 30));
		this.getContentPane().add(botao8, null);
		botao8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stringArmazena += "8";
				fieldDisplay.setText(stringArmazena);
			}
		});

		botao9 = new JButton("9");
		botao9.setBounds(new Rectangle(137, 182, 45, 30));
		this.getContentPane().add(botao9, null);
		botao9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stringArmazena += "9";
				fieldDisplay.setText(stringArmazena);
			}
		});

		botao0 = new JButton("0");
		botao0.setBounds(new Rectangle(77, 220, 45, 30));
		this.getContentPane().add(botao0, null);
		botao0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stringArmazena += "0";
				fieldDisplay.setText(stringArmazena);
			}
		});

		fieldDisplay = new JTextField();
		fieldDisplay.setBounds(new Rectangle(4, 18, 265, 28));
		this.getContentPane().add(fieldDisplay, null);

		botaoDivisao = new JButton("/");
		botaoDivisao.setBounds(new Rectangle(206, 109, 45, 30));
		this.getContentPane().add(botaoDivisao, null);
		botaoDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					if (intAcionaIgual == 1) {
						intOperacoes = 4;
						intAcionaIgual = 0;
						intAuxOp = 0;
						stringArmazena = "";
					} else {
						if (intAuxMulDiv == 0) {
							doubleTotal = 1;
							intAuxMulDiv = 1;

						}
						if (intAuxOp == 0) {
							intAuxOp = 1;
							intOperacoes = 4;
							doubleTDivisao = Double.parseDouble(stringArmazena);
							stringArmazena = "";
							doubleTotal = doubleTDivisao;
							System.out.println(doubleTotal);

						} else {
							calcularOperacoes(intOperacoes);

							fieldDisplay.setEditable(true);
							fieldDisplay.setText(String.valueOf(doubleTotal));
							fieldDisplay.setEditable(false);
							intOperacoes = 4;
						}
					}
				} catch (Exception et) {
					System.out.println("");
					intOperacoes = 0;
				}

			}

		});

		botaoMultiplicacao = new JButton("*");
		botaoMultiplicacao.setBounds(new Rectangle(206, 145, 45, 30));
		this.getContentPane().add(botaoMultiplicacao, null);
		botaoMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					if (intAcionaIgual == 1) {
						intOperacoes = 3;
						intAcionaIgual = 0;
						intAuxOp = 0;
						stringArmazena = "";
					} else {

						if (intAuxMulDiv == 0) {
							doubleTotal = 1;
							intAuxMulDiv = 1;

						}

						if (intAuxOp == 0) {
							intAuxOp = 1;
							intOperacoes = 3;
							doubleTMultiplicacao = Double.parseDouble(stringArmazena);
							stringArmazena = "";
							doubleTotal = doubleTMultiplicacao;
							intContadorOperacoes++;

						} else {
							calcularOperacoes(intOperacoes);

							fieldDisplay.setEditable(true);
							fieldDisplay.setText(String.valueOf(doubleTotal));
							fieldDisplay.setEditable(false);
							intOperacoes = 3;
							intContadorOperacoes++;
						}

					}
				} catch (Exception et) {
					System.out.println("");
					intOperacoes = 0;
				}

			}

		});

		linhaV = new JButton();
		linhaV.setBounds(new Rectangle(191, 106, 4, 152));
		this.getContentPane().add(linhaV, null);

		botaoSubtracao = new JButton("-");
		botaoSubtracao.setBounds(new Rectangle(206, 183, 45, 30));
		this.getContentPane().add(botaoSubtracao, null);
		botaoSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					if (intAcionaIgual == 1) {
						intOperacoes = 2;
						intAcionaIgual = 0;
						intAuxOp = 0;
						stringArmazena = "";
					} else {

						if (intAuxMulDiv == 0) {
							doubleTotal = 1;
							intAuxMulDiv = 1;

						}

						if (intAuxOp == 0) {
							intAuxOp = 1;
							intOperacoes = 2;
							doubleTSubtracao = Double.parseDouble(stringArmazena);
							stringArmazena = "";
							doubleTotal = doubleTSubtracao;
							System.out.println(doubleTotal);

						} else {
							calcularOperacoes(intOperacoes);

							fieldDisplay.setEditable(true);
							fieldDisplay.setText(String.valueOf(doubleTotal));
							fieldDisplay.setEditable(false);
							intOperacoes = 2;
						}
					}
				} catch (Exception et) {
					System.out.println("");
					intOperacoes = 0;
				}
			}
		});

		botaoSoma = new JButton("+");
		botaoSoma.setBounds(new Rectangle(206, 220, 45, 30));
		this.getContentPane().add(botaoSoma, null);
		botaoSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					if (intAcionaIgual == 1) {
						intOperacoes = 1;
						intAcionaIgual = 0;
						intAuxOp = 0;
						stringArmazena = "";
					} else {

						if (intAuxMulDiv == 0) {
							doubleTotal = 1;
							intAuxMulDiv = 1;

						}

						if (intAuxOp == 0) {
							intAuxOp = 1;
							intOperacoes = 1;
							doubleTSoma = Double.parseDouble(stringArmazena);
							stringArmazena = "";
							doubleTotal = doubleTSoma;
							System.out.println(doubleTotal);

						} else {
							calcularOperacoes(intOperacoes);

							fieldDisplay.setEditable(true);
							fieldDisplay.setText(String.valueOf(doubleTotal));
							fieldDisplay.setEditable(false);
							intOperacoes = 1;
						}
					}
				} catch (Exception et) {
					System.out.println("");
					intOperacoes = 0;
				}
			}
		});

		botaoIgual = new JButton("=");
		botaoIgual.setBounds(new Rectangle(138, 221, 45, 30));
		this.getContentPane().add(botaoIgual, null);
		botaoIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				stringArmazenaAux = stringArmazena;
				calcularOperacoes(intOperacoes);
				stringArmazena = stringArmazenaAux;

				fieldDisplay.setEditable(true);
				fieldDisplay.setText(String.valueOf(doubleTotal));
				fieldDisplay.setEditable(false);
				intAcionaIgual = 1;

			}
		});

		linhaH = new JButton();
		linhaH.setBounds(new Rectangle(6, 264, 257, 4));
		this.getContentPane().add(linhaH, null);

		botaoFechar = new JButton("Fechar");
		botaoFechar.setBounds(new Rectangle(89, 273, 100, 30));
		this.getContentPane().add(botaoFechar, null);
		botaoFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aoFechar();
			}
		});

		botaoCE = new JButton("CE");
		botaoCE.setBounds(new Rectangle(14, 68, 84, 30));
		this.getContentPane().add(botaoCE, null);
		botaoCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fieldDisplay.setEditable(true);
				fieldDisplay.setText(null);
				fieldDisplay.setEditable(false);
				stringArmazena = "";
			}
		});

		botaoC = new JButton("C");
		botaoC.setBounds(new Rectangle(98, 68, 84, 30));
		this.getContentPane().add(botaoC, null);
		botaoC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				doubleTotal = 0;
				intAuxMulDiv = 0;
				stringArmazena = "";
				intAuxOp = 0;
				fieldDisplay.setText(null);
			}
		});

		botaoVirgula = new JButton(",");
		botaoVirgula.setBounds(new Rectangle(14, 220, 45, 30));
		this.getContentPane().add(botaoVirgula, null);
		botaoVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stringArmazena += ".";
				fieldDisplay.setText(stringArmazena);

			}
		});

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				aoFechar();
			}
		});
	}

	private void aoFechar() {
		System.exit(0);
	}

	private void calcularOperacoes(int op) {
		stringArmazenaAux = stringArmazena;

		switch (op) {
		case 1:
			doubleTSoma = Double.parseDouble(stringArmazena);
			doubleTotal = doubleTotal + doubleTSoma;

			break;

		case 2:
			doubleTSubtracao = Double.parseDouble(stringArmazena);
			doubleTotal = doubleTotal - doubleTSubtracao;

			break;

		case 3:
			doubleTMultiplicacao = Double.parseDouble(stringArmazena);
			doubleTotal = doubleTotal * doubleTMultiplicacao;

			break;

		case 4:
			doubleTDivisao = Double.parseDouble(stringArmazena);
			doubleTotal = doubleTotal / doubleTDivisao;

			break;
		}

		stringArmazena = "";
	}

	public static void main(String args[]) {
		new CalculadoraFrame().show();
	}
}