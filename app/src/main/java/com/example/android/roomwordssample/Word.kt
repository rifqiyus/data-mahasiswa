//Nama paket
package com.example.android.roomwordssample

//mengimport kelas
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//membuat entitas
@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)
