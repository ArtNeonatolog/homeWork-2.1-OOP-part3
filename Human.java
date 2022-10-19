public class Human {
    private final String name;
    private int age;
    private String cityOfLife;
    private String position;

    public int yearOfBirth () {
        if (age < 0) {
            age = 0;
            System.out.println("Возраст не может быть отрицательным! Установлено значение по умолчанию - " + age);
        } else {
            age = 2022 - age;
        }
        return age;
    }

    public Human (String name, int age, String cityOfLife, String position) {
        this.name = name;
        if (name == null) {
            System.out.println("Информация об имени не указана");
        }
        this.age = age;
        this.cityOfLife = cityOfLife;
        if (cityOfLife == null) {
            System.out.println("Информация о городе проживания не указана");
        }
        this.position = position;
        if (position == null) {
            System.out.println("Информация о должности не указана");
        }
    }

    private String getName () {
        return name;
    }

    private int getAge () {
            return age;
        }

    public String getCityOfLife () {
        return cityOfLife;
    }

    public String getPosition () {
        return position;
    }

    public void informationOgHuman () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfLife + ". Я родился (ась) в " + yearOfBirth() + " году. Я работаю на должности " + position + ". Будем знакомы!");
    }
}
