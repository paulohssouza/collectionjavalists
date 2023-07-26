package br.com.paulohenrique.examplesorting;

public class Cat implements Comparable<Cat>{
    private String name;
    private Integer age;
    private String hairColor;

    public Cat(String name, Integer age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.name.compareToIgnoreCase(cat.getName());
    }
}
