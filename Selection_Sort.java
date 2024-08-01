class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int small=i;
        for(int j=i;j<arr.length;j++){
            if(arr[small]>arr[j]){
                small=j;
            }
        }
        return small;
    }
	
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	     for(int i=0;i<n-1;i++){
           int min = select(arr,i);
            int temp = arr[i];
           arr[i]=arr[min];
           arr[min]= temp;
	}
}
}
