public class Unit10Lab2 extends Unit9Lab1{
    private int memoryCount;

    public void resetMemory() {
        memoryCount = 0;
    }

    public int getMemoryCount() {
        return memoryCount;
    }

    public void addToMemory() {
        memoryCount += getCount();
    }
}
