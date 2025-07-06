package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Read: ImageVector
    get() {
        if (_Read != null) {
            return _Read!!
        }
        _Read = ImageVector.Builder(
            name = "Read",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.59f, 11.59f)
                lineTo(23f, 13f)
                lineTo(13.5f, 22.5f)
                lineTo(8.42f, 17.41f)
                lineTo(9.83f, 16f)
                lineTo(13.5f, 19.68f)
                lineTo(21.59f, 11.59f)
                moveTo(4f, 16f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                lineTo(9f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 7f)
                curveTo(13f, 8.54f, 12.13f, 9.88f, 10.85f, 10.55f)
                lineTo(14f, 16f)
                horizontalLineTo(12f)
                lineTo(9.11f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                moveTo(6f, 9f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Read!!
    }

@Suppress("ObjectPropertyName")
private var _Read: ImageVector? = null
