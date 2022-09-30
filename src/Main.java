public class Main {
    public static void main(String[] args) {
        ERDict dictionary1 = new ERDict();

        System.out.println("");
        //dic.printDictionary();
        dictionary1.printWord("July");
        System.out.println("");
        dictionary1.addWord("add","добавить");
        dictionary1.addWord("fire","огонь");

        dictionary1.printDictionary();
        System.out.println("");
    }
}
