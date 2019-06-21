package 第7讲;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-20 - 19:49
 */
public class AboutPrimitive {

    class Counter {
        private final AtomicLong counter = new AtomicLong();

        public void increase() {
            counter.incrementAndGet();
        }
    }


    class CompactCounter {
        private volatile long counter;

        private final AtomicLongFieldUpdater<CompactCounter> updater =
            AtomicLongFieldUpdater.newUpdater(CompactCounter.class, "counter");

        public void increase() {
            updater.incrementAndGet(this);
        }
    }


}
