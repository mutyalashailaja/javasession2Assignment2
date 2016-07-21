package session2assignment2;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prime=true;
		


		for(int i=1;i<=100;i++){
			
			prime=true;
			for(int j=2;j<i&&prime==true;j++){
				
					if(i%j==0){
						prime=false;
				}
			}
			if(prime==true){
				System.out.print(i+"\t");
			}
		}
	}

}
