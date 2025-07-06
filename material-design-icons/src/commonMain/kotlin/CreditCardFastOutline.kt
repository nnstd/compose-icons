package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardFastOutline: ImageVector
    get() {
        if (_CreditCardFastOutline != null) {
            return _CreditCardFastOutline!!
        }
        _CreditCardFastOutline = ImageVector.Builder(
            name = "CreditCardFastOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 8f)
                curveTo(2.45f, 8f, 2f, 7.55f, 2f, 7f)
                reflectiveCurveTo(2.45f, 6f, 3f, 6f)
                horizontalLineTo(5.54f)
                curveTo(5.19f, 6.6f, 5f, 7.29f, 5f, 8f)
                horizontalLineTo(3f)
                moveTo(5f, 13f)
                horizontalLineTo(2f)
                curveTo(1.45f, 13f, 1f, 12.55f, 1f, 12f)
                reflectiveCurveTo(1.45f, 11f, 2f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                moveTo(1f, 18f)
                curveTo(0.448f, 18f, 0f, 17.55f, 0f, 17f)
                reflectiveCurveTo(0.448f, 16f, 1f, 16f)
                horizontalLineTo(5f)
                curveTo(5f, 16.71f, 5.19f, 17.4f, 5.54f, 18f)
                horizontalLineTo(1f)
                moveTo(21f, 6f)
                horizontalLineTo(9f)
                curveTo(7.89f, 6f, 7f, 6.89f, 7f, 8f)
                verticalLineTo(16f)
                curveTo(7f, 17.11f, 7.89f, 18f, 9f, 18f)
                horizontalLineTo(21f)
                curveTo(22.11f, 18f, 23f, 17.11f, 23f, 16f)
                verticalLineTo(8f)
                curveTo(23f, 6.89f, 22.11f, 6f, 21f, 6f)
                moveTo(21f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                moveTo(9f, 16f)
                lineTo(9f, 12f)
                horizontalLineTo(21f)
                lineTo(21f, 16f)
                lineTo(9f, 16f)
                close()
            }
        }.build()

        return _CreditCardFastOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardFastOutline: ImageVector? = null
