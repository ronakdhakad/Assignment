import java.lang.*;
class Table implements Runnable{
    public void run(){
        try{
            int t=2;
        for(int i=1; i<=10;i++){
            int table=t*i;
            System.out.println(t+" X "+i+" = "+table);
            Thread.sleep(1000);
        }
        }catch(Exception e){
            System.out.println("Exception:"+e);
        }
    }
}
class Main{
    public static void main(String args[]){
        Table obj = new Table();
        Thread th =new Thread(obj);
        th.start();
    }
}