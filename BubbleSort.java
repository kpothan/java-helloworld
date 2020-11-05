package Sample;

public class BubbleSort {

	public static void bubleSort(int[] a)
	{
		int n=a.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
					
			}
		}
		
		
//		//selection sort
//		  for (int i = 0; i < arr.length - 1; i++)  
//	        {  
//	            int index = i;  
//	            for (int j = i + 1; j < arr.length; j++){  
//	                if (arr[j] < arr[index]){  
//	                    index = j;//searching for lowest index  
//	                }  
//	            }  
//	            int smallerNumber = arr[index];   
//	            arr[index] = arr[i];  
//	            arr[i] = smallerNumber;  
//	        }  
//				
//		}
//		}
		
	}
}
