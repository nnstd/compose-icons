package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceTextPlus: ImageVector
    get() {
        if (_InvoiceTextPlus != null) {
            return _InvoiceTextPlus!!
        }
        _InvoiceTextPlus = ImageVector.Builder(
            name = "InvoiceTextPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                verticalLineTo(22f)
                lineTo(6f, 20f)
                lineTo(9f, 22f)
                lineTo(12f, 20f)
                lineTo(13.3f, 20.86f)
                curveTo(13.1f, 20.28f, 13f, 19.65f, 13f, 19f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                curveTo(19.7f, 13f, 20.37f, 13.12f, 21f, 13.34f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                moveTo(17f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                moveTo(15f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                moveTo(18f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _InvoiceTextPlus!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceTextPlus: ImageVector? = null
