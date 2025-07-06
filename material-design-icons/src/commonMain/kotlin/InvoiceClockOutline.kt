package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceClockOutline: ImageVector
    get() {
        if (_InvoiceClockOutline != null) {
            return _InvoiceClockOutline!!
        }
        _InvoiceClockOutline = ImageVector.Builder(
            name = "InvoiceClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 16.69f)
                verticalLineTo(13f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15f, 16.69f)
                moveTo(10.87f, 20.76f)
                lineTo(9f, 22f)
                lineTo(6f, 20f)
                lineTo(3f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(11.1f)
                curveTo(22.24f, 12.36f, 23f, 14.09f, 23f, 16f)
                curveTo(23f, 19.87f, 19.87f, 23f, 16f, 23f)
                curveTo(13.97f, 23f, 12.14f, 22.14f, 10.87f, 20.76f)
                moveTo(9.73f, 19.11f)
                curveTo(9.26f, 18.17f, 9f, 17.12f, 9f, 16f)
                curveTo(9f, 12.13f, 12.13f, 9f, 16f, 9f)
                curveTo(17.07f, 9f, 18.09f, 9.24f, 19f, 9.67f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(18.26f)
                lineTo(6f, 17.6f)
                lineTo(9f, 19.6f)
                lineTo(9.73f, 19.11f)
                moveTo(16f, 21f)
                curveTo(18.76f, 21f, 21f, 18.76f, 21f, 16f)
                curveTo(21f, 13.24f, 18.76f, 11f, 16f, 11f)
                curveTo(13.24f, 11f, 11f, 13.24f, 11f, 16f)
                curveTo(11f, 18.76f, 13.24f, 21f, 16f, 21f)
                close()
            }
        }.build()

        return _InvoiceClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceClockOutline: ImageVector? = null
