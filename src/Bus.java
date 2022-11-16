public class Bus extends Transport implements Сompeting {

    // public  static final String [] COMPETING_PITSTOP = new String[] {"Пит-стоп", "Лучшее время круга", "Максимальная скорость"};
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    protected void startMoving() {
        System.out.println("Вставить ключ в замок зажигания");
    }
    @Override
    protected void finishMovement() {
        System.out.println("Выключить зажигание и выйти из автобуса");
    }
    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                "} " + super.toString();
    }


    @Override
    public void pitStop() {
        System.out.println("Заправить машину и сменить резину");
        return;
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для автобуса");
        return;
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшая скорость круга у автобуса ");
        return;
    }
}
