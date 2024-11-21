package com.example.arsitekturmvvm.view

import android.app.PictureInPictureUiState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.arsitekturmvvm.model.DataSiswa


@Composable
fun TampilDataView(
    modifier: Modifier = Modifier,
    uiState: DataSiswa,
    onBackButton:()-> Unit
){
    Column (modifier = Modifier
        .fillMaxSize().padding(16.dp),horizontalAlignment = Alignment.CenterHorizontally
    ){
        TampilData(param = "Nama", argum = uiState.nama )
        TampilData(param = "Nim", argum = uiState.nim )
        TampilData(param = "Jenis Kelamin", argum = uiState.gender )
        TampilData(param = "Email", argum = uiState.email)
        TampilData(param = "Alamat", argum = uiState.alamat )
        TampilData(param = "No Telpon", argum = uiState.notelpon )
        Button(onClick = onBackButton) {
            Text(text ="Kembali")
        }
    }

}
@Composable
fun TampilData(
    param: String, argum: String
){
    Column(
        modifier = Modifier.padding(16.dp))
    {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Text(text = param,
                modifier = Modifier.weight(0.8f)) // memberi ruang seberapa banyak dalam kolon/barisnya
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = argum, //kenapa argum? karena isinya akan digantikan dengan parameter argum
                modifier = Modifier.weight(2f))

        }
    }
}