package com.example.asm_kot104

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*


import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddAlert
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MainScreen()
        }
    }
}
@Composable

fun MainScreen() {
    val context = LocalContext.current
    val images = listOf(
        R.drawable.group1,
        R.drawable.group2,
        R.drawable.gruop3,
        R.drawable.group4,
        R.drawable.group5,
        R.drawable.group4
    )

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier.padding(top = 10.dp, start = 20.dp)

                    )
                    Text(
                        text = "Make home",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        modifier = Modifier.padding(top = 5.dp, bottom = 5.dp, start = 105.dp, end = 115.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Cart",
                        modifier = Modifier.size(40.dp).padding(top = 5.dp, end = 10.dp)

                    )
                }
                Text(
                    text = "BEAUTIFUL",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(vertical = 2.dp)
                )

                HorizontalImageList(images)
            }

        },
        bottomBar = {
            val items = listOf(
                BottomNavItem("Home", Icons.Default.Home),
                BottomNavItem("Bookmark", Icons.Default.Bookmark),
                BottomNavItem("Message", Icons.Default.AddAlert),
                BottomNavItem("Profile", Icons.Default.AccountCircle)
            )
            var selectedIndex by remember { mutableStateOf(0) }
            MyBottomNavigation(
                items = items,
                selectedIndex = selectedIndex,
                onItemSelected = { newIndex -> selectedIndex = newIndex
                    when (newIndex) {
                        0 -> {
                            // Chuyển đến màn hình Home
                            // Ví dụ: Sử dụng Intent để chuyển đến HomeActivity
                            val intent = Intent(context, Home::class.java)
                            context.startActivity(intent)
                        }
                        1 -> {
                            val intent = Intent(context, Bank::class.java)
                            context.startActivity(intent)
                            // Chuyển đến màn hình Bookmark
                            // Thêm xử lý tương tự ở đây nếu cần
                        }
                        // Thêm các trường hợp khác tương tự ở đây nếu cần
                    }

                }
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            ProductGrid()
        }
    }
}


@Composable
fun HorizontalImageList(imageList: List<Int>){
    val scrollSate = rememberScrollState()
    Row(modifier = Modifier
        .horizontalScroll(scrollSate)
        .padding(15.dp)) {
        imageList.forEachIndexed { index, image ->
            Image(
                painter = painterResource(id = image),
                contentDescription = "Image Description",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .size(65.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .padding(10.dp)
            )
        }
    }
}
@Composable
fun ProductGrid() {

    val products = listOf(
        Product("Black Simple Lamp", R.drawable.image1,20.000),
        Product("Minimal Stand", R.drawable.image2,100.000),
        Product("Coffee Chair", R.drawable.image3,1000.1),
        Product("Simple Desk", R.drawable.image4,30.300)
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp) // Padding for some space around the content
    ) {
        items(products) { product ->
            ProductItem(product)
        }
    }
}

@Composable
fun ProductItem(product: Product) {
    Column(
        modifier = Modifier
            .padding(1.dp)
            .fillMaxWidth()
    ) {
        Surface(
            modifier = Modifier
                .aspectRatio(1f)
                .clip(RoundedCornerShape(8.dp)), // Ensure square aspect ratio
            shape = RoundedCornerShape(8.dp), // Add rounded corners
            color = Color.White // Placeholder background
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 15.dp), // Add space at the bottom for the text
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = product.imageRes),
                    contentDescription = product.name,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        Text(
            text = product.name,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp, bottom = 5.dp)
                .align(Alignment.Start)
        )
        Text(
            text = product.price.toString()+" $",
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp, bottom = 15.dp)
                .align(Alignment.Start)
        )
    }
}


data class Product(val name: String, val imageRes: Int, val price: Double)

@Composable
fun MyBottomNavigation(
    items: List<BottomNavItem>,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit
) {
    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                selected = selectedIndex == index,
                onClick = { onItemSelected(index) }
            )
        }
    }
}

data class BottomNavItem(val label: String, val icon: ImageVector)
