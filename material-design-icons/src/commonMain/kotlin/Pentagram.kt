package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pentagram: ImageVector
    get() {
        if (_Pentagram != null) {
            return _Pentagram!!
        }
        _Pentagram = ImageVector.Builder(
            name = "Pentagram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.15f, 14.4f)
                lineTo(18.71f, 22.26f)
                lineTo(12f, 17.4f)
                lineTo(5.28f, 22.3f)
                lineTo(7.85f, 14.37f)
                lineTo(1.15f, 9.5f)
                horizontalLineTo(9.44f)
                lineTo(12f, 1.61f)
                lineTo(14.56f, 9.5f)
                horizontalLineTo(22.89f)
                lineTo(16.15f, 14.4f)
                moveTo(13.3f, 16.47f)
                lineTo(15.86f, 18.33f)
                lineTo(14.88f, 15.32f)
                lineTo(13.3f, 16.47f)
                moveTo(11f, 9.5f)
                horizontalLineTo(13f)
                lineTo(12f, 6.47f)
                lineTo(11f, 9.5f)
                moveTo(10.74f, 16.47f)
                lineTo(9.13f, 15.3f)
                lineTo(8.13f, 18.37f)
                lineTo(10.74f, 16.47f)
                moveTo(18.28f, 11f)
                horizontalLineTo(15.05f)
                lineTo(15.67f, 12.9f)
                lineTo(18.28f, 11f)
                moveTo(10.53f, 11f)
                lineTo(9.62f, 13.8f)
                lineTo(12f, 15.54f)
                lineTo(14.39f, 13.82f)
                lineTo(13.47f, 11f)
                horizontalLineTo(10.53f)
                moveTo(5.76f, 11f)
                lineTo(8.34f, 12.87f)
                lineTo(8.95f, 11f)
                horizontalLineTo(5.76f)
                close()
            }
        }.build()

        return _Pentagram!!
    }

@Suppress("ObjectPropertyName")
private var _Pentagram: ImageVector? = null
