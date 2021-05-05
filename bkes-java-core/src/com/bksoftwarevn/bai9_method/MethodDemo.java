package com.bksoftwarevn.bai9_method;

public class MethodDemo {

    // Viết một phương thức cho phép admin có thể thêm danh mục sản phẩm vào hệ thống?

    /*
    1. Cần access modifier không? Nếu có thì là gì?

    2. static ?

    3. Kiểu dữ liệu trả về?có  thì Là gì? Không thì là void

    4. Tên phương thức là gì?

    5. Input có hay không? là gì?

    6. Thân phương thức? - Giải thuật để xử lý yêu cầu
    trên
     */

    static String db =""; // Đien thoai : Laptop : ...
    public static boolean enterListCategory(String[] listCategory){
        boolean rs = false;
        int check = 0;
        if(listCategory!=null && listCategory.length > 0){
            for (int i = 0; i < listCategory.length; i++) {
                db = db.concat(listCategory[i].concat(":"));
                if(!db.contains(listCategory[i])){
                    check++;
                    break;
                }
            }
        }

        if(check==0){
            rs = true;
        }
        return rs;
    }

    public static boolean enterListCategory2(String[] listCategory){
        boolean rs = false;
        if(listCategory!=null && listCategory.length > 0){
            for (int i = 0; i < listCategory.length; i++) {
                db = db.concat(listCategory[i].concat(":"));
            }
        }
        if(db.length() > 0){
            rs = true;
        }
        return rs;
    }

    // 1. Nếu 1 bước thêm bị lỗi dừng hay tiếp tục?
    // Dừng thì làm gì?
    // Tiếp tục thì làm gì?
    // Cần làm sao đảm bảo là thực hiện được mục đích:
    // Viết một phương thức cho phép admin có thể thêm danh mục sản phẩm vào hệ thống?



    public static void main(String[] args) {
        // Nhập danh sách
        String data[] = new String[100];
        // Viết 1 phương thức để nhập danh sách từ bàn phím
        // Goi chuc năng

        boolean kq = enterListCategory2(data);
        if(kq){
            System.out.println("Them danh sach thanh cong!");

            // Hiển thị danh sách đó
            // Viết phương thức để hiển thị toàn bộ danh mục sản phẩm trong hệ thống?
        }else {
            System.out.println("Them danh sach that bai!");
        }

    }
}
