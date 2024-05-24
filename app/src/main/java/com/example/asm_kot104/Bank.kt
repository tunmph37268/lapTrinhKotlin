package com.example.asm_kot104

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Bank : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BankScreen()
        }
    }
}

@Composable
fun BankScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text( text = "SUCCESS!",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 60.dp)
            )
        val image1 = painterResource(id = R.drawable.phong)
        val image2 = painterResource(id = R.drawable.imagelogo)
        val image3 = painterResource(id = R.drawable.stick)
        StackedImages(image1, image2,image3)
        Text( text = "Your order will be delivered soon.",
            fontSize = 20.sp,

            modifier = Modifier.padding(top = 10.dp, bottom = 5.dp)
        )
        Text( text = "Thank you for choosing our app!",
            fontSize = 20.sp,

            modifier = Modifier.padding( bottom = 80.dp)
        )
        Button(
            onClick = {

                // Xử lý logic đăng nhập ở đây
                // Để trình diễn, chúng ta chuyển hướng quay lại MainActivity
            },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .width(285.dp)
                .height(54.dp)
                .align(Alignment.CenterHorizontally),
            shape = MaterialTheme.shapes.small.copy(
                topStart = CornerSize(10.dp),
                topEnd = CornerSize(10.dp),
                bottomStart = CornerSize(10.dp),
                bottomEnd = CornerSize(10.dp)
            )
        ) {
            Text(
                text = "Track your orders",
                fontSize = 18.sp
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                val intent = Intent(context, Home::class.java)
                context.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier
                .width(285.dp)
                .height(54.dp)
                .align(Alignment.CenterHorizontally),
            shape = MaterialTheme.shapes.small.copy(
                topStart = CornerSize(10.dp),
                topEnd = CornerSize(10.dp),
                bottomStart = CornerSize(10.dp),
                bottomEnd = CornerSize(10.dp)
            )
        ) {
            Text(
                text = "BACK TO HOME",
                fontSize = 18.sp,
              style = TextStyle(Color.Black)

            )
        }




    }
}

@Composable
fun StackedImages(image1: Painter, image2: Painter, image3: Painter) {
    Box {
        Image(
            painter = image1,
            contentDescription = null,
            modifier = Modifier

                .size(250.dp)
                .align(Alignment.Center),
            colorFilter = ColorFilter.tint(Color(0xFF_DCDCDC))
        )
        Image(
            painter = image2,
            contentDescription = null,
            modifier = Modifier

                .size(200.dp)
                .align(Alignment.Center)
        )
        Image(
            painter = image3,
            contentDescription = null,
            modifier = Modifier
                .padding(top = 220.dp)
                .size(50.dp)
                .align(Alignment.Center)
        )
    }
}


