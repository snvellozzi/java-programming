
public class StringRemoval {
	
	public static String withoutString(String base, String remove) {
		  remove = remove.toLowerCase();
		  String baseHolder = base;
		  baseHolder = baseHolder.toLowerCase();
		  String newBase = "";
		  
		  for(int i = 0; i < base.length(); i++){
		    if(i > base.length()-remove.length()){
		      newBase += base.charAt(i);
		    }else if(baseHolder.substring(i, i+remove.length()).equals(remove)){
		      i+=remove.length()-1;
		    }else{
		      newBase += base.charAt(i);
		    }
		  }
		  return newBase;
		}
	
	//removes instances of the remove string in base string (not case sensitive)
	public static void main(String[] args) {
		System.out.println(withoutString("Hello there", "llo"));
		System.out.println(withoutString("This IS my Name", "is"));
		System.out.println(withoutString("aaa", "aa"));
		System.out.println(withoutString("Hello everyone!", "he"));
		System.out.println(withoutString("CatssTAc", "STAC"));
		System.out.println(withoutString("HellohelloHe", "Hello"));
	}

}
