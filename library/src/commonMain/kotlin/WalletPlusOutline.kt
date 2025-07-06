package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WalletPlusOutline: ImageVector
    get() {
        if (_WalletPlusOutline != null) {
            return _WalletPlusOutline!!
        }
        _WalletPlusOutline = ImageVector.Builder(
            name = "WalletPlusOutline",
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
                moveTo(10f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                curveTo(11.9f, 7f, 11f, 7.9f, 11f, 9f)
                verticalLineTo(15f)
                curveTo(11f, 16.1f, 11.9f, 17f, 13f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(16.72f)
                curveTo(21.59f, 16.37f, 22f, 15.74f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 8.26f, 21.59f, 7.63f, 21f, 7.28f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(10f)
                moveTo(13f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                moveTo(16f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10.5f)
                close()
            }
        }.build()

        return _WalletPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WalletPlusOutline: ImageVector? = null
