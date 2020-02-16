import java.util.HashMap;
import java.util.Map;

public class CoordinatesUtil {

    public static Map<XyValue, Integer> getCoordinates() {
        final java.util.Map<XyValue, Integer> xyMap = new HashMap<>();
        xyMap.put(new XyValue("1", "3"), 2);
        xyMap.put(new XyValue("2", "3"), 5);
        xyMap.put(new XyValue("3", "3"), 8);
        xyMap.put(new XyValue("1", "2"), 1);
        xyMap.put(new XyValue("2", "2"), 4);
        xyMap.put(new XyValue("3", "2"), 7);
        xyMap.put(new XyValue("1", "1"), 0);
        xyMap.put(new XyValue("2", "1"), 3);
        xyMap.put(new XyValue("3", "1"), 6);
        return xyMap;
    }
}
