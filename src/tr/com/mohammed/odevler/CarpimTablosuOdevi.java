package tr.com.mohammed.odevler;

/**
 * Created by Mohammed on 17/2/2017.
 */

class CarpimTablosuOdevi
 { 
	public static void main(String args[])
 	{ 
		System.out.println ("Mohammed Rashad BAKER ");
		System.out.print ("   ");
		
		for (int y=1; y <=10;y++){
			System.out.print (" "+y+" ");
			
		}
		System.out.println  ("");
		for (int x=1; x <=10;x++){
				System.out.print ("_____");
			}
		System.out.println  ("");
		for (int i=1;i<=10;i++){
				System.out.print (i + " |");
			for (int j=1;j<=10;j++){
				
				System.out.print(" " + i*j + " ");
			}
			
			System.out.println (" ");
		}
 	}
 }
