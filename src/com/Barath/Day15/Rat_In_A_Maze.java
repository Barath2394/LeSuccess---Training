package com.Barath.Day15;

import java.util.ArrayList;
import java.util.List;

public class Rat_In_A_Maze {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0},
                       {1,1,0,0},
                       {1,1,0,0},
                       {0,1,1,1}};
        List<String> ds = findPath(arr,4);
        for (String str : ds) {
            System.out.println(str);
        }
    }
    static List<String> findPath(int[][] path,int n) {
        int[][] visited = new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                visited[i][j] = 0;
            }
        }
        List<String> ds = new ArrayList<>();
        solve(ds,0,0,path,visited,n,"");
        return ds;
    }

    private static void solve(List<String> ds, int row, int col, int[][] path, int[][] visited,
                              int n,String move) {
        if (row == n-1 && col == n-1) {
            ds.add(move);
            return;
        }
//        Down - move
        if (row+1 < n && visited[row+1][col] == 0 && path[row+1][col] == 1) {
            visited[row+1][col] = 1;
            solve(ds,row+1,col,path,visited,n,move+'D');
            visited[row+1][col] = 0;
        }
//        Left - move
        if (col-1 >= 0 && visited[row][col-1] == 0 && path[row][col-1] == 1) {
            visited[row][col-1] = 1;
            solve(ds,row,col-1,path,visited,n,move+'L');
            visited[row][col-1] = 0;
        }
//        Up - move
        if (row-1 >= 0 && visited[row-1][col] == 0 && path[row-1][col] == 1) {
            visited[row-1][col] = 1;
            solve(ds,row-1,col,path,visited,n,move+'U');
            visited[row-1][col] = 0;
        }
//        Right - move
        if (col+1 < n && visited[row][col+1] == 0 && path[row][col+1] == 1) {
            visited[row][col+1] = 1;
            solve(ds,row,col+1,path,visited,n,move+'R');
            visited[row][col+1] = 0;
        }
    }
}
