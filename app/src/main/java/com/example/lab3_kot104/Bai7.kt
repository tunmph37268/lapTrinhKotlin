package com.example.lab3_kot104

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val danhSachGV = mutableListOf<CBGV>()

    // Thêm các giáo viên mặc định vào danh sách
    danhSachGV.add(CBGV("Nguyễn Văn Nam", 35, "Hà Nội", "GV001", 5000000, 1000000, 200000))
    danhSachGV.add(CBGV("Trần Thị Hoa", 40, "Hồ Chí Minh", "GV002", 6000000, 1200000, 150000))

    do {
        println("Chọn hành động:")
        println("1. Thêm giáo viên")
        println("2. Xóa giáo viên")
        println("3. Hiển thị danh sách giáo viên")
        println("4. Thoát")
        print("Lựa chọn của bạn: ")
        val choice = scanner.nextInt()
        scanner.nextLine() // Đọc dòng kết thúc từ lần nhập trước

        when (choice) {
            1 -> {
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

                val gv = CBGV(hoTen, tuoi, queQuan, maSoGV, luongCung, luongThuong, tienPhat)
                danhSachGV.add(gv)
                println("Thêm Thành Công")
            }
            2 -> {
                println("Nhập mã giáo viên cần xóa: ")
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
                    println("Không tìm thấy giáo viên có mã $maGvXoa để xóa.")
                } else {
                    println("Xóa thành công")
                }
            }
            3 -> {
                println("Danh sách giáo viên:")
                for (ds in danhSachGV) {
                    ds.hienThiThongTin()
                }
            }
            4 -> {
                println("Thoát chương trình")
            }
            else -> {
                println("Lựa chọn không hợp lệ, vui lòng chọn lại.")
            }
        }
    } while (choice != 4)
}

class Bai7 {
}