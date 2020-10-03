public class CEO extends EasyITCompany {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void goPublic(){
        System.out.println("CEO" + " Work IPO");
    }
    public void goToVacation(){
        System.out.println(" CEO say: I am going to Havail!");
    }

}
