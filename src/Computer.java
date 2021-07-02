import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    int ram;
    int hardDrive;
    int countOfCycle;


    public void getInfo() {
        System.out.println("Процессор - " + processor + "\nОбъем оперативной памяти - " +
                ram + "\nОбъём жесткого диска - " + hardDrive + "\nКоличество циклов - " + countOfCycle);
    }

    boolean isBurn = false;
    boolean isOn = false;

    public void turnOn() {
        for (int i = countOfCycle; i > 0; i--) {
            System.out.println("Введите 0 или 1 для включения компьютера");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (isBurn) {
                System.out.println("Компу КОНЕЦ");
                return;
            }
            Random random = new Random();
            int a = random.nextInt(2);
            if (n == a && !isBurn) {
                isOn = true;
                System.out.println("Компьютер включен");
            } else {
                isBurn = true;
                System.out.println("Компьютер сгорел");
            }

            if (isOn) {
                turnOff();
            }

        }

    }
    public void turnOff() {
        System.out.println("Введите 0 или 1 для чтобы выключить компьютера");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int a = random.nextInt(2);
        if (n == a) {
            System.out.println("Компьютер выключен");
        } else {
            isBurn = true;
            System.out.println("Компьютер сгорел");
        }
    }
}

