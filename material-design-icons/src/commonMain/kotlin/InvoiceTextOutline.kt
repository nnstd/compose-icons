package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceTextOutline: ImageVector
    get() {
        if (_InvoiceTextOutline != null) {
            return _InvoiceTextOutline!!
        }
        _InvoiceTextOutline = ImageVector.Builder(
            name = "InvoiceTextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                moveTo(15f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                moveTo(18f, 20f)
                lineTo(21f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                lineTo(6f, 20f)
                lineTo(9f, 22f)
                lineTo(12f, 20f)
                lineTo(15f, 22f)
                lineTo(18f, 20f)
                moveTo(19f, 5f)
                verticalLineTo(18.26f)
                lineTo(18f, 17.6f)
                lineTo(15f, 19.6f)
                lineTo(12f, 17.6f)
                lineTo(9f, 19.6f)
                lineTo(6f, 17.6f)
                lineTo(5f, 18.26f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _InvoiceTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceTextOutline: ImageVector? = null
