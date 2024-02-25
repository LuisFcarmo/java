package herance.obj;
import java.util.*;

public class dice {
   public static int roll(int limit) {
         Random ran = new Random();
         return ran.nextInt(limit);
   }
}
