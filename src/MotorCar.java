public class MotorCar extends Transport implements Сompeting {

    public MotorCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    protected void startMoving() {
        System.out.println("Завести двигатель");
    }
    @Override
    protected void finishMovement() {
        System.out.println("Заглушить машину");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                "} " + super.toString();
    }


    @Override
    public void pitStop() {
        System.out.println("Заехать в бокс");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Лучшая скорость у машины");

    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время у машины");

    }
}
