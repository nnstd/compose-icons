package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BullseyeArrow: ImageVector
    get() {
        if (_BullseyeArrow != null) {
            return _BullseyeArrow!!
        }
        _BullseyeArrow = ImageVector.Builder(
            name = "BullseyeArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                curveTo(22f, 10.84f, 21.79f, 9.69f, 21.39f, 8.61f)
                lineTo(19.79f, 10.21f)
                curveTo(19.93f, 10.8f, 20f, 11.4f, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                curveTo(12.6f, 4f, 13.2f, 4.07f, 13.79f, 4.21f)
                lineTo(15.4f, 2.6f)
                curveTo(14.31f, 2.21f, 13.16f, 2f, 12f, 2f)
                moveTo(19f, 2f)
                lineTo(15f, 6f)
                verticalLineTo(7.5f)
                lineTo(12.45f, 10.05f)
                curveTo(12.3f, 10f, 12.15f, 10f, 12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                curveTo(14f, 11.85f, 14f, 11.7f, 13.95f, 11.55f)
                lineTo(16.5f, 9f)
                horizontalLineTo(18f)
                lineTo(22f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(2f)
                moveTo(12f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 12f)
                horizontalLineTo(16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _BullseyeArrow!!
    }

@Suppress("ObjectPropertyName")
private var _BullseyeArrow: ImageVector? = null
