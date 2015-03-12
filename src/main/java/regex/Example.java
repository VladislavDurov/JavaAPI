package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

    private String regex;
    private String strSearch;
    private Pattern p;
    private Matcher m;

    public Example(String regex, String strSearch) {
        this.regex = regex;
        this.strSearch = strSearch;
        p = Pattern.compile(this.regex, Pattern.CASE_INSENSITIVE);
        m = p.matcher(this.strSearch);
    }

    public void replaceAll(String s){

        System.out.println(m.replaceAll(s));
    }

    public void replaceAll(String regex,String strSearch,String s){
        m.reset(strSearch);
        m.usePattern(Pattern.compile(regex, Pattern.CASE_INSENSITIVE));
        System.out.println(m.replaceAll(s));
    }

    public void split(){
        for (String s: p.split(strSearch))
            System.out.println(s);
    }

    public void split(int limit){
        for (String s: p.split(strSearch, limit))
            System.out.println(s);
    }

}
