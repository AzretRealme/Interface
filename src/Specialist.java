public class Specialist extends EasyITCompany {

    private String name;
    private String name2;
    private String name3;

    public Specialist() {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName2() {

        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void workWithClients(){
        System.out.println("Specialist " + " workWithClients ");
    }
    public void goToVacation(){
        System.out.println("Specialist say: I am go to Stanbul");
    }
}
