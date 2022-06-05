package basic;

public class StaticVariableMemory {
    static int static_variable = 10;

    public static void main(String[] args) {
        StaticVariableMemory ref = new StaticVariableMemory();
        ref.function(); // 10 10
        ref.function(); //11 10
    }

    void function() {
        int local_variable = 10;
        System.out.println(static_variable + " " + local_variable);
        ++static_variable;
        ++local_variable;
    }
}
/* Static variable store data in memory and print from memory.
But local variable not store in memory and print old value again.
 */