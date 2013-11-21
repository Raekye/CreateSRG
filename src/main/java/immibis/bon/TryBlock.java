package immibis.bon;

import org.objectweb.asm.tree.TryCatchBlockNode;

public class TryBlock {
	Class<?> catches;
	boolean isReachable;
	MethodDetails method;
	TryCatchBlockNode node;
}