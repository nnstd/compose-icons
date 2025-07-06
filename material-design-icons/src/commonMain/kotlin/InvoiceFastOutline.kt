package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceFastOutline: ImageVector
    get() {
        if (_InvoiceFastOutline != null) {
            return _InvoiceFastOutline!!
        }
        _InvoiceFastOutline = ImageVector.Builder(
            name = "InvoiceFastOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 19.32f)
                lineTo(22f, 21f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                lineTo(9.5f, 19.32f)
                lineTo(12f, 21f)
                lineTo(14.5f, 19.32f)
                lineTo(17f, 21f)
                lineTo(19.5f, 19.32f)
                moveTo(20f, 7f)
                verticalLineTo(16.57f)
                lineTo(17f, 18.59f)
                lineTo(14.5f, 16.9f)
                lineTo(12f, 18.59f)
                lineTo(9f, 16.57f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                moveTo(2f, 8f)
                curveTo(2f, 7.4f, 2.4f, 7f, 3f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                curveTo(2.4f, 9f, 2f, 8.6f, 2f, 8f)
                moveTo(2f, 11f)
                curveTo(1.4f, 11f, 1f, 11.4f, 1f, 12f)
                curveTo(1f, 12.6f, 1.4f, 13f, 2f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                moveTo(0f, 16f)
                curveTo(0f, 15.4f, 0.4f, 15f, 1f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(1f)
                curveTo(0.4f, 17f, 0f, 16.6f, 0f, 16f)
                close()
            }
        }.build()

        return _InvoiceFastOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceFastOutline: ImageVector? = null
