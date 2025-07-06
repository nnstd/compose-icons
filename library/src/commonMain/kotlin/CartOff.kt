package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CartOff: ImageVector
    get() {
        if (_CartOff != null) {
            return _CartOff!!
        }
        _CartOff = ImageVector.Builder(
            name = "CartOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.73f, 22.73f)
                lineTo(1.27f, 1.27f)
                lineTo(0f, 2.54f)
                lineTo(4.39f, 6.93f)
                lineTo(6.6f, 11.59f)
                lineTo(5.25f, 14.04f)
                curveTo(5.09f, 14.32f, 5f, 14.65f, 5f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                horizontalLineTo(14.46f)
                lineTo(15.84f, 18.38f)
                curveTo(15.34f, 18.74f, 15f, 19.33f, 15f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 22f)
                curveTo(17.67f, 22f, 18.26f, 21.67f, 18.62f, 21.16f)
                lineTo(21.46f, 24f)
                lineTo(22.73f, 22.73f)
                moveTo(7.42f, 15f)
                arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.17f, 14.75f)
                lineTo(7.2f, 14.63f)
                lineTo(8.1f, 13f)
                horizontalLineTo(10.46f)
                lineTo(12.46f, 15f)
                horizontalLineTo(7.42f)
                moveTo(15.55f, 13f)
                curveTo(16.3f, 13f, 16.96f, 12.59f, 17.3f, 11.97f)
                lineTo(20.88f, 5.5f)
                curveTo(20.96f, 5.34f, 21f, 5.17f, 21f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                horizontalLineTo(6.54f)
                lineTo(15.55f, 13f)
                moveTo(7f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18f)
                close()
            }
        }.build()

        return _CartOff!!
    }

@Suppress("ObjectPropertyName")
private var _CartOff: ImageVector? = null
