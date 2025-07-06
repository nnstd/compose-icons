package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HdrOff: ImageVector
    get() {
        if (_HdrOff != null) {
            return _HdrOff!!
        }
        _HdrOff = ImageVector.Builder(
            name = "HdrOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(18.6f)
                lineTo(19.5f, 15f)
                horizontalLineTo(21f)
                lineTo(20.1f, 12.9f)
                curveTo(20.6f, 12.7f, 21f, 12.1f, 21f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(21f, 9.7f, 20.3f, 9f, 19.5f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(13.9f)
                lineTo(17.1f, 15f)
                horizontalLineTo(17.5f)
                moveTo(17.5f, 10.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.5f)
                moveTo(13f, 10.5f)
                verticalLineTo(10.9f)
                lineTo(14.5f, 12.4f)
                verticalLineTo(10.5f)
                curveTo(14.5f, 9.7f, 13.8f, 9f, 13f, 9f)
                horizontalLineTo(11.1f)
                lineTo(12.6f, 10.5f)
                horizontalLineTo(13f)
                moveTo(9.5f, 9.5f)
                lineTo(2.5f, 2.5f)
                lineTo(1.4f, 3.5f)
                lineTo(6.9f, 9f)
                horizontalLineTo(6.5f)
                verticalLineTo(11f)
                horizontalLineTo(4.5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(4.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(10.1f)
                lineTo(9.5f, 11.6f)
                verticalLineTo(15f)
                horizontalLineTo(12.9f)
                lineTo(20.5f, 22.6f)
                lineTo(21.6f, 21.5f)
                lineTo(9.5f, 9.5f)
                close()
            }
        }.build()

        return _HdrOff!!
    }

@Suppress("ObjectPropertyName")
private var _HdrOff: ImageVector? = null
