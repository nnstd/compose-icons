package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WalletTravel: ImageVector
    get() {
        if (_WalletTravel != null) {
            return _WalletTravel!!
        }
        _WalletTravel = ImageVector.Builder(
            name = "WalletTravel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(20f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                moveTo(9f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                moveTo(20f, 6f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                curveTo(17f, 2.89f, 16.11f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(7.89f, 2f, 7f, 2.89f, 7f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                curveTo(2.89f, 6f, 2f, 6.89f, 2f, 8f)
                verticalLineTo(19f)
                curveTo(2f, 20.11f, 2.89f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(21.11f, 21f, 22f, 20.11f, 22f, 19f)
                verticalLineTo(8f)
                curveTo(22f, 6.89f, 21.11f, 6f, 20f, 6f)
                close()
            }
        }.build()

        return _WalletTravel!!
    }

@Suppress("ObjectPropertyName")
private var _WalletTravel: ImageVector? = null
