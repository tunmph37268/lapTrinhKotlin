package com.example.asm_kot104

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.border
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.VisualTransformation

import androidx.compose.ui.unit.dp

class Resigin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ResiginScreen()
        }
    }
}

@Composable
fun ResiginScreen() {
    val context = LocalContext.current
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var comforpassword by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.thanhngang),
                        contentDescription = "",
                        modifier = Modifier
                            .width(105.dp)
                            .height(10.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "",
                        modifier = Modifier
                            .width(63.dp)
                            .height(63.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Image(
                        painter = painterResource(id = R.drawable.thanhngang),
                        contentDescription = "",
                        modifier = Modifier
                            .width(105.dp)
                            .height(10.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "WELCOME",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(32.dp, bottom = 15.dp).align(Alignment.Start)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Name",
                    color = Color.Gray,
                    modifier = Modifier.padding(bottom = 2.dp)
                )
                OutlinedTextField(
                    value = username,
                    onValueChange = {username = it},
                    textStyle = TextStyle(color = Color.Black), // Thiết lập màu văn bản
                    singleLine = true, // Chỉ cho phép nhập một dòng
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text
                    ), // Thiết lập loại bàn phím
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent) // Đặt nền trong suốt
                        .padding(vertical = 2.dp, horizontal = 5.dp) // Căn lề
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
                Spacer(modifier = Modifier.height(1.dp))
                Text(
                    text = "Email",
                    color = Color.Gray,
                    modifier = Modifier.padding(bottom = 2.dp)
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = {email = it},
                    textStyle = TextStyle(color = Color.Black), // Thiết lập màu văn bản
                    singleLine = true, // Chỉ cho phép nhập một dòng
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Text
                    ), // Thiết lập loại bàn phím
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent) // Đặt nền trong suốt
                        .padding(vertical = 2.dp, horizontal = 5.dp) // Căn lề
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
                Spacer(modifier = Modifier.height(1.dp))
                Text(
                    text = "Password",
                    color = Color.Gray,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        val image = if (passwordVisible)
                            Icons.Filled.Visibility
                        else Icons.Filled.VisibilityOff

                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            Icon(imageVector = image, contentDescription = if (passwordVisible) "Hide password" else "Show password")
                        }
                    },
                    textStyle = TextStyle(color = Color.Black),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text),
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent)
                        .padding(vertical = 8.dp, horizontal = 5.dp)
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
                Text(
                    text = "ComforPassword",
                    color = Color.Gray,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                OutlinedTextField(
                    value = comforpassword,
                    onValueChange = { comforpassword = it },
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        val image = if (passwordVisible)
                            Icons.Filled.Visibility
                        else Icons.Filled.VisibilityOff

                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            Icon(imageVector = image, contentDescription = if (passwordVisible) "Hide password" else "Show password")
                        }
                    },
                    textStyle = TextStyle(color = Color.Black),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text),
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent)
                        .padding(vertical = 8.dp, horizontal = 5.dp)
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
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {
                    if (username.isNotBlank() && password.isNotBlank()) {
                        val intent = Intent(context, Login::class.java)
                        context.startActivity(intent)
                        Toast.makeText(context, "Login successful", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(context, "Please enter username and password", Toast.LENGTH_LONG).show()
                    }
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
                    text = "SIGN UP",
                    fontSize = 18.sp
                )
            }

            Row (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center,
                ){

                Text(text = "Already have accuont?",
                    color = Color.Gray,
                    fontSize = 18.sp,
                    modifier = Modifier

                )
                Text(text = "SIGN IN",
                    color = Color.Black,
                    modifier = Modifier,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold

                )
            }

        }
    }
}

@Preview
@Composable
fun PreviewResiginScreen() {
    ResiginScreen()
}
