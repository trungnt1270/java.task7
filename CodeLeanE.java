package bt.task7;

public class CodeLeanE extends CodeLeanB{
    public static void main(String[] args){
        new CodeLeanB().methodPublic();
        new CodeLeanB().methodProtected(); // compile time error

        // works, accessing super class protected method using subclass
        new CodeLeanE().methodProtected();
    }
}
