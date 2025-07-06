package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hexadecimal: ImageVector
    get() {
        if (_Hexadecimal != null) {
            return _Hexadecimal!!
        }
        _Hexadecimal = ImageVector.Builder(
            name = "Hexadecimal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 7f)
                curveTo(5.9f, 7f, 5f, 7.9f, 5f, 9f)
                verticalLineTo(15f)
                curveTo(5f, 16.11f, 5.9f, 17f, 7f, 17f)
                horizontalLineTo(9f)
                curveTo(10.11f, 17f, 11f, 16.11f, 11f, 15f)
                verticalLineTo(9f)
                curveTo(11f, 7.9f, 10.11f, 7f, 9f, 7f)
                horizontalLineTo(7f)
                moveTo(7f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(17.6f, 17f)
                lineTo(15.5f, 14.9f)
                lineTo(13.4f, 17f)
                lineTo(12f, 15.6f)
                lineTo(14.1f, 13.5f)
                lineTo(12f, 11.4f)
                lineTo(13.4f, 10f)
                lineTo(15.5f, 12.1f)
                lineTo(17.6f, 10f)
                lineTo(19f, 11.4f)
                lineTo(16.9f, 13.5f)
                lineTo(19f, 15.6f)
                lineTo(17.6f, 17f)
                close()
            }
        }.build()

        return _Hexadecimal!!
    }

@Suppress("ObjectPropertyName")
private var _Hexadecimal: ImageVector? = null
