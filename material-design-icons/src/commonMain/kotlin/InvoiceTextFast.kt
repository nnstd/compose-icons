package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceTextFast: ImageVector
    get() {
        if (_InvoiceTextFast != null) {
            return _InvoiceTextFast!!
        }
        _InvoiceTextFast = ImageVector.Builder(
            name = "InvoiceTextFast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                lineTo(19.5f, 19.32f)
                lineTo(17f, 21f)
                lineTo(14.5f, 19.32f)
                lineTo(12f, 21f)
                lineTo(9.5f, 19.32f)
                lineTo(7f, 21f)
                verticalLineTo(5f)
                moveTo(18f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                moveTo(11f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                moveTo(3f, 7f)
                curveTo(2.4f, 7f, 2f, 7.4f, 2f, 8f)
                curveTo(2f, 8.6f, 2.4f, 9f, 3f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                moveTo(1f, 12f)
                curveTo(1f, 11.4f, 1.4f, 11f, 2f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                curveTo(1.4f, 13f, 1f, 12.6f, 1f, 12f)
                moveTo(1f, 15f)
                curveTo(0.4f, 15f, 0f, 15.4f, 0f, 16f)
                curveTo(0f, 16.6f, 0.4f, 17f, 1f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                close()
            }
        }.build()

        return _InvoiceTextFast!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceTextFast: ImageVector? = null
