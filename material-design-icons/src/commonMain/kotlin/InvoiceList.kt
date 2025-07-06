package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceList: ImageVector
    get() {
        if (_InvoiceList != null) {
            return _InvoiceList!!
        }
        _InvoiceList = ImageVector.Builder(
            name = "InvoiceList",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                lineTo(18f, 20f)
                lineTo(15f, 22f)
                lineTo(12f, 20f)
                lineTo(9f, 22f)
                lineTo(6f, 20f)
                lineTo(3f, 22f)
                moveTo(17f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(13f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(13f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(15f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _InvoiceList!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceList: ImageVector? = null
