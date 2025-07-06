package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReceiptTextArrowRightOutline: ImageVector
    get() {
        if (_ReceiptTextArrowRightOutline != null) {
            return _ReceiptTextArrowRightOutline!!
        }
        _ReceiptTextArrowRightOutline = ImageVector.Builder(
            name = "ReceiptTextArrowRightOutline",
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
                verticalLineTo(4.91f)
                horizontalLineTo(5f)
                verticalLineTo(19.09f)
                horizontalLineTo(13f)
                curveTo(13f, 19.66f, 13.1f, 20.22f, 13.26f, 20.74f)
                moveTo(14.54f, 15f)
                curveTo(14f, 15.58f, 13.61f, 16.25f, 13.35f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(14.54f)
                moveTo(6f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                moveTo(6f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(19f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                lineTo(22f, 19f)
                lineTo(19f, 22f)
                close()
            }
        }.build()

        return _ReceiptTextArrowRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptTextArrowRightOutline: ImageVector? = null
