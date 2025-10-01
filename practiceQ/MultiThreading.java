class First{
     void display(){
        System.out.println("Thread : "+Thread.currentThread());
        try{
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" Peter");
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        try{
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"Andrew");
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
class Second extends Thread{
    First obj;
    Second(First obj){
        this.obj=obj;
    }
    // @Override
    public void run(){
        obj.display();
    }
}
class MultiThreading {
    public static void main(String args[]){
        First obj=new First();
        Second s1=new Second(obj);
        Second s2=new Second(obj);
        Second s3=new Second(obj);
        s1.start();
        try{
            s1.join(10);
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        s2.start();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        s3.start();
    }   
}
