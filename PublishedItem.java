abstract class PublishedItem {
    String num; // ISBN�ԍ�
    String title; // �^�C�g��
    String publisher; // �o�Ŏ�
    int publishedYear; // �o�ŔN
    boolean state; // �ݏo���

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