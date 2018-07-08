package our.mymap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        OurMapImpl<String, Integer> map = new OurMapImpl<>();
        map.put("Luty", asciValueOfMonth("Luty"));
        map.put("Maj", asciValueOfMonth("Maj"));
        map.put("Czerwiec", asciValueOfMonth("Czerwiec"));
        map.put("Lipiec", asciValueOfMonth("Lipiec"));
        map.put("KWIECIEN", asciValueOfMonth("kwiecien"));

        map.remove("Maj");

        log.info("{}",map.get("Maj"));
        }

    private static Integer asciValueOfMonth(String month) {
        int sum = 0;
        byte[] ascii = month.getBytes();
        for (byte anAscii : ascii) sum += anAscii;
        return sum;
    }

}
