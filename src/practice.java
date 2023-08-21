
// Java program for the above approach

import java.util.*;

class practice{
    static class pair {
        int first, second;
        public pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    static int find(int m, pair[] q)
    {
        int mx = 0;
        int[] pre = new int[5];

        for (int i = 0; i < m; i++) {

            // take input a and b
            int a = q[i].first, b = q[i].second;

            // add 100 at first index and
            // subtract 100 from last index

            // pre[1] becomes 100
            pre[a - 1] += 100;

            // pre[4] becomes -100 and this
            pre[b] -= 100;

            // continues m times as we input diff. values of
            // a and b
        }
        for (int i = 1; i < 5; i++) {

            // add all values in a cumulative way
            pre[i] += pre[i - 1];

            // keep track of max value
            mx = java.lang.Math.max(mx, pre[i]);
        }

        return mx;
    }

    // Driver Code
    public static void main(String[] args)
    {

        int m = 3;
        pair[] q = { new pair(2, 4), new pair(1, 3),
                new pair(1, 2) };

        // Function call
        System.out.print(find(m, q));
    }
}
