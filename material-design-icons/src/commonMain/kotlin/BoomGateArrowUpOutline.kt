package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BoomGateArrowUpOutline: ImageVector
    get() {
        if (_BoomGateArrowUpOutline != null) {
            return _BoomGateArrowUpOutline!!
        }
        _BoomGateArrowUpOutline = ImageVector.Builder(
            name = "BoomGateArrowUpOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.86f, 3f)
                curveTo(20.41f, 3.96f, 20.08f, 5.18f, 19.12f, 5.73f)
                lineTo(9f, 11.58f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20f)
                verticalLineTo(11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                curveTo(6.31f, 8f, 6.62f, 8.06f, 6.92f, 8.16f)
                lineTo(17.12f, 2.27f)
                curveTo(18.09f, 1.71f, 19.31f, 2.04f, 19.86f, 3f)
                moveTo(7.5f, 20f)
                verticalLineTo(13.6f)
                curveTo(6.57f, 14.14f, 5.43f, 14.14f, 4.5f, 13.6f)
                verticalLineTo(20f)
                horizontalLineTo(7.5f)
                moveTo(6f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 12.5f)
                moveTo(10.4f, 9.62f)
                lineTo(11.7f, 8.87f)
                lineTo(9.4f, 7.87f)
                lineTo(8.1f, 8.62f)
                lineTo(10.4f, 9.62f)
                moveTo(13.86f, 7.62f)
                lineTo(15.16f, 6.87f)
                lineTo(12.86f, 5.87f)
                lineTo(11.56f, 6.62f)
                lineTo(13.86f, 7.62f)
                moveTo(17.33f, 5.62f)
                lineTo(18.62f, 4.87f)
                lineTo(16.33f, 3.87f)
                lineTo(15.03f, 4.62f)
                lineTo(17.33f, 5.62f)
                moveTo(16f, 20f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                lineTo(17f, 11.16f)
                lineTo(21f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _BoomGateArrowUpOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BoomGateArrowUpOutline: ImageVector? = null
