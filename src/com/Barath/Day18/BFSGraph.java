package com.Barath.Day18;

import java.util.*;

public class BFSGraph {

    public static List<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[0] = true;
        queue.add(0);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfs.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return bfs;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1},{0,2},{1,2},{1,3},{2,4},{3,4}};
        ArrayList<ArrayList<Integer>> adj = buildAdjacencyList(V, edges);

        System.out.println("BFS Traversal: " + bfsOfGraph(V, adj));
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

