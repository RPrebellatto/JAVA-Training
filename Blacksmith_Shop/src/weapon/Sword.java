package weapon;

import damage.type.Blunt;
import damage.type.Pierce;
import damage.type.Slash;

public abstract class Sword extends Weapon{
	Slash slash;
	Pierce pierce;
	Blunt blunt;
}
