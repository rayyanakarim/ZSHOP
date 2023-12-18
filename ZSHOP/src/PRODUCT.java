import java.util.ArrayList;

public class PRODUCT {

    ArrayList<DRESS>Tops = new ArrayList<>();
    ArrayList<DRESS>Jacket = new ArrayList<>();
    ArrayList<DRESS>Shirt = new ArrayList<>();

    public PRODUCT(){
        MakeTops();
        MakeJacket();
        MakeShirt();
    }
    public void MakeTops(){
        Tops.add(0,new DRESS("TopX","Red","10",9.99,"Top",1));
        Tops.add(1,new DRESS("TopY","Blue","12",19.99,"Top",2));
        Tops.add(2,new DRESS("TopZ","Yellow","14",29.99,"Top",3));
    }
    public void MakeJacket(){
        Jacket.add(0,new DRESS("JacketX","Black","10",899.99,"Jacket",4));
        Jacket.add(1,new DRESS("JacketY","White","12",999.99,"Jacket",5));
        Jacket.add(2,new DRESS("JacketZ","Black","14",1199.99,"Jacket",6));
    }
    public void MakeShirt(){
        Shirt.add(0,new DRESS("ShirtX","Orange","10",69.99,"Shirt",7));
        Shirt.add(1,new DRESS("ShirtY","Silver","12",73.99,"Shirt",8));
        Shirt.add(2,new DRESS("ShirtZ","NavyBlue","14",79.99,"Shirt",9));
    }

    }



