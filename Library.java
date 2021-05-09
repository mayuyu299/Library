import java.util.*;
public class Library {
    static Map<String,PublishedItem> map = new HashMap<String,PublishedItem>();

    static Map<String,PublishedItem> returnMap(){
        return map;
    }

    static void addPublishedItem(String s,PublishedItem p){
        map.put(s,p);
    }

    static  boolean doubleCheck(String num){
        if(map.containsKey(num)){
            return false; //—^‚¦‚ç‚ê‚½ ISBN ”Ô†‚ğ‚Â–{EG‚ğŠ‘ ‚µ‚Ä‚¢‚é
        }
        return true; //—^‚¦‚ç‚ê‚½ ISBN ”Ô†‚ğ‚Â–{EG‚ğŠ‘ ‚µ‚Ä‚¢‚È‚¢
    }

    static void specificLending(String ISBN){
        map.get(ISBN).lending();
    }

    static void specificReturn(String ISBN){
        map.get(ISBN).putback();
    }
}