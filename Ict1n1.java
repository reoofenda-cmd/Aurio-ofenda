package projects;
import java.util.Scanner;
import java.util.Random;
public class Ict1n1 {
	    public static final String RESET = "\u001B[0m";
	    public static final String BLACK = "\u001B[30m";
	    public static final String RED = "\u001B[31m";
	    public static final String GREEN = "\u001B[32m";
	    public static final String YELLOW = "\u001B[33m";
	    public static final String BLUE = "\u001B[34m";
	    public static final String PURPLE = "\u001B[35m";
	    public static final String CYAN = "\u001B[36m";
	    public static final String WHITE = "\u001B[37m";

	 
	    public static void loadingScreen() throws InterruptedException {
	        String[] COLORS = {
	            "\u001B[31m", // Red
	            "\u001B[32m", // Green
	            "\u001B[33m", // Yellow
	            "\u001B[34m", // Blue
	            "\u001B[35m", // Purple
	            "\u001B[36m", // Cyan
	        };
	        Random rand = new Random();
	        int randomIndex = rand.nextInt(COLORS.length); 
	        String color = COLORS[randomIndex];
	        
	        
	        System.out.println("\n" + "\u001B[37m" + "                                        PLEASE WAIT, LOADING..." + "\u001B[0m");
	        System.out.println("                                        ===============================================================");

	        for (int i = 0; i < 1; i++) {
	            System.out.print(("                                        ") + color + "██     ██ ███████  ██       ██████   ██████  ███    ███ ███████     ");
    	        Thread.sleep(500);
    	        System.out.println();

    	        System.out.print(("                                        ")  + color + "██     ██ ██       ██      ██       ██    ██ ████  ████ ██        ");
    	        Thread.sleep(600);
    	        System.out.println();

    	        System.out.print(("                                        ") + color + "██  █  ██ █████    ██      ██       ██    ██ ██ ████ ██ █████       ");
    	        Thread.sleep(400);
    	        System.out.println();

    	        System.out.print(("                                        ")  + color + "██ ███ ██ ██       ██      ██       ██    ██ ██  ██  ██ ██        ");
    	        Thread.sleep(500);
    	        System.out.println();

    	        System.out.println(("                                        ")  + color + " ███ ███  ███████  ███████  ██████   ██████  ██      ██ ███████     " + BLACK + RESET);
    	        Thread.sleep(800);
            
    	        System.out.println(("                                        ") + ("==============================================================="));
    	        
                System.out.println(WHITE + ("                                        ") + "PLEASE WAIT FOR A BIT.");
                Thread.sleep(100);
            
            System.out.println("");
            Thread.sleep(2000);
	            Thread.sleep(150);
	        }

	        System.out.println("\u001B[32m" + "                                        LOADING COMPLETE!" + "\u001B[0m");
	        Thread.sleep(800);
	        
	        System.out.println();	    }

	    // Calculator
	    
	    public static void calculator(Scanner sc)throws InterruptedException {
	    	String[] COLORS = {
		            "\u001B[31m", // Red
		            "\u001B[32m", // Green
		            "\u001B[33m", // Yellow
		            "\u001B[34m", // Blue
		            "\u001B[35m", // Purple
		            "\u001B[36m", // Cyan
		        };
		        Random rand = new Random();
		        int randomIndex = rand.nextInt(COLORS.length); 
		        String color = COLORS[randomIndex];
		        
	        System.out.println((color + "\n                                                ") + "================= CALCULATOR =================");

	    	System.out.print(("                                                ") + "PLEASE WAIT");
	    	for (int i = 3; i > 0; i--) {	    		
	        	System.out.print(".");
	            Thread.sleep(1000);
	        }
	        System.out.print(("\n                                                ") + ("Enter first number: "));
	        double a = sc.nextDouble();
	        System.out.print(("\n                                                ") + "Enter operator (+ - * /):");
	        char op = sc.next().charAt(0);
	        System.out.print(("\n                                                ") + "Enter second number:");
	        double b = sc.nextDouble();

	        double result = 0;
	        switch (op) {
	            case '+': result = a + b; break;
	            case '-': result = a - b; break;
	            case '*': result = a * b; break;
	            case '/': 
	                if (b != 0) result = a / b;
	                else System.out.println(RED + "Error: Division by zero" + RESET);
	                break;
	            default: 
	                System.out.println(RED + "Invalid operator!" + RESET);
	                return;
	        }
	        System.out.println(("                                                ") + "Result: " + result);
	        System.out.println("                                                ============================================== "+ RESET);
	        
	     
	    }

