package Task13_13;

public class Task14_17 {
//	Предполагается "Task14_17" вместо "Task14_17"
	public static final Task14_17 JANUARY = new Task14_17(0);
    public static final Task14_17 FEBRUARY = new Task14_17(1);
    public static final Task14_17 MARCH = new Task14_17(2);
    public static final Task14_17 APRIL = new Task14_17(3);
    public static final Task14_17 MAY = new Task14_17(4);
    public static final Task14_17 JUNE = new Task14_17(5);
    public static final Task14_17 JULY = new Task14_17(6);
    public static final Task14_17 AUGUST = new Task14_17(7);
    public static final Task14_17 SEPTEMBER = new Task14_17(8);
    public static final Task14_17 OCTOBER = new Task14_17(9);
    public static final Task14_17 NOVEMBER = new Task14_17(10);
    public static final Task14_17 DECEMBER = new Task14_17(11);
    
    public static final Task14_17[] array = {JANUARY, FEBRUARY, MARCH, APRIL, MAY,
                                        JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
                                        NOVEMBER, DECEMBER};
    private final int value;

   private Task14_17 (int value)
   {
      this.value = value;
   }

   public int ordinal()
   {
      return this.value;
   }

   public static Task14_17[] values()
   {
      return array;
   }
}
