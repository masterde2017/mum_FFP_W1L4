package wenxin.fpp;

public class MergeStrings {

	static StringBuilder sb= new StringBuilder();
	
	public static void merge(String s1,String s2) {
	
		if(s1==null||s1.equals("")) {
			sb.append(s2);
			return;
		}else if(s2==null||s2.equals("")) {
			sb.append(s1);
			return;
		}
		if(s1.charAt(0)>=s2.charAt(0)) {
			sb.append(s2.charAt(0));
			 merge(s1,s2.substring(1));
		}else {
			sb.append(s1.charAt(0));
			 merge(s1.substring(1),s2);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merge("abcdkyz","copqsy");
		System.out.println(sb.toString());
	}

}
