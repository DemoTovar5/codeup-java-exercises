package Annotations;

class Red {
     public void show(){
         System.out.println("I am Red");
     }
}

class Orange extends Red{
    @Override

    // comments for the compiler //
    // checks to see if the compiler is doing it's job.
    // this method should be overriding the method in it's parent class. //

    public void show() {
        System.out.println("I am Orange");
    }
}

public class Colors {
    public static void main(String[] args) {
             Red red = new Red();
             Orange orange = new Orange();

             red.show();
             orange.show();
    }
}
