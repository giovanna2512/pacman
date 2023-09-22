/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.pacman;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Game extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private Player player = new Player(50, 50, 180);
	private Ghost ghost1 = new Ghost(500,50,0);
	private Ghost ghost2 = new Ghost(500,50,0);
	private Ghost ghost3 = new Ghost(300,500,0);
	private Ghost ghost4 = new Ghost(500,500,0);
	private Bomb bomb = new Bomb(100,100);
	private Booster booster = new Booster(400, 400, 10);

	private JLabel imgPlayer = new JLabel(new ImageIcon("src/test/java/folder/pacman.png"));
	private JLabel imgGhost1 = new JLabel(new ImageIcon("src/test/java/folder/ghost_1.png"));
	private JLabel imgGhost2 = new JLabel(new ImageIcon("src/test/java/folder/ghost_2.png"));
	private JLabel imgGhost3 = new JLabel(new ImageIcon("src/test/java/folder/ghost_3.png"));
	private JLabel imgGhost4 = new JLabel(new ImageIcon("src/test/java/folder/ghost_4.png"));
	private JLabel imgBomb = new JLabel(new ImageIcon("src/test/java/folder/bomb.png"));
	private JLabel imgBooster = new JLabel(new ImageIcon("src/test/java/folder/booster.png"));

	private final int SCREENSIZE = 600;
	private int speed = 50;
	
	public static void main(String[] args) {
		new Game().init();
	}

	private void init() {
		setLayout(null);
		player.setScreenSize(SCREENSIZE);
		player.setLife(15);

		ghost1.setScreenSize(SCREENSIZE);
		ghost2.setScreenSize(SCREENSIZE);
		ghost3.setScreenSize(SCREENSIZE);
		ghost4.setScreenSize(SCREENSIZE);
		
		add(imgPlayer);
		add(imgGhost1);
		add(imgGhost2);
		add(imgGhost3);
		add(imgGhost4);
		add(imgBomb);
		add(imgBooster);

		render();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(SCREENSIZE + 100, SCREENSIZE + 100);
		getContentPane().setBackground(new java.awt.Color(5, 5, 5));
		setVisible(true);
		addKeyListener(this);

		run();
	}

	private void render() {
		
		updateLocation(imgPlayer, player);
		updateLocation(imgGhost1, ghost1);
		updateLocation(imgGhost2, ghost2);
		updateLocation(imgGhost3, ghost3);
		updateLocation(imgGhost4, ghost4);
		updateLocation(imgBomb, bomb);
		updateLocation(imgBooster, booster);
		setTitle("Life: " + player.getLife());
		SwingUtilities.updateComponentTreeUI(this);

	}

	private void updateLocation(JLabel label, GameObject object) {
		label.setBounds(object.getX(), object.getY(), 50, 50);
		ImageIcon myImage = (ImageIcon) label.getIcon();
        Image img = myImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        label.setIcon( new ImageIcon(newImg) );
	}

	private void run() {
		while (player.getLife() > 0) {
			//TODO: coloque aqui os mÃ©todos de movimentaÃ§Ã£o e colisÃ£o 
			
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			render();
                        player.move();
                         ghost1.move();
                            ghost2.move();
                            ghost3.move();
                            ghost4.move();
                           
			
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if (c == '8' || c == 'w') player.setDirection(0);	
		if (c == '6' || c == 'd') player.setDirection(90);	
		if (c == '2' || c == 's') player.setDirection(180);	
		if (c == '4' || c == 'a') player.setDirection(270);	
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}
	

	
}



/**
 *
 * @author giovanna.palmeida1
 */
        
    
    

