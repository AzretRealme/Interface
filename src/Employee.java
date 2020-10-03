public class Employee extends EasyITCompany {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void goToVacation(){
        System.out.println(" Employee say: I am going to Sochi ");
    }
}
