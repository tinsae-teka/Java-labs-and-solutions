/** 
 * File: Player.java 
 * 
 * Defines a Player class that holds information about an athlete. 
 */ 

import java.util.Scanner;

public class Player {

	private String name;
	private String team;
	private int jerseyNumber;

	/** 
	 * Prompts for and reads in the player's name, team, and 
	 * jersey number. 
	 */ 
	public void readPlayer() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Name: ");
		name = scan.nextLine();
		
		System.out.print("Team: ");
		team = scan.nextLine();
		
		System.out.print("Jersey number: ");
		jerseyNumber = scan.nextInt();
	}
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

	public boolean equals(Player other){
		return other.getJerseyNumber() == this.jerseyNumber &&
			   other.getName().equals(this.name) &&
			   other.getTeam().equals(this.name); 
	   }
}