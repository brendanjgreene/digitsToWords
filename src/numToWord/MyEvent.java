package numToWord;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MyEvent implements ActionListener{
	
	private static final String[] tensNames = {
		    "",
		    " Ten",
		    " Twenty",
		    " Thirty",
		    " Forty",
		    " Fifty",
		    " Sixty",
		    " Seventy",
		    " Eighty",
		    " Ninety"
		  };
	private static final String[] numNames = {
		    "",
		    " One",
		    " Two",
		    " Three",
		    " Four",
		    " Five",
		    " Six",
		    " Seven",
		    " Eight",
		    " Nine",
		    " Ten",
		    " Eleven",
		    " Twelve",
		    " Thirteen",
		    " Fourteen",
		    " Fifteen",
		    " Sixteen",
		    " Seventeen",
		    " Eighteen",
		    " Nineteen"
		  };
	
	
	
	private static String convert(int number){
		String z = null;
		System.out.println("starting string "+z);
		System.out.println("starting number  "+number);
		
		if (number%100<20) {
			z = numNames[number % 100];
			number/=100;
		}else {
			z = numNames[number % 10];
	        number /= 10;

	        z = tensNames[number % 10] + z;
	        number /= 10;
	    }
		if (number == 0) return z; 
		return numNames[number] + " Hundred" + z;
		}
	
	Button b;
	TextField c, a;

	public MyEvent(Button enterButton, TextField wordField, TextField numberField) {
		// TODO Auto-generated constructor stub
		a=wordField;
		b=enterButton;
		c=numberField;
	}

	@Override
	public void actionPerformed(ActionEvent e1) {
		// TODO Auto-generated method stub
		Button eventSourceBTN = (Button) e1.getSource();
		try {
			if(eventSourceBTN == b) {

				int number = Integer.parseInt(c.getText());
				
				a.setText(convert(number));
				
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			c.setText("please enter a whole number "
					+ "using only digits 0-9");
		}
		
	}

}
