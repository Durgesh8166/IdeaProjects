import java.util.*;

public class Solution {
    public int maximumEdgeSum(int n, int[][] edges) {
        // Create adjacency list representation of the tree
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }

        // To store the maximum edge sum for all paths
        int[] totalMaxSum = {0};

        // Perform DFS from any node, here we start with node 1 (assuming nodes are 1-indexed)
        boolean[] visited = new boolean[n + 1];
        dfs(graph, 1, -1, visited, totalMaxSum);

        return totalMaxSum[0]; // Return the total maximum edge sum
    }

    private int dfs(Map<Integer, List<int[]>> graph, int node, int parent, boolean[] visited, int[] totalMaxSum) {
        visited[node] = true;
        int maxSinglePath = 0;

        // To store the maximum weights from the children
        List<Integer> maxWeights = new ArrayList<>();

        for (int[] neighbor : graph.get(node)) {
            int nextNode = neighbor[0];
            int weight = neighbor[1];

            if (!visited[nextNode]) {
                int maxFromChild = dfs(graph, nextNode, node, visited, totalMaxSum);
                maxWeights.add(maxFromChild + weight);
                maxSinglePath = Math.max(maxSinglePath, maxFromChild + weight);
            }
        }

        // Calculate the sum of the largest weights
        Collections.sort(maxWeights, Collections.reverseOrder());
        if (!maxWeights.isEmpty()) {
            totalMaxSum[0] = Math.max(totalMaxSum[0], maxWeights.get(0));
        }
        if (maxWeights.size() > 1) {
            totalMaxSum[0] = Math.max(totalMaxSum[0], maxWeights.get(0) + maxWeights.get(1));
        }

        return maxSinglePath;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        int[][] edges = {{1, 2, 1}, {2, 4, 3}, {1, 3, 3}};
        int expectedOutput = 16;
        int actualOutput = sol.maximumEdgeSum(n, edges);
        System.out.println("Expected Output: " + expectedOutput);
        System.out.println("Actual Output: " + actualOutput);
        System.out.println("Output Matches Expected: " + (actualOutput == expectedOutput));
    }
}
