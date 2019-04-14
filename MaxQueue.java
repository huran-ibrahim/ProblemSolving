public class MaxQueue{

	Stack firstStack = new Stack();
	Stack secondStack = new Stack();

	void enqueue(Integer val){
		firstStack.push(val);
	}

	Integer dequeue(){
		if(secondStack.peek() == null) {
			while(firstStack.peek() != null) {
				secondStack.push(firstStack.pop());
			}
		}

		return secondStack.pop();
	}

	Integer max(){
		if(firstStack.max() != null && secondStack.max() != null){
			return Math.max(firstStack.max(), secondStack.max());
		} else {
			return firstStack.max() == null ? secondStack.max() : firstStack.max();
		}
	}




	class Stack {
		Node head;

		void push(Integer val){

			Node newHead = new Node();
			newHead.value = val;

			if (this.head != null){
				newHead.next = head;
				newHead.stackMaxValue = Math.max(val, head.stackMaxValue);
			} else {
				newHead.stackMaxValue = val;
			}

			this.head = newHead;
		}

		Integer peek(){
			return this.head != null ? this.head.stackMaxValue : null;
		}

		Integer pop(){
			
			if(this.head == null){
				return null;
			}

			Integer res = this.head.value;
			this.head = this.head.next;

			return res;
		}

		Integer max(){
			return this.head != null ? this.head.stackMaxValue : null;
		}


		class Node {
			Integer value;
			Integer stackMaxValue;
			Node next;
		}
	}
}
