public class PeakArray {

    static class PeakElement { 
        
        static int maxElement(int[] arr, int n) {
            if (n == 1) return 0;
            if (arr[0] > arr[1]) return 0;
            if (arr[n - 1] > arr[n - 2]) return n - 1;

            for (int i = 1; i < n - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    return i;
                }
            }
            return 0; 
        }

        
        static int peakNum(int[] arr, int low, int high, int n) {
            int mid = low + (high - low) / 2;

           
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return mid;
            }
           
            else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return peakNum(arr, low, mid - 1, n);
            }
            
            else {
                return peakNum(arr, mid + 1, high, n);
            }
        }

        
        static int findPeak(int arr[], int n) {
            return peakNum(arr, 0, n - 1, n);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 30};
        int n = arr.length;

    
        int peakIndex = PeakElement.maxElement(arr, n);
        System.out.println("Peak element found at index " + peakIndex + " using linear search: " + arr[peakIndex]);

        int peakBinary = PeakElement.findPeak(arr, n);
        System.out.println("Peak element found at index " + peakBinary + " using binary search: " + arr[peakBinary]);
    }
}
