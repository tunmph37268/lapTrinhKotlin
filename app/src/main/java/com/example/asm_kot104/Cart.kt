package com.example.asm_kot104

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Dangerous
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class Cart : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
            ) { innerPadding -> NoteApp(innerPadding)
            }
        }
    }
    @Preview
    @Composable
    fun NoteApp(paddingValues: PaddingValues? = null) {

        val context = LocalContext.current
        val listProduct = mutableListOf<SanPham>() // goi class java tu kotlin jetpack compose
        var totalValue by remember { mutableDoubleStateOf(0.0) }
        var searchText by remember { mutableStateOf("") }
        listProduct.add(SanPham(R.drawable.image2, "Table Gucci", 7.5, 2))
        listProduct.add(SanPham(R.drawable.image3, "Chair Vip", 8.7, 4))
        listProduct.add(SanPham(R.drawable.image4, "Table Television", 9.6, 7))
        listProduct.forEach { product ->
            totalValue += product.price * product.quantity
        }
        Column(
            modifier = Modifier
                .padding(paddingValues!!)
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Icon trở về
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
                    text = "My Cart",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .padding(horizontal = 125.dp)
                        .weight(1f)
                )
            }

            listProduct.forEach { product ->
                NoteCard(product  )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Total:",
                    style = TextStyle(color = Color.Black) ,
                            modifier = Modifier.padding(40.dp, bottom = 10.dp)
                )
                Text(
                    text = "$totalValue$",
                    style = TextStyle(color = Color.Black),
                    modifier = Modifier.padding(end = 20.dp)
                )
            }

            TextField(
                value = searchText,
                onValueChange = { newValue ->
                    searchText = newValue
                },
                placeholder = { Text("Enter your promo code") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White) // Đặt nền trong suốt
                    .padding(vertical = 8.dp, horizontal = 20.dp) // Căn lề
                    .border(
                        width = 0.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(5.dp)
                    )
                    .border(
                        width = 1.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(5.dp)
                    )
            )
            Button(
                onClick = {
                    val intent = Intent(context, Home::class.java)
                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier
                    .width(290.dp)
                    .padding(top = 20.dp)
                    .height(55.dp)
                    .align(Alignment.CenterHorizontally),
                shape = MaterialTheme.shapes.small.copy(
                    topStart = CornerSize(10.dp),
                    topEnd = CornerSize(10.dp),
                    bottomStart = CornerSize(10.dp),
                    bottomEnd = CornerSize(10.dp)
                )
            )
            {
                Text(
                    text = "BACK TO HOME",
                    fontSize = 18.sp,
                    style = TextStyle(Color.White)

                )
            }
        }
    }




    @Composable
    fun NoteCard(sp: SanPham) {
        var quantity by remember { mutableIntStateOf(sp.quantity) }

//        var totalValue by remember { mutableDoubleStateOf(0.0) }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(
                    color = Color.White,
                    shape = MaterialTheme.shapes.medium
                )
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Hình ảnh ở ngoài cùng tay trái
                Image(
                    painter = painterResource(id = sp.image),
                    contentDescription = null,
                    modifier = Modifier

                        .height(100.dp)
                        .width(100.dp)
                        .weight(0.5f)
                        .padding(end = 10.dp)
                        .clip(RoundedCornerShape(10.dp)) // Bo góc cho hình ảnh
                )

                // Các trường văn bản
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 16.dp) // Thêm padding ở bên phải để tạo khoảng cách với biểu tượng
                ) {
                    Text(
                        text = sp.name,
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Text(
                        text = "${sp.price}"+" $",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        IconButton(
                            onClick = {    quantity++
                            },
                            modifier = Modifier.padding(end = 4.dp)
                            )

                        {
                            Icon(
                                imageVector = Icons.Filled.Add,
                                contentDescription = "Add",
                                tint = Color.Black
                            )
                        }

                        // Hiển thị quantity
                        Text(
                            text = "${sp.quantity}",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.padding(horizontal = 8.dp)
                        )


                        IconButton(
                            onClick = {  quantity--
                                 },
                            modifier = Modifier.padding(start = 4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Remove,
                                contentDescription = "Decrease",
                                tint = Color.Black
                            )
                        }
                    }
                }

                // Biểu tượng ở phía phải
                Icon(
                    imageVector = Icons.Filled.Dangerous,
                    contentDescription = "Dangerous",
                    modifier = Modifier
                        .padding(16.dp, bottom = 100.dp, end = 1.dp)

                )

            }

        }
    }
}