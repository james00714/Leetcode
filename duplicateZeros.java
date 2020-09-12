class Solution {
    //o(n) runtime, o(1) space
    public void duplicateZeros(int[] arr) {
        int numZero = 0, size = arr.length, length = 0;
        for (int i = 0; i < size; ++i){
            if (arr[i] == 0){
                numZero++;
            }
        }
        
        length = size + numZero;
        
        for (int i = size-1, j = length-1; i < j; --i, --j){    // j < size to shift
            if (arr[i] != 0){
                if (j < size) arr[j] = arr[i];
            }else {
                if (j < size) arr[j] = arr[i];
                --j;
                if (j < size) arr[j] = arr[i];      //duplicate the 0s
            }
        }
    }
}