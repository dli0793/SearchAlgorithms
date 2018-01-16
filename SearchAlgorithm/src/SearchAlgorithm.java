public class SearchAlgorithm 
{
	public static void main(String[] args)
	{
		int [] test1 = {1,2,3,4,5,6,7,8,9,10};
		int [] test2 = {0,4,5,6,12,15,17,23,29};
	
		System.out.println(binarySearch(test1,3));//2
		System.out.println(linearSearch(test1,3));//2

		System.out.println(binarySearch(test2,23));//7
		System.out.println(linearSearch(test2,23));//7
	
		System.out.println(binarySearch(test2,25));//-1
		System.out.println(linearSearch(test2,25));//-1
	
		System.out.println(binarySearch(test1,10));//9
		System.out.println(linearSearch(test1,1));//0
	
		System.out.println(binarySearch(test1,1));//0
	}


	public static int linearSearch(int [] arr, int query) 
	{
	for(int i=0; i<arr.length;i++) 
	{
		if(arr[i]==query) 
		{
			return i;
		}
	}
	return -1;
	}
	
	public static int binarySearch(int [] arr, int query) 
	{
		int l = 0;
		int r = arr.length-1;
		while(l<=r) 
		{
			int mid = (l+r)/2;
			if(arr[mid] < query) 
			{
				l=mid+1;
			}
			else if(arr[mid] > query)
			{
				r=mid-1;
			}
			else 
			{
				return mid;
			}	
		}
		return -1;
	}

}