public class Manager extends EasyITCompany {

    private String name;
    private String name2;

    public Manager() {

    }
    public Manager(String name, String name2) {
        this.name = name;
        this.name = name2;
    }
    public void goToDayOff(){
        System.out.println("Менеджеры, Вам нужен отгул");
    }



}