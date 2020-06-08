public class QuickSort 
{
public int partition(int[]a,int l,int h)
{
int pivot=a[l];
int i=l;
int j=h+1;
while(i<j)
{
do
{
i++;	
}while(a[i]<pivot&&i<h);
do
{
j--;
}
while(a[j]>pivot&&j>l);
	
if(i<j)
swap(i,j,a);	
}
swap(l,j,a);
return j;
}
public void swap(int p,int q,int[]ar)
{
int temp=ar[p];
ar[p]=ar[q];
ar[q]=temp;
}
public void Sort(int []arr,int l ,int h)
{
if(l<h)
{
int j=partition(arr,l,h);
Sort(arr,l,j);
Sort(arr,j+1,h);
}
}
public void print(int[]ar)
{
for(int i = 0 ;i<ar.length ; i++)	
{
	System.out.print(ar[i]+" ");
}
}
public static void main(String[]args)
{
int arr[]= {6,2,7,1,9,11,3,44,5,99,12};
QuickSort Sort=new QuickSort();
Sort.Sort(arr, 0, arr.length-1);
Sort.print(arr);
}
}
