package Day9_Strings;

public class Topic2_StringMethods {
    public static void main(String[] args) {
        String str = "something";
        /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */

       //charAt()	          Returns the character at the specified index (position)	        char
       String str1 = "Tanya"; //Index or positions: T==>0 , a==>1, n==>2, y==>3, a==>4
       char ch = str1.charAt(0);
        System.out.println("The char at the position 0(or index 0): "+ ch);
        System.out.println("The char at the position 2(or index 2): "+ str1.charAt(2));



        //concat()	          Appends a string to the end of another string	                   String
        String FirstName = "Zeliha";
        String LastName = "Ungun";
        String Fullname = FirstName.concat(" "+ LastName);
        System.out.println("The full name is: "+ Fullname);

        //contains()	          Checks whether a string contains a sequence of characters	        boolean
        String str3 = "This is a test";
        boolean con = str3.contains("test");
        System.out.println("Contains the test :" +con);

        //endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
        String str4 = "This is the String";
        boolean ends = str4.endsWith("ing");
        System.out.println("does String end with ing: "+ends); //only check the characters at the end in the string

        //equals()	Compares two strings. Returns true if the strings are equal, and false if not         boolean
        String str5 = "Hello";
        String str6 = "Hello";
        boolean eq = str5.equals(str6);
        System.out.println("Are they equal? "+eq);
        String str7 = new String("Hello");
        boolean eq1 = str5.equals(str7);
        System.out.println("Are they equal in the new keyword as well? " + eq1);

        //equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
        String str8 = "Andy";
        String str9 = "andy";
        boolean eq3 = str8.equals(str9);
        System.out.println("Are they equal: "+eq3);
        boolean eq4 = str8.equalsIgnoreCase(str9);
        System.out.println("Are they equal when we ignore case: "+eq4);

        //indexOf()	   Returns the position of the first found occurrence of specified characters in a string      int.
        String str10 = "eloise";
        int pos = str10.indexOf('e');
        System.out.println("The index of e on the string: "+pos);

        //lastIndexOf()	   Returns the position of the last found occurrence of specified characters in a string    int
        String str11 = "eloise";
        int pos1 = str11.lastIndexOf('e');
        System.out.println("the last index of e: "+pos1);

        //isEmpty()	          Checks whether a string is empty or not	                        boolean
        String str12 = " ";
        System.out.println("is String Empty: "+(str12.isEmpty()));

        //length()	          Returns the length of a specified string	                        int
        String str13 = "hjaflgdlkjfdsgkjfdsgbvajrhuirehtlaif";
        System.out.println("the length of the string is: "+str13.length());

        //





    }
}
