package com.example.lab_week_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab_week_2.ui.theme.Lab_Week_2Theme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab_Week_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun MainView4() {
    Column(
        modifier = Modifier
            .background(Color(0xFF1735AD))
            .padding(bottom = 45.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp)
                .padding(top = 20.dp, bottom = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,

            ) {
            Image(
                painter = painterResource(id = R.drawable.back_white),
                contentDescription = "back",
                modifier = Modifier.size(30.dp, 30.dp),
            )
            Text(
                text = "Profile",
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = poppinsFamily,
                    color = Color.White
                )
            )
            Image(
                painter = painterResource(id = R.drawable.pencil),
                contentDescription = "menu",
                modifier = Modifier.size(30.dp, 30.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Rafi Abhista",
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = poppinsFamily,
                        color = Color.White
                    )
                )
                Text(
                    text = "Ciputra University",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = poppinsFamily,
                        color = Color.White
                    )
                )
            }
            Image(
                painter = painterResource(id = R.drawable.person),
                contentDescription = "profile",
                modifier = Modifier.size(120.dp, 120.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth()
                    .offset(0.dp, (-30).dp)
                    .shadow(5.dp, shape = RoundedCornerShape(12.dp))
                    .background(Color.White, shape = RoundedCornerShape(12.dp))
            ) {
                Text(
                    text = "Personal Data",
                    style = TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = poppinsFamily
                    ),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 15.dp, bottom = 5.dp)
                )
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    color = Color.Gray,
                    thickness = 1.dp
                )
                Row(
                    modifier = Modifier
                        .padding(horizontal = 20.dp, vertical = 10.dp)
                        .fillMaxWidth(),
                ) {
                    Column(
                    ) {
                        Text(
                            text = "NIM",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = poppinsFamily,
                                color = Color.Gray
                            )
                        )
                        Text(
                            text = "0706012210029",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = poppinsFamily,
                                color = Color.Black
                            )
                        )
                    }
                    Box(
                        modifier = Modifier.padding(end = 70.dp)
                    ) {
                    }
                    Column(
                    ) {
                        Text(
                            text = "Date of Birth",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = poppinsFamily,
                                color = Color.Gray
                            )
                        )
                        Text(
                            text = "11 November 2023",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = poppinsFamily,
                                color = Color.Black
                            )
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .fillMaxWidth(),
                ) {
                    Column(
                    ) {
                        Text(
                            text = "Occupation",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = poppinsFamily,
                                color = Color.Gray
                            )
                        )
                        Text(
                            text = "Student",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = poppinsFamily,
                                color = Color.Black
                            )
                        )
                    }
                    Box(
                        modifier = Modifier.padding(end = 92.dp)
                    ) {
                    }
                    Column(
                    ) {
                        Text(
                            text = "Marital Status",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = poppinsFamily,
                                color = Color.Gray
                            )
                        )
                        Text(
                            text = "Single",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = poppinsFamily,
                                color = Color.Black
                            )
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .padding(horizontal = 20.dp, vertical = 10.dp)
                        .fillMaxWidth(),
                ) {
                    Text(
                        text = "Email",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = poppinsFamily,
                            color = Color.Gray
                        )
                    )
                    Text(
                        text = "rabhista@student.ciputra.ac.id",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = poppinsFamily,
                            color = Color.Black
                        )
                    )
                }
            }
        }
    }
    Column(
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
            .offset(0.dp, (-20).dp)
            .padding(bottom = 15.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .background(Color.White, shape = RoundedCornerShape(12.dp))
    ) {
        Text(
            text = "Expertise",
            style = TextStyle(
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = poppinsFamily
            ),
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .padding(top = 15.dp, bottom = 5.dp)
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            color = Color.Gray,
            thickness = 1.dp
        )
        Row(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 10.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.android),
                contentDescription = "arrow",
                modifier = Modifier.size(40.dp, 40.dp)
            )
            Box(
                modifier = Modifier.padding(end = 20.dp)
            ) {
            }
            Text(
                text = "Android Development",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = poppinsFamily,
                    color = Color.Black
                ),
            )
        }
    }
    Column(
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
            .offset(0.dp, (-24).dp)
            .padding(bottom = 15.dp)
            .shadow(5.dp, shape = RoundedCornerShape(12.dp))
            .background(Color.White, shape = RoundedCornerShape(12.dp))
    ) {
        Text(
            text = "Send a Message",
            style = TextStyle(
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = poppinsFamily
            ),
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .padding(top = 15.dp, bottom = 5.dp)
        )
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            color = Color.Gray,
            thickness = 1.dp
        )
        Box(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .padding(top = 7.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .padding(horizontal = 5.dp, vertical = 3.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Gray,
                        shape = MaterialTheme.shapes.large
                    )
                    .fillMaxWidth(),
            ) {
                Text(
                    modifier = Modifier
                        .padding(vertical = 12.dp, horizontal = 20.dp),
                    text = "Write a Message",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Gray,
                        fontFamily = poppinsFamily,
                        textAlign = TextAlign.Left
                    )
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp, bottom = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .background(
                        color = Color(0xFF1735AD),
                        shape = RoundedCornerShape(50.dp)
                    )
                    .padding(horizontal = 20.dp)
            ) {
                Text(
                    text = "Send",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = poppinsFamily
                    ),
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    Lab_Week_2Theme {
        MainView4()
    }
}