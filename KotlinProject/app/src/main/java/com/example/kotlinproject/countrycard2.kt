package com.example.kotlinproject

import CountryViewModel
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CountryCard(country: Country) {
    Column (modifier= Modifier
        .fillMaxWidth()
        .padding(14.dp))
    {
        Image(
            painter = painterResource(id = country.imageResource),
            contentDescription = "Country Image",
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
        )
        Spacer(modifier =Modifier.padding(16.dp))

        Row {

            Column (modifier = Modifier
                .padding(8.dp)
                .width(120.dp)){

                Text(text = country.name, modifier =Modifier.padding(bottom =16.dp), fontWeight = FontWeight.Bold)

                for (ta in country.capital) {
                    Text(text = ta)
                }

            }
            Text(text = country.info)
        }
    }
}


@Composable
fun CountryScreen(viewModel: CountryViewModel = viewModel() ) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(modifier =Modifier.height(600.dp) ){
            CountryCard(countries[viewModel.currentIndex.value])
        }


        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                viewModel.nextCountry()
            }
        ) {
            Text("Next Country")
        }
    }
}