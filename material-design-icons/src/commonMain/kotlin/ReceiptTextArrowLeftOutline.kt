package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReceiptTextArrowLeftOutline: ImageVector
    get() {
        if (_ReceiptTextArrowLeftOutline != null) {
            return _ReceiptTextArrowLeftOutline!!
        }
        _ReceiptTextArrowLeftOutline = ImageVector.Builder(
            name = "ReceiptTextArrowLeftOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                lineTo(13.26f, 20.74f)
                curveTo(13.1f, 20.22f, 13f, 19.66f, 13f, 19.09f)
                horizontalLineTo(5f)
                verticalLineTo(4.91f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                curveTo(19.7f, 13f, 20.37f, 13.13f, 21f, 13.35f)
                verticalLineTo(2f)
                lineTo(19.5f, 3.5f)
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
                moveTo(13.35f, 17f)
                curveTo(13.61f, 16.25f, 14f, 15.58f, 14.54f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(13.35f)
                moveTo(18f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(18f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                moveTo(18f, 20f)
                verticalLineTo(22f)
                lineTo(15f, 19f)
                lineTo(18f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _ReceiptTextArrowLeftOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptTextArrowLeftOutline: ImageVector? = null
