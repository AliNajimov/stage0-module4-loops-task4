package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if(toBreakWith>numberToGoUntil){
            System.out.println("iterating till the end");
            for(int i = 0; i < numberToGoUntil; i++){
                System.out.println(i+1);
            }
        }else {
            for(int i = 1; i <= numberToGoUntil; i++){
                System.out.println(i);
            }
        }

    }
}
