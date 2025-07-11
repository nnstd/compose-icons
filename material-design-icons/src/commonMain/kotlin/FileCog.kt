package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCog: ImageVector
    get() {
        if (_FileCog != null) {
            return _FileCog!!
        }
        _FileCog = ImageVector.Builder(
            name = "FileCog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(12.68f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12.08f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                moveTo(18f, 14f)
                curveTo(17.87f, 14f, 17.76f, 14.09f, 17.74f, 14.21f)
                lineTo(17.55f, 15.53f)
                curveTo(17.25f, 15.66f, 16.96f, 15.82f, 16.7f, 16f)
                lineTo(15.46f, 15.5f)
                curveTo(15.35f, 15.5f, 15.22f, 15.5f, 15.15f, 15.63f)
                lineTo(14.15f, 17.36f)
                curveTo(14.09f, 17.47f, 14.11f, 17.6f, 14.21f, 17.68f)
                lineTo(15.27f, 18.5f)
                curveTo(15.25f, 18.67f, 15.24f, 18.83f, 15.24f, 19f)
                curveTo(15.24f, 19.17f, 15.25f, 19.33f, 15.27f, 19.5f)
                lineTo(14.21f, 20.32f)
                curveTo(14.12f, 20.4f, 14.09f, 20.53f, 14.15f, 20.64f)
                lineTo(15.15f, 22.37f)
                curveTo(15.21f, 22.5f, 15.34f, 22.5f, 15.46f, 22.5f)
                lineTo(16.7f, 22f)
                curveTo(16.96f, 22.18f, 17.24f, 22.35f, 17.55f, 22.47f)
                lineTo(17.74f, 23.79f)
                curveTo(17.76f, 23.91f, 17.86f, 24f, 18f, 24f)
                horizontalLineTo(20f)
                curveTo(20.11f, 24f, 20.22f, 23.91f, 20.24f, 23.79f)
                lineTo(20.43f, 22.47f)
                curveTo(20.73f, 22.34f, 21f, 22.18f, 21.27f, 22f)
                lineTo(22.5f, 22.5f)
                curveTo(22.63f, 22.5f, 22.76f, 22.5f, 22.83f, 22.37f)
                lineTo(23.83f, 20.64f)
                curveTo(23.89f, 20.53f, 23.86f, 20.4f, 23.77f, 20.32f)
                lineTo(22.7f, 19.5f)
                curveTo(22.72f, 19.33f, 22.74f, 19.17f, 22.74f, 19f)
                curveTo(22.74f, 18.83f, 22.73f, 18.67f, 22.7f, 18.5f)
                lineTo(23.76f, 17.68f)
                curveTo(23.85f, 17.6f, 23.88f, 17.47f, 23.82f, 17.36f)
                lineTo(22.82f, 15.63f)
                curveTo(22.76f, 15.5f, 22.63f, 15.5f, 22.5f, 15.5f)
                lineTo(21.27f, 16f)
                curveTo(21f, 15.82f, 20.73f, 15.65f, 20.42f, 15.53f)
                lineTo(20.23f, 14.21f)
                curveTo(20.22f, 14.09f, 20.11f, 14f, 20f, 14f)
                horizontalLineTo(18f)
                moveTo(19f, 17.5f)
                curveTo(19.83f, 17.5f, 20.5f, 18.17f, 20.5f, 19f)
                curveTo(20.5f, 19.83f, 19.83f, 20.5f, 19f, 20.5f)
                curveTo(18.16f, 20.5f, 17.5f, 19.83f, 17.5f, 19f)
                curveTo(17.5f, 18.17f, 18.17f, 17.5f, 19f, 17.5f)
                close()
            }
        }.build()

        return _FileCog!!
    }

@Suppress("ObjectPropertyName")
private var _FileCog: ImageVector? = null
