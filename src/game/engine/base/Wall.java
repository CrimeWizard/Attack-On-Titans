package game.engine.base;

import game.engine.interfaces.Attackee;

public class Wall implements Attackee{
	
	private final int baseHealth;
	private int currentHealth;
	
	public Wall(int baseHealth) {
		this.baseHealth = baseHealth;
		this.currentHealth = baseHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int health) {
		this.currentHealth = Math.max(0,health);
	}

	public int getBaseHealth() {
		return baseHealth;
	}

	@Override
	public int getResourcesValue() {
		return -1;
	}



}
