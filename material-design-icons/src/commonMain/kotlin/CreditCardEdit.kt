package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardEdit: ImageVector
    get() {
        if (_CreditCardEdit != null) {
            return _CreditCardEdit!!
        }
        _CreditCardEdit = ImageVector.Builder(
            name = "CreditCardEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.6f, 11.3f)
                curveTo(20.7f, 11.2f, 20.8f, 11.1f, 21f, 11.1f)
                curveTo(21.1f, 11.1f, 21.3f, 11.2f, 21.4f, 11.3f)
                lineTo(22.6f, 12.5f)
                curveTo(22.8f, 12.7f, 22.8f, 13.1f, 22.6f, 13.3f)
                lineTo(21.6f, 14.3f)
                lineTo(19.6f, 12.3f)
                lineTo(20.6f, 11.3f)
                moveTo(13f, 18.9f)
                lineTo(19f, 12.8f)
                lineTo(21.1f, 14.9f)
                lineTo(15.1f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(18.9f)
                moveTo(11f, 19.1f)
                verticalLineTo(18.1f)
                lineTo(11.6f, 17.5f)
                lineTo(18.1f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(9.1f)
                lineTo(22f, 7.1f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(3.5f, 4f, 3f, 4.2f, 2.6f, 4.6f)
                curveTo(2.2f, 5f, 2f, 5.5f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 18.5f, 2.2f, 19f, 2.6f, 19.4f)
                curveTo(3f, 19.8f, 3.5f, 20f, 4f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(19.1f)
                close()
            }
        }.build()

        return _CreditCardEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardEdit: ImageVector? = null
