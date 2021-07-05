class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i, j, temp = 0;
        for (i =0, j = 0; j < A.length; ++j){
            if (A[j] %2 == 0){
                temp = A[i];
                A[i] = A[j];
                i++;
                A[j] = temp;
                
            }
        }
        return A;
    }
}