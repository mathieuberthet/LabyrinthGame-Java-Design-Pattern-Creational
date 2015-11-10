package fr.iutvalence.info.dut.m3105.labyrinthGame;

public interface RobotCreation 
{
	public static RobotArtificialIntelligence makeRobot (String Artificialintelligence)
	{
		switch (Artificialintelligence)
		{
			case "artificial intelligence":
				return new DumbBotArtificialIntelligence();
			case "lesser articifial intelligence":
				return new LesserDumbBotArtificialIntelligence();
			default:
				return new DumbBotArtificialIntelligence();
		}
		
	}
}
