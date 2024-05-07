class Interface Drawable
{
    void draw();
}

class rectangle implements Drawable
{
    void draw()
    {
        System.out.println("drawing a colourfull picture............");
    }
}

class circle implements Drawable
{
    void draw()
    {
        System.out.println("drawing a circle painting...........");
    }
}

class sqare implements Drawable
{
    void draw()
    {
        System.out.println("drawing a sqare painting..............");
    }
}

class Interface
{
    public static void main(String args[])
    {
        Drawable d=new Drawable();
        d.draw();
    }
}