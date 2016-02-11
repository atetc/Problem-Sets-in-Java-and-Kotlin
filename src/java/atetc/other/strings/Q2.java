package atetc.other.strings;

/**
 * @author  Dev_Android on 11.02.2016.
 */
public class Q2 {

    public static int minReplacements(String intellect, String brand) {
        int result = 0;

        int counter = 0;
        while (counter < intellect.length()) {
            String source = intellect.substring(counter);
            int indexOf = source.indexOf(brand);

            if (indexOf >= 0) {
                result++;
                counter += indexOf + brand.length();
            } else {
                counter++;
            }
        }

        return result;
    }
}