package Chapter5;

/**
 * Notes:
 * => a = 0011 1100
 * => b = 0000 1101
 * -----------------
 *      a & b = 0000 1100
 *      a | b = 0011 1101
 *      a ^ b = 0011 0001
 *      ~a    = 1100 0011
 * 
 *       << (left shift)	Binary Left Shift Operator. The left operands value is moved left by the 
 *                          number of bits specified by the right operand.	
 *                          A << 2 will give 240 which is 1111 0000
 *      >> (right shift)	Binary Right Shift Operator. The left operands value is moved right by the 
 *                          number of bits specified by the right operand.	
 *                          A >> 2 will give 15 which is 1111
 *      >>> (zero fill right shift)	Shift right zero fill operator. The left operands value is moved right by the 
 *                          number of bits specified by the right operand and shifted values are filled up with zeros.	
 *                          A >>>2 will give 15 which is 0000 1111
 *                          It always fills 0 irrespective of the sign of the number.
 * ----------------- 
 * Note1 : Check if least significant bit is set => and it with 1 
 * 
 * 

 */

class Chapter_5_Data_Type {
    public static void main(String[] args) {
        System.out.println("------------------");

        /**
         * 5.1 
         */
        System.out.println("Number of bits " + countBits(-1));

        System.out.println("------------------");
    }

    /**
     * 5.1
     * ------------------------------------------------------------------------------------
     * Writing a program to count the number of bits that are set to 1 in an integer
     * is a good way to get up to speed with primitive types.
     * ------------------------------------------------------------------------------------
     */

    public static int countBits(int number) {
         int bitCount = 0;
         while(number != 0) {
            bitCount += (number & 1);
            number >>>= 1; //Work for negative number as well
         }
         return bitCount;
     }
}





