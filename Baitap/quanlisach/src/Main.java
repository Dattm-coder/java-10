import model.Sach;

public class Main {

    public static void main(String[] args) {
        Sach[] arrSach = new Sach[10];
        arrSach[0] = new Sach(101,"Đắc nhân tâm","tác giả 1","Kiến thức","Kim Đồng",2019);
        arrSach[1] = new Sach(102,"Đắc nhân","tác giả 2","Kiến thức","Kim Đồng",2019);
        arrSach[2] = new Sach(103,"Nhân tâm","tác giả 3","Kiến thức","Kim Đồng",2019);
        arrSach[3] = new Sach(104,"7 thói quen của người thành đạt","tác giả 4","Kiến thức","Kim Đồng",2019);
        arrSach[4] = new Sach(105,"8 thói quen của người thành đạt","tác giả 5","Kiến thức","Giáo dục",2019);
        arrSach[5] = new Sach(106,"Hành trình về Phương Đông","tác giả 6","Sách giáo khoa","Giáo dục",2022);
        arrSach[6] = new Sach(107,"Người giàu có nhất thành Babylon","tác giả 7","Sách giáo khoa","Giáo dục",2019);
        arrSach[7] = new Sach(108,"Hạt giống tâm hồn","tác giả 8","Sách giáo khoa","Giáo dục",2019);
        arrSach[8] = new Sach(109,"Tốc độ của niềm tin","tác giả 9","Sách giáo khoa","Giáo dục",2019);
        arrSach[9] = new Sach(110,"Thói quen thứ 8","tác giả 10","Sách giáo khoa","Giáo dục",2022);
//        for(Sach sach: s){
//            System.out.println(s);
//        }
        System.out.println("Các loại tên sách:");
        for(int i=0; i< arrSach.length;i++){
            System.out.println(arrSach);
        }
        System.out.println("========================================");
        System.out.println("Sách có cùng tên:");
        for(Sach sach : arrSach){
            if(sach.tenSach.equalsIgnoreCase("Đắc nhân")){
                System.out.println(arrSach);
            }
        }
        System.out.println("========================================");
        System.out.println("Sách có cùng thể loại:");
        for(Sach sach : arrSach){
            if(sach.theLoai.equalsIgnoreCase("Sách giáo khoa")){
                System.out.println(arrSach);
            }
        }
        System.out.println("========================================");
        System.out.println("Sách xuất bản trong năm là:");
        for(Sach sach : arrSach){
            if(sach.theLoai.equalsIgnoreCase("Sách giáo khoa")){
                System.out.println(arrSach);
            }
        }
    }
}
