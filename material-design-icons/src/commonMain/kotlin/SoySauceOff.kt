package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SoySauceOff: ImageVector
    get() {
        if (_SoySauceOff != null) {
            return _SoySauceOff!!
        }
        _SoySauceOff = ImageVector.Builder(
            name = "SoySauceOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(8.6f, 10.5f)
                curveTo(7.5f, 12.6f, 6f, 15.3f, 6f, 17.6f)
                verticalLineTo(19.6f)
                curveTo(6f, 21f, 8.7f, 21.9f, 12f, 21.9f)
                curveTo(15.1f, 21.9f, 17.7f, 21.1f, 18f, 19.9f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(12f, 15f)
                curveTo(10.9f, 15f, 10f, 14.1f, 10f, 13f)
                curveTo(10f, 12.7f, 10.1f, 12.4f, 10.2f, 12.1f)
                lineTo(12.9f, 14.8f)
                curveTo(12.6f, 14.9f, 12.3f, 15f, 12f, 15f)
                moveTo(8.3f, 3.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(2f)
                horizontalLineTo(16.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(15.7f)
                lineTo(14.8f, 6f)
                horizontalLineTo(14.2f)
                curveTo(14.1f, 6.3f, 13.9f, 6.8f, 13.9f, 7.5f)
                curveTo(13.9f, 8.4f, 15.9f, 11f, 17.1f, 13.9f)
                lineTo(10.1f, 6.9f)
                curveTo(10f, 6.5f, 9.9f, 6.2f, 9.8f, 6f)
                horizontalLineTo(9.2f)
                lineTo(8.3f, 3.5f)
                close()
            }
        }.build()

        return _SoySauceOff!!
    }

@Suppress("ObjectPropertyName")
private var _SoySauceOff: ImageVector? = null
