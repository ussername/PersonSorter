
public class AgeComparator implements Comparator<Person> {
	public int compare(Person source, Person target){
		return source.age - target.age;
	}
}
