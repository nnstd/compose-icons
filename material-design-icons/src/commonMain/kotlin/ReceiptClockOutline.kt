package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReceiptClockOutline: ImageVector
    get() {
        if (_ReceiptClockOutline != null) {
            return _ReceiptClockOutline!!
        }
        _ReceiptClockOutline = ImageVector.Builder(
            name = "ReceiptClockOutline",
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
                lineTo(10.58f, 20.42f)
                curveTo(10.72f, 20.61f, 10.88f, 20.78f, 11.05f, 20.95f)
                curveTo(12.36f, 22.26f, 14.14f, 23f, 16f, 23f)
                curveTo(19.86f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 14.17f, 22.28f, 12.41f, 21f, 11.1f)
                verticalLineTo(2f)
                lineTo(19.5f, 3.5f)
                moveTo(19f, 9.68f)
                curveTo(18.07f, 9.24f, 17.05f, 9f, 16f, 9f)
                curveTo(12.14f, 9f, 9f, 12.13f, 9f, 16f)
                curveTo(9f, 17.05f, 9.24f, 18.07f, 9.68f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(9.68f)
                moveTo(20.85f, 16f)
                curveTo(20.85f, 16.64f, 20.73f, 17.27f, 20.5f, 17.86f)
                curveTo(20.24f, 18.44f, 19.88f, 19f, 19.43f, 19.43f)
                curveTo(19f, 19.88f, 18.44f, 20.24f, 17.86f, 20.5f)
                curveTo(17.27f, 20.73f, 16.64f, 20.85f, 16f, 20.85f)
                curveTo(13.32f, 20.85f, 11.15f, 18.68f, 11.15f, 16f)
                curveTo(11.15f, 14.71f, 11.66f, 13.5f, 12.57f, 12.57f)
                curveTo(13.5f, 11.66f, 14.71f, 11.15f, 16f, 11.15f)
                curveTo(18.67f, 11.15f, 20.85f, 13.32f, 20.85f, 16f)
                moveTo(15f, 16.69f)
                verticalLineTo(13f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15f, 16.69f)
                close()
            }
        }.build()

        return _ReceiptClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptClockOutline: ImageVector? = null