	    // Conversion: mm, cm, m
	    public static void conversion(Scanner sc) throws InterruptedException {
	    	String[] COLORS = {
		            "\u001B[31m", // Red
		            "\u001B[32m", // Green
		            "\u001B[33m", // Yellow
		            "\u001B[34m", // Blue
		            "\u001B[35m", // Purple
		            "\u001B[36m", // Cyan
		        };
		        Random rand = new Random();
		        int randomIndex = rand.nextInt(COLORS.length); 
		        String color = COLORS[randomIndex];
		        
	        System.out.print((color + "\n                                                 ") + "============== UNIT CONVERSION ==============");
	    	System.out.print(("\n                                                 ") + "PLEASE WAIT");
	    	for (int i = 3; i > 0; i--) {	    		
	        	System.out.print(".");
	            Thread.sleep(1000); }
	            	  
	        System.out.print(("\n                                                 ") + "Enter value in millimeters (mm): ");
	        double mm = sc.nextDouble();
	        System.out.println(("                                                 ") + "In centimeters: " + (mm / 10));
	        System.out.println(("                                                 ") + "In meters: " + (mm / 1000));
	        System.out.println("                                                 ============================================="+ RESET);
	    }
	    
	    // Odd or Even
	    public static void oddEven(Scanner sc) throws InterruptedException {
	    	String[] COLORS = {
		            "\u001B[31m", // Red
		            "\u001B[32m", // Green
		            "\u001B[33m", // Yellow
		            "\u001B[34m", // Blue
		            "\u001B[35m", // Purple
		            "\u001B[36m", // Cyan
		        };
		        Random rand = new Random();
		        int randomIndex = rand.nextInt(COLORS.length); 
		        String color = COLORS[randomIndex];
		        
	        System.out.println(color + ("\n                                                 ") + "================ ODD OR EVEN ================");
	    	System.out.print(("                                                 ") + "PLEASE WAIT");
	    	for (int i = 3; i > 0; i--) {	    		
	        	System.out.print(("."));
	            Thread.sleep(1000); }
	            
	        System.out.print(("\n                                                 ") + "Enter a number: ");
	        int n = sc.nextInt();
	        if (n % 2 == 0)
	            System.out.println( n + ("                                               ") + "your number Even");
	        else
	            System.out.println(n + ("                                                ") + "your number is Odd");
	        System.out.println(("                                                 ") + "==============================================" + RESET);

	    }
	    
	    // Circle: area and circumference
	    public static void circle(Scanner sc) throws InterruptedException {
	    	String[] COLORS = {
		            "\u001B[31m", // Red
		            "\u001B[32m", // Green
		            "\u001B[33m", // Yellow
		            "\u001B[34m", // Blue
		            "\u001B[35m", // Purple
		            "\u001B[36m", // Cyan
		        };
		        Random rand = new Random();
		        int randomIndex = rand.nextInt(COLORS.length); 
		        String color = COLORS[randomIndex];
		        
	    	 System.out.println(color + ("                                                ") + "============= CIRCLE COMPUTATION =============");
	    	System.out.print(("                                                ") + "PLEASE WAIT");
	    	for (int i = 3; i > 0; i--) {	    		
	        	System.out.print(("."));
	            Thread.sleep(1000);
	    	}
	        System.out.print(("\n                                                ") + "Enter radius: ");
	        double r = sc.nextDouble();
	        double area = Math.PI * r * r;
	        double circumference = 2 * Math.PI * r;
	        System.out.printf(("                                                ") + "Area: %.2f%n", area);
	        System.out.printf(("\n                                                ") + "Circumference: %.2f%n" + RESET, circumference);
	        System.out.println(("                                                ") + "==============================================" + RESET);
	    }
	    
