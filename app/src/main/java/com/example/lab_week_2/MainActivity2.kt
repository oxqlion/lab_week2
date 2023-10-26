package com.example.lab_week_2

import android.icu.number.IntegerWidth
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab_week_2.ui.theme.Lab_Week_2Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab_Week_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun MainView2() {
    Column {
        Header("Your Cart")
        ItemBlock(
            R.drawable.burger1,
            "Krabby Patty",
            "Plant Based Whopper",
            "Rate - 🧑‍🍳 Spicy Level - 5/10",
            "12.000",
            "8"
        )
        Divider(
            modifier = Modifier.padding(horizontal = 28.dp),
            thickness = 1.dp,
            color = Color.Gray
        )
        ItemBlock(
            R.drawable.burger2,
            "Krabby Patty",
            "Extra Spicy Chicken Burger",
            "Rate - 🌶️ Spicy Level - 10/10",
            "36.000",
            "5"
        )
        Divider(
            modifier = Modifier.padding(horizontal = 28.dp),
            thickness = 1.dp,
            color = Color.Gray
        )
        ItemBlock(
            R.drawable.burger3,
            "Krabby Patty",
            "BBQ Beef Rasher",
            "Rate - 👍 Spicy Level - 7/10",
            "30.000",
            "2"
        )
        Divider(
            modifier = Modifier.padding(horizontal = 28.dp),
            thickness = 1.dp,
            color = Color.Gray
        )
        Row(
            modifier = Modifier
                .padding(horizontal = 22.dp, vertical = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Delivery Charges", fontSize = 16.sp)
            Text(text = "Free Delivery", fontSize = 16.sp, textDecoration = TextDecoration.Underline)
        }
        Divider(
            modifier = Modifier.padding(horizontal = 28.dp),
            thickness = 1.dp,
            color = Color.Gray
        )
        Row(
            modifier = Modifier
                .padding(horizontal = 22.dp, vertical = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Total Amount", fontSize = 16.sp)
            Text(text = "Rp 78.000", fontSize = 16.sp)
        }
        Row(
            modifier = Modifier
                .padding(horizontal = 22.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .background(color = Color.White),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                border = BorderStroke(2.dp, color = Color.Black)
            ) {
                Text(text = "Rp 78.000", color = Color.Black)
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .background(color = Color.White),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.Black
                ),
                border = BorderStroke(2.dp, color = Color.Black)
            ) {
                Text(text = "Continue", color = Color.Black)
            }
        }
    }
}

@Composable
fun ItemBlock(
    image: Int,
    resto: String,
    item: String,
    info: String,
    price: String,
    qty: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Box(
            modifier = Modifier.size(width = 130.dp, height = 130.dp),
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "Burger",
                modifier = Modifier
                    .size(width = 130.dp, height = 130.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(horizontal = 6.dp)
        ) {
            Text(
                text = resto,
                color = Color.Gray,
//                modifier = Modifier.padding(vertical = 4.dp),
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = item,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = info,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = price,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "+  " + qty + "  -",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "x",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .border(border = BorderStroke(2.dp, Color.Black))
                        .padding(vertical = 2.dp, horizontal = 12.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview2() {
    Lab_Week_2Theme {
        MainView2()
    }
}