public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int right =arr.length;
        int num =9;
        int result =search(arr,0,right,num);
        if(result != -1){
            System.out.println("so can tim nam o vi tri"+result);
        }else {
            System.out.println("khong co so can tim");
        }
    }
    public static int search(int[] arr,int left, int right,int num){
        if(right>=left){
            int mid =  left+(right-left)/2;
            if(arr[mid]==num){
                return mid;
            }else if (arr[mid]<num){
                return search(arr,mid+1,right,num);
            }else {
                return search(arr,left,mid-1,num);
            }
        }
        return -1;
    }
}
