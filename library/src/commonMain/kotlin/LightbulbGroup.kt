package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbGroup: ImageVector
    get() {
        if (_LightbulbGroup != null) {
            return _LightbulbGroup!!
        }
        _LightbulbGroup = ImageVector.Builder(
            name = "LightbulbGroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 16f)
                verticalLineTo(14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, 14f)
                moveTo(14f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 20f)
                horizontalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                moveTo(7f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                horizontalLineTo(7.17f)
                arcTo(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 19f)
                moveTo(5f, 10f)
                arcTo(6.79f, 6.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.68f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 14.45f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(14.88f)
                arcTo(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 10f)
                moveTo(17f, 18f)
                verticalLineTo(19f)
                arcTo(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.83f, 20f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19f)
                verticalLineTo(18f)
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

        return _LightbulbGroup!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbGroup: ImageVector? = null
