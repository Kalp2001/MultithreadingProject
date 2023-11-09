public class Consumer extends Thread {
    Company c;
    Consumer(Company c) {
        this.c = c;
    }
        public void run() {
//        int i = 1;
        while (true) {
            try {
                this.c.consume_item();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {

              }
          }
        }
    }

