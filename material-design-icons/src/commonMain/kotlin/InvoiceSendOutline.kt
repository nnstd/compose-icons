package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceSendOutline: ImageVector
    get() {
        if (_InvoiceSendOutline != null) {
            return _InvoiceSendOutline!!
        }
        _InvoiceSendOutline = ImageVector.Builder(
            name = "InvoiceSendOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                lineTo(14f, 13f)
                verticalLineTo(17f)
                lineTo(18f, 18f)
                lineTo(14f, 19f)
                verticalLineTo(23f)
                lineTo(24f, 18f)
                moveTo(19f, 13.26f)
                lineTo(21f, 14.26f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                lineTo(6f, 20f)
                lineTo(9f, 22f)
                lineTo(12f, 20f)
                verticalLineTo(17.6f)
                lineTo(9f, 19.6f)
                lineTo(6f, 17.6f)
                lineTo(5f, 18.26f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(13.26f)
                close()
            }
        }.build()

        return _InvoiceSendOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceSendOutline: ImageVector? = null
