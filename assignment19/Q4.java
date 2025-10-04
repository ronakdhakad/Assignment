/*4. Smart Home Simulation
Design a class SmartHome with a non-static inner class Device. Each device should have a name, 
type (e.g., light, thermostat), and status (on/off). The outer class should:
Add and remove devices
Toggle device status
Display all devices
Include a static nested class DeviceUtils to:
Count active devices
Group devices by type */
import java.util.Scanner;
class SmartHome{
    Scanner sc = new Scanner(System.in);
    String name;
    String type;
    boolean status=false;
    void add(){
    }
    void remove(){
    }
    class Device{
    void set(){
        System.out.println(" Device Name: ");
        name=sc.nextLine();
        System.out.println(" Device Type: ");
        type=sc.nextLine();
    }
    void dis(){
        System.out.println(name+"\t"+type+"\t"+status);
    }
    }
    void toggle(){
        status=!status;
    }
    // static DeviceUtils{
    // }
}
class Main extends SmartHome{
    public static void main (String args[]){
        SmartHome s=new SmartHome();
        Device d[]=new Device[5];
        for(int i=0;i<d.length;i++){
            d[i]=s.new Device();
            d[i].set();
        }
        for(Device d1:d){
            d1.dis();
        }
    }
}