public class StringManipulator {
	public String trimAndConcat(String i, String j){
		String a = i.trim();
		String b = j.trim();
		return a.concat(b); 
	}
	public Integer getIndexOrNull(String a, char b){
		if(a.indexOf(b)>=0)
			return a.indexOf(b);
		else{
			return null;
		}
	}
	public Integer getIndexOrNull(String w, String sub){
		if(w.indexOf(sub)>=0){
			return w.indexOf(sub);
		}
		else{
			return null;
		}
	}
	public String concatSubstring(String w, int a, int b, String sub){
		return w.substring(a,b).concat(sub);
	}
	
}