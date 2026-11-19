public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int shortestPath = 0;
        boolean[] visited = new boolean[m.length];
        boolean[] current = new boolean[m.length];

        visited[i] = true;
        current[i] = true;

            if (i == j) {
                return (0);
            }

        for (int step = 0; step < m.length; step++) {
            boolean[] next = new boolean[m.length];

            for (int row = 0; row < m.length; row++) {
                if (current[row]) {
                    for (int col = 0; col < m.length; col++) {
                        if (m[row][col] == 1) {
                            if (col == j) {
                                return shortestPath + 1;
                            }
                            if (visited[col] != true) {
                                visited[col] = true;
                                next[col] = true;
                            }
                        }
                    }
                }
            }
            current = next;
            shortestPath++;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}