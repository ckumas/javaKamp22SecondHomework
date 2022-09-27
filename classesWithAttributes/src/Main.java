public class Main {
    public static void main(String[] args) {
        Product product = new Product(5,"Laptop","Bilgisayar",500,5,"Kırmızı","kkl");
//        product.setName("Cell Phone");
//        product.setId(5);
//        product.setDescription("Samsung N950");
//        product.setStockAmount(5);

        System.out.println(product.getName());

        ProductManager productManager=new ProductManager();

        productManager.Add(product);

        System.out.println(product.getKod());
        


    }
}