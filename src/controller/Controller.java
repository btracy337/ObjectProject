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
			response = JOptionPane.showInputDialog(null, "No? type in a valid number for the attractiveness");
		}
		userHuman.setAttractiveness(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "What is your character's strength");
		while (!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "No! Type in a valid number for strength");
		}
		userHuman.setStrength(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "What is your characters intelligence?");
		while (!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "No type in a valid number for intelligence");
		}
		userHuman.setIntelligence(Integer.parseInt(response));
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
			JOptionPane.showMessageDialog(null, "This requirese a double value human!");
		}
		return isValid;
	}
}
