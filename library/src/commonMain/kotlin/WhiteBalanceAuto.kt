package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WhiteBalanceAuto: ImageVector
    get() {
        if (_WhiteBalanceAuto != null) {
            return _WhiteBalanceAuto!!
        }
        _WhiteBalanceAuto = ImageVector.Builder(
            name = "WhiteBalanceAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.3f, 16f)
                lineTo(9.6f, 14f)
                horizontalLineTo(6.4f)
                lineTo(5.7f, 16f)
                horizontalLineTo(3.8f)
                lineTo(7f, 7f)
                horizontalLineTo(9f)
                lineTo(12.2f, 16f)
                moveTo(22f, 7f)
                lineTo(20.8f, 13.29f)
                lineTo(19.3f, 7f)
                horizontalLineTo(17.7f)
                lineTo(16.21f, 13.29f)
                lineTo(15f, 7f)
                horizontalLineTo(14.24f)
                curveTo(12.77f, 5.17f, 10.5f, 4f, 8f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 20f)
                curveTo(11.13f, 20f, 13.84f, 18.19f, 15.15f, 15.57f)
                lineTo(15.25f, 16f)
                horizontalLineTo(17f)
                lineTo(18.5f, 9.9f)
                lineTo(20f, 16f)
                horizontalLineTo(21.75f)
                lineTo(23.8f, 7f)
                moveTo(6.85f, 12.65f)
                horizontalLineTo(9.15f)
                lineTo(8f, 9f)
                lineTo(6.85f, 12.65f)
                close()
            }
        }.build()

        return _WhiteBalanceAuto!!
    }

@Suppress("ObjectPropertyName")
private var _WhiteBalanceAuto: ImageVector? = null
