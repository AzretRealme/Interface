public class Employee extends EasyITCompany {

    private String name;

    public Employee() {

    }
    public Employee(String name) {
        this.name = name;
    }
    public void goToDayOff(){
        System.out.println("Рабочие, Вам нужен отгул");
    }

}
