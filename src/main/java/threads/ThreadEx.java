package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadEx {
    public static void main(String[] args) {

        Timer first = new Timer("First");
        Timer second = new Timer("Second");

       // first.run();//запуск первого потока
       // second.run();//запуск второго - поочередно


       // Для одновременного запуска потоков
        // ExecutSer - это пул для потоков Метод FixedThrPool для принятия кол-ва потоков

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(first); // кладем в этот пул таймер который хотим запустить
        executorService.submit(second);// аналогично

    }
}
