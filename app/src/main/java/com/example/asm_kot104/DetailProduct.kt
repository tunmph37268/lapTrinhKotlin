
package com.example.asm_kot104


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DetailProduct : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Manchitiet()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Manchitiet() {
    val context = LocalContext.current
    Column (modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.weight(1f)) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back",
                tint = Color.Black,
                modifier = Modifier
                    .padding(8.dp)
                    .clickable {
                        val intent = Intent(context, Cart::class.java)
                        context.startActivity(intent)
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.chair),
                contentDescription = "bantrangtri",
                modifier = Modifier
                    .heightIn(600.dp)
                    .width(500.dp)
                    .padding(start = 80.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.color),
                contentDescription = "khungmau",
                modifier = Modifier
                    .heightIn(230.dp)
                    .width(150.dp)
                    .align(Alignment.CenterStart)
                    .padding(end = 0.dp)
            )

        }
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 20.dp)
        ) {
            Text(text = "Minimal Stand", fontSize = 30.sp, modifier = Modifier.padding(top = 20.dp))
            Row() {
                Text(
                    text = "$ 50",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(top = 10.dp),
                    fontWeight = FontWeight.Bold
                )
                Image(
                    painter = painterResource(id = R.drawable.cong), contentDescription = "cong",
                    modifier = Modifier
                        .height(70.dp)
                        .width(30.dp)
                        .offset(x = 96.dp)
                )
                Text(
                    text = "02",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 20.dp, start = 120.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.tru), contentDescription = "tru",
                    modifier = Modifier
                        .height(70.dp)
                        .width(30.dp)
                        .offset(x = 16.dp)
                )
            }

            Row {
                Image(
                    painter = painterResource(id = R.drawable.start),
                    contentDescription = "danhgia",
                    modifier = Modifier
                        .height(50.dp)
                        .width(30.dp)
                )
                Text(
                    text = "4.5",
                    fontSize = 30.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 3.dp)
                )
                Text(
                    text = "(50 reviews)",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 30.dp, top = 10.dp),
                    color = Color(0xff808080)
                )
            }
            Text(
                text = "Minimal Stand is made of by natural wood. The design that is very simple and minimal. This is truly one of the best furnitures in any family for now. With 3 different colors," +
                        " you can easily select the best match for your home. ",
                fontSize = 18.sp,
                color = Color(0xff808080),
                modifier = Modifier.padding(end = 10.dp)
            )

            Row {
                Image(painter = painterResource(id = R.drawable.book), contentDescription = "danhdau",
                    modifier = Modifier.height(90.dp).width(70.dp))
                    Button(
                        onClick = {val intent = Intent(context, Cart::class.java)
                            context.startActivity(intent) },
                        modifier = Modifier
                            .padding(top = 15.dp, start = 20.dp)
                            .size(width = 250.dp, height = 60.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black), // Đặt màu nền cho nút là màu đen
                        shape = MaterialTheme.shapes.small,
                    ) {
                        Text(
                            text = "Add to cart",
                            fontSize = 23.sp,
                            color = Color(0xffFFFFFF),

                            )
                    }
                }
            }
        }
    }