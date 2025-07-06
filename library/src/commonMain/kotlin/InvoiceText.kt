package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceText: ImageVector
    get() {
        if (_InvoiceText != null) {
            return _InvoiceText!!
        }
        _InvoiceText = ImageVector.Builder(
            name = "InvoiceText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                verticalLineTo(22f)
                lineTo(6f, 20f)
                lineTo(9f, 22f)
                lineTo(12f, 20f)
                lineTo(15f, 22f)
                lineTo(18f, 20f)
                lineTo(21f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
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
                close()
            }
        }.build()

        return _InvoiceText!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceText: ImageVector? = null
