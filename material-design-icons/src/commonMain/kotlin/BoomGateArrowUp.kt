package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BoomGateArrowUp: ImageVector
    get() {
        if (_BoomGateArrowUp != null) {
            return _BoomGateArrowUp!!
        }
        _BoomGateArrowUp = ImageVector.Builder(
            name = "BoomGateArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.86f, 3f)
                curveTo(19.31f, 2.04f, 18.09f, 1.71f, 17.12f, 2.27f)
                lineTo(6.92f, 8.16f)
                curveTo(6.62f, 8.06f, 6.31f, 8f, 6f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                verticalLineTo(11.58f)
                lineTo(19.12f, 5.73f)
                curveTo(20.08f, 5.18f, 20.41f, 3.96f, 19.86f, 3f)
                moveTo(6f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12.5f)
                moveTo(10.4f, 9.62f)
                lineTo(8.1f, 8.62f)
                lineTo(9.4f, 7.87f)
                lineTo(11.7f, 8.87f)
                lineTo(10.4f, 9.62f)
                moveTo(13.86f, 7.62f)
                lineTo(11.56f, 6.62f)
                lineTo(12.86f, 5.87f)
                lineTo(15.16f, 6.87f)
                lineTo(13.86f, 7.62f)
                moveTo(17.33f, 5.62f)
                lineTo(15.03f, 4.62f)
                lineTo(16.33f, 3.87f)
                lineTo(18.62f, 4.87f)
                lineTo(17.33f, 5.62f)
                moveTo(17f, 11f)
                lineTo(22f, 16f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                lineTo(17f, 11f)
            }
        }.build()

        return _BoomGateArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _BoomGateArrowUp: ImageVector? = null
