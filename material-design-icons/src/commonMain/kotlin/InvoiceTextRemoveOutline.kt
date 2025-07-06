package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceTextRemoveOutline: ImageVector
    get() {
        if (_InvoiceTextRemoveOutline != null) {
            return _InvoiceTextRemoveOutline!!
        }
        _InvoiceTextRemoveOutline = ImageVector.Builder(
            name = "InvoiceTextRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
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
                curveTo(19.7f, 13f, 20.37f, 13.12f, 21f, 13.34f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                lineTo(6f, 20f)
                lineTo(9f, 22f)
                lineTo(12f, 20f)
                moveTo(17f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(15f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                moveTo(19f, 17.6f)
                lineTo(16.9f, 15.5f)
                lineTo(15.5f, 16.9f)
                lineTo(17.6f, 19f)
                lineTo(15.5f, 21.1f)
                lineTo(16.9f, 22.5f)
                lineTo(19f, 20.4f)
                lineTo(21.1f, 22.5f)
                lineTo(22.5f, 21.1f)
                lineTo(20.4f, 19f)
                lineTo(22.5f, 16.9f)
                lineTo(21.1f, 15.5f)
                lineTo(19f, 17.6f)
                close()
            }
        }.build()

        return _InvoiceTextRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceTextRemoveOutline: ImageVector? = null
