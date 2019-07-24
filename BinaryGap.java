public class BinaryGap {


    public int solution(int N){

        int max = 0;
        int count = -1;
        int temp = 0;

        while (N > 0) {
            // get right most bit & shift right
            temp = N & 1;
            N = N >> 1;

            if (0 == temp && count >= 0) {
                count++;
            }

            if (1 == temp) {
                max = count > max ? count : max;
                count = 0;

                }
        }

        return max;
    }}
