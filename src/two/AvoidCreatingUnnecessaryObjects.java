package two;
// String.matches internally creates a Pattern instance which
// is an expensive operation

import java.util.regex.Pattern;

// Reusing expensive object for improved performance
class RomanNumerals {

   // static boolean isRomanNumeral(String s) {
   //  return s.matches("^(?=.)M*(C[MD]|D?C{0,3})" +
   //             "X[CL]|L?X{0,3})(I[VX]|V?I{0,3})$");
   // }

    private static final Pattern ROMAN = Pattern.compile(
        "^(?=.)M*(C[MD]|D?C{0,3})" +
        "X[CL]|L?X{0,3})(I[VX]|V?I{0,3})$");
    
    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
