package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartLine: ImageVector
    get() {
        if (_ChartLine != null) {
            return _ChartLine!!
        }
        _ChartLine = ImageVector.Builder(
            name = "ChartLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 11.78f)
                lineTo(20.24f, 4.45f)
                lineTo(21.97f, 5.45f)
                lineTo(16.74f, 14.5f)
                lineTo(10.23f, 10.75f)
                lineTo(5.46f, 19f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(17.54f)
                lineTo(9.5f, 8f)
                lineTo(16f, 11.78f)
                close()
            }
        }.build()

        return _ChartLine!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLine: ImageVector? = null
