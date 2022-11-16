public class Truck extends Transport implements Сompeting {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    protected void startMoving() {
        System.out.println("Запрыгнуть в кабину и завести двигатель");
    }
    @Override
    protected void finishMovement() {
        System.out.println("Выключить двигатель и спрыгнуть с подножки");
    }
    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                "} " + super.toString();
    }


    @Override
    public void pitStop() {
        System.out.println("Заехать на запраку");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у грузовика");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время для грузовика ");
    }
}
