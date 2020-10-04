public class Developer extends EasyITCompany {
    private String grades;
    private String name;
    private String name2;
    private String name3;
    private String name4;

    public Developer() {

    }
    public Developer(String grades) {
        this.grades = grades;
    }
    public void goToDayOff(){
        System.out.println("Разработчики, Вам нужен отгул");
    }

}
