public class test5{
    public static void main(String[] args){ //여기부터 진입하기
        int arr1[] = {3,5,9,2,5,4};
        atest at = new atest();
        int arr2[] = at.rw(arr1);
        at.pa(arr2);
    }
}

class atest{
    int[] rw(int[] a){
        int len = a.length;
        int b[] = new int[len];
        for(int i = 0; i < len ; i++)
            b[i] = a[len - i - 1];
            return b;
    }
    void pa(int[] arr) {
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}

