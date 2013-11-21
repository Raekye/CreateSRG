package immibis.bon;

import java.util.List;
import java.util.ArrayList;

public class ExceptionEntry {
	MethodDetails method;
	List<TryBlock> tryBlocks = new ArrayList<>();
}