package com.example.asm_kot104

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageView()
        }
    }
}

@Composable
fun ImageView() {
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.banner),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "MAKE YOUR",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            modifier = Modifier
                .padding(top = 231.dp, start = 30.dp)
        )
        Text(
            text = "HOME BEAUTIFUL",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .padding(top = 286.dp, start = 30.dp)
        )

        Text(
            text = "The best simple place where you discover most wonderful furnitures and make your home beautiful",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 35.sp,
            color = Color.Gray,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .width(350.dp)
                .padding(top = 359.dp, start = 59.dp)
        )

        Button(
            onClick = {
                val intent = Intent(context, Login::class.java)
                context.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .padding(top = 458.dp)
                .width(159.dp)
                .height(54.dp)
                .align(Alignment.Center),
            shape = MaterialTheme.shapes.small.copy(
                topStart = CornerSize(5.dp),
                topEnd = CornerSize(5.dp),
                bottomStart = CornerSize(5.dp),
                bottomEnd = CornerSize(5.dp)
            )
        ) {
            Text(
                text = "Get Started",
                fontSize = 18.sp
            )
        }
    }
}

@Preview
@Composable
fun PreviewImageView() {
    ImageView()
}
