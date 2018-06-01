package wenxin.fpp;

public class Palindrome {

	private static boolean paldrom(String s,int i,int j){
		if(i==-1&&j==s.length()) return true;
		if(s.charAt(i)==s.charAt(j)) return paldrom(s,--i,++j);
		else return false;
	}
	
	public static boolean pd(String s) {
		
		int mid=s.length()/2;
		if(s.length()%2!=0)return paldrom(s,mid-1,mid+1);
		else return paldrom(s,mid-1,mid);
	}
	
	public static void main(String[] args) {
		System.out.println(pd("asdsa"));
	}
}
