package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReceiptTextSendOutline: ImageVector
    get() {
        if (_ReceiptTextSendOutline != null) {
            return _ReceiptTextSendOutline!!
        }
        _ReceiptTextSendOutline = ImageVector.Builder(
            name = "ReceiptTextSendOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 3.5f)
                lineTo(18f, 2f)
                lineTo(16.5f, 3.5f)
                lineTo(15f, 2f)
                lineTo(13.5f, 3.5f)
                lineTo(12f, 2f)
                lineTo(10.5f, 3.5f)
                lineTo(9f, 2f)
                lineTo(7.5f, 3.5f)
                lineTo(6f, 2f)
                lineTo(4.5f, 3.5f)
                lineTo(3f, 2f)
                verticalLineTo(22f)
                lineTo(4.5f, 20.5f)
                lineTo(6f, 22f)
                lineTo(7.5f, 20.5f)
                lineTo(9f, 22f)
                lineTo(10.5f, 20.5f)
                lineTo(12f, 22f)
                verticalLineTo(19.09f)
                horizontalLineTo(5f)
                verticalLineTo(4.91f)
                horizontalLineTo(19f)
                verticalLineTo(13.26f)
                lineTo(21f, 14.26f)
                verticalLineTo(2f)
                lineTo(19.5f, 3.5f)
                moveTo(14f, 23f)
                verticalLineTo(19f)
                lineTo(18f, 18f)
                lineTo(14f, 17f)
                verticalLineTo(13f)
                lineTo(24f, 18f)
                lineTo(14f, 23f)
                moveTo(12f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                moveTo(6f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                moveTo(18f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _ReceiptTextSendOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptTextSendOutline: ImageVector? = null
