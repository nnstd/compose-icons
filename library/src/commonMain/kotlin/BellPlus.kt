package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellPlus: ImageVector
    get() {
        if (_BellPlus != null) {
            return _BellPlus!!
        }
        _BellPlus = ImageVector.Builder(
            name = "BellPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                moveTo(12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4.29f)
                curveTo(7.12f, 5.14f, 5f, 7.82f, 5f, 11f)
                verticalLineTo(17f)
                lineTo(3f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(12.35f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12.09f)
                verticalLineTo(11f)
                curveTo(19f, 7.82f, 16.88f, 5.14f, 14f, 4.29f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(10f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 23f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.65f, 22.13f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.81f, 21f)
                close()
            }
        }.build()

        return _BellPlus!!
    }

@Suppress("ObjectPropertyName")
private var _BellPlus: ImageVector? = null
