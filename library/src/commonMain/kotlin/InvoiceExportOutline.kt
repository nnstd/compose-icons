package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceExportOutline: ImageVector
    get() {
        if (_InvoiceExportOutline != null) {
            return _InvoiceExportOutline!!
        }
        _InvoiceExportOutline = ImageVector.Builder(
            name = "InvoiceExportOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 22f)
                lineTo(18f, 20f)
                lineTo(15f, 22f)
                lineTo(12f, 20f)
                lineTo(9f, 22f)
                lineTo(6f, 20f)
                lineTo(3f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(9.67f)
                lineTo(19f, 7.67f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(18.26f)
                lineTo(6f, 17.6f)
                lineTo(9f, 19.6f)
                lineTo(12f, 17.6f)
                lineTo(15f, 19.6f)
                lineTo(18f, 17.6f)
                lineTo(19f, 18.26f)
                verticalLineTo(16.33f)
                lineTo(21f, 14.33f)
                verticalLineTo(22f)
                moveTo(20.5f, 12f)
                lineTo(15.5f, 7f)
                lineTo(14.08f, 8.41f)
                lineTo(16.67f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(16.67f)
                lineTo(14.08f, 15.58f)
                lineTo(15.5f, 17f)
                lineTo(20.5f, 12f)
                close()
            }
        }.build()

        return _InvoiceExportOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceExportOutline: ImageVector? = null
