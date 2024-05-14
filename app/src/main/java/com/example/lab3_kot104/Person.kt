package com.example.lab3_kot104


open class Nguoi(val hoTen: String, val tuoi: Int, val queQuan: String, val maSoGV: String)

class CBGV(
    hoTen: String,
    tuoi: Int,
    queQuan: String,
    maSoGV: String,
    val luongCung: Int,
    val luongThuong: Int,
    val tienPhat: Int
) : Nguoi(hoTen, tuoi, queQuan, maSoGV) {
    fun tinhLuongThucLinh(): Int {
        return luongCung + luongThuong - tienPhat
    }
  fun hienThiThongTin() {
        println("Họ tên: $hoTen ,Tuổi: $tuoi ,Quê quán: $queQuan, Mã số giáo viên: $maSoGV, Lương cứng: $luongCung, Lương thưởng: $luongThuong, Tiền phạt: $tienPhat")
        println("Lương thực lĩnh: ${tinhLuongThucLinh()} VND")
    }
}

class Person {
}