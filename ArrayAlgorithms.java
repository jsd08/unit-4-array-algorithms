public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new int[arraySize];
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for(int i = 0; i < intArray.length; i++) {
         intArray[i] = (int)(Math.random() * 100);
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for(int i = 0; i < intArray.length; i++) {
         intArray[i] = startNum + i;
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int max = intArray[0];
      for(int i = 0; i < intArray.length; i++) {
         if(intArray[i] > max) {
            max = intArray[i];
         }
      }
      return max;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for(int i = 0; i < intArray.length; i++) {
         for(int j = i + 1; j < intArray.length; j++) {
            if(intArray[i] == intArray[j]) {
               return true;
            }
         }
      }
      return false;
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      for(int x : intArray) {
         if(x == intToFind) {
            return true;
         }
      }
      return false;
   }


   // ===== UWHS ALGORITHMS =====


   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      ArrayAlgorithms a = new ArrayAlgorithms(10);

      a.populateArrayWithRandom();

      System.out.println(a.findMax());
      System.out.println(a.hasDuplicates());
      System.out.println(a.isInArray(25));
   }
}
