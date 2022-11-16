public class Main {
    public static void main(String[] args) {

        Bus vector = new Bus("Вектор", "NEXT 8.8", 11.6);
        Bus kavz = new Bus("Кавз Аврора", "4235", 10.7);
        Bus paz = new Bus("Паз", "4234", 12.1);
        Bus maz = new Bus("Маз", "131020", 11.3);

        MotorCar audi = new MotorCar("Audi", "A8 50 L TDI quattro", 3.0);
        MotorCar bmw = new MotorCar("BMW", "Z8", 3.0);
        MotorCar kia = new MotorCar("Kia", "Sportage 4-го поколения", 2.6);
        MotorCar lada = new MotorCar("Lada", "Granta", 1.7);

        Truck volvo = new Truck("Volvo", "FH", 12.8);
        Truck man = new Truck("Man", "TGL", 6.0);
        Truck hyundai = new Truck("Hyundai", "HD78", 3.9);
        Truck mercedesBenz = new Truck("Mercedes-Benz", "Atego", 4.3);


        Driver <MotorCar> sergei = new Driver<>("Зайцев Сергей Викторович", "категория B", 10,audi);
        Driver <Bus> alexei = new Driver<>("Белочкин Алексей Иванович", "Категория D", 8, vector);
        Driver <Truck> vadim = new Driver<>("Чернетта Вадим Александрович", "категория С", 9,volvo);


        System.out.println("Водитель " + sergei.getName() + " управляет автомобилем " + audi + " и будет участвовать в заезде " );
        sergei.start(audi);
        sergei.refuel(audi);
        sergei.stop(audi);
        System.out.println("Водитель " + alexei.getName() + " управляет автомобилем " + vector + " и будет участвовать в заезде " );
        alexei.start(vector);
        alexei.refuel(vector);
        alexei.stop(vector);
        System.out.println("Водитель " + vadim.getName() + " управляет автомобилем " + volvo + " и будет участвовать в заезде " );
        vadim.start(volvo);
        vadim.refuel(volvo);
        vadim.stop(volvo);


    }


}