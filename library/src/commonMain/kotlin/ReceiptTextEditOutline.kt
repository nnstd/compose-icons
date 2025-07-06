package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReceiptTextEditOutline: ImageVector
    get() {
        if (_ReceiptTextEditOutline != null) {
            return _ReceiptTextEditOutline!!
        }
        _ReceiptTextEditOutline = ImageVector.Builder(
            name = "ReceiptTextEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                lineTo(19.5f, 3.5f)
                lineTo(21f, 2f)
                verticalLineTo(9.13f)
                lineTo(19f, 11.13f)
                verticalLineTo(4.91f)
                horizontalLineTo(5f)
                verticalLineTo(19.09f)
                horizontalLineTo(10.5f)
                verticalLineTo(20.5f)
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
                moveTo(13f, 19.96f)
                lineTo(19.13f, 13.83f)
                lineTo(21.17f, 15.87f)
                lineTo(15.04f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(19.96f)
                moveTo(19.83f, 13.13f)
                lineTo(20.81f, 12.15f)
                lineTo(20.83f, 12.13f)
                curveTo(20.88f, 12.09f, 20.94f, 12.05f, 21f, 12.03f)
                curveTo(21.18f, 11.97f, 21.39f, 12f, 21.53f, 12.15f)
                lineTo(22.85f, 13.47f)
                curveTo(23.05f, 13.67f, 23.05f, 14f, 22.85f, 14.19f)
                lineTo(21.87f, 15.17f)
                lineTo(19.83f, 13.13f)
                moveTo(18f, 12.13f)
                lineTo(17.13f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(12.13f)
                moveTo(15.13f, 15f)
                lineTo(13.13f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(15.13f)
                moveTo(18f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _ReceiptTextEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptTextEditOutline: ImageVector? = null
