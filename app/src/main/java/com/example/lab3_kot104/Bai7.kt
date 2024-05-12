package com.example.lab3_kot104

import java.util.Scanner

fun main() {
    val gv1 = CBGV("Nguyễn Văn Nam", 35, "Hà Nội", "GV001", 5000000, 1000000, 200000)
    val gv2 = CBGV("Trần Thị Hoa", 40, "Hồ Chí Minh", "GV002", 6000000, 1200000, 150000)
    val scanner = Scanner(System.`in`)
    val danhSachGV = mutableListOf<CBGV>()
    danhSachGV.add(gv1)
    danhSachGV.add(gv2)
    println("Nhập thông tin của giáo viên:")
    print("Họ tên: ")
    val hoTen = scanner.nextLine()
    print("Tuổi: ")
    val tuoi = scanner.nextInt()
    scanner.nextLine()
    print("Quê quán: ")
    val queQuan = scanner.nextLine()
    print("Mã số giáo viên: ")
    val maSoGV = scanner.nextLine()
    print("Lương cứng: ")
    val luongCung = scanner.nextInt()
    print("Lương thưởng: ")
    val luongThuong = scanner.nextInt()
    print("Tiền phạt: ")
    val tienPhat = scanner.nextInt()
    // Tạo đối tượng giáo viên từ thông tin vừa nhập
    val gv = CBGV(hoTen, tuoi, queQuan, maSoGV, luongCung, luongThuong, tienPhat)
        danhSachGV.add(gv)
println("Danh sách Giáo Viên:")
    for (ds in danhSachGV){
        ds.hienThiThongTin()
    }
    // Xóa
    println("Nhập mã giáo viên cần xóa: ")
    scanner.nextLine() // Đọc dòng kết thúc từ lần nhập trước
    val maGvXoa = scanner.nextLine()
    var found = false
    for (i in 0 until danhSachGV.size) {
        if (danhSachGV[i].maSoGV == maGvXoa) {
            danhSachGV.removeAt(i)
            found = true
            break
        }
    }
    if (!found) {
        println("Không tìm thấy sinh viên có mã $maGvXoa để xóa.")
    } else {
        println("Xóa Thành Công")
        println("Danh Sách sau khi xóa:")
        for (sv in danhSachGV) {
            println(sv.hienThiThongTin())
        }
    }

}
class Bai7 {
}