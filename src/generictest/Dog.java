package generictest;

public class Dog<T> {

    private  T integerDog ;
    public Dog(T integerDog) {
       this.integerDog = integerDog;
    }

    public static <E> void show_3(E t){
        System.out.println(t.toString());
    }

    //在泛型类中声明了一个泛型方法，使用泛型T，注意这个T是一种全新的类型，可以与泛型类中声明的T不是同一种类型。
    public <T> void show_2(T t){
        System.out.println(t);


        System.out.println(integerDog.toString());
    }
}
