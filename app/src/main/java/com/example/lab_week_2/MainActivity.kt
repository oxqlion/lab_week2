package com.example.lab_week_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab_week_2.ui.theme.DarkBlue
import com.example.lab_week_2.ui.theme.Lab_Week_2Theme
import com.example.lab_week_2.ui.theme.Purple80
import com.example.lab_week_2.ui.theme.DarkBlue
import com.example.lab_week_2.ui.theme.Lab_Week_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab_Week_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                }
            }
        }
    }
}

val poppinsFamily = FontFamily(
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_medium, FontWeight.Medium)
)

@Composable
fun MainView() {
    Column(
        Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header("Krabby Patty")
        HeroImage()
        InfoSection()
    }
}

@Composable
fun Header(title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        IconButton(onClick = {}) {
            Image(painter = painterResource(id = R.drawable.arrow_left), contentDescription = "Back", modifier = Modifier.size(size= 20.dp) )
        }
        Text(
            text = title,
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        IconButton(onClick = {}) {
            Image(
                painter = painterResource(id = R.drawable.align_justify),
                contentDescription = "Menu",
                modifier = Modifier.size(size = 20.dp)
            )
        }
        //Padding -> Di dalam imagenya atau kamu mau buat composable sendiri
    }
}


@Composable
fun HeroImage() {
    Column{
        Image(painter = painterResource(id = R.drawable.burger),
            contentDescription = "Hero Image",
            modifier = Modifier
                .size(300.dp)
                .padding(top = 48.dp)
        )
    }
}

@Composable
fun InfoSection() {
    Column(
        modifier = Modifier
            .background(DarkBlue, shape = RoundedCornerShape(topEnd = 24.dp, topStart = 24.dp))
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column() {
                Text(
                    text = "King Box Cheesy Beef Burger",
                    fontSize = 24.sp,
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_star_24),
                        contentDescription = "Rating Star",
                        modifier = Modifier.size(24.dp)
                    )
                    Text(
                        text = "5.0",
                        color = Color.White,
                        fontSize = 22.sp
                    )
                    Text(
                        text = "(684 Reviews)",
                        color = Color.Gray,
                        fontSize = 22.sp,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }
                Text(
                    text = "Cheesy Beef Burger + 1pc Ayam Crispy + Nasi + Coke Regular + Spider-Verse Toys : Brooklyn Sky Scrapper + Super Float Cake",
                    modifier = Modifier.padding(top = 12.dp),
                    color = Color.White
                )

                Text(
                    text = "Read more...",
                    color = Color.White,
                    textDecoration = TextDecoration.Underline
                )
            }
            Row(
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Rp. 40,909",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = poppinsFamily,
                    color = Color.White
                )
                Button(
                    onClick = {},
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(24.dp))
                        .height(52.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.White
                    )
                ) {
                    Text(
                        text = "Add To Cart",
                        fontSize = 24.sp,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Lab_Week_2Theme {
        MainView()
    }
}