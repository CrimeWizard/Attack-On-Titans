package game.engine.dataloader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import game.engine.titans.TitanRegistry;
import game.engine.weapons.WeaponRegistry;

public class DataLoader {

	private static final String TITANS_FILE_NAME = "titans.csv";
	private  static final String WEAPONS_FILE_NAME = "weapons.csv";
	
	
	public static HashMap<Integer, TitanRegistry> readTitanRegistry() throws IOException {
	    HashMap<Integer, TitanRegistry> map = new HashMap<>();
	    BufferedReader br = new BufferedReader(new FileReader(TITANS_FILE_NAME));
	    String line = br.readLine();

	    while (line != null) {
	        String[] attributes = line.split(",");

	        if (attributes.length >= 7) {
	            int code = Integer.parseInt(attributes[0]);
	            int baseHealth = Integer.parseInt(attributes[1]);
	            int baseDamage = Integer.parseInt(attributes[2]);
	            int heightInMeters = Integer.parseInt(attributes[3]);
	            int speed = Integer.parseInt(attributes[4]);
	            int resourcesValue = Integer.parseInt(attributes[5]);
	            int dangerLevel = Integer.parseInt(attributes[6]);

	            TitanRegistry titan = new TitanRegistry(code, baseHealth, baseDamage, heightInMeters, speed, resourcesValue, dangerLevel);
	            map.put(code, titan);
	        }

	        line = br.readLine();
	    }
	    br.close();
	    return map;
	}

	public static HashMap<Integer, WeaponRegistry> readWeaponRegistry() throws IOException {
	    HashMap<Integer, WeaponRegistry> map = new HashMap<>();
	    BufferedReader br = new BufferedReader(new FileReader(WEAPONS_FILE_NAME));
	    String line = br.readLine();

	    while (line != null) {
	        String[] attributes = line.split(",");

	        if (attributes.length >= 4) {
	            int code = Integer.parseInt(attributes[0]);
	            int price = Integer.parseInt(attributes[1]);
	            int damage = Integer.parseInt(attributes[2]);
	            String name = attributes[3];

	            if (attributes.length == 6) {
	                int minRange = Integer.parseInt(attributes[4]);
	                int maxRange = Integer.parseInt(attributes[5]);
	                WeaponRegistry weapon = new WeaponRegistry(code, price, damage, name, minRange, maxRange);
	                map.put(code, weapon);
	            } else {
	                WeaponRegistry weapon = new WeaponRegistry(code, price, damage, name);
	                map.put(code, weapon);
	            }
	        }

	        line = br.readLine();
	    }
	    br.close();
	    return map;
	}

	
	public String getTITANS_FILE_NAME() {
		return TITANS_FILE_NAME;
	}
	
	public String getWEAPONS_FILE_NAME() {
		return WEAPONS_FILE_NAME;
	}
}