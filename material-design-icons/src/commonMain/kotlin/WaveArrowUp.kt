package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaveArrowUp: ImageVector
    get() {
        if (_WaveArrowUp != null) {
            return _WaveArrowUp!!
        }
        _WaveArrowUp = ImageVector.Builder(
            name = "WaveArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                curveTo(18.62f, 9f, 17.26f, 8.65f, 16f, 8f)
                curveTo(13.5f, 9.3f, 10.5f, 9.3f, 8f, 8f)
                curveTo(6.74f, 8.65f, 5.37f, 9f, 4f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                curveTo(5.39f, 7f, 6.78f, 6.53f, 8f, 5.67f)
                curveTo(10.44f, 7.38f, 13.56f, 7.38f, 16f, 5.67f)
                curveTo(17.22f, 6.53f, 18.61f, 7f, 20f, 7f)
                moveTo(12f, 11f)
                lineTo(16f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                lineTo(12f, 11f)
                close()
            }
        }.build()

        return _WaveArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _WaveArrowUp: ImageVector? = null
