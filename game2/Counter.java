import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int value = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public Counter()
    {
        updateImage();
    }

    // カウンターを増やすメソッド
    public void addValue(int amount)
    {
        value += amount;
        updateImage();
    }

    // スコア表示の画像を更新
    private void updateImage()
    {
        setImage(new GreenfootImage("Score: " + value, 24, Color.WHITE, Color.BLACK));
    }

    // 現在の値を取得するメソッド
    public int getValue()
    {
        return value;
    }

}
