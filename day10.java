import java.util.*;
public class day10
{
    String name;
    day10(String name)
    {
        this.name=name;

    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s =new teacher();
        s.teach(this);

    }
    public static void main(String[] args) {
        day10 o=new day10("shaaz");
        o.agt();

    }
}
class teacher{
    public void teach(day10 s)
    {
        s.dis1();
    }
}