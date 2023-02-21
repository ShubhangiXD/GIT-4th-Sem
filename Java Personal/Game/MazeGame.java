import java.util.Random;
import java.util.Scanner;

public class MazeGame {

    public static void main(String[] args) {
        int width = 20;
        int height = 20;
        char[][] maze = generateMaze(width, height);
        int[] playerPos = {1, 1};

        while (true) {
            drawMaze(maze, playerPos);
            String move = getMove();
            movePlayer(maze, playerPos, move);
            if (playerPos[0] == height - 2 && playerPos[1] == width - 2) {
                System.out.println("You have reached the end of the maze!");
                break;
            }
        }
    }

    public static char[][] generateMaze(int width, int height) {
        char[][] maze = new char[height][width];
        Random rand = new Random();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    maze[i][j] = '#';
                } else {
                    maze[i][j] = '.';
                }
            }
        }

        for (int i = 1; i < height - 1; i++) {
            for (int j = 1; j < width - 1; j++) {
                if (rand.nextDouble() > 0.7) {
                    maze[i][j] = '#';
                }
            }
        }

        return maze;
    }

    public static void drawMaze(char[][] maze, int[] playerPos) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (i == playerPos[0] && j == playerPos[1]) {
                    System.out.print('P');
                } else {
                    System.out.print(maze[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static String getMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Move (up, down, left, right): ");
        return scanner.nextLine();
    }

    public static void movePlayer(char[][] maze, int[] playerPos, String move) {
        if (move.equals("up")) {
            if (playerPos[0] > 0 && maze[playerPos[0]-1][playerPos[1]] != '#') {
                playerPos[0]--;
            }
        } else if (move.equals("down")) {
            if (playerPos[0] < maze.length - 1 && maze[playerPos[0]+1][playerPos[1]] != '#') {
                playerPos[0]++;
            }
        } else if (move.equals("left")) {
            if (playerPos[1] > 0 && maze[playerPos[0]][playerPos[1]-1] != '#') {
                playerPos[1]--;
            }
        } else if (move.equals("right")) {
            if (playerPos[1] < maze[0].length - 1 && maze[playerPos[0]][playerPos[1]+1] != '#') {
                playerPos[1]++;
            }
        }
    }
}
