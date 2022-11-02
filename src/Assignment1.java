public class Assignment1 {
	
	public static void main(String[] args){
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int current_index = alphabet.indexOf(args[0]);
		int offset = Integer.valueOf(args[1]);
		if (offset < 0)
			offset = offset + 26;
		int num1 = ((offset)%26);
		int index_find = ((current_index + num1)%26);
		char newChar = alphabet.charAt(index_find);
				
		System.out.println("New char is " + newChar + ".");
	}
}
