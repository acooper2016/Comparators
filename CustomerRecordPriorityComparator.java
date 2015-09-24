public class CustomerRecordPriorityComparator implements Comparator<CustomerRecord>
{
	public int compare(CustomerRecord s1, CustomerRecord s2)
	{
		return(s1.getPriority() - s2.getPriority());
	}
	
	public boolean equals(Object obj)
	{
      return true;
	}
}


