
public class Cricket {

	public boolean numOfTeams(int arr[],int t, int k )
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)		//
		{
			sum=sum+Math.min(t, arr[i]);    //sum=14
		}
		
		if(sum>=t*k)	
			return true;
		else
			return false;
	}

	
	public int countOfTeams(int[] arr, int k) {
	
		int min=0;
		int max=10;
		int mid;
		
		while(min<=max)
		{
			mid=(min+max)/2;
		if(numOfTeams(arr,mid,k))
		{
				if(!numOfTeams(arr,mid+1,k))
				{
					return mid;
				}
				else
				{
					min=mid+1;
				}
		}
		
		else
			max=mid-1;
		}
		
		return 0;
	}

}
