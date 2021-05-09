import java.util.*;
import java.io.*;
public class LibraryTest {
    public static void main(String[] args){ 
        Library l = new Library();
        try{
            FileReader in = new FileReader("Library_list.csv");
            BufferedReader reader = new BufferedReader(in);
            String line;
            while((line=reader.readLine())!=null){
                String[] array = line.split(",");
                if(l.doubleCheck(array[1])==true){
                    if(array[0].equals("Book")){
                        Book b = new Book(array[1],array[2],array[3],array[4],(Integer.parseInt(array[5])));
                        l.addPublishedItem(array[1],b);
                 }
                    else if(array[0].equals("Magazine")){
                        Magazine m = new Magazine(array[1],array[2],Integer.parseInt(array[3]),Integer.parseInt(array[4]),array[5],(Integer.parseInt(array[6])));
                        l.addPublishedItem(array[1],m);
                    }
                }
            }
            reader.close();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("‘İo‚Æ•Ô‹p‚Ç‚¿‚ç‚ğs‚¤‚©‚ÆAISBN”Ô†‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        //args[0]‚É‘İo‚Ü‚½‚Í•Ô‹pAargs[1]‚ÉISBN”Ô†‚ğ“ü—Í
        if(args[0].equals("‘İo")){
            l.specificLending(args[1]);
        }
        else if(args[0].equals("•Ô‹p")){
            l.specificReturn(args[1]);
        }
        try{
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("New_Library_file.csv")));
            for (PublishedItem p : l.map.values()){
                if(p.state==true){
                    writer.println(p+",‘İo’†");
                }
                else{
                    writer.println(p+",•Ô‹p’†");
                }
            }
            writer.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}