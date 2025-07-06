package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceTextSend: ImageVector
    get() {
        if (_InvoiceTextSend != null) {
            return _InvoiceTextSend!!
        }
        _InvoiceTextSend = ImageVector.Builder(
            name = "InvoiceTextSend",
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
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(14.47f)
                lineTo(21f, 14.26f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                moveTo(17f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                moveTo(14f, 23f)
                verticalLineTo(19f)
                lineTo(18f, 18f)
                lineTo(14f, 17f)
                verticalLineTo(13f)
                lineTo(24f, 18f)
                lineTo(14f, 23f)
                close()
            }
        }.build()

        return _InvoiceTextSend!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceTextSend: ImageVector? = null
