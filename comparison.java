import java.util.*;
public class comparison{
	public static void main(String args[]){
	
	Random r = new Random();
	Scanner sc = new Scanner (System.in);
	
	int [] player={1,2,3,4,5,6};
	int secret[] = new int[6];
	
	
	
	
	
			for(int i=0;i<6;i++){
				secret[i]=r.nextInt(40)+1;
				System.out.println(secret[i]);
					if(secret[i]==player[6]){
						System.out.println(player);
						}else{
							System.out.println("Too Bad");
							}
			}
	
				
	
		
		
		
		
		
		
		
		
	}//main method
}//class
	
	
	
	
	
	
	
