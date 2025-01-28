
class GuessGame {
    private int pick; 
    
    public GuessGame(int pick) {
        this.pick = pick;
    }
    
    public int guess(int num) {
        if (num > pick) return -1; 
        else if (num < pick) return 1; 
        else return 0; 
    }
}

public class Solution extends GuessGame {
    public Solution(int pick) {
        super(pick);
    }
    
    public int guessNumber(int n) {
        int low = 1, high = n;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            
            int res = guess(mid);
            if (res == 0) { 
                return mid;
            } else if (res == -1) { 
                high = mid - 1;
            } else { 
                low = mid + 1;
            }
        }
        
        return -1; 
    }
    
    public static void main(String[] args) {
        int pick = 6; 
        int n = 10; 
        
        Solution solution = new Solution(pick);
        int result = solution.guessNumber(n);
        
        System.out.println("Picked number is: " + result);
    }
}
