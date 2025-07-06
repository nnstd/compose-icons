package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbGroupOutline: ImageVector
    get() {
        if (_LightbulbGroupOutline != null) {
            return _LightbulbGroupOutline!!
        }
        _LightbulbGroupOutline = ImageVector.Builder(
            name = "LightbulbGroupOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 19f)
                arcTo(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.17f, 20f)
                horizontalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                moveTo(10f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 20f)
                horizontalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                moveTo(4f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(14.88f)
                arcTo(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 10f)
                arcTo(6.79f, 6.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.68f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 14.45f)
                moveTo(17f, 19f)
                arcTo(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.83f, 20f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                moveTo(17f, 10f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 14f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 16f)
                verticalLineTo(14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 10f)
                moveTo(15f, 10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11f, 12.82f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(12.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10f)
                moveTo(18.32f, 7f)
                arcTo(6.79f, 6.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 10f)
                arcTo(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 14.88f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 16f)
                verticalLineTo(14.45f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.32f, 7f)
                close()
            }
        }.build()

        return _LightbulbGroupOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbGroupOutline: ImageVector? = null
