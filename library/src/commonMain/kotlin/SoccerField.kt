package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SoccerField: ImageVector
    get() {
        if (_SoccerField != null) {
            return _SoccerField!!
        }
        _SoccerField = ImageVector.Builder(
            name = "SoccerField",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                moveTo(4f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(8.13f)
                curveTo(9.24f, 8.59f, 8f, 10.18f, 8f, 12f)
                curveTo(8f, 13.82f, 9.24f, 15.41f, 11f, 15.87f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(13f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(15.87f)
                curveTo(14.76f, 15.41f, 16f, 13.82f, 16f, 12f)
                curveTo(16f, 10.18f, 14.76f, 8.59f, 13f, 8.13f)
                verticalLineTo(6f)
                moveTo(4f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                moveTo(19f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                moveTo(13f, 10.27f)
                curveTo(13.62f, 10.63f, 14f, 11.29f, 14f, 12f)
                curveTo(14f, 12.71f, 13.62f, 13.37f, 13f, 13.73f)
                verticalLineTo(10.27f)
                moveTo(11f, 10.27f)
                verticalLineTo(13.73f)
                curveTo(10.38f, 13.37f, 10f, 12.71f, 10f, 12f)
                curveTo(10f, 11.29f, 10.38f, 10.63f, 11f, 10.27f)
                close()
            }
        }.build()

        return _SoccerField!!
    }

@Suppress("ObjectPropertyName")
private var _SoccerField: ImageVector? = null
