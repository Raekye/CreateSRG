package immibis.bon;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public class MethodDetails implements Comparable<MethodDetails> {
	MethodGroup group = new MethodGroup();
	
	Set<MethodDetails> allDerived = new HashSet<>();
	
	// used during exception discovery and propagation phase
	List<ExceptionEntry> exceptionsFrom = new ArrayList<>();
	List<ExceptionEntry> exceptionsTo = new ArrayList<>();
	Set<String> exceptions = new HashSet<>();

	final MethodIdentifier ident;
	public MethodDetails(MethodIdentifier ident) {
		this.ident = ident;
	}
	
	@Override
	public String toString() {
		return ident.toString();
	}

	@Override
	public int compareTo(MethodDetails o) {
		return ident.compareTo(o.ident);
	}
}