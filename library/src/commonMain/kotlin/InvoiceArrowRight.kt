package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceArrowRight: ImageVector
    get() {
        if (_InvoiceArrowRight != null) {
            return _InvoiceArrowRight!!
        }
        _InvoiceArrowRight = ImageVector.Builder(
            name = "InvoiceArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13.34f)
                curveTo(20.37f, 13.12f, 19.7f, 13f, 19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
                curveTo(13f, 19.65f, 13.1f, 20.28f, 13.3f, 20.86f)
                lineTo(12f, 20f)
                lineTo(9f, 22f)
                lineTo(6f, 20f)
                lineTo(3f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(13.34f)
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

        return _InvoiceArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceArrowRight: ImageVector? = null
