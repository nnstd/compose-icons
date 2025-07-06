package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReceiptTextCheckOutline: ImageVector
    get() {
        if (_ReceiptTextCheckOutline != null) {
            return _ReceiptTextCheckOutline!!
        }
        _ReceiptTextCheckOutline = ImageVector.Builder(
            name = "ReceiptTextCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.26f, 20.74f)
                lineTo(12f, 22f)
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
                lineTo(19.5f, 3.5f)
                lineTo(21f, 2f)
                verticalLineTo(13.35f)
                curveTo(20.37f, 13.13f, 19.7f, 13f, 19f, 13f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                curveTo(13f, 19.57f, 13.1f, 20.22f, 13.26f, 20.74f)
                moveTo(6f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(13.35f)
                curveTo(13.61f, 16.25f, 14f, 15.58f, 14.54f, 15f)
                horizontalLineTo(6f)
                moveTo(6f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                moveTo(6f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                moveTo(23f, 17.23f)
                lineTo(21.84f, 15.82f)
                lineTo(18.25f, 19.41f)
                lineTo(16.66f, 17.82f)
                lineTo(15.5f, 19f)
                lineTo(18.25f, 22f)
            }
        }.build()

        return _ReceiptTextCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptTextCheckOutline: ImageVector? = null
