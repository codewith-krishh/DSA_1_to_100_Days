// Rat-maze
import java.util.*;
public class problem_02_brute {


    static boolean isSafe(int i, int j, int n, int[][] maze, int[][] visited){
        return (i>=0 && i<n && j>=0 && j<n && maze[i][j]==1 && visited[i][j]==0);
    }

    
    static void solve(int i, int j, int n, int[][] maze, int[][] visited, String path, List<String> res){
     
        if(i==n-1 && j==n-1){
            res.add(path);
            return;
        }

        // Mark the cell
        visited[i][j] = 1;

        // Try move down
        if(isSafe(i+1, j, n, maze, visited)){
            solve(i+1, j, n, maze, visited, path + "D", res);
        }

        // Try moving Left
        if(isSafe(i, j-1, n, maze, visited)){
            solve(i, j-1, n, maze, visited, path + "L", res);
        }

        // Try move right
        if(isSafe(i, j+1, n, maze, visited)){
            solve(i, j+1, n, maze, visited, path + "R", res);
        }

        // Try move up
        if(isSafe(i-1, j, n, maze, visited)){
            solve(i-1, j, n, maze, visited, path + "U", res);
        }

        // backtrack
        visited[i][j] = 0;
    }


    static List<String> findPath(int[][] maze, int n){
        List<String> res = new ArrayList<>();
        int[][] visited = new int[n][n];
        if(maze[0][0] == 1){
            solve(0, 0, n, maze, visited, "", res);
        }
        Collections.sort(res);
        return res;
    }


    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int n = maze.length;
        List<String> path = findPath(maze, n);
        System.out.println(path);
        // for(String p : path){
        //     System.out.print(p + " ");
        // }
    }
}

// Time Complexity = O(4^(n*n))
// Space Complexity = O(n*n)