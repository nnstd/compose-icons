package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MinusCircleOff: ImageVector
    get() {
        if (_MinusCircleOff != null) {
            return _MinusCircleOff!!
        }
        _MinusCircleOff = ImageVector.Builder(
            name = "MinusCircleOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(4.1f, 6f)
                curveTo(2.8f, 7.6f, 2f, 9.7f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(14.3f, 22f, 16.4f, 21.2f, 18f, 19.9f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(7f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(9.1f)
                lineTo(11.1f, 13f)
                horizontalLineTo(7f)
                moveTo(14.2f, 11f)
                lineTo(6.7f, 3.5f)
                curveTo(8.3f, 2.6f, 10.1f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 13.9f, 21.4f, 15.7f, 20.5f, 17.3f)
                lineTo(16.2f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(14.2f)
                close()
            }
        }.build()

        return _MinusCircleOff!!
    }

@Suppress("ObjectPropertyName")
private var _MinusCircleOff: ImageVector? = null
