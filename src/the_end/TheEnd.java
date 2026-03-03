package the_end;

public class TheEnd {

	public static void main(String[] args) throws InterruptedException {

		int h = 7; // height
		int w = 5; // width of each letter

		for (int i = 1; i <= h; i++) {
			System.out.print("\t\t");
			// ===== T =====
			for (int j = 1; j <= w; j++) {
				if (i == 1 || j == w / 2 + 1) {
					System.out.print("T ");
//					Thread.sleep(800);
				} else
					System.out.print("  ");
			}
			System.out.print("   ");

			// ===== H =====
			for (int j = 1; j <= w; j++) {
				if (j == 1 || j == w || i == h / 2 + 1) {
					System.out.print("H ");
//					Thread.sleep(800);
				} else
					System.out.print("  ");
			}
			System.out.print("   ");

			// ===== E =====
			for (int j = 1; j <= w; j++) {
				if (j == 1 || i == 1 || i == h / 2 + 1 && j < w || i == h) {
					System.out.print("E ");
//					Thread.sleep(800);
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("\n\n\n");
		for (int i = 1; i <= h; i++) {
			System.out.print("\t\t\t\t\t  ");
			// ===== E =====
			for (int j = 1; j <= w; j++) {
				if (j == 1 || i == 1 || i == h / 2 + 1 && j < w || i == h) {
					System.out.print("E ");
//					Thread.sleep(800);
				} else
					System.out.print("  ");
			}
			System.out.print("   ");

			// ===== N =====
			for (int j = 1; j <= h; j++) {
				if (j == 1 || j == h || j == i) {
					System.out.print("N ");
//					Thread.sleep(800);
				} else
					System.out.print("  ");
			}
			System.out.print("   ");

			// ===== D =====
			for (int j = 1; j <= w; j++) {
				if (j == 1 || (j == w && i > 2 && i < 6) || i == 1 && j < 4 || i == h && j < 4 || i == 2 && j == 4
						|| i == 6 && j == 4) {
					System.out.print("D ");
//					Thread.sleep(800);
				} else
					System.out.print("  ");
			}

			System.out.println();
		}
		System.out.println("\n\n\n\t\t\t\t\t\t\t  ");
		
//						heart shape
	}
}
