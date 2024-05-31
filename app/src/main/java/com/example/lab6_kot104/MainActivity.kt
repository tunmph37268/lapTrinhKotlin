package com.example.lab6_kot104

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.lab6_kot104.ui.theme.Lab6_KOT104Theme
import org.jetbrains.annotations.Async

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieScreenb2(Movie.getSampleMovies())
        }
    }
}

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration:String,
    val releaseDate:String,
    val genre:String,
    val shotDescription:String

) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie(
                "Avengers: Endgame",
                "2019",
                "https://via.placeholder.com/150",
                "3h",
                "22/20/2024",
                "action",
                "Thể loại phim hay dòng phim (tiếng Anh: film genre) hay còn gọi là thể loại điện ảnh, là một phương pháp cơ bản để phân loại phim trong điện ảnh. Việc xác định thể loại của một bộ phim được dựa trên nhiều yếu tố, trong đó quan trọng nhất là kịch bản phim. Một bộ phim, tùy cách phân tích khác nhau, có thể thuộc các thể loại khác nhau, vì vậy việc phân loại phim theo thể loại đôi khi cũng bị các nhà phê bình phim chỉ trích là làm sai lệch ý tưởng của biên kịch và đạo diễn."
            ),
            Movie(
                "Interstellar",
                "2014",
                "https://via.placeholder.com/150",
                "3h",
                "22/20/2024",
                "action",
                "Thể loại phim hay dòng phim (tiếng Anh: film genre) hay còn gọi là thể loại điện ảnh, là một phương pháp cơ bản để phân loại phim trong điện ảnh. Việc xác định thể loại của một bộ phim được dựa trên nhiều yếu tố, trong đó quan trọng nhất là kịch bản phim. Một bộ phim, tùy cách phân tích khác nhau, có thể thuộc các thể loại khác nhau, vì vậy việc phân loại phim theo thể loại đôi khi cũng bị các nhà phê bình phim chỉ trích là làm sai lệch ý tưởng của biên kịch và đạo diễn."
            ),
            // Thêm các phim mẫu khác
            Movie(
                "Interstellar",
                "2014",
                "https://via.placeholder.com/150",
                "3h",
                "22/20/2024",
                "action",
                "Thể loại phim hay dòng phim (tiếng Anh: film genre) hay còn gọi là thể loại điện ảnh, là một phương pháp cơ bản để phân loại phim trong điện ảnh. Việc xác định thể loại của một bộ phim được dựa trên nhiều yếu tố, trong đó quan trọng nhất là kịch bản phim. Một bộ phim, tùy cách phân tích khác nhau, có thể thuộc các thể loại khác nhau, vì vậy việc phân loại phim theo thể loại đôi khi cũng bị các nhà phê bình phim chỉ trích là làm sai lệch ý tưởng của biên kịch và đạo diễn."
            ),
            //
            Movie(
                "Interstellar",
                "2014",
                "https://via.placeholder.com/150",
                "3h",
                "22/20/2024",
                "action",
                "Thể loại phim hay dòng phim (tiếng Anh: film genre) hay còn gọi là thể loại điện ảnh, là một phương pháp cơ bản để phân loại phim trong điện ảnh. Việc xác định thể loại của một bộ phim được dựa trên nhiều yếu tố, trong đó quan trọng nhất là kịch bản phim. Một bộ phim, tùy cách phân tích khác nhau, có thể thuộc các thể loại khác nhau, vì vậy việc phân loại phim theo thể loại đôi khi cũng bị các nhà phê bình phim chỉ trích là làm sai lệch ý tưởng của biên kịch và đạo diễn."
            ),
            //
        )
    }
}
//
//@Composable
//fun MovieItem(movie: Movie) {
//    Card(
//        colors = CardDefaults.cardColors(containerColor = Color.White),
//        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
//    ) {
//        Column(
//            modifier = Modifier
//                .width(175.dp)
//                .height(330.dp)
//        ) {
//            AsyncImage(
//                model = movie.posterUrl,
//                contentScale = ContentScale.Crop,
//                contentDescription = null,
//                modifier = Modifier
//                    .clip(
//                        RoundedCornerShape(
//                            topEnd = 8.dp, topStart =
//                            8.dp
//                        )
//                    )
//                    .height(255.dp)
//                    .fillMaxWidth(),
//            )
//            Column(modifier = Modifier.padding(8.dp)) {
//                Text(
//                    text = movie.title, style =
//                    MaterialTheme.typography.titleSmall, maxLines = 2
//                )
//                Text(
//                    text = "Thời lượng: ${movie.year}", style =
//                    MaterialTheme.typography.bodySmall
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun MovieScreen(movies: List<Movie>) {
//    LazyRow(
//        state = rememberLazyListState(),
//        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
//        horizontalArrangement = Arrangement.spacedBy(8.dp)
//    ) {
//        items(movies.size) { index ->
//            MovieItem(movie = movies[index])
//        }
//    }
//}

// Bai2
enum class ListType {
    ROW, COLUMN, GRID
}

@Composable
fun MovieScreenb2(movies: List<Movie>) {
    var listType by remember { mutableStateOf(ListType.ROW) }
    Column {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { listType = ListType.ROW }) {
                Text("Row")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { listType = ListType.COLUMN }) {
                Text("Column")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { listType = ListType.GRID }) {
                Text("Grid")
            }
        }
        when (listType) {
            ListType.ROW -> MovieRow(movies)
            ListType.COLUMN -> MovieColumn(movies)
            ListType.GRID -> MovieGrid(movies)
        }
    }
}

