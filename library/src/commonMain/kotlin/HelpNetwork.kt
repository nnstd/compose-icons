package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HelpNetwork: ImageVector
    get() {
        if (_HelpNetwork != null) {
            return _HelpNetwork!!
        }
        _HelpNetwork = ImageVector.Builder(
            name = "HelpNetwork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 23f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                curveTo(5.89f, 17f, 5f, 16.1f, 5f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                horizontalLineTo(17f)
                moveTo(12.19f, 5f)
                curveTo(11.32f, 5f, 10.62f, 5.2f, 10.08f, 5.59f)
                curveTo(9.56f, 6f, 9.3f, 6.57f, 9.31f, 7.36f)
                lineTo(9.32f, 7.39f)
                horizontalLineTo(11.25f)
                curveTo(11.26f, 7.09f, 11.35f, 6.86f, 11.53f, 6.7f)
                curveTo(11.71f, 6.55f, 11.93f, 6.47f, 12.19f, 6.47f)
                curveTo(12.5f, 6.47f, 12.76f, 6.57f, 12.94f, 6.75f)
                curveTo(13.12f, 6.94f, 13.2f, 7.2f, 13.2f, 7.5f)
                curveTo(13.2f, 7.82f, 13.13f, 8.09f, 12.97f, 8.32f)
                curveTo(12.83f, 8.55f, 12.62f, 8.75f, 12.36f, 8.91f)
                curveTo(11.85f, 9.25f, 11.5f, 9.55f, 11.31f, 9.82f)
                curveTo(11.11f, 10.08f, 11f, 10.5f, 11f, 11f)
                horizontalLineTo(13f)
                curveTo(13f, 10.69f, 13.04f, 10.44f, 13.13f, 10.26f)
                curveTo(13.22f, 10.07f, 13.39f, 9.9f, 13.64f, 9.74f)
                curveTo(14.09f, 9.5f, 14.46f, 9.21f, 14.75f, 8.81f)
                curveTo(15.04f, 8.41f, 15.19f, 8f, 15.19f, 7.5f)
                curveTo(15.19f, 6.74f, 14.92f, 6.13f, 14.38f, 5.68f)
                curveTo(13.85f, 5.23f, 13.12f, 5f, 12.19f, 5f)
                moveTo(11f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _HelpNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _HelpNetwork: ImageVector? = null
