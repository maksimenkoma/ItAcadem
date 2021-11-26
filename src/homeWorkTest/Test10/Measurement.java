package homeWorkTest.Test10;

import java.util.Collection;
import java.util.Random;

public class Measurement extends Result {


    public Measurement(Collection c, long elementsCount) {
        super(c, elementsCount);
    }
    public long getElementsCount() {
        return elementsCount;
    }
    public Result measureAdd(Collection c, long elementsCount) {
        Result operation = new Result();
        operation.type = Result.TypeOperation.ADD;
        long timeMillis = System.currentTimeMillis();
        for (int i = 0; i <= elementsCount; i++) {
            c.add(String.valueOf(new Random().nextInt((int) elementsCount)));
        }
        this.time = (int) (System.currentTimeMillis() - timeMillis);

        return new Result(c, elementsCount, operation.type, this.time);


    }

    public Result measureRemove(Collection c, long elementsCount,int element ) {
        Result operation = new Result();
        operation.type = TypeOperation.REMOVE;
        long timeMillis = System.currentTimeMillis();
       for (int i = 0; i <= element; i++) {
            c.remove(String.valueOf(new Random().nextInt((int) elementsCount)));
       }
        this.time = (int) (System.currentTimeMillis() - timeMillis);
        return new Result(c, elementsCount, operation.type, this.time,element);
    }

    public Result measureContains(Collection c, long elementsCount,int element) {
        Result operation = new Result();
        operation.type = TypeOperation.CONTAINS;
        long timeMillis = System.currentTimeMillis();
        for (int i = 0; i <= element; i++) {
            c.contains(String.valueOf(new Random().nextInt((int) elementsCount)));
        }
        this.time =(int) (System.currentTimeMillis() - timeMillis);
        return new Result(c, elementsCount, operation.type, this.time,element);

    }


}
