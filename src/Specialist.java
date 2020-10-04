public class Specialist extends EasyITCompany {

    private String name;
    private String name2;
    private String name3;

    public Specialist() {

    }

    public Specialist(String name) {
        this.name = name;
    }
    public void goToDayOff(){
        System.out.println("Специалисты, Вам нужен отгул");
    }

}
