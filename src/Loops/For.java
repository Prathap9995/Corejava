package Loops;

public class For {
	public static void main(String[] args) {
		int [] a = {10, 20, 30, 40, 50};
//		int sum = 0;
//		int avg = 0;
//		int count = 0;
//		int count1 = 0;
       int sum2=0;
	/*	for(int i = 0;i<a.length; i++) 
		{
			System.out.println(a[i]);
			 sum += a[i];
			 System.out.println(sum);
			 if(i <= avg) {
				 count=+1;
				 if(i >= avg) {
					 count1=+1;
					 count++;
					 count1++;
					 
					
					 
			 }System.out.println(count);
		} 
		
		System.out.println(a.length);
		avg = sum/a.length;
		 System.out.println(avg);
		 System.out.println(count);
		 System.out.println(count1);*/
	
		for(int x = 0; x < a.length;x++) {
			System.out.println(x);
			sum2 = sum2+x;}
			System.out.println(sum2);
		
		for(int aa:a) {
			System.out.println(aa);
			}
		}
			
		}
			
		





//for(sop; i<5; i++) // we can declare multiple Sop statements inside for
//Initialization is optional but ; is mandatory
//for(int i =0, j=0;i<2;i++)----> allowed, for(int i =0, int j=0;i<2;i++)----.not allowed
// for(;;){sop()} --> here we will get infinite time output because default condition is true

/*   int []a = {10,20,30};
for(int aa : a) {
System.out.println(aa);  ----> for each loop

here we can say that a is part to execute
 
If we don't have initialization, inc/dec, condition part we can simply use for each loop
*/



// for ---> conditions apply
// for - each conditions not applies