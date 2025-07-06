package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockDigital: ImageVector
    get() {
        if (_ClockDigital != null) {
            return _ClockDigital!!
        }
        _ClockDigital = ImageVector.Builder(
            name = "ClockDigital",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 18f)
                horizontalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 6f)
                moveTo(2f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                moveTo(3f, 9f)
                verticalLineTo(10.5f)
                horizontalLineTo(6.25f)
                lineTo(3f, 15f)
                horizontalLineTo(4.75f)
                lineTo(8f, 10.5f)
                verticalLineTo(9f)
                moveTo(9.25f, 9f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.75f)
                verticalLineTo(9f)
                moveTo(12f, 9f)
                verticalLineTo(10.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(17f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 15f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 14f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9f)
                moveTo(17.5f, 10.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(17.5f)
                moveTo(9.25f, 13.5f)
                verticalLineTo(15f)
                horizontalLineTo(10.75f)
                verticalLineTo(13.5f)
            }
        }.build()

        return _ClockDigital!!
    }

@Suppress("ObjectPropertyName")
private var _ClockDigital: ImageVector? = null
