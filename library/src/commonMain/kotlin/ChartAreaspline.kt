package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartAreaspline: ImageVector
    get() {
        if (_ChartAreaspline != null) {
            return _ChartAreaspline!!
        }
        _ChartAreaspline = ImageVector.Builder(
            name = "ChartAreaspline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.45f, 15.18f)
                lineTo(22f, 7.31f)
                verticalLineTo(19f)
                lineTo(22f, 21f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(15.54f)
                lineTo(9.5f, 6f)
                lineTo(16f, 9.78f)
                lineTo(20.24f, 2.45f)
                lineTo(21.97f, 3.45f)
                lineTo(16.74f, 12.5f)
                lineTo(10.23f, 8.75f)
                lineTo(4.31f, 19f)
                horizontalLineTo(6.57f)
                lineTo(10.96f, 11.44f)
                lineTo(17.45f, 15.18f)
                close()
            }
        }.build()

        return _ChartAreaspline!!
    }

@Suppress("ObjectPropertyName")
private var _ChartAreaspline: ImageVector? = null
