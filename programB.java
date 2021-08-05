import java.util.Scanner;

public class programB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (true) {
			count++;
			int width = sc.nextInt();
			int length = sc.nextInt();
			if (width == 0 && length == 0)
				break;
			char[][] house = new char[length][width];

			for (int r = 0; r < length; r++) {
				String row = sc.next();

				for (int c = 0; c < width; c++)
					house[r][c] = row.charAt(c);
			}
			System.out.println("HOUSE " + count);
			house = exitDoor(house);
			for (int i = 0; i < house.length; i++)
				System.out.println(new String(house[i]));
		}

		sc.close();
	}

	public static char[][] exitDoor(char[][] house) {

		int direction = 0;
		int r = 0;
		int c = 0;

		outer: for (int i = 0; i < house.length; i++)
			for (int j = 0; j < house[0].length; j++)
				if (house[i][j] == '*') {
					r = i;
					c = j;
					break outer;
				}

		if (r == 0)
			direction = 1;
		if (r == house.length - 1)
			direction = 2;
		if (c == 0)
			direction = 3;
		if (c == house[0].length - 1)
			direction = 4;

		// DOWN: 1 | UP: 2 | RIGHT: 3 | LEFT: 4

		while (house[r][c] != 'x') {
			if (house[r][c] == '.' || house[r][c] == '*') {
				if (direction == 1)
					r++;
				else if (direction == 2)
					r--;
				else if (direction == 3)
					c++;
				else if (direction == 4)
					c--;
			}

			else if (house[r][c] == '/') {
				if (direction == 1) {
					c--;
					direction = 4;
				} else if (direction == 2) {
					c++;
					direction = 3;
				} else if (direction == 3) {
					r--;
					direction = 2;
				} else if (direction == 4) {
					r++;
					direction = 1;
				}
			}

			else if (house[r][c] == '\\') {
				if (direction == 1) {
					c++;
					direction = 3;
				} else if (direction == 2) {
					c--;
					direction = 4;
				} else if (direction == 3) {
					r++;
					direction = 1;
				} else if (direction == 4) {
					r--;
					direction = 2;
				}
			}
		}

		house[r][c] = '&';
		return house;
	}

}
