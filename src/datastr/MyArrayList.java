package datastr;

public class MyArrayList {
	//1. mainigie
	private char[] list;
	private final int DEFAULT_SIZE =8; // pec noklusejuma bus 8 sunu masivs
	private int size = DEFAULT_SIZE;
	private int howManyElements = 0;
	//2. konstrokturi
	public MyArrayList() {
		list= new char[size];
	}
	public MyArrayList(int inputSize) {
		if(inputSize>0) {
			size=inputSize;
		}
			
		list= new char[inputSize];
	}
	
	//3. pamatalgoritmu funkcijas
	public boolean isEmpty() {
		//garais if variants
		if(howManyElements==0) {
			return true; // tukss
		}
		else {
			return false;// nav tukss
		}
		// isais if varinats
//		return (howManyElements==0) ? true:false;
	}
	public boolean isFull() {
		return (howManyElements==size);
	}
	private void resize() {
		int largeSize = (howManyElements<100)? size*2: (int)(size*1.5);
		char[] largeList = new char[largeSize];
		for(int i=0; i<howManyElements;i++) {
			largeList[i] = list[i];
		}
		list=largeList;
		System.gc();// izdzesis no RAM atminas mazo masiva
		size= largeSize;
		
	}
	public void add(char element) {
		if(isFull()) {
			resize();
		}
		list[howManyElements]= element;
		howManyElements++;
		
		
	}
	// pievieno elemntu
	public void add(char element, int index) throws Exception {
		if(index<0) {
			throw (new Exception("Nevar pievienot elemntu jo index ir negativs"));
			
		}
		if(index> howManyElements) {
			throw new Exception("Nevar pievienot elementu, jo index ir lielaks par elemntu");
		}
		if(isFull()) {
			resize();
		}
		if(index == howManyElements) {
			add(element);
		}
		else {
			if(isFull()) {
				resize();
			}
			for(int i = howManyElements;i>index;i--) {
				list[i]= list[i-1];
			}
			list[index]= element;
			howManyElements++;
		}
		
	}
	// iznem elemntu
	public void remove(int index) throws Exception{
		if(isEmpty()) {
			throw (new Exception("saraksts ir tukss"));
		}
		if(index<0) {
			throw (new Exception("Nevar izdzest elemntu"));
		}
		if(index>howManyElements) {
			throw (new Exception("nevar izdzest elemntu"));
		}
		for(int i = index; i<howManyElements-1;i++) {
			list[i]= list[i+1];
		}
		list[howManyElements-1]=' ';
		howManyElements--;
	}
	// izprinte
	public void print()throws Exception {
		if(isEmpty()) {
			throw (new Exception("Saraksts ir tukss un to nevar izprintet"));
		}
		for( int i=0;i<howManyElements;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
	//parada elemntu
	public char get(int index)throws Exception {
		if(isEmpty()) {
			throw (new Exception("Nevar paradit elementu"));
		}
		if(index<0) {
			throw (new Exception("Nevar paradit mazaku elementu"));
		}
		if(index>howManyElements) {
			throw (new Exception("Nevar paradit lielaku elemntu"));
		}
		return list[index];
	}
	// meklesana
	public int search(char element)throws Exception {
		if(isEmpty()) {
			throw (new Exception("saraksrs ir tukss nevar sameklet elementu"));
		}
		for( int i=0;i<howManyElements;i++) {
			if(list[i]==element) {
				return i;
			}
		}
		
		throw (new Exception("mekletais elements nav atrasts"));
	}
	public char getNextElement(char element) throws Exception{
		int indexOfSearch = search(element);
		if(indexOfSearch==howManyElements-1) { // ja mekletais elements ir pedejais
			throw (new Exception("jsus ievaditais elements ir atrasts ka pedejais un aiz to neka nav"));
		}
		int indexForNextElement = indexOfSearch+1;
		return list[indexForNextElement];
	}
	
	
	
	
}
