package nachos.threads;

public class HashTable1 {
	public HashTable1(int n_bucket){
		KVPair[] hash= new KVPair[n_bucket];
		for (int i=0;i<n_bucket;i++){
			hash[i]= new KVPair();
		}
	}
	

}
class KVPair {
	private String k; 
	private int v;
	private KVPair next; 
	KVPair(){
		
	}

	KVPair(String key, int value) {
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
	KVPair getNext() {
		return next;
	}
	void setKey(String key) {
		k = key;
	}
	void setValue(int value) {
		v = value;
	}
	void setNext(KVPair n) {
		next = n;
	}
}
