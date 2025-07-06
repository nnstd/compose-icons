package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceTextClock: ImageVector
    get() {
        if (_InvoiceTextClock != null) {
            return _InvoiceTextClock!!
        }
        _InvoiceTextClock = ImageVector.Builder(
            name = "InvoiceTextClock",
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
                moveTo(3f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(11.1f)
                curveTo(22.24f, 12.36f, 23f, 14.09f, 23f, 16f)
                curveTo(23f, 19.87f, 19.87f, 23f, 16f, 23f)
                curveTo(13.97f, 23f, 12.14f, 22.14f, 10.87f, 20.76f)
                lineTo(9f, 22f)
                lineTo(6f, 20f)
                lineTo(3f, 22f)
                moveTo(9.67f, 13f)
                curveTo(10.03f, 12.25f, 10.5f, 11.57f, 11.1f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(9.67f)
                moveTo(17f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(16f, 21f)
                curveTo(18.76f, 21f, 21f, 18.76f, 21f, 16f)
                curveTo(21f, 13.24f, 18.76f, 11f, 16f, 11f)
                curveTo(13.24f, 11f, 11f, 13.24f, 11f, 16f)
                curveTo(11f, 18.76f, 13.24f, 21f, 16f, 21f)
                close()
            }
        }.build()

        return _InvoiceTextClock!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceTextClock: ImageVector? = null
