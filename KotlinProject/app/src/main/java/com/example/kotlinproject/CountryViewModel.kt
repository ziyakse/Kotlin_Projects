import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.kotlinproject.countries

public class CountryViewModel : ViewModel() {
private var _currentIndex = mutableStateOf(0)
        val currentIndex: State<Int>
        get() = _currentIndex

                fun nextCountry() {
                _currentIndex.value = (_currentIndex.value + 1) % countries.size
                }
                }

