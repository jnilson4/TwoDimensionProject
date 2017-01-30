package grid.view;

import javax.swing.*;
import grid.controller.GridController;
import java.awt.Color;

public class GridPanel extends JPanel
{
	private GridController baseController;
	private SpringLayout baseLayout;
	
	public GridPanel(GridController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
