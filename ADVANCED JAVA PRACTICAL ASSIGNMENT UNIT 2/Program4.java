//Write a program that will
//-create an array of 5 cars
//-print the array
//-add 2 cars at 3rd positins
//-print the array with changes
//-remove the car from 2nd position
//-print the array with changes

public class Program4 {
    public static void main(String[] args) {
        String[] cars = new String[]{"Car1", "Car2", "Car3", "Car4", "Car5"};

        System.out.println("Original Array:");
        printArray(cars);

        addCars(cars, 2, "NewCar1", "NewCar2");

        System.out.println("\nArray after adding cars at 3rd position:");
        printArray(cars);

        removeCar(cars, 1);

        System.out.println("\nArray after removing car from 2nd position:");
        printArray(cars);
    }

    private static void printArray(String[] array) {
        for (String car : array) {
            System.out.println(car);
        }
    }

    private static void addCars(String[] array, int position, String... newCars) {
        if (position >= 0 && position <= array.length) {
            for (String newCar : newCars) {
                if (position < array.length) {
                    System.arraycopy(array, position, array, position + 1, array.length - position - 1);
                }
                array[position] = newCar;
                position++;
            }
        }
    }

    private static void removeCar(String[] array, int position) {
        if (position >= 0 && position < array.length) {
            System.arraycopy(array, position + 1, array, position, array.length - position - 1);
        }
    }
}
