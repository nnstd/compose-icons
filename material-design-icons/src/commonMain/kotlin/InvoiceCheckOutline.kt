package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceCheckOutline: ImageVector
    get() {
        if (_InvoiceCheckOutline != null) {
            return _InvoiceCheckOutline!!
        }
        _InvoiceCheckOutline = ImageVector.Builder(
            name = "InvoiceCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                curveTo(19.7f, 13f, 20.37f, 13.12f, 21f, 13.34f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                lineTo(6f, 20f)
                lineTo(9f, 22f)
                lineTo(12f, 20f)
                lineTo(13.3f, 20.86f)
                curveTo(13.1f, 20.28f, 13f, 19.65f, 13f, 19f)
                curveTo(13f, 18.76f, 13f, 18.5f, 13.04f, 18.29f)
                lineTo(12f, 17.6f)
                lineTo(9f, 19.6f)
                lineTo(6f, 17.6f)
                lineTo(5f, 18.26f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(15.5f, 19f)
                lineTo(18.25f, 22f)
                lineTo(23f, 17.23f)
                lineTo(21.84f, 15.82f)
                lineTo(18.25f, 19.41f)
                lineTo(16.66f, 17.82f)
                lineTo(15.5f, 19f)
                close()
            }
        }.build()

        return _InvoiceCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceCheckOutline: ImageVector? = null
