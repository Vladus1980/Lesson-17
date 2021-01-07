package Ex_01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Collection {

	private static Object [] number;

	Collection (Object [] number) {
		this.number= number;
		
	}
	public class Start implements Iterator{
		int count = 0;
		
		@Override
		public boolean hasNext() {
			
			return count < number.length;
		}

		@Override
		public Object next() {
			
			return number[count++];
		}
	}
		public Start newStart() {
			return new Start();
		}
		
	
	public class End implements Iterator{
		int count = number.length - 1;
		@Override
		public boolean hasNext() {
		
			return count >= 0;
		}

		@Override
		public Object next() {
		
			return number[count--];
		}
	}
		public End newEnd() {
			return new End();
		
		
	}
	public Iterator anonimIterator() {
		return new Iterator() {
			private int count = number.length-1;

			@Override
			public boolean hasNext() {
				
				return count >= 0;
			}

			@Override
			public Object next() {
				
			
				return number[count--];
			}
			
		};
	}
	
	public Iterator localIterator() {
		class LocalIterator implements Iterator{
			
			private int count = 0;
			@Override
			public boolean hasNext() {
				
				return count < number.length;
			}

			@Override
			public Object next() {
				
				return number[count++];
			};
		
		}
		return new LocalIterator();
	}
	
	static class IteratorStatic implements Iterator{

		private int count = 0;
		@Override
		public boolean hasNext() {
			
			return count < number.length;
		}

		@Override
		public Object next() {
			
			return number[count++];
		};
		
	}
	static IteratorStatic iteratorStatic() {
		return new IteratorStatic();
	}
	
}
