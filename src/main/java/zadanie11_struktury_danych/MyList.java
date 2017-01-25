package zadanie11_struktury_danych;

public class MyList {
    public Element firstElement;

    public MyList(Element firstElement) {
        this.firstElement = firstElement;
    }

    public MyList() {

    }

    public int getFirstElementValue() {
        return firstElement.value;
    }

    public int getSecondElementValue() {
        return firstElement.next.value;
    }

    public void setFirstElement(Element firstElement) {
        this.firstElement = firstElement;
    }

    public void setSecondElement(Element secondElement) {
        this.firstElement.next = secondElement;
    }

    public int size() {
        if (firstElement == null) {
            return 0;
        } else {
            Element element = firstElement;
            int counter = 1;
            while (element.next != null) {
                element = element.next;
                counter++;
            }
            return counter;
        }
    }

    public Element getLast() {
        if (firstElement != null) {
            Element element = firstElement;
            while (element.next != null) element = element.next;
            return element;
        } else {
            return null;
        }
    }

    public void add(int x) {
        Element newElement = new Element();
        newElement.value = x;
        if (getLast() != null) {
            getLast().next = newElement;
        } else {
            firstElement = newElement;
        }
    }

    public void print() {
        if (firstElement != null) {
            Element element = firstElement;
            System.out.print("[" + element.value + "]");
            while (element.next != null) {
                element = element.next;
                System.out.print("[" + element.value + "]");
            }
            System.out.println();
        } else {
            System.out.println("[ ]");
        }
    }

    public int getElementValueAt(int index) {
        Element element = firstElement;
        int counter = 0;
        while (element != null) {
            if (counter == index) {
                return element.value;
            }
            element = element.next;
            counter++;
        }
        return -1;
    }

    public int getElementIndex(int value) {
        if (firstElement != null) {
            Element element = firstElement;
            int counter = 0;
            int finalCounter = -1;
            do {
                if (element.value == value) {
                    finalCounter = counter;
                    break;
                }
                element = element.next;
                counter++;
            } while (element != null);
            return finalCounter;
        } else {
            return -1;
        }
    }

    public void removeLast() {
        if (firstElement != null) {
            if (firstElement.next == null) {
                firstElement = null;
            } else {
                Element elementLast = firstElement;
                Element elementLastButOne = new Element();

                while (elementLast.next != null) {
                    elementLastButOne = elementLast;
                    elementLast = elementLast.next;
                }
                elementLastButOne.next = null;
            }
        }
    }

    public void remove(int index) {
        if (firstElement != null) {
            Element element = firstElement;
            int counter = 0;
            do {
                if (index == 0) {
                    firstElement = firstElement.next;
                    break;
                } else if (counter == index - 1) {
                    element.next = element.next.next;
                    break;
                }
                element = element.next;
                counter++;
            } while (element.next != null);
        }
    }

    public void insertAt(int index, int value) {
            Element element = firstElement;
            Element newElement = new Element();
            newElement.value = value;
            Element tempElement;
            int counter = 0;
            do {
                if (index == 0) {
                    newElement.next = firstElement;
                    firstElement = newElement;
                    break;
                } else if (counter == index - 1) {
                    tempElement = element.next;
                    element.next = newElement;
                    newElement.next = tempElement;
                    break;
                }
                element = element.next;
                counter++;
            } while (element.next != null);
    }
}
