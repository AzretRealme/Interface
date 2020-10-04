public class CEO extends EasyITCompany {

    private String name;

    public CEO() {

    }
    public CEO(String name) {
        this.name = name;
    }
    public void goToDayOff(){
        System.out.println("Директор, Вам нужен отгул");
    }

}