@Composable
fun MovieRow(movies: List<Movie>) {
    LazyRow(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(movies.size) { index ->
            MovieItemb2(movie = movies[index], listType = ListType.ROW)
        }
    }
}

@Composable
fun MovieColumn(movies: List<Movie>) {
    LazyColumn(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(movies.size) { index ->
            MovieColumnItem(
                movie = movies[index], listType =
                ListType.COLUMN
            )
        }
    }
}

@Composable
fun MovieGrid(movies: List<Movie>) {
    val gridState = rememberLazyStaggeredGridState()
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        state = gridState,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalItemSpacing = 8.dp,
        contentPadding = PaddingValues(8.dp)
    ) {
        items(movies.size) { index ->
            MovieItemb2(movie = movies[index], listType = ListType.GRID)
        }
    }
}

@Composable
fun MovieItemb2(movie: Movie, listType: ListType) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor =
            Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation =
            6.dp
        ),
    ) {
        Column(
            modifier = Modifier.then(getItemSizeModifier(listType))
        ) {
            AsyncImage(
                model = movie.posterUrl,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.wrapContentHeight().fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.titleSmall,
                    maxLines = 2,

                    overflow = TextOverflow.Ellipsis

                )
                BoldValueText(
                    label = "Thời lượng: ", value =
                    movie.duration
                )
                BoldValueText(
                    label = "Khởi chiếu: ", value =
                    movie.releaseDate
                )
            }
        }
    }
}

@Composable
fun AsyncImage(model: String, contentDescription: Nothing?, contentScale: ContentScale, modifier: Modifier) {

}

@Composable
fun MovieColumnItem(movie: Movie, listType: ListType) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor =
            Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation =
            6.dp
        ),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            AsyncImage(
                model = movie.posterUrl,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .then(getItemSizeModifier(listType))
                    .wrapContentHeight()
            )
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.titleSmall,
                    maxLines = 2,

                    overflow = TextOverflow.Ellipsis

                )
                BoldValueText(
                    label = "Thời lượng: ", value =
                    movie.duration
                )
                BoldValueText(
                    label = "Khởi chiếu: ", value =
                    movie.releaseDate
                )
                BoldValueText(label = "Thể loại: ", value = movie.genre)
                Text(
                    text = "Tóm tắt nội dung",

                    style = MaterialTheme.typography.bodySmall,

                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(
                        top = 4.dp, bottom =
                        2.dp
                    )
                )
                Text(
                    text = movie.shotDescription,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 5,

                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(end = 2.dp)
                )
            }
        }
    }
}
@Composable
fun BoldValueText(label: String, value: String, style: TextStyle =
    MaterialTheme.typography.bodySmall
) {
    Text(buildAnnotatedString {
        append(label)
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
            append(value)
        }
    }, style = style)
}
@Composable
private fun getItemSizeModifier(listType: ListType): Modifier {
    return when (listType) {
        ListType.ROW -> Modifier.width(175.dp)
        ListType.COLUMN -> Modifier
            .width(130.dp)
        ListType.GRID -> Modifier
            .fillMaxWidth()
    }
}