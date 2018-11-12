public class Printer {

    private int paperRemaining;
    private int tonerVol;

    public Printer(){
        this.paperRemaining = 1000;
        this.tonerVol = 500;
    }

    public int getPaperRemaining(){
        return this.paperRemaining;
    }

    public void print(int pages, int copies){

        if ((this.paperRemaining >= (pages * copies)) && (this.tonerVol >= (pages * copies))){
           this.paperRemaining -=  (pages * copies);
           this.tonerVol -= (pages * copies);

        }
    }


    public int printerRefill(){
        this.paperRemaining = 1000;
        return this.paperRemaining;
    }

    public int tonerRemaining(){
        return this.tonerVol;
    }
}
