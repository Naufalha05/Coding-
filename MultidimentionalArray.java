class MultidimentionalArray {
    public static void main(String[] args) {
        int[][] num = {
        {10, 11, 12},
        {13, 14, 15}
        };
        for(int x=0; x<num.length; x++) {
            for(int y=0; y<num[x].length; y++) {
                System.out.println(num[x][y]);
            }
        }  
    }
}