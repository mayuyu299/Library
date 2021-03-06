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
            return false; //与えられた ISBN 番号を持つ本・雑誌を所蔵している
        }
        return true; //与えられた ISBN 番号を持つ本・雑誌を所蔵していない
    }

    static void specificLending(String ISBN){
        map.get(ISBN).lending();
    }

    static void specificReturn(String ISBN){
        map.get(ISBN).putback();
    }
}