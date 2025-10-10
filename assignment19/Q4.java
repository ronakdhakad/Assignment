/*
4. Smart Home Simulation

Design a class SmartHome with a non-static inner class Device.
Each device should have a name, type (e.g., light, thermostat), 
and status (on/off). The outer class should:

· Add and remove devices

· Toggle device status

· Display all devices

Include a static nested class DeviceUtils to:

· Count active devices

· Group devices by type
 */

import java.util.Scanner;

class SmartHome {
    Device[] devices = new Device[10];
    int deviceCount = 0;

    void addDevice(String name, String type, boolean status) {
        devices[deviceCount] = new Device(name, type, status);
        deviceCount++;
    }

    void removeDevice(String name) {
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].name.equals(name)) {
                
                for (int j = i; j < deviceCount - 1; j++) {
                    devices[j] = devices[j + 1];
                }
                devices[deviceCount - 1] = null;
                deviceCount--;
                break;
            }
        }
    }

    void toggleDeviceStatus(String name) {
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].name.equals(name)) {
                devices[i].status = !devices[i].status;
                break;
            }
        }
    }

    void displayDevices() {
        for (int i = 0; i < deviceCount; i++) {
            devices[i].displayInfo();
        }
    }

    // non-static nested class
    class Device {
        String name;
        String type;
        boolean status;

        Device(String name, String type, boolean status) {
            this.name = name;
            this.type = type;
            this.status = status;
        }

        void displayInfo() {
            System.out.println("Name: " + name + ", Type: " + type + ", Status: " + (status ? "On" : "Off"));
        }
    }

    // static nested class
    static class DeviceUtils {
        static int countActiveDevices(SmartHome.Device[] devices, int deviceCount) {
            int count = 0;
            for (int i = 0; i < deviceCount; i++) {
                if (devices[i].status)
                    count++;
            }
            return count;
        }

        static void groupDevicesByType(SmartHome.Device[] devices, int deviceCount) {
            System.out.println("\nDevices grouped by type:");
            for (int i = 0; i < deviceCount; i++) {
                System.out.println("- " + devices[i].type + ": " + devices[i].name);
            }
            System.out.println();
        }
    }
}

class Test {
    public static void main(String[] args) {
        SmartHome sh = new SmartHome();

        sh.addDevice("Living Room Light", "Light", true);
        sh.addDevice("Bedroom Thermostat", "Thermostat", false);
        sh.addDevice("Kitchen Light", "Light", true);

        System.out.println("\nAll Devices:");
        sh.displayDevices();

        sh.toggleDeviceStatus("Bedroom Thermostat");

        System.out.println("\nAfter Toggling:");
        sh.displayDevices();

        sh.removeDevice("Kitchen Light");

        System.out.println("\nAfter Removing Kitchen Light:");
        sh.displayDevices();

        System.out.println("\nActive Devices: "
                + SmartHome.DeviceUtils.countActiveDevices(sh.devices, sh.deviceCount));
        SmartHome.DeviceUtils.groupDevicesByType(sh.devices, sh.deviceCount);
    }
}
