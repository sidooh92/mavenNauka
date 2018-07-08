package our.mymap;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Main {
    public static void main(String[] args) {
        OurMap<String, Integer> map = new OurMap<>();
        map.put("Luty", asciValueOfMonth("Luty"));
        map.put("Maj", asciValueOfMonth("Maj"));
        map.put("Czerwiec", asciValueOfMonth("Czerwiec"));
        map.put("Lipiec", asciValueOfMonth("Lipiec"));

        map.put("KWIECIEN", asciValueOfMonth("kwiecien"));
        log.info("{}",map.get("Maj"));
        }

    private static Integer asciValueOfMonth(String month) {
        int sum = 0;
        byte[] ascii = month.getBytes();
        for (byte anAscii : ascii) sum += anAscii;
        return sum;
    }

}
