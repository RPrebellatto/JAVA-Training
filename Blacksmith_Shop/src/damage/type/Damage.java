package damage.type;

public abstract class Damage {
	int dmg;
	int lethality; //killing type dmg
	int penetration; //protection piercing rate
	int size; //size of the damaged area: 1- Point 2- Piece 3- Part 4- Half Body 5- Full Body 6+ Square++
	public abstract void attack();
}
