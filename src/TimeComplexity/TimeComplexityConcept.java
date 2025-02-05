package TimeComplexity;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		// Big Oh() -- Big O()
		
		//1.
		int i = 1;
		System.out.println(i); // O(1)
		
		//2.
		for( int j = 0; j <= 10; j++) {
			System.out.println(j); //O(1+n+n+n)  
		}
		// j = 0 -- 1 time 
		//j <= 10 -- 10 time n time 
		// print j 10 times  n times  
		//j++ n time
		///O(1+n+n+n) = 3n+1 -- linear equation: n + c
		//3n+1 = 3n(bcs (j = 0) which will take very less time 0.000001 and we wont consider it)
		//3n = n -- O(n) bcs we wont consider the variable part and we have to generalize it bcs we dont know how many lines of code we are writing
		
		//Nested Loops
		for( int k = 0; k <= 10; k++) {
			for( int l = 0; l <= 10; l++) {
				System.out.println(k+""+l);
			}
			System.out.println();
		}
		
		//(1+n+n+n)(1+n+n+n)==(1+3n)(1+3n)=> 1+3n+3n+9n^2 => 9n^2+6n+1 == Quadratic equation
		//9n^2+6n+1 ==> 9n^2+6n ==> n(9n+6)==> 9n^2 ==> n^2 ==> O(n^2)
		
		for( int k = 0; k <= 10; k++) {
			for( int l = 0; l <= 10; l++) {
				for( int n = 0; n <= 10; n++) {
				System.out.println(k+""+l+""+n);
				}
			}
			System.out.println();
		}
		
		
		//n*n*n ==> n^3 -- cubic
		
		// log n
		//Binary Search
		
		int arr[] = {0,25,26,29,30,32,37,46,58,62,63,64,73,73,75,77};
		int target = 77;
		int start = 0, end = arr.length -1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				System.out.println("Target Found at :"+mid);
			}
			if(arr[mid] < target) {
				start = mid + 1;
			}
			else {
				end = mid -1;
			}
			
			
		}
		System.out.println("ELement is not present");
		
		// n = 32
		// n / 2 = 16
		// n / 4 = 4
		// n / 8 = 2
		
		// tc = n/k 
		// T = n/k 
		// log T =  log n - log k
		// log T = 1-log k
		// log T = log k
		// O(log k)
	}

}

