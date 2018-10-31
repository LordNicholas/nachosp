package nachos.threads;


class kvPair {
	private String k; 
	private int v;
	private kvPair next; 
	kvPair(){
		
	}

	kvPair(String key, int value) {
		k = key;
		v = value;
		next = null;
	}
	int getValue() {
		return v;
	}
	String getKey() {
		return k;
	}
	kvPair getNext() {
		return next;
	}
	void setKey(String key) {
		k = key;
	}
	void setValue(int value) {
		v = value;
	}
	void setNext(kvPair n) {
		next = n;
	}
}
public class HashTable1 {
	private Lock[] lockArray;// create an array of lock 
	private kvPair[] hash;
	public HashTable1(int n_bucket){
		hash= new kvPair[n_bucket];
		lockArray= new Lock[n_bucket];
		for (int i=0;i<n_bucket;i++){
			lockArray[i]= new Lock();
			hash[i]= new kvPair();
		}
	}
	

}
