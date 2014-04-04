package stack1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Ein einfacher Stack (Stapel - wie ein Stapel Holz) von Objekten. 
 * Ein Stapel funktioniert nach der 
 * LIFO-Methode - last in first out.
 * @author Weiser
 * @version 2014-03-13
 */
public class Stack1 {
	
	/** Der Stapel der Objekte. */
	private Object[] os;
	/** Der Zeiger auf den nächsten freien Platz. */
	private int tos;
	
	/**
	 * Ein neuer Stack wird erzeugt.
	 * @param size Die Größe des Stack (die maximale Anzahl der 
	 * Elemente.
	 */
	public Stack1(int size) {
		os = new Object[size];
		tos = 0;
	}
	
	/**
	 * Ein Objekt wird auf den Stapel gelegt.
	 * @param o Das Objekt.
	 */
	public void push(Object o) {
			os[tos++] = o;
	}
	
	/**
	 * Ein Objekt wir dvom Stapel heurnter geholt.
	 * @return das Objekt vom Stapel.
	 */
	public Object pop() {
		return os[--tos];
	}
	
	/**
	 * Prüft, ob der Stack leer ist.
	 * @return True wenn leer, sonst false.
	 */
	public boolean isEmpty() {
		return tos==0;
	}
	
	/**
	 * Prüft, ob der Stapel voll ist. 
	 * @return True wenn voll, sonst false.
	 */
	public boolean isFull() {
		return tos >= os.length;
	}


		public static int calc(int a,int b,char operatoren){
			int result = 0;
			switch(operatoren){
			case'+':
				result = a+b;
			break;
			case'-':
				result = a-b;
			break;
			case'*':
				result = a*b;
			break;
			case'/':
				result = a/b;
			break;
			case'%':
				result = a%b;
			break;
			default:
				throw new RuntimeException("Invalid operator");
			
			}
		return result;
		}


				@Test
					public void test1(){
						int rechnung = calc(25,5,'+');
						if(rechnung != 30){
							throw new RuntimeException("Falsch gerechnet");
						}
					}

				@BeforeClass
					static void beforeClassTest(){
						System.out.println("Method beforeClassTest");
					}
				@AfterClass
					static void afterClassTest(){
						System.out.println("Method afterClassTest");
					}
				@Test(expected=RuntimeException.class)
					public void testInvalid(){
						calc(5, 10,'?');
				}
			
		}

