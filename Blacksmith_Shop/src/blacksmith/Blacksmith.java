package blacksmith;

import java.util.ArrayList;
import weapon.Weapon;

public class Blacksmith {
	int cash = 0;
	String name;
	ArrayList<Weapon> weapons = new ArrayList<>();

	Blacksmith(){};
	public Blacksmith(String name){
		this.name = name;
	}
}