	    // About us
	    public static void aboutUs() {
	        System.out.println(GREEN + ("                     ") + "============================================= ABOUT US =============================================" + RESET);
	        System.out.println(RED + ("                             ") + "This project is a simple Menu-Driven System in Java.");
	        System.out.println(("                             ") + "It demonstrates calculator, conversions, circle formulas, and odd/even checking." + RESET);
	        System.out.println(("                                                 ") + "Developers: ");
	        System.out.println(("                                                 ") + BLUE + "LEADER - JAMES EVANZ C. VALDEZ" + RESET);
	        System.out.println(("                                                 ") + PURPLE + "MEMBERS:");
	        System.out.println(("                                                 ") + "1.FERMANTE");
	        System.out.println(("                                                 ") + "2.DE SOSA");
	        System.out.println(("                                                 ") + "3.ANASARIO");
	        System.out.println(("                                                 ") + "4.OFENDA");	      
	        System.out.println(GREEN + ("                     ") + "====================================================================================================" + RESET);
	        System.exit(0);

	    }

	    public static void main(String[] args) throws InterruptedException {
	        Scanner sc = new Scanner(System.in);
	        String[] COLORS = {
		            "\u001B[31m", // Red
		            "\u001B[32m", // Green
		            "\u001B[33m", // Yellow
		            "\u001B[34m", // Blue
		            "\u001B[35m", // Purple
		            "\u001B[36m", // Cyan
		        };
		        Random rand = new Random();
		        int randomIndex = rand.nextInt(COLORS.length); 
		        String color = COLORS[randomIndex];

	        loadingScreen();
	     

	        int choice;
	        do {
	            System.out.println(color +"                                            ░░                                                  ░░    \r\n"
	            		+ "                                            ████                                              ████    \r\n"
	            		+ "                                            ██▓▓██                                          ██  ██    \r\n"
	            		+ "                                            ██▓▓▓▓██                                      ██    ██    \r\n"
	            		+ "                                        ██████▓▓▓▓▓▓██████████████████████████████████████      ██████\r\n"
	            		+ "                                        ██▓▓▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒      ▒▒▒▒▒▒  ██\r\n"
	            		+ "                                        ██▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒      ░░▒▒▒▒    ██\r\n"
	            		+ "                                        ██░░▓▓▓▓▓▓▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒        ░░██\r\n"
	            		+ "                                        ██▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒░░▒▒▒▒▒▒    ▒▒▒▒        ▒▒▒▒  ██\r\n"
	            		+ "                                        ██▓▓▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒░░▒▒▒▒    ▒▒▒▒▒▒    ▒▒▒▒      ██\r\n"
	            		+ "                                        ██░░▓▓▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▒▒▒▒░░▒▒    ░░▒▒  ▒▒  ░░▒▒      ░░██\r\n"
	            		+ "                                        ██▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒     1. CALCULATOR           ▒▒▒▒      ▒▒  ██\r\n"
	            		+ "                                        ██▓▓▓▓▒▒▓▓▓▓▓▓▒▒▒                             ▒▒      ▒▒    ██\r\n"
	            		+ "                                        ██░░▓▓▓▓▒▒▒▒▓▓▒▒▓     2. CONVERSION           ▒▒  ▒▒▒▒    ░░██\r\n"
	            		+ "                                        ██░░▓▓▓▓▓▓▓▓▒▒▒▒▓                             ▒▒▒▒        ░░██\r\n"
	            		+ "                                        ██░░▒▒▓▓▓▓▓▓▓▓▒▒▒     3. ODD OR EVEN          ▒▒        ▒▒░░██\r\n"
	            		+ "                                        ██░░░░░░▓▓▓▓▓▓░░░                             ░░      ░░░░░░██\r\n"
	            		+ "                                        ██░░▒▒▒▒▒▒▓▓▓▓░░▒     4. CIRCLE COMPUTATION   ▒▒    ░░▒▒▒▒░░██\r\n"
	            		+ "                                        ██░░▓▓▓▓▒▒▒▒▓▓▒▒▓                             ▒▒  ▒▒▒▒    ░░██\r\n"
	            		+ "                                        ██░░▒▒▓▓▓▓▓▓▒▒▒▒▒     5. ABOUT US             ▒▒▒▒      ▒▒░░██\r\n"
	            		+ "                                        ██░░▒▒▓▓▓▓▓▓▓▓▒▒▓                             ▒▒        ▒▒░░██\r\n"
	            		+ "                                        ██░░▒▒▒▒▒▒▓▓▓▓▒▒▓     6. EXIT                 ▒▒    ▒▒▒▒▒▒░░██\r\n"
	            		+ "                                        ██░░▒▒▓▓▒▒▒▒▒▒▒▒▓                             ▒▒▒▒▒▒▒▒  ▒▒░░██\r\n"
	            		+ "                                        ██░░▒▒▓▓▓▓▓▓▓▓▒▒▒     ENTER CHOICE:           ▒▒        ▒▒░░██\r\n"
	            		+ "                                        ██░░▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒░░    ▒▒░░▒▒▒▒    ░░▒▒  ▒▒      ▒▒▒▒░░██\r\n"
	            		+ "                                        ██░░▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒░░  ▒▒▒▒░░▒▒▒▒    ░░▒▒▒▒      ░░▒▒▒▒░░██\r\n"
	            		+ "                                        ██░░▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓  ▒▒▒▒      ▒▒▒▒▒▒    ▒▒    ▒▒▒▒▒▒▒▒░░██\r\n"
	            		+ "                                        ██░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒    ▒▒    ░░▒▒▒▒      ▒▒▒▒▒▒▒▒░░██\r\n"
	            		+ "                                        ██░░░░▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒      ░░▒▒▒▒      ▒▒    ▒▒▒▒▒▒▒▒░░░░██\r\n"
	            		+ "                                        ██████░░░░▒▒▒▒▒▒▓▓▒▒▒▒    ▒▒▒▒░░        ▒▒▒▒  ▒▒▒▒▒▒░░░░██████\r\n"
	            		+ "                                              ████░░░░▒▒▒▒▒▒    ░░          ▒▒░░▒▒▒▒▒▒▒▒░░░░████      \r\n"
	            		+ "                                                  ████░░░░▒▒      ▒▒    ▒▒▒▒▓▓▓▓▓▓▒▒░░░░████          \r\n"
	            		+ "                                                      ██      ▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▓▓▓▓▓▓██              \r\n"
	            		+ "                                                    ██    ████░░░░▒▒▒▒░░▒▒▒▒░░░░████▓▓▓▓██            \r\n"
	            		+ "                                                  ██    ██    ████░░░░░░░░░░████    ██▓▓▓▓██          \r\n"
	            		+ "                                                ████████          ████░░████          ████████        \r\n"
	            		+ "                                                                      ██                              \r\n"
	            		+ RESET);
	            choice = sc.nextInt();
	            	            
	            
	            switch (choice) {
	                case 1: calculator(sc); break;
	                case 2: conversion(sc); break;
	                case 3: oddEven(sc); break;
	                case 4: circle(sc); break;
	                case 5: aboutUs(); break;
	                case 6: System.out.println(color +"EXITING...." 
	                +"\n                                                ⡏⠉⠉⠉⠉⠉⠉⠋⠉⠉⠉⠉⠉⠉⠋⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠙⠉⠉⠉⠹\r\n"
	                + "                                                ⡇⢸⣿⡟⠛⢿⣷⠀⢸⣿⡟⠛⢿⣷⡄⢸⣿⡇⠀⢸⣿⡇⢸⣿⡇⠀⢸⣿⡇ :\r\n"
	                + "                                                ⡇⢸⣿⣧⣤⣾⠿⠀⢸⣿⣇⣀⣸⡿⠃⢸⣿⡇⠀⢸⣿⡇⢸⣿⣇⣀⣸⣿⡇⠀:\r\n"
	                + "                                                ⡇⢸⣿⡏⠉⢹⣿⡆⢸⣿⡟⠛⢻⣷⡄⢸⣿⡇⠀⢸⣿⡇⢸⣿⡏⠉⢹⣿⡇⠀:\r\n"
	                + "                                                ⡇⢸⣿⣧⣤⣼⡿⠃⢸⣿⡇⠀⢸⣿⡇⠸⣿⣧⣤⣼⡿⠁⢸⣿⡇⠀⢸⣿⡇⠀:\r\n"
	                + "                                                ⣇⣀⣀⣀⣀⣀⣀⣄⣀⣀⣀⣀⣀⣀⣀⣠⣀⡈⠉⣁⣀⣄⣀⣀⣀⣠⣀⣀⣀⣰\r\n"
	                + "                                                ⣇⣿⠘⣿⣿⣿⡿⡿⣟⣟⢟⢟⢝⠵⡝⣿⡿⢂⣼⣿⣷⣌⠩⡫⡻⣝⠹⢿⣿⣷\r\n"
	                + "                                                ⡆⣿⣆⠱⣝⡵⣝⢅⠙⣿⢕⢕⢕⢕⢝⣥⢒⠅⣿⣿⣿⡿⣳⣌⠪⡪⣡⢑⢝⣇\r\n"
	                + "                                                ⡆⣿⣿⣦⠹⣳⣳⣕⢅⠈⢗⢕⢕⢕⢕⢕⢈⢆⠟⠋⠉⠁⠉⠉⠁⠈⠼⢐⢕⢽\r\n"
	                + "                                                ⡗⢰⣶⣶⣦⣝⢝⢕⢕⠅⡆⢕⢕⢕⢕⢕⣴⠏⣠⡶⠛⡉⡉⡛⢶⣦⡀⠐⣕⢕\r\n"
	                + "                                                ⡝⡄⢻⢟⣿⣿⣷⣕⣕⣅⣿⣔⣕⣵⣵⣿⣿⢠⣿⢠⣮⡈⣌⠨⠅⠹⣷⡀⢱⢕\r\n"
	                + "                                                ⡝⡵⠟⠈⢀⣀⣀⡀⠉⢿⣿⣿⣿⣿⣿⣿⣿⣼⣿⢈⡋⠴⢿⡟⣡⡇⣿⡇⡀⢕\r\n"
	                + "                                                ⡝⠁⣠⣾⠟⡉⡉⡉⠻⣦⣻⣿⣿⣿⣿⣿⣿⣿⣿⣧⠸⣿⣦⣥⣿⡇⡿⣰⢗⢄\r\n"
	                + "                                                ⠁⢰⣿⡏⣴⣌⠈⣌⠡⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣬⣉⣉⣁⣄⢖⢕⢕⢕\r\n"
	                + "                                                ⡀⢻⣿⡇⢙⠁⠴⢿⡟⣡⡆⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣵⣵⣿\r\n"
	                + "                                                ⡻⣄⣻⣿⣌⠘⢿⣷⣥⣿⠇⣿⣿⣿⣿⣿⣿⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
	                + "                                                ⣷⢄⠻⣿⣟⠿⠦⠍⠉⣡⣾⣿⣿⣿⣿⣿⣿⢸⣿⣦⠙⣿⣿⣿⣿⣿⣿⣿⣿⠟\r\n"
	                + "                                                ⡕⡑⣑⣈⣻⢗⢟⢞⢝⣻⣿⣿⣿⣿⣿⣿⣿⠸⣿⠿⠃⣿⣿⣿⣿⣿⣿⡿⠁⣠\r\n"
	                + "                                                ⡝⡵⡈⢟⢕⢕⢕⢕⣵⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣿⣿⣿⣿⣿⠿⠋⣀⣈⠙\r\n"
	                + "                                                ⡝⡵⡕⡀⠑⠳⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⢉⡠⡲⡫⡪⡪⡣."
	                + RESET); break;
	                default: System.out.println(RED + "Invalid choice!" + RESET);
	            }
	        } while (choice != 6);

	        sc.close();
}
}
