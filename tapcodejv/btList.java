import java.util.ArrayList;
public class btList{
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        //them phan tu vao ArrayList
        fruits.add("apple");
        fruits.add("banana");

        System.out.println("danh sach ban dau :"+ fruits);

        // them phan tu moi
        fruits.add("Cantaloupe");
        System.out.println("danh sach cac phan tu sau khi them canloupe:" + fruits);
        fruits.remove("apple");
        System.out.println("danh sach sau khi xoa banana:" + fruits);
        System.out.println("phan tu tai index 1 "+fruits.get(1));
        System.out.println("so luong phan tu trong ArrayList:"+fruits.size());
    }
}