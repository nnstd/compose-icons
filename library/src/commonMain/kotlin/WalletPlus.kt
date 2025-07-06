package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WalletPlus: ImageVector
    get() {
        if (_WalletPlus != null) {
            return _WalletPlus!!
        }
        _WalletPlus = ImageVector.Builder(
            name = "WalletPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                moveTo(9f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                curveTo(10.9f, 18f, 10f, 17.11f, 10f, 16f)
                verticalLineTo(8f)
                curveTo(10f, 6.9f, 10.89f, 6f, 12f, 6f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(9f)
                moveTo(12f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                moveTo(16f, 10.5f)
                curveTo(16.83f, 10.5f, 17.5f, 11.17f, 17.5f, 12f)
                curveTo(17.5f, 12.83f, 16.83f, 13.5f, 16f, 13.5f)
                curveTo(15.17f, 13.5f, 14.5f, 12.83f, 14.5f, 12f)
                curveTo(14.5f, 11.17f, 15.17f, 10.5f, 16f, 10.5f)
                close()
            }
        }.build()

        return _WalletPlus!!
    }

@Suppress("ObjectPropertyName")
private var _WalletPlus: ImageVector? = null
