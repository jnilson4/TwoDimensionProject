package grid.controller;

import grid.view.*;
import javax.swing.JOptionPane;
import grid.model.*;

public class GridController
{
	private GridFrame appFrame;
	private ChickenNoodleSoup[][] grid;
	
	public GridController()
	{
		grid = new ChickenNoodleSoup[6][5];
		fillGrid();
		
		appFrame = new GridFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Hey looks, it's my 2D creation");
	}
	
	public void fillGrid()
	{
		for(int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[0].length; col ++)
			{
				grid[row][col] = new ChickenNoodleSoup();
			}
		}
	}
	
	public ChickenNoodleSoup[][] getGrid()
	{
		return grid;
	}
	
	public GridFrame getFrame()
	{
		return appFrame;
	}
}
