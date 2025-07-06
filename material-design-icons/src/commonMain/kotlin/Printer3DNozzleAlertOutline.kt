package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Printer3DNozzleAlertOutline: ImageVector
    get() {
        if (_Printer3DNozzleAlertOutline != null) {
            return _Printer3DNozzleAlertOutline!!
        }
        _Printer3DNozzleAlertOutline = ImageVector.Builder(
            name = "Printer3DNozzleAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(16.5f)
                lineTo(13f, 17f)
                horizontalLineTo(11f)
                lineTo(7.5f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                moveTo(10f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                curveTo(10.6f, 20f, 11f, 19.5f, 11f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                curveTo(13f, 20.7f, 11.7f, 22f, 10f, 22f)
                moveTo(7f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(8.5f)
                lineTo(12f, 15f)
                lineTo(15.5f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                moveTo(21f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                moveTo(21f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _Printer3DNozzleAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Printer3DNozzleAlertOutline: ImageVector? = null
