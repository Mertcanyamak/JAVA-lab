import org.jsoup.*;
import org.jsoup.nodes.*;

import java.security.Security;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import java.net.*;
//import java.io.*;

public class SearchEngine {

    public Map<String, Set<String>> index = new HashMap<>();

    public void index(String url) throws Exception {
//        URL oracle = new URL(string);
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(oracle.openStream()));
//
//        String inputLine;
//        while ((inputLine = in.readLine()) != null)
//            System.out.println(inputLine);
//        in.close();
        Document doc = Jsoup.connect(url).get();
        String text = doc.text();
        //System.out.println(text);

        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            String word = matcher.group();
            Set<String> links = index.get(word);
            if (links==null){
                links = new HashSet<>();
                links.add(url);
                index.put(word, links);
            }else{
                links.add(url);
            }

            //System.out.println(word);
        }
        //System.out.println(index);
    }

    public Set<String> search(String input) {
        return index.get(input);
    }
}
