package StringePractice;

public class CountChar {
	public static void main(String[] args) {
		String g = "I LOVE CRICKET AND CHESS";
		int count =0;
		
		for(int i=0; i<=g.length()-1; i++) {
			int j = g.charAt(i);
			if(j=='S') {
				count++;
			}
		}
		System.out.println(count);
	}

}
