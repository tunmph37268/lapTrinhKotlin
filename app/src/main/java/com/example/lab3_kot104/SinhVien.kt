package com.example.lab3_kot104
data class SinhVienPL(val hoTen:String, val tuoi: Int, val lop: String)
class TheMuon( val maPhieu: String,
               val ngayMuon: Int,
               val hanTra: Int,
               val soHieuSach: String,
               val sinhVien: SinhVienPL){
    fun hienThongTin() {
        println("Mã phiếu mượn: $maPhieu, Ngày mượn: $ngayMuon, Hạn trả: $hanTra,Số hiệu sách: $soHieuSach")
        println("Thông tin sinh viên mượn sách:")
        println("  Họ và tên: ${sinhVien.hoTen}")
        println("  Tuổi: ${sinhVien.tuoi}")
        println("  Lớp: ${sinhVien.lop}")
    }
    }




class SinhVien {
}