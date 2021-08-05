
public class MyAdd<T> {
	public static void main(String[] args) {
		
	}
	void add(T t){
		MyAdd<Number> myadd = new MyAdd<>();
		myadd.add(new Integer(0));
		myadd.add(new Double(1.0));
		System.out.println(myadd);
	}
}
