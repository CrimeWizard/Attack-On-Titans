package game.engine.titans;

import game.engine.interfaces.Attackee;
import game.engine.interfaces.Attacker;
import game.engine.interfaces.Mobil;

public abstract class Titan implements Comparable<Titan> , Attacker, Mobil, Attackee {
	private final int baseHealth;
	private int currentHealth;
	private final int baseDamage;
	private final int heightInMeters;
	private int distanceFromBase;
	private int speed;
	private final int resourcesValue;


	public void setDistanceFromBase(int distanceFromBase) {
		this.distanceFromBase = distanceFromBase;
	}

	private final int dangerLevel;
	
	
	public Titan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int
			speed, int resourcesValue, int dangerLevel) {
		
		super();
		this.baseHealth = baseHealth;
		this.currentHealth = baseHealth;
		this.baseDamage = baseDamage;
		this.heightInMeters = heightInMeters;
		this.distanceFromBase = distanceFromBase;
		this.speed = speed;
		this.resourcesValue = resourcesValue;
		this.dangerLevel = dangerLevel;
		
	}
	

	
	public int compareTo(Titan o) {
		return this.distanceFromBase - o.distanceFromBase;
	}
	
	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = Math.max(0, currentHealth);
	}
	
	public int getBaseDamage() {
		return baseDamage;
	}

	public int getDistance() {
		return distanceFromBase;
	}
	public void setDistance(int distance) {
		this.distanceFromBase = distance;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getBaseHealth() {
		return baseHealth;
	}
	
	public int getDamage() {
		return baseDamage;
	}
	
	public int getHeightInMeters() {
		return heightInMeters;
	}
	
	public int getResourcesValue() {
		return resourcesValue;
	}
	
	public int getDangerLevel() {
		return dangerLevel;
	}
	
}
