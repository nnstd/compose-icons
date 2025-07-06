package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Printer3DNozzleOffOutline: ImageVector
    get() {
        if (_Printer3DNozzleOffOutline != null) {
            return _Printer3DNozzleOffOutline!!
        }
        _Printer3DNozzleOffOutline = ImageVector.Builder(
            name = "Printer3DNozzleOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(5.1f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7.5f)
                lineTo(11f, 17f)
                horizontalLineTo(13f)
                lineTo(14f, 15.9f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(12f, 15f)
                lineTo(8.5f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(7.1f)
                lineTo(12.5f, 14.4f)
                lineTo(12f, 15f)
                moveTo(11f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                curveTo(13f, 20.7f, 11.7f, 22f, 10f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                curveTo(10.6f, 20f, 11f, 19.6f, 11f, 19f)
                verticalLineTo(18f)
                moveTo(9f, 5.8f)
                lineTo(7f, 3.8f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(16.2f)
                lineTo(14.9f, 11.7f)
                lineTo(15.5f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(5.8f)
                close()
            }
        }.build()

        return _Printer3DNozzleOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Printer3DNozzleOffOutline: ImageVector? = null
