import java.io.*;


public class Solution {
    // maxMoney function
    static int maxMoney(int n, long k) {
        int sum = 0;
        // sum all students id
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            // if sum equal to unlucky number k, then start collecting money from second student
            if (sum == k) {
                sum = 0;
                for (int j = 2; j <= n; j++) {
                    sum = sum + j;
                }
                return sum;
            }
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("result.txt"));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        long k = Long.parseLong(bufferedReader.readLine().trim());
        int res = maxMoney(n, k);
        try {
            System.out.print(res);
        } catch (Exception err) {
            System.out.print(err.getMessage());
        }
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
