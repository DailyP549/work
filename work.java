// Time Complexity: O(n)
// Space Complexity: O(1)
// This code implements a linear search algorithm to find the index of a given element in an array.
// It iterates through the array and returns the index of the element if found, otherwise returns -1
//---------------array linear search-------------------
public class work {
    public static int fun(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 8, 19, 37, 33 };
        int n = 37;
        int result = fun(arr, arr.length, n);
        if (result == -1) {
            System.out.println("element is not found");

        } else {
            System.out.println("element is found at the index:" + result);

        }
    }
}
