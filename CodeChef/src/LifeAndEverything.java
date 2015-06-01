import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LifeAndEverything {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = br.readLine();
			int i = Integer.parseInt(line);

			if (i != 42) {
				System.out.println(i);
			} else {
				System.exit(0);
			}
		}

	}
}
