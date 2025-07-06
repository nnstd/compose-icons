package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartLineStacked: ImageVector
    get() {
        if (_ChartLineStacked != null) {
            return _ChartLineStacked!!
        }
        _ChartLineStacked = ImageVector.Builder(
            name = "ChartLineStacked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.45f, 15.18f)
                lineTo(22f, 6.81f)
                verticalLineTo(19f)
                lineTo(22f, 21f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(15.54f)
                lineTo(4f, 19f)
                horizontalLineTo(4.31f)
                lineTo(6f, 19f)
                horizontalLineTo(6.57f)
                lineTo(10.96f, 11.44f)
                lineTo(17.45f, 15.18f)
                moveTo(22f, 3f)
                lineTo(21.97f, 3.45f)
                lineTo(17f, 11f)
                lineTo(10f, 6f)
                lineTo(6f, 12f)
                verticalLineTo(3f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ChartLineStacked!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLineStacked: ImageVector? = null
