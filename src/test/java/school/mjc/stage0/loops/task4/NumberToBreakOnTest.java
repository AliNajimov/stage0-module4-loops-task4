package school.mjc.stage0.loops.task4;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class NumberToBreakOnTest extends BaseIOTest {

    @Test
    void printNumbersUntilWithBreakOnPrintsNumbers() {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();

        numberToBreakOn.printNumbersUntilWithBreakOn(5, 10);

        assertOutEquals("1\n2\n3\n4\n5\n");
    }

    @Test
    void printNumbersUntilWithBreakOnIterateUntilBiggerThanBreakOn() {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();

        numberToBreakOn.printNumbersUntilWithBreakOn(6, 5);

        assertOutEquals("iterating till the end\n1\n2\n3\n4\n5\n");
    }

    @Test
    public void containsInitialConfigAndBreak() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/loops/task4/NumberToBreakOn.java");
        List<String> strings = Files.readAllLines(path);

        List<String> result = strings.stream()
                .filter(line -> line.contains("break") || line.contains("int i = 0; i < numberToGoUntil; i++")
                    || line.contains("int i = 1; i <= numberToGoUntil; i++"))
                .collect(Collectors.toList());

        assertEquals(1, result.size());
    }
}
