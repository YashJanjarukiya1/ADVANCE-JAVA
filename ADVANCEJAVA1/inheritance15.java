interface drawable
{
    void draw();
}

class rectangle implements drawable
{
    public void draw()
    {
        System.out.println("drawing a painting............");
    }
}

class circular implements drawable
{
    public void draw()
    {
        System.out.println("drawing a circular...........");
    }
}

class inheritance15
{
    public static void main(String args[])
    {
        drawable d=new circular();
        d.draw();
        d=new rectangle();
        d.draw();
    }
}