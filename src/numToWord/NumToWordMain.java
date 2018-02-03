package numToWord;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.BoxLayout;

public class NumToWordMain {

	//
	public static void main(String[] args) {
		Frame F = new Frame("Convertor");
		TextField numberField = new TextField(10);
		TextField wordField = new TextField(50);
		Button enterButton = new Button("convert number to string");
		MyEvent e1 = new MyEvent(enterButton, wordField, numberField);
		myWEvent f = new myWEvent(F);
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		F.addWindowListener(f);
		Label firstLabel = new Label("Enter digits here:");
		Label secondLabel = new Label("Number in word format:");
		enterButton.addActionListener(e1);
		P1.add(firstLabel);
		P1.add(numberField);
		P1.add(enterButton);
		P2.add(secondLabel);
		P2.add(wordField);
		// set size of Frame
		F.add(P1, BorderLayout.NORTH);
		F.add(P2);
		F.setSize(600, 100);
				// set frame to visible
		F.setVisible(true);	
	}
}
