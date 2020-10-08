public class StrangerSort {
    public static void printArray(int []a){
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    public static void Merge(int a[],int p,int q,int r){
        int tmp;
        for(int i=0;i<q-1;i++){
            for(int j=r-1;j>q-1;j--){
                if(a[i]<a[j]){
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                    break;
                }
            }
        }
        if(a[q-1]<a[q]){
            tmp=a[q-1];
            a[q-1]=a[q];
            a[q]=tmp;
        }
    }
    public static void Sort(int []a, int p, int r){
        int q;
        if(p<r){
            q=(int)Math.floor((p+r)/2);
            Sort(a,p,q);
            Sort(a,q+1,r);
            Merge(a,p,q,r);
        }
    }
    public static void main (String []args){
        int [] A ={5,2,4,6,1,3,2,6};
        int [] B ={5,2,4,6,1,3,2};

        System.out.println(A.length);
        printArray(A);
        Sort(A,1,A.length);
        printArray(A);

        System.out.println(B.length);
        printArray(B);
        Sort(B,1,B.length);
        printArray(B);

    }
}
