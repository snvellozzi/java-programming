
public class CharReplace {

	public static void main(String[] args) {
		System.out.println(addPlus("123456", "34"));
		System.out.println(addPlus("56ab34ab123ab", "ab"));
		System.out.println(addPlus("234789", "2"));
		System.out.println(addPlus("catdog", "g"));
		System.out.println(addPlus("helloworld", "llo"));
		System.out.println(addPlus("coding is fun", "odin"));
		System.out.println(addPlus("Whatisyourname", "Whatis"));
		System.out.println(addPlus("helloeveryonehello", "hello"));
	}


//replaces all chars with plus (+) sign except for cases where the word string appears in str string
public static String addPlus(String str, String word) {
	String finalStr = "";
		for(int i = 0; i < str.length(); i++){
			if(i <= str.length() - word.length()){
				if(str.substring(i, i + word.length()).equals(word)){
					finalStr += word;
					i += word.length()-1;
				}else{
					finalStr += "+";
				}
			}else{
				finalStr += "+";
			  }
			}
	return finalStr;
	}	
}
