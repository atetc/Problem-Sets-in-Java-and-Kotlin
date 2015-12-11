package atetc.other;

import atetc.helpers.LinkedListNode;
import atetc.helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import static atetc.helpers.Printer.*;

public class Other {

    /**
     * Implement a method to perform basic string compression using the counts of
     * repeated characters. For example, the string aabcccccaaa would become
     * a2blc5a3. If the "compressed" string would not become smaller than the original
     * string, your method should return the original string.
     */

    static String compress(String s) {
        if (s == null || s.isEmpty()) return s;

        char prev = s.charAt(0);
        int cnt = 1;
        StringBuffer sb = new StringBuffer();
        sb.append(prev);
        for (int i = 1; i < s.length(); ++i) {
            char curr = s.charAt(i);
            if (curr == prev) {
                ++cnt;
            } else {
                prev = curr;
                sb.append(cnt)
                        .append(curr);
                cnt = 1;
            }
        }
        sb.append(cnt);

        return sb.toString().length() >= s.length() ? s : sb.toString();
    }

    public static LinkedListNode reverseList(LinkedListNode n) {
        if (n == null || n.next == null) return n;
        LinkedListNode head = n;
        LinkedListNode curr =  head.next;
        LinkedListNode next = curr.next;
        head.next = null;
        while (true) {
            curr.next = head;
            head = curr;
            curr = next;
            if (curr == null) break;
            next = curr.next;
        }
        return head;
    }

    /**
     * Write code to partition a linked list around a value x, such that all
     * nodes less than x come before all nodes greater than or equal to x.
     */

    static LinkedListNode partition(LinkedListNode n, int x) {
        LinkedListNode head1 = null, tail1 = null,
                head2 = null, tail2 = null;
        while (n != null) {
            if (n.data < x) {
                if (head1 == null) {
                    head1 = tail1 = n;
                } else {
                    tail1.next = n;
                    tail1 = n;
                }
            } else {
                if (head2 == null) {
                    head2 = tail2 = n;
                } else {
                    tail2.next = n;
                    tail2 = n;
                }
            }
            n = n.next;
        }
        // Trim tails
        if (tail1 != null) tail1.next = null;
        if (tail2 != null) tail2.next = null;

        // List1 is empty
        if (head1 == null) return head2;
        tail1.next = head2;
        return head1;
    }

    /**
     * Implement a function to check if a linked list is
     * a palindrome (like 0->1->2->1->0).
     */
    static boolean isPalindrome(LinkedListNode head) {
        if (head == null) return false;
        LinkedListNode p1 = head, p2 = head;
        Stack<Integer> s = new Stack<>();
        while (p2 != null && p2.next != null) {
            s.push(p1.data);
            p1 = p1.next;
            p2 = p2.next.next;
        }
        // handle odd nodes
        if (p2 != null) p1 = p1.next;
        while (p1 != null) {
            if(p1.data != s.pop()) return false;
            p1 = p1.next;
        }
        return true;
    }

    //TEST----------------------------------
    public static void main(String[] args) {
        println(isPalindrome(null));
        println(isPalindrome(LinkedListNode.buildList(new int[] {1})));
        println(isPalindrome(LinkedListNode.buildList(new int[] {1,1})));
        println(isPalindrome(LinkedListNode.buildList(new int[] {1,2,3,4,4,3,2,1})));
        println(isPalindrome(LinkedListNode.buildList(new int[] {1,2,3,4,4,3,3,2,1})));
    }

    /**
     * Implement a function to check if a binary tree is a binary search
     * tree. More precisely, the condition is that ALL left nodes must be
     * less than or equal to the current node, which must be less than ALL
     * the right nodes (for all nodes).
     */
    public static boolean isBSTNaive(BinaryTreeNode n) {
        if (n == null) return true;
        return smallerThan(n.left, n.value) &&
                largerThan(n.right, n.value) &&
                isBSTNaive(n.left) &&
                isBSTNaive(n.right);
    }

    private static boolean largerThan(BinaryTreeNode n, int val) {
        if (n == null) return true;
        return n.value > val && largerThan(n.left, val) && largerThan(n.right, val);
    }

    private static boolean smallerThan(BinaryTreeNode n, int val) {
        if (n == null) return true;
        return n.value <= val && smallerThan(n.left, val) && smallerThan(n.right, val);
    }

