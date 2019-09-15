package hello;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

class assumeTest {
	
	private static Scanner scan;
	private static int number, y;
	private static String quit, assume;

	@Test
	void test() {
		fail("Not yet implemented");
	}

	public static Scanner getKeyboard() {
		return getKeyboard(); 
	}
	
	public static void setKeyboard(Scanner keyboard) {
		assumeTest.scan = keyboard; 
	}
	
	public static int getNumber() {
		return number;
	}
	
	public static void setNumber(int number) {
		assumeTest.number = number;
	}
	
	public static int getI() {
		return y;
	}
	
	public static void setI(int y) {
		GuessTest.y = y;
	}
	
	public static String  getQuit() {
		return quit;
	}
	
	public static void setQuit(String quit) {
		assumeTest.quit = quit;
	}
	
	public static String getGuess() {
		return assume;
	}
	
	public static void setGuess(String assume) {
		assumeTest.assume = assume;
	}
}
