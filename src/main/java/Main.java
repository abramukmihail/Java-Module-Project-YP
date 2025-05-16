
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race=new Race();
           for (int number=1;number<=3;number++) {
               String nameCar;
               int speedCar = 0;
               boolean isValid = false;
               while (true) {
                   System.out.println("Введите название машины №" + number);
                   nameCar = scanner.nextLine();
                   if (nameCar.isEmpty()) {
                       System.out.println("Строка пустая, введите заново.");
                   } else
                       break;
               }
               while (!isValid) {
                   System.out.println("Введите скорость машины №" + number);
                   String speedCars = scanner.nextLine();

                   if (speedCars.trim().isEmpty()) {
                       System.out.println("Ошибка: ввод не может быть пустым!");
                       continue;
                   }

                   try {
                       speedCar = Integer.parseInt(speedCars.trim());
                       if (speedCar < 0 || speedCar > 250) {
                           System.out.println("Введена некорректная скорость, введите от 0 до 250!");
                       } else {
                           isValid = true;
                       }
                   } catch (NumberFormatException e) {
                       System.out.println("Ошибка: введено не целое число или буквы!");
                   }
               }
               Car car = new Car(nameCar, speedCar);

               race.race(car.nameCar,car.speedCar);
           }
        System.out.println("Самая бастрая машина: "+ race.liderCar);
        scanner.close();
    }
}