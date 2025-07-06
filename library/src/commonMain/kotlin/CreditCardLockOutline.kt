package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardLockOutline: ImageVector
    get() {
        if (_CreditCardLockOutline != null) {
            return _CreditCardLockOutline!!
        }
        _CreditCardLockOutline = ImageVector.Builder(
            name = "CreditCardLockOutline",
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
                moveTo(13f, 19.7f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(14.5f)
                curveTo(15.18f, 10.28f, 16.96f, 9f, 19f, 9f)
                curveTo(20.13f, 9f, 21.17f, 9.4f, 22f, 10.04f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(13.03f)
                curveTo(13f, 19.9f, 13f, 19.8f, 13f, 19.7f)
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _CreditCardLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardLockOutline: ImageVector? = null
