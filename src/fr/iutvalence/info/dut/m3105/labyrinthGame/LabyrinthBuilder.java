package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.Set;

public class LabyrinthBuilder 
{	
	private int width;
	private int height;
	private Position ExitPosition;
	private Set<Position> forbiddenCellPositions;
	
	public LabyrinthBuilder(final int width, final int height, Position exitPosition) 
	{
		this.width = width;
		this.height = height;
		this.ExitPosition = exitPosition;
	}

	public LabyrinthBuilder addForbidden(final Position position) 
	{
		return this;
	}
	
	public LabyrinthBuilder setWidth(int width) 
	{
		return this;
	}
	
	public LabyrinthBuilder setHeight(int height)
	{
		return this;
	}
	
	public LabyrinthBuilder setExitPosition()
	{
		return this;
	}
	
	public Labyrinth getLabyrinth() 
	{
		// Vérification
		return new Labyrinth(width, height, forbiddenCellPositions, ExitPosition);
	}
}
