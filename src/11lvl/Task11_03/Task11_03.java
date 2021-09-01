
public class Task11_03 {
// Название класса по задумке - "Skyscraper"
	private int floorsCount;
    private String developer;

    public Task11_03() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
        System.out.println("Количество этажей " + floorsCount + " застройщик " + developer);
    }
    public Task11_03(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
        System.out.println("Количество этажей " + floorsCount + " застройщик " + developer);
    }

    public static void main(String[] args) {
    	Task11_03 skyscraper = new Task11_03();
    	Task11_03 skyscraperUnknown = new Task11_03(50, "Неизвестно");
    }
}

