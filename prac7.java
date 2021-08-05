public class prac7 {
	public static void main(String[] args) {
		GenericsWithObjects<Integer> i1 = new GenericsWithObjects<Integer>(12);
		GenericsWithObjects<String> s1 = new GenericsWithObjects<String>("11");
		//i1 = s1;
		i1.print();
	}
}

class GenericsWithObjects<T> {
	T obj;

	GenericsWithObjects(T obj) {
		this.obj = obj;
	}

	void print() {
		System.out.println(obj);
	}
}