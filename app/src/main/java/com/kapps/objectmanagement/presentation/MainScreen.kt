package com.kapps.objectmanagement.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.runtime.Composable

@Composable
fun MainScreen(
    viewModel: MainViewModel = MainViewModel()
) {

    LazyColumn{
        items(viewModel.persons){ person ->
            //...
        }
    }

    /*
    Insert new persons logic ..
     */

    Button(onClick = {
        viewModel.addNewInsertedPersons()
    }) {

    }

}