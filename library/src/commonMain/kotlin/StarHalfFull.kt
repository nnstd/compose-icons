package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarHalfFull: ImageVector
    get() {
        if (_StarHalfFull != null) {
            return _StarHalfFull!!
        }
        _StarHalfFull = ImageVector.Builder(
            name = "StarHalfFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.4f)
                verticalLineTo(6.1f)
                lineTo(13.71f, 10.13f)
                lineTo(18.09f, 10.5f)
                lineTo(14.77f, 13.39f)
                lineTo(15.76f, 17.67f)
                moveTo(22f, 9.24f)
                lineTo(14.81f, 8.63f)
                lineTo(12f, 2f)
                lineTo(9.19f, 8.63f)
                lineTo(2f, 9.24f)
                lineTo(7.45f, 13.97f)
                lineTo(5.82f, 21f)
                lineTo(12f, 17.27f)
                lineTo(18.18f, 21f)
                lineTo(16.54f, 13.97f)
                lineTo(22f, 9.24f)
                close()
            }
        }.build()

        return _StarHalfFull!!
    }

@Suppress("ObjectPropertyName")
private var _StarHalfFull: ImageVector? = null
