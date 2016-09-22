package sumPrimes;

public class sumPrimes {
	
	static boolean checkPrime(int n){
		
		for (int i = 2; i <=n; i++){
			
			if (i * i > n){
				return true;
			}else{
				
				if (n % i == 0){
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	static int helper1(int n){
		
		int sum = 0;
		
		if (n < 2){
			return 0;
		}
		
		for (int i = 2; i <= n; i++){
			
			if (checkPrime(i)){
				
				sum = sum + i;
			}else{
				continue;
			}
		}
		
		return sum;
		
	}
	
	static int helper2(int n){
		
		if (n < 2){
			return 0;
		}
		
		int[] array = new int[n + 1];
		
		for (int i = 2; i <= n; i++){
			array[i] = i;
		}
		
		array[0] = 0;
		
		
		for (int i = 1; i <= n; i++){
			
			if (i == 1){
				array[i] = 0;
			}else{
				
				for (int j = i + i; j <= n; j = j + i){
					
					array[j] = 0; 
				}
			}
		}
		
		int sum = 0;
		for (int i= 0; i <= n; i++){
			
			sum = sum + array[i];
		}
		
		return sum;
		
	}
	
	public static void main(String[] args){
		
		System.out.println(helper1(7));
		System.out.println(helper2(7));
	}

}
