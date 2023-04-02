public class JaggedArray {
    
    static int nums [] [] = new int [3] [];
    
    public static void main(String[] args) {
        
        nums[0] = new int[2] ;
        nums[1] = new int[5] ;
        nums[2] = new int[6] ;

        // fill jagged array with random data
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100); // generate random integer between 0 and 99
            }
        }
        
        // print jagged array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}

    