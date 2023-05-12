
 // Класс Dish представляет блюдо с определенными характеристиками.

public class Dish {
    private String dishName;
    private int price;
    private int weight;
    private String typeOne;
    private String typeTwo;


     // Конструктор по умолчанию, инициализирует все поля значениями по умолчанию.
    public Dish() {
        this.dishName = "";
        this.price = 0;
        this.weight = 0;
        this.typeOne = "";
        this.typeTwo = "";
    }

    
    //Конструктор копирования, создает копию объекта Dish.
     
    public Dish(Dish other) {
        this.dishName = other.dishName;
        this.price = other.price;
        this.weight = other.weight;
        this.typeOne = other.typeOne;
        this.typeTwo = other.typeTwo;
    }

    
    //Метод копирования, создает и возвращает копию текущего объекта Dish.
    
    public Dish clone() {
        return new Dish(this);
    }

    
    //Метод сравнения, сравнивает текущий объект Dish с другим объектом Dish.
    
    public boolean equals(Dish other) {
        if (other == null) {
            return false;
        }
        return this.dishName.equals(other.dishName) && this.price == other.price && this.weight == other.weight && this.typeOne.equals(other.typeOne) && this.typeTwo.equals(other.typeTwo);
    }

    
    //Метод чтения из потока.

    public void readFromStream(DataInputStream in) throws IOException {
        this.dishName = in.readUTF();
        this.price = in.readInt();
        this.weight = in.readInt();
        this.typeOne = in.readUTF();
        this.typeTwo = in.readUTF();
    }

    
    //Метод записи в поток.
     
    public void writeToStream(DataOutputStream out) throws IOException {
        out.writeUTF(this.dishName);
        out.writeInt(this.price);
        out.writeInt(this.weight);
        out.writeUTF(this.typeOne);
        out.writeUTF(this.typeTwo);
    }

    
    //Геттер для названия блюда.
     
    public String getDishName() {
        return dishName;
    }

    //Сеттер для названия блюда
    
     public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    
    
    //Геттер для цены блюда.
  
    public int getPrice() {
        return price;
    }

    
    //Сеттер для цены блюда.
    
    public void setPrice(int price) {
        this.price = price;
    }

    
    //Геттер для веса блюда.
   
    public int getWeight() {
        return weight;
    }

    
    //Сеттер для веса блюда.
  
    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    //Геттер для категроии блюда.
   
    public String getTypeOne() {
        return typeOne;
    }

    
    //Сеттер для категории блюда.
   
    public void setTypeOne(String typeOne) {
        this.typeOne = typeOne;
    }

    
    //Геттер для типа блюда.
  
    public String getTypeTwo() {
        return typeTwo;
    }

    
    //Сеттер для типа блюда.
   
    public void setTypeTwo(String typeTwo) {
        this.typeTwo = typeTwo;
    }
}


