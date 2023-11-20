public class LoopingOverArray{
    public static void main(String[] args) {
        int[] num = {7, 1, 5, 9, 2};
        int sum = 0;
        for(int x: num) {
            sum += x;
        }
        System.out.println(sum); 
    }
}