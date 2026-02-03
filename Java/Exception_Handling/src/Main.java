//  Compile Time Error   :    Checked Exception
//  Run Time Error       :    Unchecked Exception



import java.io.FileReader;
import java.io.IOException;


class Test implements  Runnable {
    public void run(){
        for (int i = 1; i <= 10; i++){
           try {
               if (i == 5) {
                   Thread.sleep(5000);   //  Compile Time Error
               }
           }catch(Exception e){
               e.printStackTrace();
           }
            System.out.println(i);
        }
    }
}


class Demo{
    public void display() throws IOException{
        FileReader fr = new FileReader("sample.txt");    //  Compile Time Error
    }
}


class Main {
    public static void main(String[] args) throws IOException {

        Test t = new Test();
        t.run();

        Demo d = new Demo();
        d.display();
    }
}



