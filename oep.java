class oep {
static boolean areRotations(String str1, String str2) {
// There lengths must be same and str2 must be
// a substring of str1 concatenated with str1. 
return (str1.length() == str2.length()) && (str1 + str1).indexOf(str2) != -1;
}
public static void main (String[] args) {
System.out.println("\n Riya Shah \t 170410107108");
String str1 = "tip";
String str2 = "pit";
if (areRotations(str1, str2))
System.out.println("Strings are rotations of each other");
 
else
System.out.println("Strings are not rotations of each other");
}
}
