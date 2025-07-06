package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceSend: ImageVector
    get() {
        if (_InvoiceSend != null) {
            return _InvoiceSend!!
        }
        _InvoiceSend = ImageVector.Builder(
            name = "InvoiceSend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(14.26f)
                lineTo(12f, 9.76f)
                verticalLineTo(20f)
                lineTo(9f, 22f)
                lineTo(6f, 20f)
                lineTo(3f, 22f)
                moveTo(24f, 18f)
                lineTo(14f, 23f)
                verticalLineTo(19f)
                lineTo(18f, 18f)
                lineTo(14f, 17f)
                verticalLineTo(13f)
                lineTo(24f, 18f)
                close()
            }
        }.build()

        return _InvoiceSend!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceSend: ImageVector? = null
