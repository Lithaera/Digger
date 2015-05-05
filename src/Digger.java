import javax.swing.*;
import java.io.*;
import java.awt.*;


public class Digger extends JFrame {
	
	public Digger() {
		Container pane = this.getContentPane();
	}
	public static void main(String[] args) {
		Digger mainFrame = new Digger();
		mainFrame.setSize(720,720);
		mainFrame.setTitle("Digger");
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
