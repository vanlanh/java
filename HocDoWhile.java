package hueic.edu.vn;

public class HocDoWhile {

	public static void main(String[] args) {
		int n=1;
		int i=1;
		do{
			n*=i;
			i++;
		}while(i<=5);
		
		System.out.println("5!= "+n);
		
		do{
			n*=i;
			i++;
			if(i>5)
				break;
		}while(true);
		
		System.out.println("5!= "+n);
		
		while(i<=5){
			n*=i;
			i++;
		}
		
		System.out.println("5!= "+n);
		
		for(i=1; i<=5; i++){
			n*=i;
		}
		System.out.println("5!= "+n);
	}

}
