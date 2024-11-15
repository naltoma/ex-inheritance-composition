/* 継承の例：Animalクラスを継承してDogクラスを作成
 */

// 親クラス
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String speak() {
        return "Some sound";
    }
}

// 子クラス
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}

// 使用例
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println(dog.name);    // "Buddy"
        System.out.println(dog.speak()); // "Woof!"
    }
}
