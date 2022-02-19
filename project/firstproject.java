package project;

public class firstproject {

	public static void main(String[] args) {
		
/ Homework from Group 21!!!!!!!
		
		/*Task 1
		 * Create an array on int values using a scanner and calculate the 
		 * sum of all stored elements in that array.
		 */
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the lenght of the array: ");
    int length=scan.nextInt();
    int[] arr=new int[length];
    System.out.println("Enter the elements of the array: ");
    for (int i=0; i<length; i++) {
   	 arr[i]=scan.nextInt();
  	  
    }
    int sum=0;
    for(int num:arr) {
   	 sum+=num;
  	  
    }
    System.out.println("The sum of all elemets in the array is "+sum);
    /*Task 2
		 * Create a 2D array of integer values. Print the sum of all numbers
		 */
		int [][] numbers= {
				{1,3,5,7},
				{2,4,6,8},
				{20,30,40,50},
		};
		int sum11=0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				sum11+=numbers[i][j];
			}
		}
		System.out.println(sum11);
		
		/*Task 3 
		 *Create a 2D array or integer type where you will store odd and even numbers. 
		 *Develop a program which will identify/print the even numbers only.
		 */
    int [][]num= {
    		{3,6,9,12,15,18},
    		{2,4,6,8,10,12,},
    };
    for(int x=0; x<num.length; x++) {
    	for(int y=0; y<num[x].length; y++) {
    		if(num[x][y]%2==0) {
    			System.out.println(num[x][y]);
    		}
     	
    	}
    }
    /*Task 4
     * Create a 2D array of integers.
		 * Develop a program which will calculate the sum of 
		 * even and odd numbers for that array.
		 * 
		 */
		int num1[][]= {
				{2,4,6,5,8,7},
				{13,21,37,19,62,69},
		};
		int sumEven=0;
		int sumOdd=0;
		for(int x=0; x<num1.length;x++) {
			for(int y=0; y<num1[x].length;y++) {
				if(num1[x][y]%2==0) {
					sumEven=sumEven+num1[x][y];
				}else {
					sumOdd=sumOdd+num1[x][y];
				}
			}
		}
		System.out.println("The sum of even numbers is = "+sumEven);
		System.out.println("The sum of odd numbers is = "+sumOdd);
		
		/*Task 5
		 * Write a program to swap 2 numbers without a temporary variable?
		 */
		int a=7;
		int b=11;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a equals "+a);
		System.out.println("b equals "+b);
		
		/*Task 6
		 * Write a java program to check whether a given number is prime or not?
		 */
	  int num3=13;
	  boolean isPrime=true;
	  
	  for(int x=2;x<num3/2; x++) {
		  if(num3%1==0) {
			  isPrime=false;
			  break;
		  }
	  	 }
		if(isPrime) {
			System.out.println(num3+" is a Prime number!");
		}else {
			System.out.println("Not a prime number!");
	}
		/*Task 7
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */
int num4=10;
		
		int first=0;
		int second=1;
		
		for(int i=0; i<num4; i++) {
			if(i==0) {
				System.out.print("0 ");
			}
			else if(i==0) {
				System.out.println("1 ");
			}else {
				int sum4=first+second;
				System.out.print(sum4+" ");
				first=second;
				second=sum4;
}
}
		
		/*Task 8
		 * Maximum and minimum number in the array?
		 */
int nums[]= {12,30,10,2,89,14};
		
		int min=nums[0];
		int max=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println("The minimim number is "+min+" and the naximim number is "+max);
		
		/*Task 9
		 * Write a java program to find the second largest number in the array?
		 */
		int[] numbers1= {80,10,15,80,60,20,30,40};
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<numbers1.length; i++) {
			if(numbers1[i]>largest) {
				secondLargest=largest;
				largest=numbers1[i];
			}else if(numbers1[i]>secondLargest && numbers1[i]<largest) {
				secondLargest=numbers1[i];
			}
		}
		System.out.println("The second largest number in the array is "+secondLargest);
	
	}











		
	}

