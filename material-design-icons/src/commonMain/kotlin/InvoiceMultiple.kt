package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceMultiple: ImageVector
    get() {
        if (_InvoiceMultiple != null) {
            return _InvoiceMultiple!!
        }
        _InvoiceMultiple = ImageVector.Builder(
            name = "InvoiceMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                moveTo(21f, 22f)
                lineTo(18.5f, 20.32f)
                lineTo(16f, 22f)
                lineTo(13.5f, 20.32f)
                lineTo(11f, 22f)
                lineTo(8.5f, 20.32f)
                lineTo(6f, 22f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _InvoiceMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceMultiple: ImageVector? = null
