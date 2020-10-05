public class Developer implements Cloneable{
    //implements Cloneable это интерфейс маркер, он не содержит ни методов, ни переменных.

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        /* Object clone() - выбрасывает исключение, CloneNotSupportedException -
         - при попытке клонировать объект не реализующий интерфейс Cloneable */
        return super.clone();
    }
}
