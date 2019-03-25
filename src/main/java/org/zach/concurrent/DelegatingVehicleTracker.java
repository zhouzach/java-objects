package org.zach.concurrent;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class DelegatingVehicleTracker {

    private final ConcurrentHashMap<String, Point> locations;
    private final Map<String, Point> unmodifiableMap;

    public DelegatingVehicleTracker(Map<String, Point> map) {
        locations = new ConcurrentHashMap<>(map);
        unmodifiableMap = Collections.unmodifiableMap(locations);
    }

    public Map<String, Point> getLocations() {
        return unmodifiableMap;
    }

    public void setLocation(String id, int x, int y) {
        if(locations.replace(id, new Point(x, y)) == null)
            throw new IllegalArgumentException("invalid id: " + id);
    }


    private Map<String, Date> deepCopy(Map<String, Date> m) {
        Map<String, Date> result = new HashMap<>();
        for (String user : m.keySet()) {
            result.put(user, m.get(user));
        }
        return Collections.unmodifiableMap(result);
    }

    public String toString() {
        return unmodifiableMap.get("a").toString();
    }
    public static void main(String[] args) {
        Map<String, Point> map = new HashMap<>();
        map.put("a", new Point(1, 2));

        DelegatingVehicleTracker delegatingVehicleTracker = new DelegatingVehicleTracker(map);
        Map<String, Point> locations = delegatingVehicleTracker.getLocations();
//        Point point = locations.get("a");
//        point.x = 11;
        List l =Collections.synchronizedList(new ArrayList<>(3));

        System.out.println(locations);

        delegatingVehicleTracker.setLocation("a", 4, 5);
        System.out.println(locations);

    }

}

class Point {
    final int x, y;

    public Point(){x = 0; y= 0;}
    public Point(int x, int y){this.x = x; this.y= y;}
    public String toString() {
        return "x = " + x + "; y=" + y;
    }
}
