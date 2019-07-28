package 第4讲;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-20 - 11:53
 */
public class ReferenceQueueTest {

    private static void testObject() {
        TestObject object = new TestObject("张三");
        ReferenceQueue<TestObject> referenceQueue = new ReferenceQueue<>();
        SoftReference<TestObject> softReference = new SoftReference<>(object, referenceQueue);
        WeakReference<TestObject> weakReference = new WeakReference<>(object, referenceQueue);
        PhantomReference<TestObject> phantomReference = new PhantomReference<>(object, referenceQueue);
        object = null;
        System.gc();
        try {
            Reference<? extends TestObject> reference = referenceQueue.remove(1000);
            TestObject objectSoft = softReference.get();
            TestObject objectWeak = weakReference.get();
            TestObject objectPha = phantomReference.get();
            System.out.println("**" + (objectSoft == objectWeak));
            System.out.println("**" + (objectPha == null));
            if (reference != null) {
                TestObject testObject = reference.get();
                System.out.println("**********" + testObject.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testObject();
    }

    @AllArgsConstructor
    private static class TestObject {

        @Override
        protected void finalize() throws Throwable {
            System.out.println("回收站了");
        }

        @Getter
        private String name;

    }
}
