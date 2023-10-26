package com.example.lab_week_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab_week_2.ui.theme.Lab_Week_2Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab_Week_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Main() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4BFBE))
    ) {
        Row(
            modifier = Modifier.padding(24.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_left),
                contentDescription = "back",
                modifier = Modifier.size(30.dp, 30.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .size(170.dp, 170.dp)
                    .padding(top = 10.dp, bottom = 10.dp),
                painter = painterResource(id = R.drawable.person),
                contentDescription = "Logo",
            )
            Text(
                text = "K L A I R S"
            )
        }
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 70.dp, topEnd = 70.dp))
                .background(Color(0xFFcfcfcf))
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Create A New Account",
                Modifier.padding(top = 30.dp),
                fontWeight = FontWeight.Bold,
                color = Color(0xFF969696)
            )
            Column(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 70.dp, topEnd = 70.dp))
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 130.dp)
                        .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pngwing_com),
                        contentDescription = "icon",
                        modifier = Modifier
                            .size(30.dp, 30.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.pngwing_com__1_),
                        contentDescription = "icon",
                        modifier = Modifier
                            .size(30.dp, 30.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.pngwing_com__3_),
                        contentDescription = "icon",
                        modifier = Modifier
                            .size(30.dp, 30.dp)
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(vertical = 20.dp),
                    text = "or use your email account",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray,
                        fontFamily = poppinsFamily,
                        textAlign = TextAlign.Center
                    )
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Name") },
                    placeholder = { Text("Ex: Jane Doe") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 60.dp, vertical = 10.dp),
                    shape = RoundedCornerShape(18.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Email") },
                    placeholder = { Text("Ex: janedoe@example.com") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 60.dp, vertical = 10.dp),
                    shape = RoundedCornerShape(18.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Password") },
                    placeholder = { Text("Enter Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 60.dp, vertical = 10.dp),
                    shape = RoundedCornerShape(18.dp)
                )
                Button(
                    onClick = { /* Handle registration here */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF456A))
                ) {
                    Text("Register")
                }
                Text(
                    text = "Already have an account?",
                )
                Text(
                    text = "ALogin here",
                    color = Color(0xFFFF456A),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab_Week_2Theme {
        Main()
    }
}