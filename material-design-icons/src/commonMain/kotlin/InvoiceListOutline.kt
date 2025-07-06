package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceListOutline: ImageVector
    get() {
        if (_InvoiceListOutline != null) {
            return _InvoiceListOutline!!
        }
        _InvoiceListOutline = ImageVector.Builder(
            name = "InvoiceListOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                moveTo(13f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                moveTo(13f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(15f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                moveTo(21f, 22f)
                lineTo(18f, 20f)
                lineTo(15f, 22f)
                lineTo(12f, 20f)
                lineTo(9f, 22f)
                lineTo(6f, 20f)
                lineTo(3f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                moveTo(19f, 18.26f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(18.26f)
                lineTo(6f, 17.6f)
                lineTo(9f, 19.6f)
                lineTo(12f, 17.6f)
                lineTo(15f, 19.6f)
                lineTo(18f, 17.6f)
                lineTo(19f, 18.26f)
                close()
            }
        }.build()

        return _InvoiceListOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceListOutline: ImageVector? = null
