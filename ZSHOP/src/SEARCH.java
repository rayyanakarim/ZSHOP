import java.util.Scanner;

public class SEARCH {
    private String SearchTitle;
    private Boolean isFound = false;

    public String getSearchTitle() {

        return SearchTitle;
    }

    public void setSearchTitle(String searchTitle) {
        SearchTitle = searchTitle;
    }

    public void SearchTop() {
        System.out.println("Search any one from the three:: Top :: Jacket :: Shirt ::");
        Scanner scanner = new Scanner(System.in);
        //SearchTitle = scanner.nextLine(); Same as 16
        setSearchTitle(scanner.nextLine());


        PRODUCT product = new PRODUCT();



        for (int i = 0; i < product.Tops.size(); i = i + 1) {

            if (SearchTitle.equals(product.Tops.get(i).getSearchText())) {
                System.out.print(" Title: " + product.Tops.get(i).getTitle());
                System.out.print(" Color: " + product.Tops.get(i).getColor());
                System.out.print(" Size: " + product.Tops.get(i).getSize());
                System.out.print(" Price: " + product.Tops.get(i).getPrice());
                System.out.print("Select Number::" + product.Tops.get(i).getSelect()); //Numbers assigned
                System.out.println("");
            } else {
                System.out.println("Bad Command");
            }
        }
    }
    public void SelectItem() {

        PRODUCT product = new PRODUCT();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Your Product only one item at a time::");
        int S  = scanner.nextInt();

        for (int i = 0; i < product.Tops.size(); i = i + 1){

            if (S == product.Tops.get(i).getSelect()){ // this means 1-9 number from the product

                System.out.print(" Title: " + product.Tops.get(i).getTitle());
                System.out.print(" Color: " + product.Tops.get(i).getColor());
                System.out.print(" Size: " + product.Tops.get(i).getSize());
                System.out.print(" Price: " + product.Tops.get(i).getPrice());
                System.out.println("");

            }


        }




    }


}

