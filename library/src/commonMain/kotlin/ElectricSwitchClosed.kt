package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ElectricSwitchClosed: ImageVector
    get() {
        if (_ElectricSwitchClosed != null) {
            return _ElectricSwitchClosed!!
        }
        _ElectricSwitchClosed = ImageVector.Builder(
            name = "ElectricSwitchClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.83f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.18f, 11f)
                horizontalLineTo(8.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.17f, 11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(3.17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.82f, 13f)
                horizontalLineTo(15.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.83f, 13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                moveTo(6f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 13f)
                moveTo(18f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13f)
                close()
            }
        }.build()

        return _ElectricSwitchClosed!!
    }

@Suppress("ObjectPropertyName")
private var _ElectricSwitchClosed: ImageVector? = null
