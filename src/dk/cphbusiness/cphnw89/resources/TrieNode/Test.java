package dk.cphbusiness.cphnw89.resources.TrieNode;

public class Test {
    public static void main(String[] args) {

        TrieNode root = new TrieNode();
        root.insert("Hej");
        root.insert("Hejsa");
        root.insert("Goddav");
        root.insert("GoddavDu!");
        root.insert("Hello");
        root.insert("Hi");
        root.insert("Greetings");
        root.insert("Yo my g");

        System.out.println(root.lookUp("Hej"));
        System.out.println(root.getBestEnding(""));

    }
}
