package grid.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import grid.controller.GridController;

public class GridFrame extends JFrame
{
	private GridController baseController;
	private GridPanel appPanel;
	
	public GridFrame(GridController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new GridPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("");
		this.setSize(new Dimension(1000, 700));
		this.setVisible(true);
		this.setResizable(false);
	}
}
