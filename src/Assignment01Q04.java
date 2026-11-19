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


    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}