public class Printer {

    public int setPaper;
    private int paper;

    public Printer(int paper) {
        this.paper = paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public int getPaper() {
        return paper;
    }

    public int canPrint () {
        this.paper = paper;
        this.copies = copies;
    }

}
