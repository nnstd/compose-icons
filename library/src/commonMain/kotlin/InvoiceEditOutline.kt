package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceEditOutline: ImageVector
    get() {
        if (_InvoiceEditOutline != null) {
            return _InvoiceEditOutline!!
        }
        _InvoiceEditOutline = ImageVector.Builder(
            name = "InvoiceEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.86f, 21.43f)
                lineTo(9f, 22f)
                lineTo(6f, 20f)
                lineTo(3f, 22f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(10.2f)
                curveTo(20.37f, 9.93f, 19.64f, 9.93f, 19f, 10.22f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(18.26f)
                lineTo(6f, 17.6f)
                lineTo(9f, 19.6f)
                lineTo(9.86f, 19f)
                verticalLineTo(21.43f)
                moveTo(11.86f, 19.96f)
                lineTo(18f, 13.83f)
                lineTo(20.03f, 15.87f)
                lineTo(13.9f, 22f)
                horizontalLineTo(11.86f)
                verticalLineTo(19.96f)
                moveTo(20.73f, 15.17f)
                lineTo(21.71f, 14.19f)
                curveTo(21.91f, 14f, 21.91f, 13.67f, 21.71f, 13.47f)
                lineTo(20.39f, 12.15f)
                curveTo(20.37f, 12.13f, 20.34f, 12.1f, 20.31f, 12.09f)
                curveTo(20.12f, 11.96f, 19.86f, 11.97f, 19.69f, 12.13f)
                lineTo(19.67f, 12.15f)
                lineTo(18.69f, 13.13f)
                lineTo(20.73f, 15.17f)
                close()
            }
        }.build()

        return _InvoiceEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceEditOutline: ImageVector? = null
