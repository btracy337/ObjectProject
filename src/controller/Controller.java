package controller;

import model.Humans;
import javax.swing.JOptionPane;

public class Controller
{
	/**
	 * Builds the instance of the Controller.
	 */
	public Controller()
	{

	}

	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		askUser();
	}

	private void askUser()
	{
		Humans userHuman = new Humans();
		String response = JOptionPane.showInputDialog(null, "What your characters attractiveness 1-10?");
		while (!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "No! type in a valid number for the attractiveness.");
		}
		userHuman.setAttractiveness(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "What is your character's strength?");
		while (!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "No! Type in a valid number for strength.");
		}
		userHuman.setStrength(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "What is your characters intelligence?");
		while (!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "No! type in a valid number for intelligence.");
		}
		userHuman.setIntelligence(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "What is your characters charisma?");
		while (!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "Type in a valid int for charisma.");
		}
		userHuman.setCharisma(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "Does your character have wisdom. True/False").toLowerCase();
		while (!response.equals("true")&&!response.equals("false"))
		{
			response = JOptionPane.showInputDialog(null, "Enter either true or false.").toLowerCase();
		}
		boolean hasWisdom = false;
		if (response.equals("true")) {
			hasWisdom = true;
		}
		userHuman.setWisdom(hasWisdom);
		response = JOptionPane.showInputDialog(null, "What is your characters name?");
		userHuman.setName(response);
		JOptionPane.showMessageDialog(null, userHuman);
	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type an integer value like 12345.");
		}

		return isValid;
	}

	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value human!");
		}
		return isValid;
	}
	public boolean validBoolean(String maybeBoolean)
	{
		boolean isValid = false;
		try
		{
			Boolean.parseBoolean(maybeBoolean);
			isValid = true;
		}	
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Enter a valid true/false.");
		}
		return isValid;
	}
}
