public class Book extends PublishedItem{
    String author;// ����

    Book(String num,String title, String author, String publisher, int publishedYear)throws Exception{
        super(num,title,publisher,publishedYear);
        this.author = author;
        this.state = false;
    }
    
    String getAuthor(){
        return this.author;
    }

    @Override
    public String toString(){
        return "Book," + this.num + "," + this.title + "," + this.author + "," + this.publisher + "," + this.publishedYear; 
    }

    boolean lending(){
        if(this.state!=true){
            this.state = true;
            return true;
        }
        else{
            System.out.println("���ݑ݂��o�����ł�");
            return false;
        }
    }

    boolean putback(){
        if(state==true){
            this.state = false;
            return true;
        }
        else{
            System.out.println("�݂��o����Ă��܂���");
            return false;
        }
    }
    
}