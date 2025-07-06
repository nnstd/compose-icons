package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WhiteBalanceIncandescent: ImageVector
    get() {
        if (_WhiteBalanceIncandescent != null) {
            return _WhiteBalanceIncandescent!!
        }
        _WhiteBalanceIncandescent = ImageVector.Builder(
            name = "WhiteBalanceIncandescent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.24f, 18.15f)
                lineTo(19.04f, 19.95f)
                lineTo(20.45f, 18.53f)
                lineTo(18.66f, 16.74f)
                moveTo(20f, 12.5f)
                horizontalLineTo(23f)
                verticalLineTo(10.5f)
                horizontalLineTo(20f)
                moveTo(15f, 6.31f)
                verticalLineTo(1.5f)
                horizontalLineTo(9f)
                verticalLineTo(6.31f)
                curveTo(7.21f, 7.35f, 6f, 9.28f, 6f, 11.5f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17.5f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11.5f)
                curveTo(18f, 9.28f, 16.79f, 7.35f, 15f, 6.31f)
                moveTo(4f, 10.5f)
                horizontalLineTo(1f)
                verticalLineTo(12.5f)
                horizontalLineTo(4f)
                moveTo(11f, 22.45f)
                curveTo(11.32f, 22.45f, 13f, 22.45f, 13f, 22.45f)
                verticalLineTo(19.5f)
                horizontalLineTo(11f)
                moveTo(3.55f, 18.53f)
                lineTo(4.96f, 19.95f)
                lineTo(6.76f, 18.15f)
                lineTo(5.34f, 16.74f)
                lineTo(3.55f, 18.53f)
                close()
            }
        }.build()

        return _WhiteBalanceIncandescent!!
    }

@Suppress("ObjectPropertyName")
private var _WhiteBalanceIncandescent: ImageVector? = null
