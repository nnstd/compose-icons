package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WalletBifold: ImageVector
    get() {
        if (_WalletBifold != null) {
            return _WalletBifold!!
        }
        _WalletBifold = ImageVector.Builder(
            name = "WalletBifold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                horizontalLineTo(7f)
                curveTo(4.79f, 3f, 3f, 4.79f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 19.21f, 4.79f, 21f, 7f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(9f)
                curveTo(21f, 7.9f, 20.11f, 7f, 19f, 7f)
                verticalLineTo(5f)
                curveTo(19f, 3.9f, 18.11f, 3f, 17f, 3f)
                moveTo(17f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                curveTo(6.27f, 7f, 5.59f, 7.2f, 5f, 7.54f)
                verticalLineTo(7f)
                curveTo(5f, 5.9f, 5.9f, 5f, 7f, 5f)
                moveTo(15.5f, 15.5f)
                curveTo(14.67f, 15.5f, 14f, 14.83f, 14f, 14f)
                reflectiveCurveTo(14.67f, 12.5f, 15.5f, 12.5f)
                reflectiveCurveTo(17f, 13.17f, 17f, 14f)
                reflectiveCurveTo(16.33f, 15.5f, 15.5f, 15.5f)
                close()
            }
        }.build()

        return _WalletBifold!!
    }

@Suppress("ObjectPropertyName")
private var _WalletBifold: ImageVector? = null
