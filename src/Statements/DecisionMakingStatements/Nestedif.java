package Statements.DecisionMakingStatements;

public class Nestedif {
    public static void main(String[] args) {
        String address = "Pune";
        String name = "abc";
        if (address == "Pune")
        {
            if (name == "xyz")
            {
                System.out.println("address is pune & name is xyz");
            } else
            {
                if (name == "abc")
                {
                    System.out.println("address is pune & name is abc");
                }
            }
        } else
        {
            System.out.println("you are living in mumbai");
        }
    }
}

