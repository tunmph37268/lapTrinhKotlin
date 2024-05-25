package com.example.asm_kot104

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
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

class PayProduct : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Checkout()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Checkout() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = "Back",
            tint = Color.Black,
            modifier = Modifier
                .padding(8.dp)
                .clickable {
                    val intent = Intent(context, Home::class.java)
                    context.startActivity(intent)
                }
        )
        Text(
            text = "Check out",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 20.dp, start = 70.dp)
        )
    }


        Spacer(modifier = Modifier.height(20.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Shipping Address",
                fontSize = 20.sp,
                color = Color(0xff909090),
                modifier = Modifier.weight(1f)
            )
            Image(
                painter = painterResource(id = R.drawable.edit1),
                contentDescription = "edit",
                modifier = Modifier.size(30.dp)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Bruno Fernandes",
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )

        Text(
            text = "25 rue Robert Latouche, Nice, 06200, Côte D’azur, France",
            fontSize = 15.sp,
            color = Color(0xff909090),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Payment",
                fontSize = 20.sp,
                color = Color(0xff909090),
                modifier = Modifier.weight(1f)
            )
            Image(
                painter = painterResource(id = R.drawable.edit2),
                contentDescription = "edit",
                modifier = Modifier.size(30.dp)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.card),
                contentDescription = "card",
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp)
                    .padding(vertical = 10.dp)
            )
            Spacer(modifier = Modifier.width(8.dp)) // Khoảng cách giữa hình ảnh và văn bản
            Text(
                text = "**** **** **** 3947",
                fontSize = 20.sp,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Delivery method",
                fontSize = 20.sp,
                color = Color(0xff909090),
                modifier = Modifier.weight(1f)
            )
            Image(
                painter = painterResource(id = R.drawable.edit2),
                contentDescription = "edit",
                modifier = Modifier.size(30.dp)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.dhl),
                contentDescription = "card",
                modifier = Modifier
                    .height(80.dp)
                    .width(150.dp)
                    .padding(vertical = 10.dp)
            )
            Spacer(modifier = Modifier.width(8.dp)) // Khoảng cách giữa hình ảnh và văn bản
            Text(
                text = "Fast (2-3days)",
                fontSize = 20.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Order:",
                fontSize = 20.sp,
                color = Color(0xff909090)
            )
            Text(
                text = "$95.00",
                fontSize = 20.sp
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Delivery:",
                fontSize = 20.sp,
                color = Color(0xff909090)
            )
            Text(
                text = "$5.00",
                fontSize = 20.sp
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Total:",
                fontSize = 20.sp,
                color = Color(0xff909090)
            )
            Text(
                text = "$100.00",
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = {   val intent = Intent(context, Bank::class.java)
                context.startActivity(intent) },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "ĐẶT HÀNG",
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
