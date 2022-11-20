public class towerOfHanoi {
    
    static void TOH(int num, char A, char B, char C) {
        //here n is the number of disks in the rod
        //A, B, C are the name of the rods
        
        //base case
        if(num == 0) {
            return;
        }
        
        TOH(num - 1, A, C, B);
        System.out.println("Disk No: " + num + " From: " + A + " To: " + B);
        
        TOH(num - 1, C, B, A);
    }
    
    public static void main(String args[]) {
        int num = 5;
        TOH(num, 'A', 'C', 'B');
    }
    
    
    
    
}
