public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        System.out.println("List Status : " + (myList.isEmpty() ? "Empty" : "Full"));
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(90);
        myList.add(50);
        myList.add(60);
        myList.add(70);

        System.out.println("List Status : " + (myList.isEmpty() ? "Empty" : "Full"));

        System.out.println("Index : " + myList.indexOf(20));

        System.out.println("Index : " + myList.indexOf(100));

        System.out.println("Index : " + myList.lastIndexOf(20));

        Object[] array = myList.toArray();
        System.out.println("First element of Object array : " + array[0]);

        MyList<Integer> mySubList = myList.subList(0, 3);
        System.out.println(mySubList.toString());

        System.out.println("Value 30 in my myList : " + myList.contains(30));
        System.out.println("Value 400 in my myList : " + myList.contains(400));

        myList.clear();
        System.out.println(myList.toString());

    }
}