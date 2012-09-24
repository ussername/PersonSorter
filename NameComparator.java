
public class NameComparator implements Comparator<Person>  {
	public int compare(Person source, Person target){
		return source.name.compareTo(target.name);		
	}
}
