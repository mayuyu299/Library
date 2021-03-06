public class Magazine extends PublishedItem {
    int volume; // 巻
    int issue; // 号
    
    Magazine(String num, String title, int volume, int issue, String publisher, int publishedYear)throws Exception{
        super(num,title,publisher,publishedYear);
        this.volume = volume;
        this.issue = issue;
    }

    int getVolume(){
        return this.volume;
    }
    int getIssue(){
        return this.issue;
    }

    @Override
    public String toString(){
        return "Magazine," + this.num + "," + this.title + "," + this.volume + "," + this.issue + "," + this.publisher + "," + this.publishedYear; 
    }

    boolean lending(){
        if(state!=true&&publishedYear<2010){
            this.state = true;
            return true;
        }
        else if(state!=true&&publishedYear>=2010){
            System.out.println("貸し出せません");
            return false;
        }
        else{
            System.out.println("現在貸し出し中です");
            return false;
        }
    }

    boolean putback(){
        if(state==true){
            this.state = false;
            return true;
        }
        else{
            System.out.println("貸し出されていません");
            return false;
        }
    }
}