import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;


/*
 * Written by Scott Hatlen
 * 
 * This program is a combination of Zetcode's tutorials on Swing Java
 * with added commenting, etc. All was hand written, no copy/paste
 * 
 * Modified tutorial material from zetcode.com
 * 2014
 */

public class JavaSwingEx extends JFrame {

	//good practice to put code that creates the GUI inside a specific method
	public JavaSwingEx(){
		
		initUI();
	}
	
	private void initUI(){
		
		/* ~~~~~~PANEL METHOD~~~~~~
		
		JPanel panel = new JPanel(); //JPanels are generic lightweight containers
		getContentPane().add(panel);
		
		panel.setLayout(null); //voids FlowLayout manager, allows absolute positioning
		panel.setToolTipText("Hey there, I'm a toolTip");
		
		JButton quitButton = new JButton("Quit");
		quitButton.setBounds(160, 135, 80, 30);
		quitButton.setToolTipText("Click here to quit");
		
		quitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);;
			}
		});
		
		panel.add(quitButton);
		~~~~~~END PANEL METHOD~~~~~~*/
		
		JMenuBar menubar = new JMenuBar();
		ImageIcon iconNew = new ImageIcon("new.png");
		ImageIcon iconOpen = new ImageIcon("open.png");
		ImageIcon iconSave = new ImageIcon("save.png");
		ImageIcon iconExit = new ImageIcon("exit.png");
		
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		
		JMenu imp = new JMenu("Import");
		imp.setMnemonic(KeyEvent.VK_M);
		
		JMenuItem newsf = new JMenuItem("Import newsfeed list...");
		JMenuItem bookm = new JMenuItem("Import bookmarks...");
		JMenuItem mail = new JMenuItem("Import mail...");
		
		imp.add(newsf);
		imp.add(bookm);
		imp.add(mail);
		
		
		JMenuItem fileNew = new JMenuItem("New", iconNew);
		fileNew.setMnemonic(KeyEvent.VK_N);
		
		JMenuItem fileOpen = new JMenuItem("Open", iconOpen);
		fileOpen.setMnemonic(KeyEvent.VK_O);
		
		JMenuItem fileSave = new JMenuItem("Save", iconSave);
		fileSave.setMnemonic(KeyEvent.VK_S);
		
		JMenuItem fileExit = new JMenuItem("Exit", iconExit);
		fileExit.setMnemonic(KeyEvent.VK_C);
		fileExit.setToolTipText("Click here to Exit");
		fileExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		//Accelerator is a key shortcut that launches a menu item
		
		fileExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
		/* this method is used when no fileExit method exists
		eMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		*/
		
		file.add(fileNew);
		file.add(fileOpen);
		file.add(fileSave);
		file.addSeparator();
		file.add(imp);
		file.addSeparator();
		file.add(fileExit);
		
		menubar.add(file);
		
		setJMenuBar(menubar);
		
		setTitle("Judge not by the cover or this (ans:title)");
		setSize(500, 300);
		setLocationRelativeTo(null); //centers window on screen
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Important- by default nothing happens
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { //places app in Swing Event Queue
			@Override
			public void run() {
				JavaSwingEx ex = new JavaSwingEx();
				ex.setVisible(true);
			}
		});
		

	}

}
