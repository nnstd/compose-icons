package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceTextMultipleOutline: ImageVector
    get() {
        if (_InvoiceTextMultipleOutline != null) {
            return _InvoiceTextMultipleOutline!!
        }
        _InvoiceTextMultipleOutline = ImageVector.Builder(
            name = "InvoiceTextMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                moveTo(10f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                moveTo(15f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                moveTo(18.5f, 20.32f)
                lineTo(21f, 22f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                lineTo(8.5f, 20.32f)
                lineTo(11f, 22f)
                lineTo(13.5f, 20.32f)
                lineTo(16f, 22f)
                lineTo(18.5f, 20.32f)
                moveTo(19f, 8f)
                verticalLineTo(17.57f)
                lineTo(16f, 19.59f)
                lineTo(13.5f, 17.9f)
                lineTo(11f, 19.59f)
                lineTo(8f, 17.57f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _InvoiceTextMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceTextMultipleOutline: ImageVector? = null
