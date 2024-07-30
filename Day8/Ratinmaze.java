//only main logic
//driver code is not included
//applicable to all
public class Ratinmaze {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> result = new ArrayList<>();
        int n = mat.length;
        if (mat[0][0] == 0 || mat[n - 1][n - 1] == 0) {
            return result;
        }

        boolean[][] visited = new boolean[n][n];
        dfs(mat, n, 0, 0, "", visited, result);
        Collections.sort(result); // Sort lexicographically
        return result;
    }

    private void dfs(int[][] mat, int n, int x, int y, String path, boolean[][] visited, ArrayList<String> result) {
         if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }

          int[] dx = {1, 0, 0, -1};
        int[] dy = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};

         visited[x][y] = true;

         for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (isValidMove(mat, n, newX, newY, visited)) {
                dfs(mat, n, newX, newY, path + dir[i], visited, result);
            }
        }

         visited[x][y] = false;
    }

    private boolean isValidMove(int[][] mat, int n, int x, int y, boolean[][] visited) {
        return x >= 0 && x < n && y >= 0 && y < n && mat[x][y] == 1 && !visited[x][y];
    }
}
