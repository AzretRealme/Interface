
public class Main {

        public static void main(String[] args){

           Developer developer = new Developer();
           Developer developer1 = foo(developer);

           developer.setName("Mark");
           developer1.setName("Bill");

           System.out.println(developer.getName());
           System.out.println(developer1.getName());
        }

           public static Developer foo(Developer developer1){
               Developer dev = null;
               //объявили ссылку dev и присвоили ей значение null
               try {
                   dev = (Developer)developer1.clone();
                   //затем этой ссылке присвоили конкретный объект, который мы присвоили
               } catch (CloneNotSupportedException e) {
                   e.printStackTrace();
               }
               return dev;  //возвращаем dev
           }
    }

