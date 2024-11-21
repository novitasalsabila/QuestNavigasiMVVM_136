package com.example.arsitekturmvvm.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
@Composable
fun FormulirView(modifier: Modifier = Modifier,
                 listJK:List<String>,
                 onSubmitClicked:(MutableList<String>)-> Unit
                 ){

    var nama by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var notelepon by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(nama,nim,gender,email,alamat,notelepon)

    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        TextField(
            value = nama,
            onValueChange = {nama = it},
            label = {
                Text(text = "Nama")
            },
            placeholder = {
                Text(text = "isi nama anda") //Hint text
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        )

        TextField(
            value = nim,
            onValueChange = {nim = it},
            label = {
                Text(text = "Nim")
            },
            placeholder = {
                Text(text = "isi Nim anda") //Hint text
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        )

        Row (modifier = Modifier.fillMaxWidth()){
            listJK.forEach{selectedGender ->
                Row (
                    verticalAlignment = Alignment.CenterVertically){
                    RadioButton(
                        selected = gender == selectedGender,
                        onClick = { gender = selectedGender
                        }
                    )
                    Text(text = selectedGender)

                }}
        }


    }
}

