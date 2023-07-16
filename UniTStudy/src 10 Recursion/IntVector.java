public class IntVector {
    public static void main(String[] args) {
        IntVector a = new IntVector(5);
        System.out.println(a.equalSum());
    }

    private int[] _arr;

    /**
     * 2
     *
     * Constructor for objects of class IntVector
     * 
     * @param size
     */
    public IntVector(int size) {
        _arr = new int[size];
        _arr[0] = 10;
        _arr[1] = 4;
        _arr[2] = 3;
        _arr[3] = 2;
        _arr[4] = 1;
    }

    // methods
    public int equalSum() {
        return equalSum(0, _arr.length - 1, _arr[0], _arr[_arr.length - 1]);
    }

    private int equalSum(int left, int right, int sumLeft, int sumRight) {
        if (left >= right)
            return -1;
        if (sumLeft == sumRight) {
            if (left + 1 == right)
                return left;
            else
                return equalSum(left + 1, right - 1, sumLeft + _arr[left + 1], sumRight + _arr[right - 1]);
        }
        if (sumLeft < sumRight)
            return equalSum(left + 1, right, sumLeft + _arr[left + 1], sumRight);
        else
            return equalSum(left, right - 1, sumLeft, sumRight + _arr[right - 1]);
    }
}
