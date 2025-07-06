package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DivingScubaMask: ImageVector
    get() {
        if (_DivingScubaMask != null) {
            return _DivingScubaMask!!
        }
        _DivingScubaMask = ImageVector.Builder(
            name = "DivingScubaMask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                curveTo(13.31f, 15f, 14.42f, 15.83f, 14.83f, 17f)
                horizontalLineTo(18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 19f)
                horizontalLineTo(14.83f)
                curveTo(14.42f, 20.17f, 13.31f, 21f, 12f, 21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                moveTo(12f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                moveTo(18f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                horizontalLineTo(14.85f)
                curveTo(14.43f, 12f, 14.05f, 12.24f, 13.9f, 12.63f)
                curveTo(13.7f, 13.23f, 13.23f, 13.71f, 12.62f, 13.91f)
                curveTo(11.58f, 14.25f, 10.44f, 13.68f, 10.1f, 12.63f)
                curveTo(9.95f, 12.24f, 9.57f, 12f, 9.15f, 12f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 10f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3f)
                horizontalLineTo(18f)
                moveTo(18f, 10f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(10.65f)
                curveTo(10.9f, 9.46f, 11.41f, 9.09f, 12f, 9f)
                curveTo(12.59f, 9.09f, 13.1f, 9.46f, 13.35f, 10f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _DivingScubaMask!!
    }

@Suppress("ObjectPropertyName")
private var _DivingScubaMask: ImageVector? = null
