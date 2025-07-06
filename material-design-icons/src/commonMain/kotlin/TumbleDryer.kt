package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TumbleDryer: ImageVector
    get() {
        if (_TumbleDryer != null) {
            return _TumbleDryer!!
        }
        _TumbleDryer = ImageVector.Builder(
            name = "TumbleDryer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                moveTo(7f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 4f)
                moveTo(10f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
                moveTo(12f, 8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                moveTo(8.11f, 10.5f)
                horizontalLineTo(10f)
                curveTo(9.76f, 11.88f, 10f, 12.67f, 10.58f, 13.29f)
                curveTo(11.68f, 14.36f, 12.16f, 15.71f, 11.89f, 17.5f)
                horizontalLineTo(10f)
                curveTo(10.24f, 16.12f, 10f, 15.33f, 9.42f, 14.71f)
                curveTo(8.32f, 13.64f, 7.85f, 12.29f, 8.11f, 10.5f)
                moveTo(12.11f, 10.5f)
                horizontalLineTo(14f)
                curveTo(13.76f, 11.88f, 14f, 12.67f, 14.58f, 13.29f)
                curveTo(15.68f, 14.36f, 16.16f, 15.71f, 15.89f, 17.5f)
                horizontalLineTo(14f)
                curveTo(14.24f, 16.12f, 14f, 15.33f, 13.42f, 14.71f)
                curveTo(12.32f, 13.64f, 11.85f, 12.29f, 12.11f, 10.5f)
                close()
            }
        }.build()

        return _TumbleDryer!!
    }

@Suppress("ObjectPropertyName")
private var _TumbleDryer: ImageVector? = null
