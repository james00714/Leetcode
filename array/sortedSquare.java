class Solution {
    public int[] sortedSquares(int[] A) {
        int[] newSquares = new int[A.length];
        int start = 0, end = A.length-1;
        
        for (int i = A.length-1; i >= 0; --i){
            if (Math.abs(A[start]) >= Math.abs(A[end]) ){
                newSquares[i] = A[start] *A[start];
                start++;
            }else {
                newSquares[i] = A[end] * A[end];
                end--;
            }
        }
        
        
        return newSquares;
    }
}