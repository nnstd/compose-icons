package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Usb: ImageVector
    get() {
        if (_Usb != null) {
            return _Usb!!
        }
        _Usb = ImageVector.Builder(
            name = "Usb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                lineTo(12f, 1f)
                lineTo(9f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(10.93f)
                curveTo(8.7f, 10.56f, 9.2f, 9.85f, 9.2f, 9f)
                curveTo(9.2f, 7.78f, 8.21f, 6.8f, 7f, 6.8f)
                curveTo(5.78f, 6.8f, 4.8f, 7.78f, 4.8f, 9f)
                curveTo(4.8f, 9.85f, 5.3f, 10.56f, 6f, 10.93f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(18.05f)
                curveTo(10.29f, 18.41f, 9.8f, 19.15f, 9.8f, 20f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22.2f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.2f, 20f)
                curveTo(14.2f, 19.15f, 13.71f, 18.41f, 13f, 18.05f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _Usb!!
    }

@Suppress("ObjectPropertyName")
private var _Usb: ImageVector? = null
