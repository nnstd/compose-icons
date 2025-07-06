package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbOnOutline: ImageVector
    get() {
        if (_LightbulbOnOutline != null) {
            return _LightbulbOnOutline!!
        }
        _LightbulbOnOutline = ImageVector.Builder(
            name = "LightbulbOnOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 11f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                moveTo(1f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                moveTo(13f, 1f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                moveTo(4.92f, 3.5f)
                lineTo(7.05f, 5.64f)
                lineTo(5.63f, 7.05f)
                lineTo(3.5f, 4.93f)
                lineTo(4.92f, 3.5f)
                moveTo(16.95f, 5.63f)
                lineTo(19.07f, 3.5f)
                lineTo(20.5f, 4.93f)
                lineTo(18.37f, 7.05f)
                lineTo(16.95f, 5.63f)
                moveTo(12f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                curveTo(18f, 14.22f, 16.79f, 16.16f, 15f, 17.2f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 20f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 19f)
                verticalLineTo(17.2f)
                curveTo(7.21f, 16.16f, 6f, 14.22f, 6f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                moveTo(14f, 21f)
                verticalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 23f)
                horizontalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                moveTo(11f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(15.87f)
                curveTo(14.73f, 15.43f, 16f, 13.86f, 16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                curveTo(8f, 13.86f, 9.27f, 15.43f, 11f, 15.87f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _LightbulbOnOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbOnOutline: ImageVector? = null
