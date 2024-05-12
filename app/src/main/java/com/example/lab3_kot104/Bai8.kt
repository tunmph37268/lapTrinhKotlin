package com.example.lab3_kot104

import java.util.Scanner

fun main(){
    val sinhVien1 = SinhVienPL("Nguyễn Văn Anh", 20, "K62")
    val theMuon1 = TheMuon("123456", 20240512, 20240519, "ABC123", sinhVien1)
    val sinhVien2 = SinhVienPL("Trần Thị Hoa", 21, "K63")
    val theMuon2 = TheMuon("789012", 20240513, 20240520, "DEF456", sinhVien2)
    val scanner=Scanner(System.`in`)
    val dspm= mutableListOf<TheMuon>()
    dspm.add(theMuon1)
    dspm.add(theMuon2)
    println("Nhập thông tin sinh viên:")
    print("Họ và tên: ")
    val hoTen = scanner.nextLine()
    print("Tuổi: ")
    val tuoi = scanner.nextInt()
    scanner.nextLine()
    print("Lớp: ")
    val lop = scanner.nextLine()
    println("\nNhập thông tin thẻ mượn:")
    print("Mã phiếu mượn: ")
    val maPhieu = scanner.nextLine()
    print("Ngày mượn: ")
    val ngayMuon = scanner.nextInt()
    print("Hạn trả: ")
    val hanTra = scanner.nextInt()
    scanner.nextLine() // Đọc dòng mới
    print("Số hiệu sách: ")
    val soHieuSach = scanner.nextLine()
    val sv=SinhVienPL(hoTen,tuoi,lop)
    val tm=TheMuon(maPhieu,ngayMuon,hanTra,soHieuSach,sv)
    dspm.add(tm)
dspm.forEachIndexed{index, theMuon ->
    println("Thẻ mượn ${index + 1}:")
    theMuon.hienThongTin()
}
    // Xóa
    println("Nhập mã thẻ mượn cần xóa: ")
    scanner.nextLine() // Đọc dòng mới
    val maTm = scanner.nextLine()
    var found = false
    for (i in 0 until dspm.size) {
        if (dspm[i].maPhieu == maTm) {
            dspm.removeAt(i)
            found = true
            break
        }
    }
    if (!found) {
        println("Không tìm thấy thẻ mượn có mã $maTm để xóa.")
    } else {
        println("Xóa Thành Công")
        println("Danh Sách sau khi xóa:")
        dspm.forEachIndexed { index, theMuon ->
            println("Thẻ mượn ${index + 1}:")
            theMuon.hienThongTin()
        }
    }
    }
class Bai8 {
}