package model;

public class Humans
{
//note that int values are on a scale from 1-10
private String name;
private int attractiveness;
private int strength;
private int intelligence;
private int charisma;
private boolean wisdom;

public Humans()
{
	
}
/*
 * name is string
 * attractiveness is value 1-10
 * strength is value 1-10
 * intelligence is value 1-10
 * charisma is value 1-10
 * wisdom is either true or false
 */
public Humans()
{
	this.attractiveness = 7;
	this.name = "Bryan";
	this.strength = 4;
	this.intelligence = 6;
	this.charisma = 7;
	this.wisdom = false;
}
public Humans(String name, int attractiveness, int strength, int intelligence, int charisma, boolean wisdom)
{
 this.name = name;
 this.attractiveness = attractiveness;
 this.strength = strength;
 this.intelligence = intelligence;
 this.charisma = charisma;
 this.wisdom = wisdom;
}

public String getName()
{
	return name;
}
public int getAttractiveness()
{
	return attractiveness;
}
public int getStrength()
{
	return strength;
}
public int getIntelligence()
{
	return intelligence;
}
public int getCharisma()
{
	return charisma;
}
public boolean getWisdom()
{
	return wisdom;
}
public void setName(String name)
{
	this.name = name;
}
public void setAttractiveness(int attractiveness)
{
	this.attractiveness = attractiveness;
}
public void setStrength(int strength)
{
	this.strength = strength;
}
public void setIntelligence(int intelligence)
{
	this.intelligence = intelligence;
}
public void setCharisma(int charisma)
{
	this.charisma = charisma;
}
public void setWisdom(boolean wisdom)
{
	this.wisdom = wisdom;
}

}
