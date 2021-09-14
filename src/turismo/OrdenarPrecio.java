package turismo;

import java.util.Comparator;

public class OrdenarPrecio implements Comparator <Atraccion>{

	@Override
	public int compare(Atraccion atrac, Atraccion otraAtrac) {
		return Integer.compare(atrac.getPrecio(), otraAtrac.getPrecio());
	}

}
