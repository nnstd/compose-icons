package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceOutline: ImageVector
    get() {
        if (_InvoiceOutline != null) {
            return _InvoiceOutline!!
        }
        _InvoiceOutline = ImageVector.Builder(
            name = "InvoiceOutline",
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

        return _InvoiceOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceOutline: ImageVector? = null
