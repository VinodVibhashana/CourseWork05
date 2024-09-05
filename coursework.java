
import java.util.Scanner;

public class coursework {

    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
			  System.out.println( "					 __   ______             __ ");
            System.out.println("					|  \\ /      \\           |  \\");
            System.out.println(" 					\\$$|  $$$$$$\\  ______  | $$  ______");
            System.out.println("					|  \\| $$   \\$$ |      \\ | $$ /      \\");
            System.out.println("					| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
            System.out.println("					| $$| $$   __  /      $$| $$| $$");
            System.out.println("					| $$| $$__/  \\|   $$$$$$| $$| $$_____");
            System.out.println("					| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
            System.out.println("					 \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("  _   _                       _                          _____                                         _                 ");
            System.out.println(" | \\ | |                     | |                        / ____|                                       | |                ");
            System.out.println(" |  \\| |  _   _   _ __ ___   | |__     ___   _ __      | |        ___    _ __   __   __   ___   _ __  | |_    ___   _ __ ");
            System.out.println(" | . ` | | | | | | '_ ` _ \\  | '_ \\   / _ \\ | '__|     | |       / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| | __|  / _ \\ | '__|");
            System.out.println(" | |\\  | | |_| | | | | | | | | |_) | |  __/ | |        | |____  | (_) | | | | |  \\ V /  |  __/ | |    | |_  |  __/ | |   ");
            System.out.println(" |_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|         \\_____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__|  \\___| |_|   ");
            System.out.println("                                                                                                                         ");
            System.out.println("                                                                                                                         ");
                System.out.println(
                "=======================================================================================================================\n");
            System.out.println("Menu:");
            System.out.println("	[01] Decimal Converter");
            System.out.println("");
            System.out.println("	[02] Binary Converter");
            System.out.println("");
            System.out.println("	[03] Octal Converter");
            System.out.println("");
            System.out.println("	[04] Hexadecimal Converter");
            System.out.println("");
            System.out.println("	[05] Roman Number Converter");
            System.out.println("");
            System.out.print("Enter an option -> ");
            int option = scanner.nextInt();

            if (option == 1) {
                while (true) {
		        System.out.println("+--------------------------------------------------------------+");
                        System.out.println("|                 Decimal Converter                            |");
                        System.out.println("+--------------------------------------------------------------+");
                        System.out.println("");
                        System.out.println("");
                    System.out.print("Enter a positive decimal number: ");
                    System.out.println("");
                    int decimal = scanner.nextInt();
                    if (decimal < 0) {
						  System.out.println("	Invalid input..... (Number must be positive)");
                                                   System.out.println(" ");
                                                   System.out.print("Do you want to input number again (Y/N)? ");
                        if (!scanner.next().equalsIgnoreCase("Y")) {
                            break;
                        }
                    } else {
                        // Convert to Binary
                        int decimalCopy = decimal;
                        String binary = "";
                        while (decimalCopy > 0) {
                            binary = (decimalCopy % 2) + binary;
                            decimalCopy = decimalCopy/2;
                        }
                       
                        System.out.println("	Binary: " + binary);

                        // Convert to Octal
                        decimalCopy = decimal;
                        String octal = "";
                        while (decimalCopy > 0) {
                            octal = (decimalCopy % 8) + octal;
                            decimalCopy /= 8;
                        }
                        //if (octal.equals("")) octal = "0";
                        System.out.println("	Octal: " + octal);

                        // Convert to Hexadecimal
                        decimalCopy = decimal;
                        String hex = "";
                        while (decimalCopy > 0) {
                            int rem = decimalCopy % 16;
                            if (rem < 10) {
                                hex = (char) ('0' + rem) + hex;
                            } else {
                                hex = (char) ('A' + rem - 10) + hex;
                            }
                            decimalCopy /= 16;
                        }
                        //if (hex.equals("")) hex = "0";
                        System.out.println("	Hexadecimal: " + hex);
                        
                        
                        System.out.println(" ");
                        System.out.print("Do you want to go to homepage (Y/N)? ");
                        if (!scanner.next().equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                }
            } else if (option == 2) {
                while (true) {
		    System.out.println("+--------------------------------------------------------------+");
                    System.out.println("|                 Binary Converter                             |");
                    System.out.println("+--------------------------------------------------------------+");
                      System.out.println("");
                      System.out.println("");
                    System.out.print("Enter a binary number: ");
                    System.out.println("");
                    String binary = scanner.next();
                    boolean isValidBinary = true;
                    for (int i = 0; i < binary.length(); i++) {
                        if (binary.charAt(i) != '0' && binary.charAt(i) != '1') {
                            isValidBinary = false;
                            break;
                        }
                    }
                    if (!isValidBinary) {
						System.out.println("	Invalid input... (Please enter a binary number)");
                        System.out.print("Do you want to input number again (Y/N)? ");
                        if (!scanner.next().equalsIgnoreCase("Y")) {
                            break;
                        }
                    } else {
                        // Convert Binary to Decimal
                        int decimal = 0;
                        for (int i = 0; i < binary.length(); i++) {
                            decimal = decimal * 2 + (binary.charAt(i) - '0');
                        }
                        System.out.println("	Decimal: " + decimal);

                        // Convert to Octal
                        int decimalCopy = decimal;
                        String octal = "";
                        while (decimalCopy > 0) {
                            octal = (decimalCopy % 8) + octal;
                            decimalCopy /= 8;
                        }
                        //if (octal.equals("")) octal = "0";
                        System.out.println("	Octal: " + octal);

                        // Convert to Hexadecimal
                        decimalCopy = decimal;
                        String hex = "";
                        while (decimalCopy > 0) {
                            int rem = decimalCopy % 16;
                            if (rem < 10) {
                                hex = (char) (rem+'0' ) + hex;
                            } else {
                                hex = (char) ('A' + rem - 10) + hex;
                            }
                            decimalCopy /= 16;
                        }
                        if (hex.equals("")) hex = "0";
                        System.out.println("	Hexadecimal: " + hex);
                        System.out.println("");
                        System.out.print("Do you want to go to homepage (Y/N)? ");
                        if (!scanner.next().equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                }
            } else if (option == 3) {
                while (true) {
		                  System.out.println("+--------------------------------------------------------------+");
                                  System.out.println("|                  Octal Converter                             |");
                                  System.out.println("+--------------------------------------------------------------+");
                                     System.out.println("");
                   System.out.println("");
                    System.out.print("Enter an octal number: ");
                       System.out.println("");
                    String octal = scanner.next();
                    boolean isValidOctal = true;
                    for (int i = 0; i < octal.length(); i++) {
                        if (octal.charAt(i) < '0' || octal.charAt(i) > '7') {
                            isValidOctal = false;
                            break;
                        }
                    }
                    if (!isValidOctal) {
						System.out.println("	Invalid input... (Please enter an octal number)");
                        System.out.print("Do you want to input number again (Y/N)? ");
                        if (!scanner.next().equalsIgnoreCase("Y")) {
                            break;
                        }
                    } else {
                        // Convert Octal to Decimal
                        int decimal = 0;
                        for (int i = 0; i < octal.length(); i++) {
                            decimal = decimal * 8 + (octal.charAt(i) - '0');
                        }
                        System.out.println("	Decimal: " + decimal);

                        // Convert to Binary
                        int decimalCopy = decimal;
                        String binary = "";
                        while (decimalCopy > 0) {
                            binary = (decimalCopy % 2) + binary;
                            decimalCopy /= 2;
                        }
                        if (binary.equals("")) binary = "0";
                        System.out.println("	Binary: " + binary);

                        // Convert to Hexadecimal
                        decimalCopy = decimal;
                        String hex = "";
                        while (decimalCopy > 0) {
                            int rem = decimalCopy % 16;
                            if (rem < 10) {
                                hex = (char) ('0' + rem) + hex;
                            } else {
                                hex = (char) ('A' + rem - 10) + hex;
                            }
                            decimalCopy /= 16;
                        }
                        if (hex.equals("")) hex = "0";
                        System.out.println("	Hexadecimal: " + hex);
                        System.out.println(""); 
                        System.out.print("Do you want to go to homepage (Y/N)? ");
                        if (!scanner.next().equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                }
            } else if (option == 4) {
                while (true) {
			        System.out.println("+--------------------------------------------------------------+");
                                System.out.println("|                 Hexadecimal Converter                        |");
                                System.out.println("+--------------------------------------------------------------+");
                                System.out.println("");
                      System.out.println("");
                    System.out.print("Enter a hexadecimal number: ");
                    String hex = scanner.next().toUpperCase();
                    boolean isValidHex = true;
                    for (int i = 0; i < hex.length(); i++) {
                        char ch = hex.charAt(i);
                        if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))) {
                            isValidHex = false;
                            break;
                        }
                    }
                    if (!isValidHex) {
						System.out.println("	Invalid input... (Please enter a hexadecimal number)");
                        System.out.print("Do you want to input number again (Y/N)? ");
                        if (!scanner.next().equalsIgnoreCase("Y")) {
                            break;
                        }
                    } else {
                        // Convert Hex to Decimal
                        int decimal = 0;
                        for (int i = 0; i < hex.length(); i++) {
                            char ch = hex.charAt(i);
                            if (ch >= '0' && ch <= '9') {
                                decimal = decimal * 16 + (ch - '0');
                            } else {
                                decimal = decimal * 16 + (ch - 'A' + 10);
                            }
                        }
                        System.out.println("	Decimal: " + decimal);

                        // Convert to Binary
                        int decimalCopy = decimal;
                        String binary = "";
                        while (decimalCopy > 0) {
                            binary = (decimalCopy % 2) + binary;
                            decimalCopy /= 2;
                        }
                        if (binary.equals("")) binary = "0";
                        System.out.println("	Binary: " + binary);

                        // Convert to Octal
                        decimalCopy = decimal;
                        String octal = "";
                        while (decimalCopy > 0) {
                            octal = (decimalCopy % 8) + octal;
                            decimalCopy /= 8;
                        }
                        if (octal.equals("")) octal = "0";
                        System.out.println("	Octal: " + octal);

                        System.out.print("Do you want to go to homepage (Y/N)? ");
                        if (!scanner.next().equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                }
            } else if (option == 5) {
                                             System.out.println("+--------------------------------------------------------------+");
                                             System.out.println("|                      Roman Converter                         |");
                                             System.out.println("+--------------------------------------------------------------+");
                                              System.out.println("");
                                              System.out.println("");
                   System.out.println("[1] Decimal to Roman Number Converter");
                   System.out.println("");
                   System.out.println("[2] Roman to Decimal Number Converter");
                   System.out.print("Enter an option: ");
                   int subOption = scanner.nextInt();

                if (subOption == 1) {
                    while (true) {
                        System.out.print("Enter a positive decimal number (1-3999): ");
                        int decimal = scanner.nextInt();
                        if (decimal < 1 || decimal > 3999) {
						    System.out.print("		Invalid input ");
                            System.out.print("Invalid input. Do you want to input number again (Y/N)? ");
                            if (!scanner.next().equalsIgnoreCase("Y")) {
                                break;
                            }
                        } else {
                            // Convert Decimal to Roman
                            String roman = "";
                            while (decimal >= 1000) { 
								roman += "M";
							    decimal -= 1000;
						    }
                            if (decimal >= 900) {
							    roman += "CM"; 
								decimal -= 900;
						    }while (decimal >= 500) { 
								roman += "D"; 
								decimal -= 500;
						    }if (decimal >= 400) { 
								roman += "CD";
							    decimal -= 400; 
							}while (decimal >= 100) {
								 roman += "C";
								 decimal -= 100; 
							}if (decimal >= 90) { 
								roman += "XC"; 
								decimal -= 90; 
							}while (decimal >= 50) { 
								roman += "L";
							    decimal -= 50; 
							} if (decimal >= 40) { 
								roman += "XL"; 
								decimal -= 40;
						    } while (decimal >= 10) { 
								roman += "X"; 
								decimal -= 10;
						    }if (decimal >= 9) { 
								roman += "IX"; 
								decimal -= 9;
						    }
                            while (decimal >= 5) {
								 roman += "V"; 
								 decimal -= 5;
						    }
                            if (decimal >= 4) { 
								roman += "IV"; 
								decimal -= 4;
						    }
                            while (decimal >= 1) {
								 roman += "I"; 
								 decimal -= 1;
						    }
                            System.out.println("	Roman Number: " + roman);
                             System.out.println("");  
                            System.out.print("Do you want to go to homepage (Y/N)? ");
                            if (!scanner.next().equalsIgnoreCase("N")) {
                                break;
                            }
                        }
                    }
                } else if (subOption == 2) {
                    while (true) {
                              System.out.print("Enter a Roman number: ");
                              String roman = scanner.next().toUpperCase();
                              boolean isValidRoman = true;
                        for (int i = 0; i < roman.length(); i++) {
                            char ch = roman.charAt(i);
                            if (!(ch == 'I' || ch == 'V' || ch == 'X' || ch == 'L' || ch == 'C' || ch == 'D' || ch == 'M')) {
                                isValidRoman = false;
                                break;
                            }
                        }
                        if (!isValidRoman) {
							 System.out.print("	Invalid input");
                                                         System.out.print(" Do you want to input number again (Y/N)? ");
                            if (!scanner.next().equalsIgnoreCase("Y")) {
                                break;
                            }
                        } else {
                            // Convert Roman to Decimal
                            int decimal = 0;
                            for (int i = 0; i < roman.length(); i++) {
                                char ch = roman.charAt(i);
                                if (ch == 'M') {
                                    decimal += 1000;
                                } else if (ch == 'D') {
                                    decimal += 500;
                                } else if (ch == 'C') {
                                    if (i + 1 < roman.length() && (roman.charAt(i + 1) == 'D' || roman.charAt(i + 1) == 'M')) {
                                        decimal -= 100;
                                    } else {
                                        decimal += 100;
                                    }
                                } else if (ch == 'L') {
                                    decimal += 50;
                                } else if (ch == 'X') {
                                    if (i + 1 < roman.length() && (roman.charAt(i + 1) == 'L' || roman.charAt(i + 1) == 'C')) {
                                        decimal -= 10;
                                    } else {
                                        decimal += 10;
                                    }
                                } else if (ch == 'V') {
                                    decimal += 5;
                                } else if (ch == 'I') {
                                    if (i + 1 < roman.length() && (roman.charAt(i + 1) == 'V' || roman.charAt(i + 1) == 'X')) {
                                        decimal -= 1;
                                    } else {
                                        decimal += 1;
                                    }
                                }
                            }
                            System.out.println("	Decimal: " + decimal);
                            
                            System.out.println("");

                            System.out.print("Do you want to go to homepage (Y/N)? ");
                            if (!scanner.next().equalsIgnoreCase("N")) {
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("	Invalid option. Returning to main menu.");
                }
            } else {
                System.out.println("	Invalid option. Please choose a valid option.");
            }

            System.out.print("Do you want to exit the program (Y/N)? ");
            if (scanner.next().equalsIgnoreCase("Y")) {
                break;
            }
        }

        scanner.close();
    }
}
