package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardCheckOutline: ImageVector
    get() {
        if (_CreditCardCheckOutline != null) {
            return _CreditCardCheckOutline!!
        }
        _CreditCardCheckOutline = ImageVector.Builder(
            name = "CreditCardCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                curveTo(13f, 18.66f, 13.04f, 18.33f, 13.09f, 18f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                curveTo(19.7f, 13f, 20.37f, 13.13f, 21f, 13.35f)
                verticalLineTo(6f)
                curveTo(21f, 4.89f, 20.11f, 4f, 19f, 4f)
                horizontalLineTo(3f)
                curveTo(1.89f, 4f, 1f, 4.89f, 1f, 6f)
                verticalLineTo(18f)
                curveTo(1f, 19.1f, 1.89f, 20f, 3f, 20f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13f, 19.34f, 13f, 19f)
                moveTo(3f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(17.75f, 22f)
                lineTo(15f, 19f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
                lineTo(17.75f, 22f)
            }
        }.build()

        return _CreditCardCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardCheckOutline: ImageVector? = null
