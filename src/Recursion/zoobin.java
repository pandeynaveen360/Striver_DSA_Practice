package Recursion;

import java.util.*;
import java.math.BigInteger;

public class zoobin {
    static int n;
    static Map<Long, Integer> pairIndex = new HashMap<>();
    static int idxCount;

    static int pairKey(int a, int b) {
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        return (a << 16) | b;
    }

    static List<int[]> enumSimpleCycles(BitSet[] adj) {
        List<int[]> cycles = new ArrayList<>();
        boolean[] used = new boolean[n + 1];
        Deque<Integer> path = new ArrayDeque<>();

        for (int start = 1; start <= n; start++) {
            Arrays.fill(used, false);
            path.clear();
            path.add(start);
            used[start] = true;
            dfsCycles(start, start, used, path, adj, cycles);
            used[start] = false;
        }
        return cycles;
    }

    static void dfsCycles(int start, int current, boolean[] used, Deque<Integer> path, BitSet[] adj, List<int[]> cycles) {
        for (int next = adj[current].nextSetBit(0); next >= 0; next = adj[current].nextSetBit(next + 1)) {
            if (next == start && path.size() > 2) {
                // Found a cycle
                int[] cycle = path.stream().mapToInt(Integer::intValue).toArray();
                cycles.add(cycle);
            } else if (!used[next] && next > start) {
                used[next] = true;
                path.add(next);
                dfsCycles(start, next, used, path, adj, cycles);
                path.removeLast();
                used[next] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        BitSet[] adj = new BitSet[n + 1];
        for (int i = 0; i <= n; i++) adj[i] = new BitSet(n + 1);

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].set(v);
            adj[v].set(u);
        }

        List<int[]> cycles = enumSimpleCycles(adj);

        System.out.println("Number of simple cycles: " + cycles.size());
        for (int[] cycle : cycles) {
            for (int x : cycle) System.out.print(x + " ");
            System.out.println();
        }

        sc.close();
    }
}