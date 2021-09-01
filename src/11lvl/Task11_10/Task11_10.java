
public class Task11_10 {
// Название класса по задумке - "Iphone"
	private String model;
    private String color;
    private int price;

    public Task11_10(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    @Override
   public boolean equals(Object obj) {
       if (this == obj) return true;
       if (obj == null) return false;
       if (getClass() != obj.getClass()) return false;
       Task11_10 object = (Task11_10) obj;
       return model.equals (object.model) && color.equals (object.color);
       
   }

    public static void main(String[] args) {
    	Task11_10 iphone1 = new Task11_10("X", "Black", 999);
    	Task11_10 iphone2 = new Task11_10("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}

