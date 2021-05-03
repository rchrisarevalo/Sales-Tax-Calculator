import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main extends JFrame{
	private JLabel messageLabel1, messageLabel2;
	private JTextField textField1, textField2;
	private JButton button1;
	
	Tax t = new Tax();
	
	public Main() {
		super("Sales Tax Calculator");
		setSize(330, 310);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		setLocation(x, y);
		setVisible(true);
		
		messageLabel1 = new JLabel("Enter a price:");
		messageLabel1.setSize(100, 30);
		messageLabel1.setLocation(50, 50);
		add(messageLabel1);
		
		textField1 = new JTextField(10);
		textField1.setSize(100, 30);
		textField1.setLocation(175, 55);
		add(textField1);
		
		messageLabel2 = new JLabel("Enter your state:");
		messageLabel2.setSize(100, 30);
		messageLabel2.setLocation(50,100);
		add(messageLabel2);
		
		textField2 = new JTextField(10);
		textField2.setSize(100, 30);
		textField2.setLocation(175, 105);
		add(textField2);
		
		button1 = new JButton("Calculate!");
		button1.setSize(100, 30);
		button1.setLocation(110, 175);
		button1.addActionListener(new Button1Clicked());
		add(button1);
		
	}
	
	public double convertToMile(String k) {

		double kilo = Double.parseDouble(k);
		double m = kilo * 0.62137;
		
		return m;
	}
	
	private class Button1Clicked implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			if (!textField1.getText().equals("") && !textField2.getText().equals("")){
				if (textField2.getText().equals("Alabama") || textField2.getText().equals("alabama"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateAlabama(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Alaska") || textField2.getText().equals("alaska"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateAlaska(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Arizona") || textField2.getText().equals("arizona"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateArizona(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Arkansas") || textField2.getText().equals("arkansas"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateArkansas(textField1.getText())));
				}
				
				else if (textField2.getText().equals("California") || textField2.getText().equals("california"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateCalifornia(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Colorado") || textField2.getText().equals("colorado"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateColorado(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Connecticut") || textField2.getText().equals("connecticut"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateConnecticut(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Delaware") || textField2.getText().equals("delaware"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateDelaware(textField1.getText())));
				}
				
				else if (textField2.getText().equals("DC") || textField2.getText().equals("dc"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateDC(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Florida") || textField2.getText().equals("florida"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateFlorida(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Georgia") || textField2.getText().equals("georgia"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateGeorgia(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Hawaii") || textField2.getText().equals("Hawaii"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateHawaii(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Idaho") || textField2.getText().equals("idaho"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateIdaho(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Illinois") || textField2.getText().equals("illinois"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateIllinois(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Indiana") || textField2.getText().equals("indiana"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateIndiana(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Iowa") || textField2.getText().equals("iowa"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateIowa(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Kansas") || textField2.getText().equals("kansas"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateKansas(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Kentucky") || textField2.getText().equals("kentucky"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateKentucky(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Louisiana") || textField2.getText().equals("louisiana"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateLouisiana(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Maine") || textField2.getText().equals("maine"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateMaine(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Maryland") || textField2.getText().equals("maryland"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateMaryland(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Massachusetts") || textField2.getText().equals("massachusetts"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateMassachusetts(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Michigan") || textField2.getText().equals("michigan"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateMichigan(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Minnesota") || textField2.getText().equals("minnesota"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateMinnesota(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Mississippi") || textField2.getText().equals("mississippi"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateMississippi(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Missouri") || textField2.getText().equals("missouri"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateMissouri(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Montana") || textField2.getText().equals("montana"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateMontana(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Nebraska") || textField2.getText().equals("nebraska"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateNebraska(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Nevada") || textField2.getText().equals("nevada"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateNevada(textField1.getText())));
				}
				
				else if (textField2.getText().equals("New Hampshire") || textField2.getText().equals("new hampshire"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateNewHampshire(textField1.getText())));
				}
				
				else if (textField2.getText().equals("New Jersey") || textField2.getText().equals("new jersey"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateNewJersey(textField1.getText())));
				}
				
				else if (textField2.getText().equals("New Mexico") || textField2.getText().equals("new mexico"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateNewMexico(textField1.getText())));
				}
				
				else if (textField2.getText().equals("New York") || textField2.getText().equals("new york"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateNewYork(textField1.getText())));
				}
				
				else if (textField2.getText().equals("North Carolina") || textField2.getText().equals("north carolina"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateNorthCarolina(textField1.getText())));
				}
				
				else if (textField2.getText().equals("North Dakota") || textField2.getText().equals("north dakota"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateNorthDakota(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Ohio") || textField2.getText().equals("ohio"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateOhio(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Oklahoma") || textField2.getText().equals("oklahoma"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateOklahoma(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Oregon") || textField2.getText().equals("oregon"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateOregon(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Pennsylvania") || textField2.getText().equals("pennsylvania"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculatePennsylvania(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Rhode Island") || textField2.getText().equals("rhode island"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateRhodeIsland(textField1.getText())));
				}
				
				else if (textField2.getText().equals("South Carolina") || textField2.getText().equals("south carolina"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateSouthCarolina(textField1.getText())));
				}
				
				else if (textField2.getText().equals("South Dakota") || textField2.getText().equals("south dakota"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateSouthDakota(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Tennessee") || textField2.getText().equals("tennessee"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateTennessee(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Texas") || textField2.getText().equals("texas"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateTexas(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Utah") || textField2.getText().equals("utah"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateUtah(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Vermont") || textField2.getText().equals("vermont"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateVermont(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Virginia") || textField2.getText().equals("virginia"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateVirginia(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Washington") || textField2.getText().equals("washington"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateWashington(textField1.getText())));
				}
				
				else if (textField2.getText().equals("West Virginia") || textField2.getText().equals("west virginia"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateWestVirginia(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Wisconsin") || textField2.getText().equals("wisconsin"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateWisconsin(textField1.getText())));
				}
				
				else if (textField2.getText().equals("Wyoming") || textField2.getText().equals("wyoming"))
				{
					JOptionPane.showMessageDialog(null, "Final price (in taxes): $" + String.format("%.2f", t.calculateWyoming(textField1.getText())));
				}
				
				else
					JOptionPane.showMessageDialog(null, "Sorry. This state (or federal district) is not available.", "State/district not found!", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				if (textField1.getText().equals("") && textField2.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Enter a price and a state!", "Error!", JOptionPane.ERROR_MESSAGE);
				
				else if (!textField1.getText().equals("") && textField2.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Enter a state!", "Error!", JOptionPane.ERROR_MESSAGE);
				
				else if (textField1.getText().equals("") && !textField2.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Enter a price!", "Error!", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
