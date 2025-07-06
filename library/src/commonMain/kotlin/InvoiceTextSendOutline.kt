package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceTextSendOutline: ImageVector
    get() {
        if (_InvoiceTextSendOutline != null) {
            return _InvoiceTextSendOutline!!
        }
        _InvoiceTextSendOutline = ImageVector.Builder(
            name = "InvoiceTextSendOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                lineTo(14f, 23f)
                verticalLineTo(19f)
                lineTo(18f, 18f)
                lineTo(14f, 17f)
                verticalLineTo(13f)
                lineTo(24f, 18f)
                moveTo(21f, 14.26f)
                lineTo(19f, 13.26f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(18.26f)
                lineTo(6f, 17.6f)
                lineTo(9f, 19.6f)
                lineTo(12f, 17.6f)
                verticalLineTo(20f)
                lineTo(9f, 22f)
                lineTo(6f, 20f)
                lineTo(3f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(14.26f)
                moveTo(17f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                moveTo(12f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _InvoiceTextSendOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceTextSendOutline: ImageVector? = null
