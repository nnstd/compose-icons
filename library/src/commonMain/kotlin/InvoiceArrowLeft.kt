package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceArrowLeft: ImageVector
    get() {
        if (_InvoiceArrowLeft != null) {
            return _InvoiceArrowLeft!!
        }
        _InvoiceArrowLeft = ImageVector.Builder(
            name = "InvoiceArrowLeft",
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
                moveTo(18f, 18f)
                verticalLineTo(16f)
                lineTo(15f, 19f)
                lineTo(18f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _InvoiceArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceArrowLeft: ImageVector? = null
