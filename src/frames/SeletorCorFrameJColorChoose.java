package frames;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SeletorCorFrameJColorChoose extends JFrame {
	private JButton changeColorJButton;
	private Color color = Color.LIGHT_GRAY;
	private JButton okButton;
	private JButton cancelButton;
	private JCheckBox backCheck;
	private JCheckBox foreCheck;
	
	public SeletorCorFrameJColorChoose() {
	
	}
	
	public void criaTela() {
		final JFrame frame = new JFrame("Seletor de Cor");
        final JPanel painel = new JPanel();

        changeColorJButton = new JButton( "Escolha a cor" );
        changeColorJButton.setSize(300, 50);
        changeColorJButton.setLocation(0,0);
        changeColorJButton.addActionListener(new ActionListener() {
        	public void actionPerformed( ActionEvent event ) {
                color = JColorChooser.showDialog(SeletorCorFrameJColorChoose.this, "Escolher a color", color );
                if(color == null)
                    color = Color.LIGHT_GRAY;
            	}
            });

        
        backCheck = new JCheckBox("BackGround");
        backCheck.setSize(100, 50);
        backCheck.setLocation(0, 50);
        backCheck.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(backCheck.isSelected()) {
					painel.setBackground(color);
				}
			}
		});
        okButton = new JButton("OK");
        okButton.setSize(100, 20);
        okButton.setLocation(0, 100);
        okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				okButton.setBackground(Color.GREEN);
			}
		});
        
        cancelButton = new JButton("CANCEL");
        cancelButton.setSize(100, 20);
        cancelButton.setLocation(150, 100);
        cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cancelButton.setBackground(Color.RED);
			}
		});
        
        foreCheck = new JCheckBox("ForeGround");
        foreCheck.setSize(100, 50);
        foreCheck.setLocation(150, 50);
        foreCheck.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(foreCheck.isSelected()) {
					painel.setForeground(color);
				}
			}
        });
        
        painel.add(changeColorJButton);
        painel.add(foreCheck);
        painel.add(backCheck);
        painel.add(okButton);
        painel.add(cancelButton);
       
        painel.setLayout(null);
        painel.setSize(300, 300);
        painel.setVisible(true);
        
        frame.add(painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(painel.getSize());
        frame.setResizable(false);
        frame.setVisible(true);
    }
	
    public static void main(String[] args) {
        SeletorCorFrameJColorChoose application = new SeletorCorFrameJColorChoose();
        application.criaTela();
    }
}