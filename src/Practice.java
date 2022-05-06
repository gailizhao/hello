import java.util.regex.Pattern;

/**
 * 
 */

/**
 * @author gzhao
 *
 */
public class Practice {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Practice tt = new Practice();
        tt.regex();
    }
    
    public void testRep() {
        // TODO Auto-generated method stub
        String test = new String("This is my GWL3 test, test again GWL3.  Thank you!");
        System.out.println("test " + test);
        String result = test.replaceAll("GWL3", "GWL6");
        System.out.println("test " + test);
        System.out.println("result " + result);
        System.out.println("test.replaceAll(\"GWL3\", \"GWL6\") " + test.replaceAll("GWL3", "GWL6"));
        System.out.println("test " + test);
        test = test.replaceAll("GWL3", "GWL6");
        System.out.println("test " + test);
    }
    
    
    public void regex() {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9/]*([*_\\-]+|//+)[a-zA-Z0-9/]*");
        String uri = "/rest//*_*/aaa";
        System.out.println(pattern.matcher(uri).matches());
        uri = "/rest/-/aaa";
        System.out.println(uri + " " + pattern.matcher(uri).matches());  
        uri = "/rest//aaa";
        System.out.println(uri + " " + pattern.matcher(uri).matches());   
        uri = "/rest///aaa";
        System.out.println(uri + " " + pattern.matcher(uri).matches());          
        uri = "/rest/v-v/aaa";
        System.out.println(uri + " " + pattern.matcher(uri).matches());  
        uri = "/rest/vv/aaa";
        System.out.println(uri + " " + pattern.matcher(uri).matches());  
        
        pattern = Pattern.compile("[a-zA-Z_0-9/]*[*_].*[a-zA-Z_0-9/]*|[a-zA-Z_0-9/]*/{2,}[a-zA-Z_0-9/]*");
        uri = "/rest/*/aaa/";
        System.out.println(pattern.matcher(uri).matches());
        uri = "/rest/_/aaa/";
        System.out.println(pattern.matcher(uri).matches());
        uri = "/rest///aaa/";
        System.out.println(pattern.matcher(uri).matches());
        
    }

}
