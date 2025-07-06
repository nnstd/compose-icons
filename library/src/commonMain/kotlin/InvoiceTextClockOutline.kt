package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceTextClockOutline: ImageVector
    get() {
        if (_InvoiceTextClockOutline != null) {
            return _InvoiceTextClockOutline!!
        }
        _InvoiceTextClockOutline = ImageVector.Builder(
            name = "InvoiceTextClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                moveTo(15f, 13f)
                verticalLineTo(16.69f)
                lineTo(18.19f, 18.53f)
                lineTo(18.94f, 17.23f)
                lineTo(16.5f, 15.82f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                moveTo(9f, 22f)
                lineTo(10.87f, 20.76f)
                curveTo(12.14f, 22.14f, 13.97f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 14.09f, 22.24f, 12.36f, 21f, 11.1f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                lineTo(6f, 20f)
                lineTo(9f, 22f)
                moveTo(9f, 19.6f)
                lineTo(6f, 17.6f)
                lineTo(5f, 18.26f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(9.67f)
                curveTo(18.09f, 9.24f, 17.07f, 9f, 16f, 9f)
                curveTo(14.09f, 9f, 12.36f, 9.76f, 11.1f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(9.67f)
                curveTo(9.24f, 13.91f, 9f, 14.93f, 9f, 16f)
                curveTo(9f, 17.12f, 9.26f, 18.17f, 9.73f, 19.11f)
                lineTo(9f, 19.6f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                curveTo(11f, 13.24f, 13.24f, 11f, 16f, 11f)
                curveTo(18.76f, 11f, 21f, 13.24f, 21f, 16f)
                curveTo(21f, 18.76f, 18.76f, 21f, 16f, 21f)
                close()
            }
        }.build()

        return _InvoiceTextClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceTextClockOutline: ImageVector? = null
