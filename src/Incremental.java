class Incremental {
   private static Incremental INSTANCE = new Incremental();
   private static int count = 0;
   private int numero;

   public Incremental() {
      numero = ++count;
   }

   public static Incremental getInstance() {
      return INSTANCE;
   }

   public String toString() {
      return "Incremental " + numero;
   }
}
