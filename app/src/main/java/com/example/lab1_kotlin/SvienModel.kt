package com.example.lab1_kotlin

class SvienModel (var tenSv:String,var mssv:String,var diemTB:Float) {
    var daTorNghiep:Boolean?=null
    var old:Int?=null
    constructor(tenSv:String, mssv:String,diemTB:Float,daTorNghiep:Boolean,old:Int) : this(tenSv,mssv,diemTB) {
        this.daTorNghiep=daTorNghiep
        this.old=old
    }
    fun getTT():String{
        var s:String
        if (daTorNghiep!=null && old!=null){
            s="Name:$tenSv,ID:$mssv,Point:$diemTB,Passit:$daTorNghiep,Old:$old"
        }
        else{
            s="Name:$tenSv,ID:$mssv,Point:$diemTB"
        }
        return s
    }
    fun capNhatSinhVien(mssv: String, tenMoi: String, diemTBMoi: Float, daTotNghiepMoi: Boolean?, tuoiMoi: Int?) {
        if (this.mssv == mssv) {
            tenSv = tenMoi
            diemTB = diemTBMoi
            daTorNghiep = daTotNghiepMoi
            old = tuoiMoi
        }
    }
}