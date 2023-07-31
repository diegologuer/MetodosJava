import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        printNameCharacters( name );
        printNameLength( name );
        
        System.out.println( "Enter your last name:  " );
        String lastName = console.next();
        printNameCharacters(name, lastName);
        
        
        console.close();
    }

    private static void printNameLength( String name )
    {
       System.out.println(name.length() + " characters");
    }

    private static void printNameCharacters( String name )
    {
    	for(int i=0; i<name.length(); i++) {
    		System.out.println(name.charAt(i));
    	}
    }
    
    private static void printNameCharacters(String name, String lastName) {
    	for(int i=0; i<name.length(); i++) {
    		System.out.println(name.charAt(i));
    	}
    	System.out.println();
    	for(int i=0; i<lastName.length(); i++) {
    		System.out.println(lastName.charAt(i));
    	}
    }


}