package grid.view;

import javax.swing.*;
import grid.controller.GridController;
import java.awt.Color;
import javax.swing.table.*;
import java.awt.Dimension;
import java.awt.event.*;

public class GridPanel extends JPanel
{
	private GridController baseController;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel inputLabel;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JLabel title;
	
	private JTable gridTable;
	private JScrollPane gridPane;
	
	public GridPanel(GridController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.updateButton = new JButton("Update");
		this.rowField = new JTextField(4);
		this.columnField = new JTextField(4);
		this.inputField = new JTextField(25);
		this.inputLabel = new JLabel("Input");
		this.rowLabel = new JLabel("Row");
		this.columnLabel = new JLabel("Col");
		this.title = new JLabel(" ");
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"one", "two", "three", "four", "five"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		gridPane.setViewportView(gridTable);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.setPreferredSize(new Dimension(850,600));
		this.add(gridPane);
		this.add(columnField);
		this.add(updateButton);
		this.add(rowField);
		this.add(inputField);
		this.add(inputLabel);
		this.add(rowLabel);
		this.add(columnLabel);
		this.add(title);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 24, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 27, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -134, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, -33, SpringLayout.EAST, this);
		rowLabel.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 6, SpringLayout.EAST, rowLabel);
		columnLabel.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, columnLabel, 542, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, -5, SpringLayout.NORTH, columnLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, rowLabel, -25, SpringLayout.NORTH, columnLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, inputLabel, 5, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.EAST, inputLabel, -6, SpringLayout.WEST, inputField);
		inputLabel.setForeground(Color.WHITE);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 0, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 0, SpringLayout.WEST, rowField);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, 0, SpringLayout.EAST, gridPane);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, 0, SpringLayout.EAST, gridPane);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 30, SpringLayout.SOUTH, gridPane);
		baseLayout.putConstraint(SpringLayout.WEST, rowLabel, 0, SpringLayout.WEST, gridPane);
		baseLayout.putConstraint(SpringLayout.WEST, columnLabel, 0, SpringLayout.WEST, gridPane);
	}
	
	private void setupListeners()
	{
		updateButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
	}
	
	public GridController getBaseController()
	{
		return baseController;
	}
}
