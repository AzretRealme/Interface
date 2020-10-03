
public class Main {

        public static void main(String[] args){

            EasyITCompany[] arr = new EasyITCompany[] {new Employee(), new Manager(),
                    new Developer(), new Specialist(), new CEO(), new EasyITCompany()};

            for(EasyITCompany easyITCompany: arr){
                easyITCompany.goToVacation();
            }

        }


    }

