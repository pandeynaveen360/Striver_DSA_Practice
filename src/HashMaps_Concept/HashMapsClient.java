package HashMaps_Concept;

public class HashMapsClient {

    public static void main(String[] args) {

        Hashmaps map = new Hashmaps();

        map.put("Riya", 20);
        map.display();

        map.put("Akhil", 40);
        map.display();

        map.put("Rahul", 30);
        map.display();

        System.out.println("Get Riya: " + map.get("Riya"));
        System.out.println("Contains Akhil: " + map.containsKey("Akhil"));

        map.remove("Riya");
        map.display();
    }
}
