package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private static final int INCREMENT_SALARY = 100;
    private final Warehouse warehouse;
    private boolean isPayed;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", warehouse=" + warehouse +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary = salary + INCREMENT_SALARY;
        warehouse.incrementDeliveredOrders();

    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;

    }


}
