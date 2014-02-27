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
import javax.swing.plaf.metal.MetalIconFactory;


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
		ImageIcon icon = new ImageIcon("exit.png");
		
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_0);
		
		JMenuItem eMenuItem = new JMenuItem("Exit", icon);
		eMenuItem.setMnemonic(KeyEvent.VK_1);
		eMenuItem.setToolTipText("Click here to Exit");
		eMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		file.add(eMenuItem);
		
		setJMenuBar(menubar);
		
		
		setTitle("Judge not by the cover or this (ans:title)");
		setSize(300, 200);
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
