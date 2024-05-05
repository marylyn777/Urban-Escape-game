import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

/**
 * Go on third level menu class
 * @author Krasovskyy Andrii
 * @author Kalianova Maria
 * @author Tarasenko Misha
 */
public class GoThird extends JFrame {
	
	/**
	 * Screen width
	 */
    private static int screenWidth;
    
    /**
	 * Screen height
	 */
    private static int screenHeight;

    /**
     * Class constructor
     */
	public GoThird() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		screenWidth = screenSize.width;
		screenHeight = screenSize.height;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(screenWidth, screenHeight);
		setLocationRelativeTo(null);
		setTitle("pause menu");
		setLayout(null);

		ImageIcon buttonIcon = new ImageIcon("gothird_menu.png");
		Image button = buttonIcon.getImage();
		Image scaledButton = button.getScaledInstance((int) (screenWidth * 0.4), (int) (screenHeight * 0.1), Image.SCALE_SMOOTH);
		ImageIcon scaledButtonIcon = new ImageIcon(scaledButton);
		JLabel buttonLabel = new JLabel(scaledButtonIcon);

		buttonLabel.setBounds((int) (screenWidth / 2 - screenWidth * 0.19), (int) (screenHeight * (0.48 + 0.045)), (int) (screenWidth * 0.4), (int) (screenHeight * 0.11));

		buttonLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {
				StartMenu startMenu = new StartMenu();
				cleanup();
				dispose();
			}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseClicked(MouseEvent e) {
				//ChooseLevel level = new ChooseLevel(finalScreenWidth1, finalScreenHeight1);
				//dispose();
			}
		});
		add(buttonLabel);

		ImageIcon buttonIcon1 = new ImageIcon("gothird_next.png");
		Image button1 = buttonIcon1.getImage();
		Image scaledButton1 = button1.getScaledInstance((int) (screenWidth * 0.4), (int) (screenHeight * 0.1), Image.SCALE_SMOOTH);
		ImageIcon scaledButtonIcon1 = new ImageIcon(scaledButton1);
		JLabel buttonLabel1 = new JLabel(scaledButtonIcon1);

		buttonLabel1.setBounds((int) (screenWidth / 2 - screenWidth * 0.19), (int) (screenHeight * (0.48 + 0.045*2 + 0.1)), (int) (screenWidth * 0.4), (int) (screenHeight * 0.1));

		buttonLabel1.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MovingBackground backgroundPanel;
				try {
					backgroundPanel = new MovingBackground(10, 3, 20, 60, "3.mp3", 25, frame);
					//backgroundPanel = new MovingBackground(10, 3, 20, 60, "3.mp3", 7, frame);
					frame.add(backgroundPanel);
					frame.pack();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				cleanup();
				dispose();
			}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
			}
		});
		add(buttonLabel1);

		ImageIcon buttonIcon2 = new ImageIcon("gothird_repeat.png");
		Image button2 = buttonIcon2.getImage();
		Image scaledButton2 = button2.getScaledInstance((int) (screenWidth * 0.4), (int) (screenHeight * 0.1), Image.SCALE_SMOOTH);
		ImageIcon scaledButtonIcon2 = new ImageIcon(scaledButton2);
		JLabel buttonLabel2 = new JLabel(scaledButtonIcon2);

		buttonLabel2.setBounds((int) (screenWidth / 2 - screenWidth * 0.19), (int) (screenHeight * (0.48 + 0.045*3 + 0.1*2)), (int) (screenWidth * 0.4), (int) (screenHeight * 0.11));

		buttonLabel2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				MovingBackground backgroundPanel;
				try {
					backgroundPanel = new MovingBackground(10, 2, 40, 70, "2.mp3", 20, frame);
					//backgroundPanel = new MovingBackground(10, 2, 40, 70, "2.mp3", 7, frame);
					frame.add(backgroundPanel);
					frame.pack();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				cleanup();
				dispose();
			}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseClicked(MouseEvent e) {
				//ChooseLevel level = new ChooseLevel(finalScreenWidth1, finalScreenHeight1);
				//dispose();
			}
		});
		
		add(buttonLabel2);


		ImageIcon imageIcon = new ImageIcon("second_back.jpg");
		Image image = imageIcon.getImage();
		Image scaledImage = image.getScaledInstance(screenWidth, (int) (screenHeight), Image.SCALE_SMOOTH);
		ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
		JLabel label = new JLabel(scaledImageIcon);
		label.setBounds(0, 0, screenWidth, (int) (screenHeight));
		add(label);

		setVisible(true);
	}
	
	/**
     * Cleanup method to release resources
     */
	public void cleanup() {
	    removeAll();

	    screenWidth = 0;
	    screenHeight = 0;
	    
	    System.gc();
	}
}