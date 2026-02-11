import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem_02_optimal {
    static boolean isSafe(int i, int j, int n, int[][] maze, int[][] visited){
        return (i>=0 && i<n && j>=0 && j<n && maze[i][j]==1 && visited[i][j]==0);
    }

    
    static void solve(int i, int j, int n, int[] di, int[] dj, int[][] maze, int[][] visited, String path, List<String> res){
     
        if(i==n-1 && j==n-1){
            res.add(path);
            return;
        }

        String dir = "DLRU";
        for(int index=0; index<4; index++){
            int nexti = i+di[index];
            int nextj = j+dj[index];
            if(nexti >= 0 && nextj >= 0 && nexti < n && nextj<n && maze[nexti][nextj]==1 && visited[nexti][nextj]==0){
                visited[nexti][nextj] = 1;
                solve(nexti, nextj, n, di, dj, maze, visited, path + dir.charAt(index), res);
                visited[nexti][nextj] = 0;
            }
            
        }
    }


    static List<String> findPath(int[][] maze, int n){
        List<String> res = new ArrayList<>();
        int[][] visited = new int[n][n];
        int[] di = {+1, 0, 0, -1};
        int[] dj = {0, -1, 1, 0};
        if(maze[0][0] == 1){
            visited[0][0] = 1;
            solve(0, 0, n, di, dj, maze, visited, "", res);
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