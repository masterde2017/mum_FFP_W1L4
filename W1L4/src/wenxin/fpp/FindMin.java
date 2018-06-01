package wenxin.fpp;

public class FindMin {
	
	
	private static char findMin(String s,char c) {
		//System.out.println(s+"  "+c);
		if(s==null||s.equals("")) {
			return c;
		}
		if(c>s.charAt(0)) {
			c=s.charAt(0);
			return findMin(s.substring(1),c);
			
		}else return findMin(s.substring(1),c);
		
	}
	
	public static char find(String s) {
		if(s==null) return ' ';
		return findMin( s,s.charAt(0));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find("sfdewfadfew"));

	}

}
