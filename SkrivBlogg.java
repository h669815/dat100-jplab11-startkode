package no.hvl.dat100.jplab11.oppgave4;

import no.hvl.dat100.jplab11.oppgave3.*;
import java.io.FileWriter;
import java.io.IOException;
public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String  output  = mappe + filnavn;
		boolean success = false;
		// try-with-resources
		try (BufferedWriter file = new BufferedWriter(new PrintWriter(output))) {
			System.out.println("Output fil: " + output);
			file.write(samling.toString());
			success = true;
		} catch (IOException e) {
			System.out.println("Error writing to file: " + output);
		}

		throw new UnsupportedOperationException(TODO.method());
		return success;
	}
}