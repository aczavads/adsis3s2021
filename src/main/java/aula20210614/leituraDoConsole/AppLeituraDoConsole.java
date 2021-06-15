package aula20210614.leituraDoConsole;

import java.util.Scanner;

public class AppLeituraDoConsole {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner fromConsole = new Scanner(System.in);
			
			String command = "";
			while (!command.equals("chega") 
					&& !command.equals("quit")
					&& !command.equals("quit1")
					&& !command.equals("quit2")
					&& !command.equals("quit3")
					&& !command.equals("quit4")
					&& !command.equals("quit5")
					&& !command.equals("quit6")
					&& !command.equals("quit7")
					&& !command.equals("quit8")
					&& !command.equals("quit9")) {
				System.out.println(">> ");
				command = fromConsole.nextLine();
				System.out.println("Você digitou: " + command);
			}
			System.out.println("Bye!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
