package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardLock: ImageVector
    get() {
        if (_CreditCardLock != null) {
            return _CreditCardLock!!
        }
        _CreditCardLock = ImageVector.Builder(
            name = "CreditCardLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 15f)
                verticalLineTo(13.5f)
                curveTo(21.8f, 12.1f, 20.4f, 11f, 19f, 11f)
                reflectiveCurveTo(16.2f, 12.1f, 16.2f, 13.5f)
                verticalLineTo(15f)
                curveTo(15.6f, 15f, 15f, 15.6f, 15f, 16.2f)
                verticalLineTo(19.7f)
                curveTo(15f, 20.4f, 15.6f, 21f, 16.2f, 21f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 21f, 23f, 20.4f, 23f, 19.8f)
                verticalLineTo(16.3f)
                curveTo(23f, 15.6f, 22.4f, 15f, 21.8f, 15f)
                moveTo(20.5f, 15f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 12.7f, 18.2f, 12.2f, 19f, 12.2f)
                reflectiveCurveTo(20.5f, 12.7f, 20.5f, 13.5f)
                verticalLineTo(15f)
                moveTo(13.03f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                verticalLineTo(10.04f)
                curveTo(21.42f, 9.6f, 20.75f, 9.26f, 20f, 9.11f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(15.04f)
                curveTo(14.5f, 11.72f, 14.2f, 12.58f, 14.2f, 13.5f)
                verticalLineTo(13.74f)
                curveTo(13.5f, 14.34f, 13f, 15.24f, 13f, 16.2f)
                verticalLineTo(19.7f)
                curveTo(13f, 19.8f, 13f, 19.9f, 13.03f, 20f)
                close()
            }
        }.build()

        return _CreditCardLock!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardLock: ImageVector? = null
