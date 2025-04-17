public class Textbook extends Book {
    private int edition;

    public Textbook(String title, double price, int edition) 
    {
        super(title, price);
        this.edition = edition;
    }

    public int getEdition() 
    {
        return edition;
    }

    @Override
    public String getBookInfo() 
    {
        return super.getBookInfo() + "-" + edition;
    }

    public boolean canSubstituteFor(Textbook other) 
    {
        if (this.getTitle().equals(other.getTitle())) 
        {
            return this.edition >= other.edition;
        }
        
        return false;
    }
}