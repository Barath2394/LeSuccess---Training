package com.Barath.Day18;

import java.util.*;

public class DFSGraph {

    public static List<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        List<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsHelper(0, adj, visited, dfs);
        return dfs;
    }

    private static void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, List<Integer> dfs) {
        visited[node] = true;
        dfs.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, adj, visited, dfs);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1},{0,2},{1,2},{2,3},{2,4}};
        ArrayList<ArrayList<Integer>> adj = buildAdjacencyList(V, edges);

        System.out.println("DFS Traversal: " + dfsOfGraph(V, adj));
    }

    public static ArrayList<ArrayList<Integer>> buildAdjacencyList(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // undirected
        }
        return adj;
    }
}

