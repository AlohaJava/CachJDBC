import Cache.Cacheble;
import Source.H2DB;

import java.util.ArrayList;

public interface Test {
    @Cacheble(H2DB.class)
    public ArrayList<Integer> test(int n);
}
