//Nama paket
package com.example.android.roomwordssample

//mengimport kelas
import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

//membuat kelas
class WordRepository(private val wordDao: WordDao) {

    //room mengeksekusi semua query pada thread terpisah.
    //memberi tahu ketika data telah berubah.
    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    // Secara default Room menjalankan kueri penangguhan dari utas utama
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}
