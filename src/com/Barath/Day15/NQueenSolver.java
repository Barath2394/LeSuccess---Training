package com.Barath.Day15;

import java.util.*;

public class NQueenSolver {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = nQueenSolver(n);
        int count = 1;
        for (List<String> solution : solutions) {
            System.out.println("Arrangement " + count++);
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
    static List<List<String>> nQueenSolver(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> solutions = new ArrayList<>();
        solve(0,board,solutions);
        return solutions;
    }
    private static void solve(int col,char[][] board,List<List<String>> solutions) {
        if (col == board.length) {
            solutions.add(construct(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isValid(board,row,col)) {
                board[row][col] = 'Q';
                // Recursive Call for the next Col
                solve(col+1,board,solutions);
                board[row][col] = '.';
            }
        }
    }
    static List<String> construct(char[][] board) {
        List<String> ans = new ArrayList<>();
        for (char[] row : board) {
            ans.add(new String(row));
        }
        return ans;
    }
    private static boolean isValid(char[][] board, int row, int col) {
//        Check for the upper diagonal
        for (int i=row,j=col;i>=0 && j>=0;i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
//        Check for left side
        for (int i=col;i>=0;i--) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
//        Check for the lower diagonal
        for (int i=row,j=col;i<board.length && j>=0;i++,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
