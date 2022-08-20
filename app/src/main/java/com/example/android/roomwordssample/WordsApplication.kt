//Nama paket
package com.example.android.roomwordssample

//mengimport kelas
import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

//membuat kelas WordsApplication
class WordsApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    //database dan repositori hanya dibuat saat dibutuhkan saat aplikasi dimulai
    val database by lazy { WordRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { WordRepository(database.wordDao()) }
}
