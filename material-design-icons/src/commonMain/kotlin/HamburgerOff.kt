package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HamburgerOff: ImageVector
    get() {
        if (_HamburgerOff != null) {
            return _HamburgerOff!!
        }
        _HamburgerOff = ImageVector.Builder(
            name = "HamburgerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 11f)
                curveTo(21.11f, 11f, 22f, 11.9f, 22f, 13f)
                reflectiveCurveTo(21.11f, 15f, 20f, 15f)
                horizontalLineTo(18.2f)
                lineTo(14.2f, 11f)
                horizontalLineTo(20f)
                moveTo(20.42f, 19.77f)
                lineTo(20.42f, 19.76f)
                lineTo(17.66f, 17f)
                horizontalLineTo(17.65f)
                lineTo(15.65f, 15f)
                horizontalLineTo(15.66f)
                lineTo(11.66f, 11f)
                horizontalLineTo(11.66f)
                lineTo(9.66f, 9f)
                horizontalLineTo(9.66f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.12f, 6f)
                curveTo(3f, 7.5f, 3f, 9f, 3f, 9f)
                horizontalLineTo(7.11f)
                lineTo(9.11f, 11f)
                horizontalLineTo(4f)
                curveTo(2.9f, 11f, 2f, 11.9f, 2f, 13f)
                reflectiveCurveTo(2.9f, 15f, 4f, 15f)
                horizontalLineTo(13.11f)
                lineTo(15.11f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                curveTo(3f, 19.66f, 4.34f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(18.33f, 21f, 18.65f, 20.93f, 18.94f, 20.83f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.42f, 19.77f)
                moveTo(21f, 9f)
                curveTo(21f, 9f, 21f, 3f, 12f, 3f)
                curveTo(9.88f, 3f, 8.28f, 3.34f, 7.05f, 3.85f)
                lineTo(12.2f, 9f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _HamburgerOff!!
    }

@Suppress("ObjectPropertyName")
private var _HamburgerOff: ImageVector? = null
