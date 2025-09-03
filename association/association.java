class Engine{
    public void start(){
        System.out.println("Engine starts");
    }
}
class MusicPlayer{
    public void start(){
        System.out.println("Music player starts");
    }
}
class Car{
    Engine engine=new Engine();
    MusicPlayer player=new MusicPlayer();
    public void start(){
        System.out.println("Car starts");
    }
    void startEngine(){
        engine.start();
    }
     void startPlayer(){
        player.start();
    }
}
class Main{
    public static void main(String args[]){
        Car car=new Car();
        car.startEngine();
        car.startPlayer();
    }
}