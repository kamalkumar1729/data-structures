package first.java.concurrency;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) throws InterruptedException {

        /** Customizable ThreadPool executors */

        /** Implementation of ExecutorService */

        /** Multiple Constructors */

        // FixedThreadPool

        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(5);

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5,
                        5,
                        0l,
                        TimeUnit.SECONDS,
                        queue);

        // More Flexible and fine tunable ThreadPoolExecutors


        List<Date> list = new ArrayList<>();
        Date date1 = new Date();
        list.add(date1);
        // Thread.sleep(4000);
        Date date2 = new Date();
        list.add(date2);
        // System.out.println(date1.compareTo(date2));

        Collections.sort(list, Comparator.reverseOrder());

        // System.out.println(list);


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {

                }
            }
        });


        /*et<Integer> set = new HashSet<>();
        System.out.println(set.add(4));
        System.out.println(set.add(4));*/


        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        // System.out.println("Hello" + input);
        String[] nums = input.split(" ");

        StringBuilder aa = new StringBuilder(nums[0]).reverse();
        StringBuilder bb = new StringBuilder(nums[2]).reverse();

        Integer a = Integer.parseInt(aa.toString());
        Integer b = Integer.parseInt(bb.toString());
        if (a > b)
            System.out.print(a);
        else
            System.out.print(b);

        HashMap<Character, Integer> map = new HashMap<>();

        map.forEach((c, f) -> {


        });


    }

}

