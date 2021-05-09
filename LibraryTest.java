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
        System.out.println("�ݏo�ƕԋp�ǂ�����s�����ƁAISBN�ԍ�����͂��Ă�������");
        //args[0]�ɑݏo�܂��͕ԋp�Aargs[1]��ISBN�ԍ������
        if(args[0].equals("�ݏo")){
            l.specificLending(args[1]);
        }
        else if(args[0].equals("�ԋp")){
            l.specificReturn(args[1]);
        }
        try{
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("New_Library_file.csv")));
            for (PublishedItem p : l.map.values()){
                if(p.state==true){
                    writer.println(p+",�ݏo��");
                }
                else{
                    writer.println(p+",�ԋp��");
                }
            }
            writer.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}