package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReceiptSendOutline: ImageVector
    get() {
        if (_ReceiptSendOutline != null) {
            return _ReceiptSendOutline!!
        }
        _ReceiptSendOutline = ImageVector.Builder(
            name = "ReceiptSendOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                lineTo(19.5f, 3.5f)
                lineTo(21f, 2f)
                verticalLineTo(14.26f)
                lineTo(19f, 13.26f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(22f)
                lineTo(10.5f, 20.5f)
                lineTo(9f, 22f)
                lineTo(7.5f, 20.5f)
                lineTo(6f, 22f)
                lineTo(4.5f, 20.5f)
                lineTo(3f, 22f)
                verticalLineTo(2f)
                lineTo(4.5f, 3.5f)
                lineTo(6f, 2f)
                lineTo(7.5f, 3.5f)
                lineTo(9f, 2f)
                lineTo(10.5f, 3.5f)
                lineTo(12f, 2f)
                lineTo(13.5f, 3.5f)
                lineTo(15f, 2f)
                lineTo(16.5f, 3.5f)
                lineTo(18f, 2f)
                moveTo(14f, 19f)
                lineTo(18f, 18f)
                lineTo(14f, 17f)
                verticalLineTo(13f)
                lineTo(24f, 18f)
                lineTo(14f, 23f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ReceiptSendOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptSendOutline: ImageVector? = null
