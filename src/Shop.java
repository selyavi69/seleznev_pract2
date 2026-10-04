public class Shop {
    private Computer[] computers;
    private int count;

    public Shop(int size){
        computers = new Computer[size];
        count=0;
    }

    public void addComputer(Computer computer){
        if (count< computers.length){
            computers[count]=computer;
            count++;
        } else{
            System.out.println("Магазин заполнен.");
        }
    }

    public void removeComputer(String name){
        for (int i=0; i < count; i++){

            if (computers[i].getName().equals(name)){

                for (int j=i; j< count - 1; j++){
                    computers[j]= computers[j+1];
                }

                computers[count-1]=null;
                count--;

                System.out.println("Компьютер удален");
                return;
            }
        }

        System.out.println("Компьютер не найден");
    }

    public Computer findComputer(String name){
        for (int n=0; n < count; n++){

            if(computers[n].getName().equals(name)){
                return computers[n];

            }
        }

        return null;
    }

    public void showComputers(){
        for ( int a=0;a<count;a++){
            System.out.println(computers[a]);
        }
    }

}
