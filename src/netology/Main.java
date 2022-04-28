package netology;


public class Main {

    public static void main(String[] args) {
        Person me = new PersonBuilder().
                setName("Sergey").
                setSurname("Egorov").
                setAge(35).
                setAddress("NN").
                build();

        Person you = new PersonBuilder().
                setName("Sergey").
                setSurname("Egorov").
                setAge(-9).
                //setAddress("NN").
                build();

        System.out.println(you);

        me.happyBirthday();

        System.out.println(me);

        Person son = me.newChildBuilder().
                setName("Artem").
                build();

        System.out.println(son);
    }

}
