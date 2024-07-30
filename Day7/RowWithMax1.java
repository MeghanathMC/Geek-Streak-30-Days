public class RowWithMax1 {

    //only main logic
    //driver code is not included
    //applicable to all 
    public int rowMax1(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) count++;
            }
            if (count > max && count != 0) {
                max = count;
                index = i;
            }
        }
        return index;
}
}
