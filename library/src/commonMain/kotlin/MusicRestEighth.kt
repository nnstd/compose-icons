package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicRestEighth: ImageVector
    get() {
        if (_MusicRestEighth != null) {
            return _MusicRestEighth!!
        }
        _MusicRestEighth = ImageVector.Builder(
            name = "MusicRestEighth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 6f)
                arcTo(5.56f, 5.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.95f, 7.86f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9.5f, 9f)
                horizontalLineTo(9.74f)
                arcTo(6.32f, 6.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.25f, 7.93f)
                lineTo(10f, 18f)
                horizontalLineTo(12f)
                lineTo(16f, 6f)
                close()
            }
        }.build()

        return _MusicRestEighth!!
    }

@Suppress("ObjectPropertyName")
private var _MusicRestEighth: ImageVector? = null
