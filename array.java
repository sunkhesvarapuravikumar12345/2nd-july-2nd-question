import java.util.Scanner;
class array {
    int max,min;
    int maximum(int x,int y){
        return (x>y)?x:y;
    }
    int minimum(int x,int y){
        return (x<y)?x:y;
    }
    int value(int arr[],int size) {
        int l=1;
        int j;
        for(int k=0;k<size-1;k++){
            this.max=arr[k];
            this.min=arr[k];
            for (j=k+1;j<size;j++)
                max=maximum(max,arr[j]);
            min=minimum(min,arr[j]);
            if ((max - min) == j-k)
                l=maximum(l,max-min+1);

        }
        return l;
    }
}


class subarray extends array{


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l;
        System.out.println("ENter the size of array");
        l=sc.nextInt();
        int arr[]=new int[l];
        l--;
        System.out.println("enter the elemnts into array ");
        for(int i=0;i<l;i++) {
            arr[i] = sc.nextInt();
        }
        array a=new subarray();
        int result = a.value(arr, l);
        System.out.println("the size of subarray is "+result);

    }
}