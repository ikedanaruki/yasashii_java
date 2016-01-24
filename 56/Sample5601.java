import java.text.MessageFormat;

public class Sample5601 {
    public static void main(String args[]){
	Object[] argument = {123,65535,3.141592};
	String s = MessageFormat.format
	    ("a={0} , b={1,number,#} , d={2,number,#.########}"
	     ,argument);
	System.out.println(s);
    }
}



