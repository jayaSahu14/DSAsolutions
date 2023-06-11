package FunctionalIntefaces.predicate;

import java.util.function.Predicate;

public class MyCustomPredicate implements Predicate<Integer> {
	
	@Override
	public boolean test(Integer t) {
		return t >= 18 && t < 25;}

	public static void main(String[] args) {
		MyCustomPredicate customPredicate = new MyCustomPredicate();

		System.out.println(customPredicate.test(10)); // false
		System.out.println(customPredicate.test(19)); // true

		// another way to use predicates is by lambda expressions
		Predicate<Integer> greaterThan45 = x -> x > 45;
		System.out.println(greaterThan45.test(90)); // true
		System.out.println(greaterThan45.test(30)); // false
	}}