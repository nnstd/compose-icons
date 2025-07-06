package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ElectricSwitch: ImageVector
    get() {
        if (_ElectricSwitch != null) {
            return _ElectricSwitch!!
        }
        _ElectricSwitch = ImageVector.Builder(
            name = "ElectricSwitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 11f)
                horizontalLineTo(3.17f)
                curveTo(3.58f, 9.83f, 4.69f, 9f, 6f, 9f)
                curveTo(6.65f, 9f, 7.25f, 9.21f, 7.74f, 9.56f)
                lineTo(14.44f, 4.87f)
                lineTo(15.58f, 6.5f)
                lineTo(8.89f, 11.2f)
                curveTo(8.96f, 11.45f, 9f, 11.72f, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
                curveTo(4.69f, 15f, 3.58f, 14.17f, 3.17f, 13f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                moveTo(23f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(20.83f)
                curveTo(20.42f, 14.17f, 19.31f, 15f, 18f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9f)
                curveTo(19.31f, 9f, 20.42f, 9.83f, 20.83f, 11f)
                horizontalLineTo(23f)
                moveTo(6f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 11f)
                moveTo(18f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11f)
                close()
            }
        }.build()

        return _ElectricSwitch!!
    }

@Suppress("ObjectPropertyName")
private var _ElectricSwitch: ImageVector? = null
