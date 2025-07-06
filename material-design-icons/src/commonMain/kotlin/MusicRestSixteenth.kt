package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicRestSixteenth: ImageVector
    get() {
        if (_MusicRestSixteenth != null) {
            return _MusicRestSixteenth!!
        }
        _MusicRestSixteenth = ImageVector.Builder(
            name = "MusicRestSixteenth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                arcTo(5.56f, 5.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.95f, 4.86f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.5f, 6f)
                horizontalLineTo(10.74f)
                arcTo(6.32f, 6.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.25f, 4.93f)
                lineTo(12.9f, 9.1f)
                arcTo(5.56f, 5.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.95f, 10.86f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.5f, 12f)
                horizontalLineTo(8.74f)
                arcTo(6.32f, 6.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.25f, 10.93f)
                lineTo(9f, 21f)
                horizontalLineTo(11f)
                lineTo(17f, 3f)
                close()
            }
        }.build()

        return _MusicRestSixteenth!!
    }

@Suppress("ObjectPropertyName")
private var _MusicRestSixteenth: ImageVector? = null
