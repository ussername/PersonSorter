
public class PersonaSorter {
	static Person[] people={
		new Person("Juan",21,12345678),
		new Person("Ana",19,87654321),
		new Person("Luis",15,12365478)
	};
	
	public static<T> void sort(T[] elements,Comparator <T> comparator,Order ord){
		for(int i=0;i<elements.length;i++){
			for(int j=i;j<elements.length;j++){
				if(ord.order(comparator.compare(elements[i],elements[j]),0)){
					T temp=elements[i];
					elements[i]=elements[j];
					elements[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Comparator<Person> comparator=new DniComparator();
		Order ord=new DescendingOrder();
		sort(people,comparator,ord);
		for(int i=0;i<people.length;i++){
			System.out.println(people[i].name + " - " + people[i].age + " - " + people[i].dni );
			
		}
		
	}
}
