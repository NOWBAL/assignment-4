package assignment_4;
import java.util.Arrays;
import java.util.List;

public class RemoveLeadingZero {

    class RemoveZero
    {
        public static String removeZero(String str)
        {
            // Count leading zeros
            int i = 0;
            while (i < str.length() && str.charAt(i) == '0')
                i++;

            StringBuffer sb = new StringBuffer(str);

            sb.replace(0, i, "");

            return sb.toString(); // return in String
        }
        
        public static void main (String[] args)
        {
            String str = "00000123569";
            str = removeZero(str);
            System.out.println(str);
        }
    }

}
