package turismo;

import java.util.Comparator;

public class OrdenarGustos implements Comparator <Atraccion>{

	@Override
	public int compare(Atraccion atrac, Atraccion otraAtrac) {
		return atrac.getGusto().compareTo(otraAtrac.getGusto());
	}

}
