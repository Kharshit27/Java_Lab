class nest_In implements Showable.Message{  
    public void msg()
    {
        System.out.println("Hello nested interface");
    }  
    public static void main(String args[]){  
        nest_In message=new nest_In();//upcasting here  
        message.msg();  
    }  
}
interface Showable{  
    void show();  
    interface Message{  
        void msg();  
    }  
}  
  