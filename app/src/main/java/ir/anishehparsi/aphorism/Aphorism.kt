package ir.anishehparsi.aphorism

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun Aphorism() {
    val list = mutableListOf(
        "Don't let yesterday take up too much of today.",
        "Nothing is impossible. The word itself says 'I'm possible!",
        "You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose. You're on your own. And you know what you know. And you are the guy who'll decide where to go.",
        "Don't sit down and wait for the opportunities to come. Get up and make them.",
        "Give light and people will find the way.",
        "To live is the rarest thing in the world. Most people just exist.",
        "There is no better compass than compassion.",
        "Love yourself first and everything else falls into line.",
        "In three words I can sum up everything I've learned about life: It goes on.",
        "One day or day one. You decide.",
        "Ask yourself at every moment. Is this necessary?",
        "Start where you are. Use what you have. Do what you can.",
        "Don't let your fear decide your future.",
        "Remember; Difficult does not mean IMPOSSIBLE.",
        "It always seems impossible until it's done.",
        "Life is like riding a bicycle. To keep your balance you must keep moving.",
        "Only you can turn your dreams into a reality."
    )
    var advice by remember { mutableStateOf("Hello, From The World Of Wonders!") }
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier.size(360.dp)
        ) {
            Text(
                text = advice,
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                style = LocalTextStyle.current.merge(
                    TextStyle(
                        lineHeight = 2.5.em,
                        platformStyle = PlatformTextStyle(
                            includeFontPadding = false
                        ),
                        lineHeightStyle = LineHeightStyle(
                            alignment = LineHeightStyle.Alignment.Center,
                            trim = LineHeightStyle.Trim.None
                        )
                    )
                )
            )
        }

        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0x99024980)),
            onClick = {
                advice = list[adviceBtn(list)]
            }) { Text("Give me advice!") }

    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    Aphorism()
}