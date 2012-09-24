
public class DniComparator implements Comparator<Person> {
	public int compare(Person source, Person target){
		return source.dni - target.dni;
	}

}
