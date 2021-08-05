import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> {

	private List<T> stackList;

	StackImpl() {
		stackList = new ArrayList<T>();
	}

	public List<T> getStackList() {
		return stackList;
	}

	public void add(T data) {
		getStackList().add(data);
	}
	
	public void iterator(){
		
	}

}
/*
b4
b3
b2
b1

generic wildcard
*/