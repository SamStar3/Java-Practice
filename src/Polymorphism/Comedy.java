package Polymorphism;

public class Comedy extends Movie{

    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny heppens",
                "Something even funnier happens",
                "Happy Ending");
    }

    public void watchComedy(){
        System.out.println("Watching an Comedy!");
    }
}
