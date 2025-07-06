package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WalletBifoldOutline: ImageVector
    get() {
        if (_WalletBifoldOutline != null) {
            return _WalletBifoldOutline!!
        }
        _WalletBifoldOutline = ImageVector.Builder(
            name = "WalletBifoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 15.5f)
                curveTo(16.33f, 15.5f, 17f, 14.83f, 17f, 14f)
                curveTo(17f, 13.17f, 16.33f, 12.5f, 15.5f, 12.5f)
                curveTo(14.67f, 12.5f, 14f, 13.17f, 14f, 14f)
                curveTo(14f, 14.83f, 14.67f, 15.5f, 15.5f, 15.5f)
                moveTo(7f, 3f)
                horizontalLineTo(17f)
                curveTo(18.11f, 3f, 19f, 3.9f, 19f, 5f)
                verticalLineTo(7f)
                curveTo(20.11f, 7f, 21f, 7.9f, 21f, 9f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.11f, 21f, 19f, 21f)
                horizontalLineTo(7f)
                curveTo(4.79f, 21f, 3f, 19.21f, 3f, 17f)
                verticalLineTo(7f)
                curveTo(3f, 4.79f, 4.79f, 3f, 7f, 3f)
                moveTo(17f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                curveTo(5.9f, 5f, 5f, 5.9f, 5f, 7f)
                verticalLineTo(7.54f)
                curveTo(5.59f, 7.2f, 6.27f, 7f, 7f, 7f)
                horizontalLineTo(17f)
                moveTo(5f, 17f)
                curveTo(5f, 18.11f, 5.9f, 19f, 7f, 19f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                curveTo(5.9f, 9f, 5f, 9.9f, 5f, 11f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _WalletBifoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WalletBifoldOutline: ImageVector? = null
