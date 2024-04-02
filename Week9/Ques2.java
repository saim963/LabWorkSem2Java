package Week9;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.ArrayList;
import java.util.List;

class CustomExceptionMemErr extends Throwable {
    public CustomExceptionMemErr(String message) {
        super(message);
    }
}

public class Ques2 {
    public static void main(String[] args) throws CustomExceptionMemErr {
        List<byte[]> list = new ArrayList<>();
        try {
            MemoryMXBean mb = ManagementFactory.getMemoryMXBean();
            long maxMem = Runtime.getRuntime().maxMemory();
            long memLimit = (long) (0.8 * maxMem);

            while (true) {
                byte[] array = new byte[1024 * 1024];
                list.add(array);
                long usedMem = mb.getHeapMemoryUsage().getUsed();
                System.out.println(usedMem);
                if (usedMem >= memLimit) {
                    throw new CustomExceptionMemErr("Memory usage exceeded limit! Terminating the program.");
                }
            }
        } catch (CustomExceptionMemErr e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        } catch (OutOfMemoryError o) {
            System.err.println("OutOfMemoryError occurred. Terminating the program.");
            System.exit(1);
        }
    }
}
