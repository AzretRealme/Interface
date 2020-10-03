public class Manager extends EasyITCompany {

    private String name;
    private String name2;

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

    public void writeProcedures() {
        System.out.println("Managers " + " WriteProcedures");
    }
    public void goToVacation(){
        System.out.println("Managers say:  I am going to Antaliya ");
    }
}