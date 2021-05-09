abstract class PublishedItem {
    String num; // ISBN番号
    String title; // タイトル
    String publisher; // 出版社
    int publishedYear; // 出版年
    boolean state; // 貸出状態

    PublishedItem(String num,String title, String publisher, int publishedYear)throws Exception{
        if(num.length()==13){
            if(publishedYear>0){
                this.num = num;
                this.title = title;
                this.publisher = publisher;
                this.publishedYear = publishedYear;
            }
            else{
                throw new Exception();
            }
        }
        else{
            throw new Exception();
        }
    }

    String getNum(){
        return this.num;
    }

    String getTitle(){
        return this.title;
    }

    String getPublisher(){
        return this.publisher;
    }

    int getPublishedYear(){
        return this.publishedYear;
    }

    boolean getState(){
        return this.state;
    }


    abstract boolean lending();
    abstract boolean putback();
    
}