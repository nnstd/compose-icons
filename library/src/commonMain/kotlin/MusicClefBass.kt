package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicClefBass: ImageVector
    get() {
        if (_MusicClefBass != null) {
            return _MusicClefBass!!
        }
        _MusicClefBass = ImageVector.Builder(
            name = "MusicClefBass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 5f)
                moveTo(18.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 11f)
                moveTo(10f, 4f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 9f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.18f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 10f)
                curveTo(14f, 13.59f, 11.77f, 16.19f, 7f, 18.2f)
                lineTo(7.76f, 20.04f)
                curveTo(13.31f, 17.72f, 16f, 14.43f, 16f, 10f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
                close()
            }
        }.build()

        return _MusicClefBass!!
    }

@Suppress("ObjectPropertyName")
private var _MusicClefBass: ImageVector? = null
