class Alien{
    private Integer id;
    private String name;
    private String city;
    public void setId(Integer id){
        this.id=id;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setCity(String city){
        this.city=city;
    }
    
    public Alien(Integer id,String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;
    }
    @Override
    public String toString() {
        return "Alien [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
    

}
public class Task5 {
    public static void main(String[] args) {
        Alien[] arr=new Alien[3];
        arr[0]=new Alien(1, "Lokesh", "Hyderabad");
        arr[1]=new Alien(2, "Mohiddin", "Hyderabad");
        arr[2]=new Alien(3, "Uday", "Banguluru");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    
}
