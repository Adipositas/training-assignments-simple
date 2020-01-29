package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

abstract class Flag {
	abstract List<Color> = getColors();
}

class DUTCH extends Flag {
	List<Color> getColors() {
		return Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
	}
}

class GERMAN extends Flag {
	List<Color> getColors() {
		return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
	}
}

class BELGIAN extends Flag {
	List<Color> getColors() {
		return Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
	}
}

class FRENCH extends Flag {
	List<Color> getColors() {
		return Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
	}
}

class ITALIAN extends Flag {
	List<Color> getColors() {
		return Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
	}
}

class ROMANIA extends Flag {
	List<Color> getColors() {
		return Arrays.asList(Color.BLUE, Color.REDYELLOW, Color.RED);
	}
}

class IRELAND extends Flag {
	List<Color> getColors() {
		return Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
	}
}

class BULGARIAN extends Flag {
	List<Color> getColors() {
		return Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
	}
}

class RUSSIA extends Flag {
	List<Color> getColors() {
		return Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);
	}
}

class UNCLASSIFIED extends Flag {
	List<Color> getColors() {
		return Arrays.asList(Color.GRAY);
	}
}

public class FlagFactory {
    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
		List<Color> colors = Flag(nationality).getColors();
        return colors;
    }
    // end::getFlag[]

}