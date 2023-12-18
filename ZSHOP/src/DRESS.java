public class DRESS {

    private String Title;
    private String Color;
    private String Size;
    private  double Price;
    private String SearchText;

    //////////////////////////////////////////
    private int Select;
    public int getSelect() {

        return Select;
    }
    public void setSelect(int select) {

        Select = select;
    }

    ///////////////////////////////////////////
    public String getSearchText() {

        return SearchText;
    }
    public void setSearchText(String searchText) {

        SearchText = searchText;
    }
    
    //////////////////////////////////////////
    public DRESS(String title,String color,String size,double price,String T,int S){

        this.Title = title;
        this.Color = color;
        this.Size = size;
        this.Price = price;
        this.SearchText = T;
        this.Select = S;

    }

    ///////////////////////////////////////////////////


    public String getTitle() {

        return Title;
    }
    public void setTitle(String title) {

        Title = title;
    }
    public String getColor() {

        return Color;
    }
    public void setColor(String color) {

        Color = color;
    }
    public String getSize() {

        return Size;
    }
    public void setSize(String size) {

        Size = size;
    }
    public double getPrice() {

        return Price;
    }
    public void setPrice(double price) {

        Price = price;
    }
}
