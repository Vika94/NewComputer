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
        if (countOfCycle <= 1) {
            System.out.println("Ресурсы исчерпаны");
            return;
        }
        System.out.println("Введите 0 или 1 для включения компьютера");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isBurn) {
            System.out.println("Компу КОНЕЦ");
            return;
        } else if (isOn) {
            System.out.println("Компьютер и так включен");
            return;
        }
        Random random = new Random();
        int a = random.nextInt(2);
        if (n == a && !isBurn) {
            isOn = true;
            System.out.println("Компьютер включен");
            countOfCycle--;
        } else {
            isBurn = true;
            System.out.println("Компьютер сгорел");
        }
    }


    public void turnOff() {
        if (countOfCycle <= 1) {
            System.out.println("Ресурсы исчерпаны");
            return;
        }
        if (isBurn) {
            System.out.println("Компу КОНЕЦ");
            return;
        } else if (!isOn) {
            System.out.println("Компьютер и так выключен");
            return;
        }
        System.out.println("Введите 0 или 1 для чтобы выключить компьютера");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int a = random.nextInt(2);
        if (n == a) {
            System.out.println("Компьютер выключен");
            isOn = false;
        } else {
            isBurn = true;
            System.out.println("Компьютер сгорел");
        }
    }
}

