public class Main{
	public static void main(String args[]){
		MaxQueue mq = new MaxQueue();
		mq.enqueue(100);
		mq.enqueue(90);
		mq.enqueue(80);
		mq.enqueue(70);
		System.out.println(mq.max());
		mq.dequeue();
		mq.dequeue();
		System.out.println(mq.max());
		mq.enqueue(100);
		mq.dequeue();
		System.out.println(mq.max());
	}
}
