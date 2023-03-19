public class NewArray {
    private String[] list = new String[10];
    private int position = 0;

    public void add(String toAdd) {
        if (position > list.length - 1) {
            expand();
        }
        list[position] = toAdd;
        position++;
    }

    public void removeByPosition(int toRemove) {
        list[toRemove] = null;
        adjustPosition(toRemove);
        position--;
    }

    public void removeByString(String toRemove) {
        int positionOfNull;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(toRemove)) {
                positionOfNull = i;
                list[i] = null;
                adjustPosition(positionOfNull);
                break;
            }
        }
        position--;
    }

    public void adjustPosition(int startingPoint) {
        for (int i = startingPoint; i < list.length - 1; i++) {
            if (i + 1 > list.length) {
                list[i] = null;
                return;
            }
            list[i] = list [i + 1];
        }
        list[list.length - 1] = null;
    }

    public int length() {
        return position;
    }

    public String get(int toGet) {
        return list[toGet];
    }

    public void expand() {
        String[] temp = new String[list.length + 10];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }
}