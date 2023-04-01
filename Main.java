package month3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Node{
    int x;
    int y;
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] arr = str.split(" ");
        int row = Integer.parseInt(arr[0]);
        int col = Integer.parseInt(arr[1]);
        int[][] book = new int[row][col];
        int[][] mat = new int[row][col];
        ArrayList<Node> path = new ArrayList<>();
        ArrayList<Node> minPath = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            str = reader.readLine();
            arr = str.split(" ");
            for (int j = 0; j < col; j++) {
                mat[i][j] = Integer.parseInt(arr[j]);
            }
        }
        getMinPath(mat,row,col,0,0,book,path,minPath);
        for (Node node : minPath){
            System.out.println("(" + node.x + "," + node.y + ")");
        }
    }
    static void getMinPath(int[][] mat, int row, int col, int x, int y, int[][] book, ArrayList<Node> path, ArrayList<Node> minPath){
        //判断当前位置能不能走
        if (x < 0 || x >= col || y < 0 || y >= row || book[x][y] == 1 || mat[x][y] == 1){
            return;
        }
        //如果能走
        path.add(new Node(x,y));
        book[x][y] = 1;
        //判断是否到了目的地
        if (x == row-1 && y == col-1){
            if (minPath.isEmpty() || path.size() < minPath.size()){
                minPath.clear();
                for (Node node : path){
                    minPath.add(node);
                }
            }
        }
        //上下左右走
        getMinPath(mat,row,col,x,y-1,book,path,minPath);
        getMinPath(mat,row,col,x,y+1,book,path,minPath);
        getMinPath(mat,row,col,x-1,y,book,path,minPath);
        getMinPath(mat,row,col,x+1,y,book,path,minPath);

        //如果不能走,就往回退,同时删除标记
        path.remove(path.size()-1);
        book[x][y] = 0;
    }
}

