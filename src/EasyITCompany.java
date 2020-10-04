public abstract class EasyITCompany {
    private String name;
    private String grades;
    private boolean hasStocks;
    private boolean hasCompanyCar;

    public EasyITCompany(String name, String grades, boolean hasStocks, boolean hasCompanyCar) {
        this.name = name;
        this.grades = grades;
        this.hasStocks = hasStocks;
        this.hasCompanyCar = hasCompanyCar;
    }
    public EasyITCompany(){

    }
    public void EasyItCompany(){
        System.out.println("Говорит Компания ИЗИ");
    }
   abstract public void goToDayOff();

}
