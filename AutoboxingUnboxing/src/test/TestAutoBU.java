package test;

public class TestAutoBU {
    public static void main(String[] args) {
        
        Integer entero = 10;//autoboxing
        Float decimal = 5.55F;
        Boolean is= true;
        Character ch = 's';
        System.out.println("autounboxing: ");
        System.out.println("entero = " + entero+" decimal = " + decimal+" boolean = " + is+ " ch = " + ch);
        
        int entero2= entero;//unboxing
        float decimal2 = decimal;
        boolean is2= is;
        char ch2 = ch;
        System.out.println("unboxing");
        System.out.println("entero = " + entero2+" decimal = " + decimal2+" boolean = " + is2+ " ch = " + ch2);
    }
}
//clases envolventes primitivos
        /*
        int = Interger
        long = Long
        float = Float
        double = Double
        boolean = Boolean
        byte= Byte
        char = Character
        short = Short
        */