import java.util.Arrays;

public class Assignment01Q04 {

public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0 || (direction != 'L' && direction != 'R')) {
            return array;
        }
        if (direction == 'L') {
            move = -move;
        }

        int moves = move % array.length;
        boolean[] visited = new boolean[array.length];
        int temp = array[0];

        for (int i = 0, j = 0; i < array.length; i++, j += moves) {
            if (visited[Math.floorMod(j, array.length)] != true) {
                j = Math.floorMod(j, array.length);
                visited[j] = true;
                int add = Math.floorMod((j + moves), array.length);
                int nexttemp = array[add];
                array[add] = temp;
                temp = nexttemp;
            }
            else {
                while (visited[Math.floorMod(j, array.length)] == true) {
                    j++;
                }
                j = Math.floorMod(j, array.length);
                visited[j] = true;
                temp = array[j];
                int add = Math.floorMod((j + moves), array.length);
                int nextTemp = array[add];
                array[add] = temp;
                temp = nextTemp;
            }
        }
        return array;
    }
}