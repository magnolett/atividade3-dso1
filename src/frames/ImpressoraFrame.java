package frames;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ImpressoraFrame {

	private JLabel myPrinter;
	private JLabel printQuality;

	private JTextField leftField;
	private JTextField centerField;
	private JTextField rightField;
	
	private JCheckBox imageBox;
	private JCheckBox textBox;
	private JCheckBox codeBox;
	private JCheckBox printToFileBox;
	
	private JRadioButton selectionButton;
	private JRadioButton allButon;
	private JRadioButton applet;
	
	private JButton okButton;
	private JButton cancelButton;
	private JButton setupButon;
	private JButton helpButton;
	
	private JFrame frame;
	private JPanel painel;
	
	private String[] printQualityList = {"high", "average", "low"};
	
	private JComboBox combobox;
	
	public void criaTela() {
		
		final JFrame frame = new JFrame("Printer");
		
		painel = new JPanel();
		
		myPrinter = new JLabel("Printer: MyPrinter");
		myPrinter.setSize(200, 50);
		myPrinter.setLocation(10,0);
		
		leftField = new JTextField();
		leftField.setSize(50, 90);
		leftField.setLocation(10,60);
		
		imageBox = new JCheckBox("Image");
		imageBox.setSize(100, 50);
		imageBox.setLocation(60, 50);
		
		textBox = new JCheckBox("Text");
		textBox.setSize(100, 50);
		textBox.setLocation(60, 80);
		
		codeBox = new JCheckBox("Code");
		codeBox.setSize(100, 50);
		codeBox.setLocation(60, 110);
		
		centerField = new JTextField();
		centerField.setSize(50, 90);
		centerField.setLocation(180,60);
		
		selectionButton = new JRadioButton("Selection");
		selectionButton.setSize(100, 50);
		selectionButton.setLocation(240, 50);
		
		allButon = new JRadioButton("All");
		allButon.setSize(100, 50);
		allButon.setLocation(240, 80);
		
		applet = new JRadioButton("Applet");
		applet.setSize(100, 50);
		applet.setLocation(240, 110);

		rightField = new JTextField();
		rightField.setSize(50, 90);
		rightField.setLocation(360,60);
		
		okButton = new JButton("OK");
		okButton.setSize(100, 25);
		okButton.setLocation(420, 50);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setSize(100, 25);
		cancelButton.setLocation(420, 80);
		
		setupButon = new JButton("Setup...");
		setupButon.setSize(100, 25);
		setupButon.setLocation(420, 110);
		
		helpButton = new JButton("Help");
		helpButton.setSize(100, 25);
		helpButton.setLocation(420, 140);
		
		printQuality = new JLabel("Print Quality:");
		printQuality.setSize(200, 50);
		printQuality.setLocation(10, 160);
		
		combobox = new JComboBox<>(printQualityList);
		combobox.setSize(100, 25);
		combobox.setLocation(90, 170);
		
		printToFileBox = new JCheckBox("Print to File");
		printToFileBox.setSize(100, 25);
		printToFileBox.setLocation(200, 170);
		
		painel.add(myPrinter);
		
		painel.add(leftField);
		painel.add(imageBox);
		painel.add(textBox);
		painel.add(codeBox);
		
		painel.add(centerField);
		painel.add(selectionButton);
		painel.add(allButon);
		painel.add(applet);
		
		painel.add(rightField);
		
		painel.add(okButton);
		painel.add(cancelButton);
		painel.add(setupButon);
		painel.add(helpButton);
		
		painel.add(printQuality);
		painel.add(combobox);
		painel.add(printToFileBox);
		
		painel.setLayout(null);
		painel.setSize(300, 300);
		painel.setVisible(true);
		
		frame.add(painel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 275);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ImpressoraFrame().criaTela();
	}
	
}
