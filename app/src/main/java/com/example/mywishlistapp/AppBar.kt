package com.example.mywishlistapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mywishlistapp.data.Wish

@Composable
fun AppBarView(
    title: String,
    onBackNavClicked: () -> Unit = {}
){
    val navigationIcon: (@Composable () -> Unit)? =
        if (!title.contains("WishList")) {
            {
                IconButton(onClick = { onBackNavClicked() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "backButton",
                        tint = colorScheme.onBackground
                    )
                }
            }
        }else{
            null
        }

    TopAppBar(title = { Text(text = title , color = colorScheme.onBackground,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .heightIn(max = 24.dp)
                        )
    },
        elevation = 3.dp,
        backgroundColor = colorScheme.onPrimary,//colorResource(id = R.color.app_bar_color),
        navigationIcon = navigationIcon,
        )
}
