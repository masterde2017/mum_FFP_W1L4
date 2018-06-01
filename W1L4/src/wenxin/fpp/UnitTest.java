package wenxin.fpp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UnitTest {
	
	@Test
	void test1() {
		MergeStrings.merge("abg", "dfhoyz");
		String  output = MergeStrings.sb.toString();
		assertEquals("abdfghoyz",output);
	}
	
	@Test
	void test2() {
		String s="abghxyz";
		
		assertEquals('a',FindMin.find(s));
	}
	
	
	@Test
	void test3() {
		int[] a= {1,2,5,7,33,123,234,500};
		assertEquals(2,BinarySearch.binarySearch(a, 5));
	}
	
	@Test
	void test4() {
		
		
		String  output = MergeStrings.sb.toString();
		assertEquals(true,Palindrome.pd("aabbcdcbbaa"));
	}

}
