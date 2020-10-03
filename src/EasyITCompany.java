public class EasyITCompany {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public boolean getHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public boolean getHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
    public void goToVacation(){

    }
}
