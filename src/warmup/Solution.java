package warmup;

public class Solution {
    public static void main(String[] args) {
         Parent parent1 = new Parent();
        parent1 = parentPrint();

        Subclass child1 = new SubClass();
        child1.subclassPrint();
        child1.parentPrint();
    }
}
