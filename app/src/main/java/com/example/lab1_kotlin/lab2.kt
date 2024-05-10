package com.example.lab1_kotlin
import java.util.Scanner

fun main() {
    println("Danh Sách Sinh Viên:")
    val sv1: SvienModel = SvienModel("Cao Gia Mai", "Ph4555", 9.2f)
    val sv2: SvienModel = SvienModel("Cao Gia Hung", "Ph33333", 5.2f)
    sv1.daTorNghiep = false
    sv1.old = 23
    val sv3: SvienModel = SvienModel("Cao Viet Xu", "PH54464", 7.2f, false, 21)
    val sv4: SvienModel = SvienModel("Cao Viet Xung", "PH5444", 9.2f, false, 21)
    val listSv = mutableListOf<SvienModel>()
    listSv.add(sv1)
    listSv.add(sv2)
    listSv.add(sv3)
    listSv.add(sv4)

    // Thêm nhập dữ liệu từ người dùng
    val scanner = Scanner(System.`in`)

    println("Nhập thông tin cho sinh viên mới:")
    print("Nhập tên: ")
    val ten = scanner.nextLine()
    print("Nhập mã sinh viên: ")
    val maSv = scanner.nextLine()
    print("Nhập điểm trung bình: ")
    val diemTb = scanner.nextFloat()
    print("Nhập tuổi: ")
    val tuoi = scanner.nextInt()
    print("Đã tốt nghiệp (true/false): ")
    val ttn = scanner.nextBoolean()

    val svMoi: SvienModel = SvienModel(ten, maSv, diemTb, ttn, tuoi)
    listSv.add(svMoi)

    println("-----------------------")
    println("Danh Sách sau khi thêm:")
    for (sv in listSv) {
        println(sv.getTT())
    }

    // Xóa
    println("Nhập mã sinh viên cần xóa: ")
    scanner.nextLine() // Đọc dòng kết thúc từ lần nhập trước
    val maSvXoa = scanner.nextLine()
    var found = false
    for (i in 0 until listSv.size) {
        if (listSv[i].mssv == maSvXoa) {
            listSv.removeAt(i)
            found = true
            break
        }
    }
    if (!found) {
        println("Không tìm thấy sinh viên có mã $maSvXoa để xóa.")
    } else {
        println("-----------------------")
        println("Danh Sách sau khi xóa:")
        for (sv in listSv) {
            println(sv.getTT())
        }
    }



    // Cập nhật
    println("Nhập mã sinh viên cần cập nhật: ")
    val maSvCapNhat = scanner.nextLine()
    println("Nhập tên mới: ")
    val tenMoi = scanner.nextLine()
    println("Nhập điểm TB mới: ")
    val diemTbMoi = scanner.nextFloat()
    println("Nhập tuổi mới: ")
    val tuoiMoi = scanner.nextInt()
    println("Đã tốt nghiệp mới (true/false): ")
    val ttnMoi = scanner.nextBoolean()
    for (sv in listSv) {
        if (sv.mssv == maSvCapNhat) {
            sv.capNhatSinhVien(maSvCapNhat, tenMoi, diemTbMoi, ttnMoi, tuoiMoi)
            break
        }
    }
    println("-----------------------")
    println("Danh sách sau khi cập nhật:")
    for (sv in listSv) {
        println(sv.getTT())
    }
}
