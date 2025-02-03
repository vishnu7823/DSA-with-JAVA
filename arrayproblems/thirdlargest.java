public class thirdlargest {
    public static void main(String[] args) {
        int[] array = {24,56,12,568,92,124};
        System.out.println(thirdlargest(array));
    }

    static int thirdlargest(int[] arr){

        int temp = 0;

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[arr.length-3];
    }
}
