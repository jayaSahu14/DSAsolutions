package DataStructures.Java.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateLab {

	static Predicate<Integer> p1 = (a) -> a%2 == 0;

	static Predicate<Integer> p2 = (a) -> a%5 == 0;

	public static void andOperation() {
	System.out.println("And result : " + p1.and(p2).test(10));
	}

	public static void orOperation() {
	System.out.println("Or result : " + p1.or(p2).test(10));
	}

	public static void negateOperation() {
	System.out.println("Negate result : " + p1.or(p2).negate().test(10));
	}

	public static void main(String[] args) {

	System.out.println(p1.test(5));

	andOperation();
	orOperation();
	negateOperation();

	}
}
