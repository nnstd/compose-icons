package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WalletGiftcard: ImageVector
    get() {
        if (_WalletGiftcard != null) {
            return _WalletGiftcard!!
        }
        _WalletGiftcard = ImageVector.Builder(
            name = "WalletGiftcard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(9.08f)
                lineTo(7f, 10.83f)
                lineTo(8.62f, 12f)
                lineTo(11f, 8.76f)
                lineTo(12f, 7.4f)
                lineTo(13f, 8.76f)
                lineTo(15.38f, 12f)
                lineTo(17f, 10.83f)
                lineTo(14.92f, 8f)
                horizontalLineTo(20f)
                moveTo(20f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                moveTo(9f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                moveTo(15f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                moveTo(20f, 6f)
                horizontalLineTo(17.82f)
                curveTo(17.93f, 5.69f, 18f, 5.35f, 18f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 2f)
                curveTo(13.95f, 2f, 13.04f, 2.54f, 12.5f, 3.35f)
                lineTo(12f, 4f)
                lineTo(11.5f, 3.34f)
                curveTo(10.96f, 2.54f, 10.05f, 2f, 9f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5f)
                curveTo(6f, 5.35f, 6.07f, 5.69f, 6.18f, 6f)
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

        return _WalletGiftcard!!
    }

@Suppress("ObjectPropertyName")
private var _WalletGiftcard: ImageVector? = null
