package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReceiptTextCheck: ImageVector
    get() {
        if (_ReceiptTextCheck != null) {
            return _ReceiptTextCheck!!
        }
        _ReceiptTextCheck = ImageVector.Builder(
            name = "ReceiptTextCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.25f, 22f)
                lineTo(15.5f, 19f)
                lineTo(16.66f, 17.82f)
                lineTo(18.25f, 19.41f)
                lineTo(21.84f, 15.82f)
                lineTo(23f, 17.23f)
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
                lineTo(13.26f, 20.74f)
                curveTo(13.09f, 20.18f, 13f, 19.59f, 13f, 19f)
                curveTo(13f, 18.32f, 13.12f, 17.64f, 13.34f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(14.53f)
                curveTo(15.67f, 13.73f, 17.29f, 13f, 19f, 13f)
                curveTo(19.68f, 13f, 20.36f, 13.12f, 21f, 13.34f)
                verticalLineTo(2f)
                lineTo(19.5f, 3.5f)
                moveTo(18f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                moveTo(18f, 9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _ReceiptTextCheck!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptTextCheck: ImageVector? = null
