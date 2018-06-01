package wenxin.fpp;

public class BinarySearch {

	private static int search(int[] sortedList, int start,int end,int aim) {
		
		if(start>end) return -1;
		int mid=(start+end)/2;
		if(aim==sortedList[mid]) return mid;
		else if(aim<sortedList[mid]) return search(sortedList,start,mid-1,aim);
		else  return search(sortedList,mid+1,end,aim);
		
		
	}
	
	public static int binarySearch(int[] sortedList,int aim) {
		
		return search( sortedList, 0,sortedList.length-1,aim);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,4,5,6,7,7,8,12,22,34,67};
		System.out.println(binarySearch(a,2));
	}

}
