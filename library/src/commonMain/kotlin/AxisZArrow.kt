package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisZArrow: ImageVector
    get() {
        if (_AxisZArrow != null) {
            return _AxisZArrow!!
        }
        _AxisZArrow = ImageVector.Builder(
            name = "AxisZArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(16f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(13.82f)
                lineTo(22.39f, 19.25f)
                lineTo(21.39f, 21f)
                lineTo(12f, 15.56f)
                lineTo(2.61f, 21f)
                lineTo(1.61f, 19.25f)
                lineTo(11f, 13.82f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                lineTo(12f, 2f)
                close()
            }
        }.build()

        return _AxisZArrow!!
    }

@Suppress("ObjectPropertyName")
private var _AxisZArrow: ImageVector? = null
