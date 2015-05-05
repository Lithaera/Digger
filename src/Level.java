import javax.swing.*;
import java.io.*;
import java.awt.*;

public class Level extends JFrame implements Serializable{
	
	public Level(){
	}
	
	public Level(Color color) {
		setBackground(color);
	}
	
	public Color getBackground(){
		return super.getBackground();
	}

	public void saveLevel(String FileName){
		try{
			FileOutputStream fileout = new FileOutputStream(FileName);
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(this);
			out.close();
			fileout.close();
		}catch(IOException e){
			System.out.println("Failed to save. Not really sure when this will happen, but it did now, so goodluck with that.");
			throw new IllegalStateException(e);
		}
	}
	public Level loadLevel(String FileName){
		Level load=null;
		try{
			FileInputStream filein = new FileInputStream(FileName);
			ObjectInputStream in = new ObjectInputStream(filein);
			load=(Level) in.readObject();
			in.close();
			filein.close();
		}catch(IOException e){
			System.out.println("The class Level has been changed since this was saved, please update saves.");
			throw new IllegalStateException(e);
		}catch(ClassNotFoundException e){
			System.out.println("File not found.");
			throw new IllegalStateException(e);
		}return load;
	}
}
