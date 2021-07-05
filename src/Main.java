public class Main {
    public static void main(String[] args) {
        Computer villy = new Computer();
        villy.processor = "Intel";
        villy.ram = 8;
        villy.hardDrive = 512;
        villy.countOfCycle = 5;
        villy.getInfo();

        while (villy.countOfCycle > 1 && !villy.isBurn) {
            villy.turnOn();
            villy.turnOn();
            villy.turnOff();
        }




    }
}
