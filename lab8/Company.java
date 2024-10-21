
interface Product{
    void sale(int amount);
    int totalSales();
}

class Hardware implements Product{
    String category, manufacturer;
    int stock, sales;

    Hardware(String cat, String man, int s){
        category = cat;
        manufacturer = man;
        stock = s;
        sales = 0;
    }

    public void sale(int amount){
        if(stock<amount){
            System.out.println("Out of stock");
            return;
        }
        sales += amount;
        stock -= amount;
    }

    public int totalSales(){
        return sales;
    }

}

class Software implements Product{
    String type, OS;
    int stock, sales;

    Software(String type, String OS, int stock){
        this.type = type;
        this.OS = OS;
        this.stock = stock;
        sales = 0;
    }

    public void sale(int amount){
        if(stock<amount){
            System.out.println("Out of stock");
            return;
        }
        sales += amount;
        stock -= amount;
    }

    public int totalSales(){
        return sales;
    }

}

class Company{
    public static void main(String[] args) {

        Hardware cpu = new Hardware("Electronics", "Intel", 100);
        Software vlc = new Software("Media",  "Windows", 50);

        cpu.sale(10);
        vlc.sale(25);

        System.out.println("CPU Sales = "+cpu.totalSales());
        System.out.println("VLC Sales = "+vlc.totalSales());
    }
}