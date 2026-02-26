import java.util.ArrayList;

public class ArrayListAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private ArrayList<Integer> intArray;


   public ArrayListAlgorithms() {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new ArrayList<Integer>();
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      intArray.clear();
      int size = (int)(Math.random() * 100);

      for(int i = 0; i < size; i++) {
         intArray.add((int)(Math.random() * 100));
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      intArray.clear();
      int size = (int)(Math.random() * 100);

      for(int i = 0; i < size; i++) {
         intArray.add(startNum + i);
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int max = intArray.get(0);
      for(int i = 0; i < intArray.size(); i++) {
         if(intArray.get(i) > max) {
            max = intArray.get(i);
         }
      }
      return max;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for(int i = 0; i < intArray.size(); i++) {
         for(int j = i + 1; j < intArray.size(); j++) {
            if(intArray.get(i).equals(intArray.get(j))) {
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
      ArrayListAlgorithms a = new ArrayListAlgorithms();

      a.populateArrayWithRandom();

      System.out.println(a.findMax());
      System.out.println(a.hasDuplicates());
      System.out.println(a.isInArray(25));
   }
}
