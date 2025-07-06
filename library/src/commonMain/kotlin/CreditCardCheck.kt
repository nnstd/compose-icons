package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardCheck: ImageVector
    get() {
        if (_CreditCardCheck != null) {
            return _CreditCardCheck!!
        }
        _CreditCardCheck = ImageVector.Builder(
            name = "CreditCardCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(13.09f)
                curveTo(13.03f, 19.67f, 13f, 19.34f, 13f, 19f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                curveTo(20.06f, 13f, 21.09f, 13.28f, 22f, 13.81f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.11f, 4f, 20f, 4f)
                moveTo(20f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(17.75f, 22f)
                lineTo(15f, 19f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
                lineTo(17.75f, 22f)
            }
        }.build()

        return _CreditCardCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardCheck: ImageVector? = null