    public static boolean isBST(BinaryTreeNode n) {
        return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBST(BinaryTreeNode n, int min, int max) {
        if (n == null) return true;
        if (n.value <= min || n.value > max) return false;
        return isBST(n.left, min, n.value) && isBST(n.right, n.value, max);
    }

    // wrong implementation
    public static boolean isBSTWrong(BinaryTreeNode n) {
        if (n == null) return true;
        if (n.left != null && n.left.value > n.value) return false;
        if (n.right != null && n.right.value <= n.value) return false;
        return isBSTWrong(n.left) && isBSTWrong(n.right);
    }

    //TEST----------------------------------
    public static void main2(String[] args) {
        /*
         *     4
         *    / \
         *   2   5
         *  / \
         * 1   3
         */
        BinaryTreeNode n1 = new BinaryTreeNode(2), n2 = new BinaryTreeNode(3), r = new BinaryTreeNode(4);
        n1.left = new BinaryTreeNode(1); n1.right = n2;
        r.left = n1; r.right = new BinaryTreeNode(5);
        BinaryTreeNode.printTree(r);
        println("isBSTNaive: " + isBSTNaive(r));
        println("isBST:      " + isBST(r));
        println("isBSTWrong: " + isBSTWrong(r));
        println();
        /*
         *   2
         *  / \
         * 1   4
         *  \
         *   3
         */
        n1 = new BinaryTreeNode(1); n1.right = new BinaryTreeNode(3);
        r = new BinaryTreeNode(2); r.left = n1; r.right = new BinaryTreeNode(4);
        BinaryTreeNode.printTree(r);
        println("isBSTNaive: " + isBSTNaive(r));
        println("isBST:      " + isBST(r));
        println("isBSTWrong: " + isBSTWrong(r));
    }

    /**
     * An animal shelter holds only dogs and cats, and operates on a strictly
     * "first in, first out" basis. People must adopt either the "oldest"
     * (based on arrival time) of all animals at the shelter, or they can
     * select whether they would prefer a dog or a cat (and will receive
     * the oldest animal of that type). They cannot select which specific
     * animal they would like. Create the data structures to maintain this
     * system and implement operations such as enqueue, dequeueAny, dequeueDog
     * and dequeueCat.You may use the built-in LinkedList data structure.
     */

    static class Animal {
        String name;
        long timestamp;
        public Animal(String n) {
            name = n;
            timestamp = System.nanoTime();
        }
    }
    static class Dog extends Animal {
        public Dog(String n) { super(n); }
        public String toString() {
            return "Dog:" + name + ":" + timestamp;
        }
    }
    static class Cat extends Animal {
        public Cat(String n) { super(n); }
        public String toString() {
            return "Cat:" + name + ":" + timestamp;
        }
    }

    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();

    public void enqueue(Animal a) {
        if (a instanceof Dog) {
            dogs.add((Dog) a);
        } else if (a instanceof Cat) {
            cats.add((Cat) a);
        } else {
            throw new IllegalArgumentException("Unknown type of animal!");
        }
    }

    public Dog dequeueDog() {
        if (noDog()) throw new IllegalStateException("No dogs!");
        return dogs.removeFirst();
    }

    public Cat dequeueCat() {
        if (noCat()) throw new IllegalStateException("No cats!");
        return cats.removeFirst();
    }

    public Animal dequeueAny() {
        if (noAnimal()) {
            throw new IllegalStateException("No animals!");
        } else if (noDog()) {
            return dequeueCat();
        } else if (noCat()) {
            return dequeueDog();
        } else if (peekDog().timestamp < peekCat().timestamp) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public Dog peekDog() {
        if (noDog()) throw new IllegalStateException("No dogs!");
        return dogs.getFirst();
    }

    public Cat peekCat() {
        if (noDog()) throw new IllegalStateException("No cats!");
        return cats.getFirst();
    }

    public Animal peekAny() {
        if (noAnimal()) {
            throw new IllegalStateException("No animals!");
        } else if (noDog()) {
            return peekCat();
        } else if (noCat()) {
            return peekDog();
        } else if (peekDog().timestamp < peekCat().timestamp) {
            return peekDog();
        } else {
            return peekCat();
        }
    }

    public boolean noDog() {
        return dogs.isEmpty();
    }

    public boolean noCat() {
        return cats.isEmpty();
    }

    public boolean noAnimal() {
        return noDog() && noCat();
    }

    //TEST----------------------------------
//    public static void main(String[] args) {
//        Q7 shelter = new Q7();
//        shelter.enqueue(new Cat("lily"));
//        shelter.enqueue(new Dog("tom"));
//        shelter.enqueue(new Dog("peter"));
//        shelter.enqueue(new Cat("john"));
//        shelter.enqueue(new Cat("anne"));
//        println(shelter.dequeueAny());
//        println(shelter.dequeueCat());
//        println(shelter.dequeueAny());
//        shelter.enqueue(new Dog("tom"));
//        println(shelter.dequeueDog());
//        println(shelter.dequeueAny());
//        println(shelter.dequeueAny());
//    }

    /**
     * A monochrome screen is stored as a single array of bytes, allowing eight consecutive pixels
     * to be stored in one byte.The screen has width w, where w is divisible by 8 (that is, no byte
     * will be split across rows). The height of the screen, of course, can be derived from the length
     * of the array and the width. Implement a function drawHorizontalLine(byte[] screen, int width,
     * int x1, int x2, int y) which draws a horizontal line from (x1, y) to (x2, y).
     */
    public static void drawLine(byte[] screen, int width, int x1, int x2, int y) {
        int startOffset = x1 % 8;
        int firstByte = startOffset == 0 ? x1/8 : x1/8 + 1;
        int endOffset = x2 % 8;
        int lastByte = endOffset == 7 ? x2/8 : x2/8 - 1;

        // draw line for full bytes
        for (int i = firstByte; i <= lastByte; ++i) {
            screen[i + width/8*y] = (byte) 0xFF;
        }

        // draw start and end of line
        byte startMask = (byte) (0xFF >> startOffset);
        byte endMask = (byte) ~(0xFF >> (endOffset + 1));
        if (x1/8 == x2/8) {
            byte mask = (byte) (startMask & endMask);
            screen[x1/8 + width/8*y] |= mask;
        }
        else {
            if (startOffset != 0) {
                screen[firstByte - 1 + width/8*y] |= startMask;
            }
            if (endOffset != 7) {
                screen[lastByte + 1 + width/8*y] |= endMask;
            }
        }
    }

    //TEST----------------------------------
    public static void main4(String[] args) {
        byte[] screen = new byte[16];
        int width = 32;
        printScreen(screen, width);
        drawLine(screen, width, 0, 6, 0);
        printScreen(screen, width);
        drawLine(screen, width, 31,31, 1);
        drawLine(screen, width, 2, 29, 2);
        drawLine(screen, width, 1, 5, 3);
        printScreen(screen, width);
    }

    private static void printScreen(byte[] screen, int width) {
        int num = 1, widthNum = width/8;
        for (byte b : screen) {
            for (int i = 7; i >= 0; --i) {
                print((b >> i) & 1);
            }
            if (num % widthNum == 0) println();
            ++num;
        }
        println();
    }

//    You have a basketball hoop and someone says that you can play one of two
//    games.
//            Game 1: You get one shot to make the hoop.
//    Game 2: You get three shots and you have to make two of three shots.
//    If p is the probability of making a particular shot, for which values of p should
//    you pick one game or the other?
//
//    SOLUTION
//
//    Game 1:
//    P(game1) = p
//
//    Game 2:
//    P(game2)=P(make 1 and 2) + P(make 1 and 3) + P(make 2 and 3) + P(make 1, 2 and 3)
//    =p*p*(1-p) + p*(1-p)*p + (1-p)*p*p + p*p*p
//    =3p^2 - 2p^3
//
//    play Game 1 if:
//    P(game1) > P(game2)
//    => p > 3p^2 - 2p^3
//            => p(p-1)(2p-1) > 0 note that 0<=p<=1
//            => p < 1/2
//
//    If p = 0 or p = 1/2 or p = 1, then it doesn't matter which game to play.

//    There are three ants on different vertices of a triangle. What is the probability of
//    collision (between any two or all of them) if they start walking on the sides of the
//    triangle? Assume that each ant randomly picks a direction, with either direction
//    being equally likely to be chosen, and that they walk at the same speed.
//            Similarly, find the probability of collision with n ants on an n-vertex polygon.
//
//    SOLUTION
//
//    P(clockwise)=(1/2)^3,
//    P(counterclockwise)=(1/2)^3,
//    so P(same_direction)=P(clockwise)+P(counterclockwise)=1/4,
//    so P(collision)=1-P(same_direction)=3/4.
//
//    P(clockwise)=(1/2)^n,
//    P(counterclockwise)=(1/2)^n,
//    so P(same_direction)=P(clockwise)+P(counterclockwise)=(1/2)^(n-1),
//    so P(collision)=1-P(same_direction)=1-(1/2)^(n-1).

    /**
     * Given two lines on a Cartesian plane, determine whether the two lines
     * would intersect. Two same lines are considered to be intersected.
     */

    public static class Line {
        static final double EPSILON = 0.0000001;
        double slope;
        double yintercept;
        public Line(double slope, double yintercept) {
            this.slope = slope;
            this.yintercept = yintercept;
        }

        public Line(Point mid, Point mid1) {

        }
    }

    /*
     * XXX: Don't assume that the slope and y-intercept are integers.
     * Understand limitations of floating point representations. Never check
     * for equality with ==. Instead, check if the difference is less than an
     * epsilon value.
     */
    public static boolean intersect(Line l1, Line l2) {
        return Math.abs(l1.slope - l2.slope) > Line.EPSILON ||
                Math.abs(l1.yintercept - l2.yintercept) < Line.EPSILON;
    }

    //TEST----------------------------------
    public static void main3(String[] args) {
        Line l1 = new Line(0.4, 0.79), l2 = new Line(0.5, 0.9), l3 = new Line(0.4, 1.3);
        println(intersect(l1, l2));
        println(intersect(l3, l1));
        println(intersect(l3, l3));
    }

    /**
     * Write methods to implement the multiply, subtract, and divide
     * operations for integers. Use only the additional operator.
     */

    // returns a + b
    public static int add(int a, int b) {
        if (a > 0 && b > Integer.MAX_VALUE - a)
            throw new IllegalArgumentException("Addition overflow!");
        if (a < 0 && b < Integer.MIN_VALUE - a)
            throw new IllegalArgumentException("Addition underflow!");
        return a + b;
    }

    // returns a - b
    public static int subtract(int a, int b) {
        return add(a, negate(b));
    }

    // returns -a
    public static int negate(int a) {
        int base = a > 0 ? -1 : 1;
        int result = 0;
        while (a != 0) {
            a = add(a, base);
            result = add(result, base);
        }
        return result;
    }

    // returns a * b
    public static int multiply(int a, int b) {
        if (a == 0 || b == 0) return 0;
        int absA = abs(a), absB = abs(b);
        if (absA < absB) return multiply(b, a);
        boolean isNegative = a > 0 != b > 0;
        int result = 0;
        for (int i = 0; i < absB; ++i) {
            result = add(result, absA);
        }
        return isNegative ? negate(result) : result;
    }

    //returns a / b
    public static int divide(int a, int b) {
        if (a == 0) return 0;
        if (b == 0) throw new IllegalArgumentException("Divisor is zero!");
        int absA = abs(a), absB = abs(b);
        boolean isNegative = a > 0 != b > 0;
        int sum = absB, result = 0;
        while (sum < absA) {
            sum = add(sum, absB);
            result = add(result, 1);
        }
        return isNegative ? negate(result) : result;
    }

    // returns absolute value of a
    public static int abs(int a) {
        return a >= 0? a : negate(a);
    }

    //TEST----------------------------------
    public static void main5(String[] args) {
        test(9, 4);
        test(0, -1);
        test(-100, 999);
        test(-23456,-56781);
    }

    private static void test(int a, int b) {
        printfln("%d + %d = %d", a, b, add(a, b));
        printfln("%d - %d = %d", a, b, subtract(a, b));
        printfln("%d * %d = %d", a, b, multiply(a, b));
        printfln("%d / %d = %d", a, b, divide(a, b));
    }

    /**
     * Given two squares on a two-dimensional plane, find a line that
     * would cut these two squares in half. Assume that the top and
     * the bottom sides of the square run parallel to the x-axis.
     */

    public Line findLine(Square s1, Square s2) {
        return new Line(mid(s1), mid(s2));
    }

    private Point mid(Square s) {
        ArrayList<Point> points = s.points;
        int sumX = 0, sumY = 0, n = points.size();
        for (Point p : points) {
            sumX += p.x;
            sumY += p.y;
        }
        return new Point(sumX / n, sumY / n);
    }

    public class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public class Line2 {
        Point p1, p2;
        public Line2(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }
    }

    public class Square {
        ArrayList<Point> points;
        public Square(ArrayList<Point> points) {
            this.points = points;
        }
    }

}