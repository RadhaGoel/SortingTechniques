public class MergeSort {
    public static void main(String ar[]) {
        int arr[] = {6,4,2,1,9,4};
        mergesort(arr, 0, arr.length-1);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void mergesort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high)/2;
        mergesort(arr, low, mid);
        mergesort(arr,mid+1, high);
        merge(arr,low,mid,high);
    }

   static void merge(int arr[], int low, int mid, int high){
        int temp[] = new int [high - low + 1];

        int left = low; //i
        int right = mid + 1; //j
       int i = 0; //k
       
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[i] = arr[left];
                left++;
                i++;
            }
            else{
                temp[i] = arr[right];
                right++;
                i++;
            }
        }
        while(left <= mid){
            temp[i] = arr[left];
            left++;
            i++;
        }
        while(right <= high){
            temp[i] = arr[right];
            right++;
        }
        for(int m = 0; m < temp.length; m++){
            arr[low + m] = temp[m];
        }
    }
}
