package com.example.qotda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.QOTDA.ui.theme.QOTDATHEME

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QOTDATHEME {
                QOTDAAPP()
            }
        }
    }

    //preview function
    @Preview
    @Composable
    fun QOTDAAPP() {
        QuotesImages(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        )
    }

    //images, hindi ko lang po naadjust sir yung size kasi ngayon ko lang din nacheck and ubos napo yung time, naglalag po kasi siya sa pc kopo
    @Composable
    fun QuotesImages(modifier: Modifier = Modifier) {
        var result by remember { mutableStateOf(0) }
        var reflectionText by remember { mutableStateOf("") }

        val quotes = listOf(
            "Quote 1",
            "Quote 2",
            "Quote 3",
            "Quote 4",
            "Quote 5",
            "Quote 6",
            "Quote 7",
            "Quote 8",
            "Quote 9",
            "Quote 10"
        )


        val imageResources = listOf(
            R.drawable.quote_image_1,
            R.drawable.quote_image_2,
            R.drawable.quote_image_3,
            R.drawable.quote_image_4,
            R.drawable.quote_image_5,
            R.drawable.quote_image_6,
            R.drawable.quote_image_7,
            R.drawable.quote_image_8,
            R.drawable.quote_image_9,
            R.drawable.quote_image_10
        )

        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = imageResources[result]),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = quotes[result]
            )
            Spacer(modifier = Modifier.height(16.dp))
            //dito po nakakapagtype yung user ng reflection nila
            TextField(
                value = reflectionText,
                onValueChange = { reflectionText = it },
                label = { Text("Type your reflection here") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            //button for the quotes
            Button(onClick = { result = (0 until quotes.size).random() }) {
                Text(stringResource(R.string.roll))
            }
            Spacer(modifier = Modifier.height(16.dp))
            //button for the reflection ng isasubmit ni user, pero hindi po siya nasesave
            Button(
                onClick = {  }
            ) {
                Text("Submit Reflection")
            }
        }
    }
}

