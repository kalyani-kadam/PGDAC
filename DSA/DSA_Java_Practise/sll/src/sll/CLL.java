package sll;

public class CLL {
	private Node head;

	public boolean insert(int data) {
		Node nn = new Node(data);
		if (nn == null) {
			return false;
		}
		if (head == null) {
			head = nn;
			nn.setNext(head);
			return true;
		}
		Node temp = head;
		while (temp.getNext() != head) {
			temp = temp.getNext();
		}
		temp.setNext(nn);
		nn.setNext(head);
		return true;
	}

	public boolean insert(int data, int pos) {
		Node nn = new Node(data);
		if (pos <= 0 || (head == null && pos > 1)) {
			return false;
		}
		if (nn == null) {
			return false;
		}
		if (pos == 1) {
			head = nn;
			nn.setNext(head);
			return true;
		}
		Node temp = head;
		for (int i = 0; i < pos - 1; i++) {
			temp = temp.getNext();
			if (temp == null) {
				return false;
			}
		}
		nn.setNext(temp.getNext());
		temp.setNext(nn);
		return true;
	}

	public boolean delete(int data) {
		if (head == null) {
			return false;
		}
		if (head.getData() == data) {
			if (head.getNext() == head) {
				head = head.getNext();
				return true;
			}

			Node temp = head;
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
//			head = head.getNext();
			temp.setNext(head);
		}
		Node prev = head, del = head;
		while (del.getData() != data) {
//			System.out.println("data found");
			prev = del;
			del = del.getNext();
			if (del == head) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}

	public boolean delete(int data, int pos) {
		int cnt = count();
		if (pos > cnt) {
			System.out.println("not valid position");
			return false;
		}
		if (head == null) {
			return false;
		}
		if (head.getData() == data && pos <= 0) {
			head = null;
			return true;
		}
		Node temp = head;
		while (temp != head) {
			if (data != temp.getData()) {
				System.out.println(data + " is not present at position " + pos);
				return false;
			}
		}
		Node del = head, prev = head;
		for (int i = 0; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev.getNext() == head) {
				return false;
			}
		}
		del = prev.getNext();
		prev.setNext(del.getNext());
		return true;
	}

	public boolean deletebypos(int pos) {
		int cnt = count();
		if (pos > cnt) {
			System.out.println("not valid position");
			return false;
		}

		if (head == null || pos <= 0) {
			return false;
		}
		Node temp = head;
		if (pos == 1) {

			if (head.getNext() == head) {
				head = null;
				return true;
			}
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			head = head.getNext();
			temp.setNext(head);
			return true;
		}
		for (int i = 1; i < pos; i++) {
			temp = temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
		return true;
	}

	public int count() {
		Node temp = head;
		int count = 1;
		while (temp.getNext() != head) {
			count++;
			temp = temp.getNext();
		}

		System.out.println("count " + count);
		return count;
	}

	public void display() {
		Node temp = head;
		System.out.println();
		do {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		} while (temp != head);
		System.out.println("head");
	}

//	public void sortAsc() {
//		Node temp = head,temp2=null;
//		while(temp != head && temp.getNext() != head) {
//			temp2=temp.getNext();
//			while(temp2 != head) {
//				if(temp.getData() > temp2.getData()) {
//					int n = temp.getData();
//					temp.setData(temp2.getData());
//					temp2.setData(n);
//				}
//				temp2 = temp2.getNext();
//			}
//			temp = temp.getNext();
//		}
//	}
	public void sortAsc() {
		Node temp = head, temp2 = null;
		if (head == null) {
			return;
		}
		while (temp.getNext() != head) {
			temp2 = temp;
			while (temp2 != head) {
				if (temp.getData() > temp2.getData()) {
					int n = temp.getData();
					temp.setData(temp2.getData());
					temp2.setData(n);
				}
				temp2 = temp2.getNext();
			}
			temp = temp.getNext();
		}
	}

	public void sortDEsc() {
		Node temp = head, temp2 = null;
		if (head == null) {
			return;
		}
		while (temp.getNext() != head) {
			temp2 = temp.getNext();
			while (temp2 != head) {
				if (temp.getData() < temp2.getData()) {
					int n = temp.getData();
					temp.setData(temp2.getData());
					temp2.setData(n);
				}
				temp2 = temp2.getNext();
			}
			temp = temp.getNext();
		}
	}

	public void searchbyVal(int data) {
		Node temp = head;
		boolean flag = false;
		if (head == null) {
			return;
		}
		while (temp.getNext() != head) {
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
		Node temp = head, temp2 = null;
		if (head == null) {
			return;
		}

		while (temp.getNext() != head) {
			temp2 = temp;
			while (temp2.getNext() != head) {
				if (temp.getData() == temp2.getData()) {
					temp.setNext(temp2.getNext().getNext());
				}
				temp2 = temp2.getNext();
			}
			temp = temp.getNext();
		}
	}
}
