package day11.task1;

public class Picker implements Worker {
    private int salary=0;
    private static final int INCREMENT_SALARY=80;
    private final Warehouse warehouse;
    private boolean isPayed;

    public Picker(Warehouse warehouse) {
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
        return "Picker{" +
                "salary=" + salary +
                ", warehouse=" + warehouse +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary=salary+INCREMENT_SALARY;
        warehouse.incrementPickedOrders();

    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders()<10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary+=70000;
        isPayed=true;

    }
}
