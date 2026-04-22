public class StackSurat10 {
    Surat10[] stack;
    int size;
    int top;

    public StackSurat10(int size) {
        this.size = size;
        stack = new Surat10[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat10 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat10 pop() {
        if (!isEmpty()) {
            Surat10 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    public boolean cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat dalam stack.");
        } else {
            System.out.println("ID Surat\tNama\t\tKelas\tJenis\tDurasi");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].idSurat + "\t\t" + stack[i].namaMahasiswa
                        + "\t\t" + stack[i].kelas + "\t" + stack[i].jenisIzin
                        + "\t" + stack[i].durasi + " hari");
            }
        }
        System.out.println();
    }
}
