package newgui.view;

import javax.swing.JFrame;
import newgui.controller.NewGUIController;

public class NewFrame extends JFrame
{
	private NewGUIController appController;
	private NewPanel appPanel;
	
	public NewFrame()
	{
		super();
		this.appController = appController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("hey!");
		this.setSize(800, 800);
		this.setResizable(true);
		this.setVisible(true);
		
	}

}
