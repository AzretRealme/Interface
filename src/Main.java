
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
            //try - определяет блок кода, в котором может произойти исключение
               //catch - определяет блок кода, в котором происходит обработка исключения
               Developer dev = null;
               //объявили ссылку dev и присвоили ей значение null
               try {
                   dev = (Developer)developer1.clone();
                   //затем этой ссылке присвоили конкретный объект, который мы присвоили
               } catch (CloneNotSupportedException e) {
                   e.printStackTrace(); /* printStackTrace, инструмент для диагностики исключений,
                   говорит, что и где в коде это произошло*/
               }
               return dev;  //возвращаем dev
           }
    }

