public class WaterBottle {

private int volume;

public WaterBottle(){
    this.volume = 100;
    }
    public int getStartVolume(){
    return this.volume;
    }
    public int drink(){
    this.volume -= 10;
    return this.volume;
    }
    public int empty(){
    return this.volume = 0;
    }
    public int fill(){
    return this.volume = 100;
    }
}
