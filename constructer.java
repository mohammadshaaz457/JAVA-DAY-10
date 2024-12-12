class Constructor
{
    String name;
    Constructor()
    {
        name="ashraf,aejas";
    }
    Constructor(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.print(name);
    }
}
class ConstructorOverloading
{
    public static void main(String[] args)
    {
        Constructor c1=new Constructor();
        c1.display();
        Constructor c2=new Constructor(",shaaz");
        c2.display();
    }
}