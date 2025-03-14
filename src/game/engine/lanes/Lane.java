package game.engine.lanes;

import game.engine.titans.Titan;
import game.engine.weapons.Weapon;
import game.engine.base.Wall;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Lane implements Comparable<Lane>{
	private final Wall laneWall;
	private int dangerLevel;
	private final PriorityQueue<Titan> titans;
	private final ArrayList<Weapon> weapons;
	
	public Lane(Wall laneWall) {
		this.laneWall = laneWall;
		dangerLevel = 0;
		titans = new PriorityQueue<>();
		weapons = new ArrayList<>();
	}
	
	public int compareTo(Lane o) {
		return this.dangerLevel - o.dangerLevel;
	}

	public int getDangerLevel() {
		return dangerLevel;
	}

	public void setDangerLevel(int dangerLevel) {
		this.dangerLevel = dangerLevel;
	}

	public Wall getLaneWall() {
		return laneWall;
	}

	public PriorityQueue<Titan> getTitans() {
		return titans;
	}

	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}
}
