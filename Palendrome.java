package Programs;

public class Palendrome {
	public static void main(String[] args) {
		System.out.println("Enter any word");
//		Scanner sc 
		String str="SAS";
		boolean isPalendrome=true;
		int length=str.length()-1;
		for(int i=0; i<str.length()/2; i++)
		{
			if(str.charAt(i)!=str.charAt(length))
			{
				isPalendrome=false;
				break;
			}
			length--;
		}
		if(isPalendrome)
		System.out.println("Yes it is palendrome");
		else 
			System.out.println("No it is palendrome");
	}

}
