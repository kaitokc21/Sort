public class MergeSort {
public void merge(int []a,int l,int mid,int h)
{
int p=l,q=mid+1,k=0;
int arr[]=new int[h-l+1];
for(int i=l;i<=h;i++)
{
if(p>mid)
arr[k++]=a[q++];
else if(q>h)
arr[k++]=a[p++];
else if(a[p]<a[q])
arr[k++]=a[p++];	
else
arr[k++]=a[q++];	
}
for(int i=0;i<k;i++)
{
a[l++]=arr[i];	
}	
}
public void sort(int[]a,int l,int h)
{
if(l<h)
{
int mid=(l+h)/2;
sort(a,l,mid);
sort(a,mid+1,h);
merge(a,l,mid,h);
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
MergeSort merge=new MergeSort();
int arr[]= {9,7,8,3,2,1};
merge.sort(arr,0,arr.length-1);
merge.print(arr);
}
}
