package immibis.bon;

import java.util.Set;
import java.util.TreeSet;

public class MethodGroup implements Comparable<MethodGroup> {
	// fields not used during discovery phase
	Set<MethodDetails> methods = new TreeSet<>();
	String srgName;
	
	@Override
	public int compareTo(MethodGroup o) {
		return methods.iterator().next().compareTo(o.methods.iterator().next());
	}
}