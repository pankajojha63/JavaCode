package strings;

public class StringProblem1 {
	public static void main(String[] args) {
		String str="pankaj_kumar_ojha";
		System.out.println(str+" :: " + modifiedStr(str));
		
		str="pankajKumar_ojha";
		System.out.println(str+" :: " + modifiedStr(str));
	}

	public static String modifiedStr(String str) {
		int len = str.length();
		String modifiedStr="";
		String first ="";
		for(int i=0;i<len;i++){
			first = (str.charAt(i)+"").toUpperCase();
			if(str.charAt(i)=='_'){
				i++;
				modifiedStr = modifiedStr +(str.charAt(i)+"").toUpperCase();
			}
			else if(first.equals(str.charAt(i)+"")){
				modifiedStr = modifiedStr +"_"+(str.charAt(i)+"").toLowerCase();
			}else{
			
				modifiedStr =modifiedStr+(str.charAt(i)+"");
			}
		}
		return modifiedStr;
	}
}
