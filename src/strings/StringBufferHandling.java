package strings;


public class StringBufferHandling {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Old Message!");
		System.out.println(sb.hashCode());
		
		sb.append("New Message");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb = new StringBuffer("Completely New Message!");
		System.out.println(sb.hashCode());
	}
}
