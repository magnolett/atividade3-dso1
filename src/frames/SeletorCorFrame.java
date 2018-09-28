package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class SeletorCorFrame extends JFrame {
	private JButton changeColorJButton;
	private Color color = Color.LIGHT_GRAY;
	private JPanel colorJPanel;

	public SeletorCorFrame() {
        super("Seletor de Cor");
       
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);
       
        changeColorJButton = new JButton( "Escolha a cor" );
        changeColorJButton.addActionListener(new ActionListener() {
        	public void actionPerformed( ActionEvent event ) {
                color = JColorChooser.showDialog(SeletorCorFrame.this, "Escolher a color", color );
                if(color == null)
                    color = Color.LIGHT_GRAY;
                	
                colorJPanel.setBackground( color );
            	}
            });
        add( colorJPanel, BorderLayout.CENTER );
        add( changeColorJButton, BorderLayout.SOUTH );
       
        setSize( 400, 130 );
        setVisible( true );
    }
	
    public static void main(String[] args) {
        SeletorCorFrame application = new SeletorCorFrame();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}