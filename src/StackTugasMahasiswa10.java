public class StackTugasMahasiswa10 {
    Mahasiswa10[] stack;
    int size;
    int top;

    public StackTugasMahasiswa10(int size) {
        this.size = size;
        this.stack = new Mahasiswa10[size];
        this.top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa10 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack sudah penuh!");
        }
    }

    public Mahasiswa10 pop() {
        if (!isEmpty()) {
            Mahasiswa10 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Mahasiswa10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
