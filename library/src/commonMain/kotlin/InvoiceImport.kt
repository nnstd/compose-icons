package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceImport: ImageVector
    get() {
        if (_InvoiceImport != null) {
            return _InvoiceImport!!
        }
        _InvoiceImport = ImageVector.Builder(
            name = "InvoiceImport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 20f)
                lineTo(21f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(12.67f)
                lineTo(10.08f, 8.41f)
                lineTo(11.5f, 7f)
                lineTo(16.5f, 12f)
                lineTo(11.5f, 17f)
                lineTo(10.08f, 15.58f)
                lineTo(12.67f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                lineTo(6f, 20f)
                lineTo(9f, 22f)
                lineTo(12f, 20f)
                lineTo(15f, 22f)
                lineTo(18f, 20f)
                close()
            }
        }.build()

        return _InvoiceImport!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceImport: ImageVector? = null
