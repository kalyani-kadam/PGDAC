package sll;

public class DLL {
	private NodeDll head;

	public boolean insert(int data) {
		NodeDll nn = new NodeDll(data);
		if (nn == null) {
			return false;
		}
		if (head == null) {
			head = nn;
			return true;
		}
		NodeDll temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(nn);
		nn.setPrev(temp);
		return true;
	}

	public boolean insert(int data, int position) {
		if (position <= 0 || (head == null && position > 0)) {
			return false;
		}
		NodeDll nn = new NodeDll(data);
		if (nn == null) {
			return false;
		}
		if (position == 1) {
			if (head != null) {
				nn.setNext(head);
				head.setPrev(nn);
			}
			head = nn;
			return true;
		}
		NodeDll prev = head;
		for (int i = 0; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}
		NodeDll next = prev.getNext();
		nn.setPrev(prev);
		if (next != null) {
			nn.setNext(next);
			next.setPrev(nn);
		}
//		nn.setNext(prev.getNext());
//		prev.getNext().setNext(nn.getNext());
		prev.setNext(nn);
		return true;
	}

	public boolean delete(int data) {
		NodeDll temp = head;
		if (temp == null) {
			return false;
		}
		if (head.getData() == data) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
			}
			return true;
		}
		while (temp.getData() != data) {
			temp = temp.getNext();
			if (temp == null) {
				return false;
			}
		}
		NodeDll prev = temp.getPrev();
		NodeDll next = temp.getNext();

		prev.setNext(next);
		return true;
	}

	public boolean deletebypos(int pos) {
		NodeDll temp = head;

		if (head == null || pos <= 0) {
			return false;
		}
		if (pos == 1) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
			}
			return true;
		}
		for (int i = 1; i < pos; i++) {
			temp = temp.getNext();
			if (temp == null) {
				return false;
			}
		}
		NodeDll prev = temp.getPrev();
		NodeDll next = temp.getNext();
		prev.setNext(next);
		if (next != null) {

			next.setPrev(null);
		}
		return true;
	}

	public void diplay() {
		NodeDll temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		}
		System.out.println("null");
	}

	public void searchByval(int data) {
		NodeDll temp = head, temp2 = null;
		boolean flag = false;
		while (temp != null) {
				if (temp.getData() == data) {
					flag = true;
				}
				temp = temp.getNext();
			}
		
		if (flag) {
			System.out.println("data found");
		} else {
			System.out.println("data not found");
		}
	}
	
	public void removeDup() {
		NodeDll temp = head,temp2=null;
		
		while(temp != head && temp.getNext()!= head) {
			temp2= temp;
			while(temp2.getNext()!=head) {
				if(temp.getData() == temp2.getNext().getData()) {
//					NodeDll newlink = temp2.getNext().getNext();
//					temp2.setNext(newlink);
//					newlink.setPrev(temp2.getPrev());
					
					NodeDll prev = temp2.getNext().getPrev();
					NodeDll next = temp2.getPrev().getNext();
//					next.setPrev(prev);
//					temp.setNext(next);
					next.setNext(temp2.getPrev());
					prev.setPrev(temp2.getNext());
//					NodeDll temp2.getNext().getPrev() = temp2.
				}else {
					temp2 = temp2.getNext();
				}
			}
			temp = temp.getNext();
		}
		
	}
	
	public void getCount() {
		NodeDll temp = head;
		int count=0;
		while(temp != null) {
			count++;
			temp = temp.getNext();
		}
		System.out.println("count "+count);
	}
	
	public void getMin() {
		NodeDll temp = head;
		int min = head.getData();
		while(temp!=null) {
			if(temp.getData()<min) {
				min = temp.getData();
			}
			temp = temp.getNext();
		}
		System.out.println("min "+ min);
	}
	
	public void getMax() {
		NodeDll temp = head;
		int max = temp.getData();
		while(temp != null) {
			if(temp.getData() > max) {
				max= temp.getData();
			}
			temp = temp.getNext();
		}
		System.out.println("max "+max);
	}
	
	public void sortAsc() {
		NodeDll temp = head,temp2=null;
		
		while(temp != null) {
			temp2= temp;
			while(temp2 != null) {
				if(temp.getData() > temp2.getData()) {
					int temp3 = temp2.getData();
					temp2.setData(temp.getData());
					temp.setData(temp3);
				}
				temp2 = temp2.getNext();
			}
			temp = temp.getNext();
		}
	}
	
	public void sortDesc() {
		NodeDll temp = head,temp2=null;
		
		while(temp !=null) {
			temp2= temp;
			while(temp2!=null) {
				if(temp.getData() < temp2.getData()) {
					int t3 = temp2.getData();
					temp2.setData(temp.getData());
					temp.setData(t3);
				}
				temp2 = temp2.getNext();
			}
			temp =temp.getNext();
		}
	}
}
