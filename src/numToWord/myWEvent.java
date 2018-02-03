package numToWord;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class myWEvent extends WindowAdapter{
	
	Frame win;
	public myWEvent(Frame a) {
		win=a;
	}
	public void windowClosing(WindowEvent x) {
		System.exit(0);
	}
	public void windowClosed(WindowEvent x) {
		win.dispose();
	}

}
