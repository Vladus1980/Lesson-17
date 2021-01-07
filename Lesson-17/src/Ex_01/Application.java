package Ex_01;

public class Application {

	public static void main(String[] args) {
		
		Integer [] array = {123, 321, 456, 654, 780, 987, 741, 852, 963, 147, 258, 369, 951, 159, 754, 357};
		
		Collection collection = new Collection(array);
		Iterator iteratorStart = collection.newStart();
		
		while (iteratorStart.hasNext()) {
			
			System.out.println(iteratorStart.next());			
		}
		
		
		
		
		
		System.out.println();
		
		Iterator iteratorEnd = collection.newEnd();
		
		while (iteratorEnd.hasNext()) {
			System.out.println(iteratorEnd.next());
		}
		
		System.out.println();
		System.out.println("Зробити заміну непарних елементів на нуль і вивести на екран даний масив");
		
		Iterator iteratorStart0 = collection.newStart();
		
		while (iteratorStart0.hasNext()) {
			
				Integer integer = (Integer) iteratorStart0.next();
				if (integer % 2 == 0) {
					System.out.println(integer);
				} else {
					System.out.println("0");

				}						
						
		}
		
		System.out.println();
		System.out.println("Другого класу виводили від останнього до першого значення через одну цифру");
		
		Iterator iteratorEnd0 = collection.newEnd();
		
		while (iteratorEnd0.hasNext()) {
			Integer integer = (Integer) iteratorEnd0.next();
			int i = 0;
				if (i % 2 == 0) {
					System.out.println(" ");
				} else {
					System.out.println(integer);
				}
				
			System.out.println(iteratorEnd0.next());
		}

		System.out.println();
		System.out.println("Перевірити кожен третій елемент масиву від останнього чи він непарний, якщо так то вивести дані елементи на консоль.");
	
		Iterator anonimIterator = collection.anonimIterator();
		
		int i =0;
		while (anonimIterator.hasNext()) {
			Integer integer2 = (Integer) anonimIterator.next();
			
				if (i % 3 == 0) {
					if (i % 2 != 0) {
						System.out.println(integer2);
					}
					
				}
				
				i++;
		
		}
		System.out.println();
		System.out.println("перевірити кожен п’ятий елемент масиву, якщо він парний то відняти від нього число 100, і вивести на консоль ці числа");
		
		Iterator localIterator = collection.localIterator();
		
		int q = 1;
		while (localIterator.hasNext()) {
			Integer integer3 = (Integer) localIterator.next();
			
			if (q % 5 == 0 && q % 2 != 0) {
				
				integer3 = integer3 - 100;
				System.out.println(integer3);
				
			}
			q++;
		}
		
		
		
		System.out.println();
		System.out.println("Перевірити кожен другий елемент масив на парність, якщо він парний, тоді зробити з нього непарний і вивести дані елементи на консоль");
		
		Iterator iteratorStatic = collection.iteratorStatic();
		
		int w = 1;
		while (iteratorStatic.hasNext()) {
			Integer integer4 = (Integer) iteratorStatic.next();
			
			if (w % 2 == 0 ) {
				if(integer4 % 2 == 0) {
				integer4 = integer4 + 1;
				System.out.println(integer4);
			}
			}
			w++;
		}
		
	}
	
	
	

}

