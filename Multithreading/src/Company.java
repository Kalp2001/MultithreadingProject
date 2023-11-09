public class Company {
    int n;
    boolean f = false;
    // f = false chance for producer
    // f = true chance for consumer
   synchronized public void produce_item(int n) throws Exception{
       if(f){
           wait(n);
       }
       this.n = n ;
        System.out.println("Produced : "+this.n);
        f=true;
        notify();
    }

    synchronized public int consume_item() throws Exception{
       if(!f){ // in this case producer is going to produce
           wait();
       }
        System.out.println("Consumed : "+this.n);
       // after consume the item now f is directly become false
        f= false;
        notify(); // it notifies
        return this.n;
    }
}
