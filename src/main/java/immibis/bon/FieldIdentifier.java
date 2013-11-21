package immibis.bon;

public class FieldIdentifier implements Comparable<FieldIdentifier> {
	public final String owner;
	public final String name;
	public final String desc;
	
	public FieldIdentifier(String owner, String name, String desc) {
		this.owner = owner;
		this.name = name;
		this.desc = desc;
	}
	
	@Override
	public int compareTo(FieldIdentifier arg0) {
		int i = owner.compareTo(arg0.owner);
		if(i != 0) return i;
		i = name.compareTo(arg0.name);
		if(i != 0) return i;
		return desc.compareTo(arg0.desc);
	}
}