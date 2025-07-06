package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardEditOutline: ImageVector
    get() {
        if (_CreditCardEditOutline != null) {
            return _CreditCardEditOutline!!
        }
        _CreditCardEditOutline = ImageVector.Builder(
            name = "CreditCardEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 18.9f)
                lineTo(19.1f, 12.8f)
                lineTo(21.2f, 14.9f)
                lineTo(15.1f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(18.9f)
                moveTo(21.4f, 11.3f)
                lineTo(22.7f, 12.6f)
                curveTo(22.9f, 12.8f, 22.9f, 13.1f, 22.7f, 13.3f)
                lineTo(21.7f, 14.3f)
                lineTo(19.6f, 12.3f)
                lineTo(20.6f, 11.3f)
                curveTo(20.7f, 11.2f, 20.8f, 11.1f, 21f, 11.1f)
                curveTo(21.2f, 11.1f, 21.3f, 11.2f, 21.4f, 11.3f)
                moveTo(11f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(17.1f)
                lineTo(22f, 7.1f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _CreditCardEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardEditOutline: ImageVector? = null
