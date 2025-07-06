package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCog: ImageVector
    get() {
        if (_AccountCog != null) {
            return _AccountCog!!
        }
        _AccountCog = ImageVector.Builder(
            name = "AccountCog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
                moveTo(17f, 12f)
                curveTo(16.87f, 12f, 16.76f, 12.09f, 16.74f, 12.21f)
                lineTo(16.55f, 13.53f)
                curveTo(16.25f, 13.66f, 15.96f, 13.82f, 15.7f, 14f)
                lineTo(14.46f, 13.5f)
                curveTo(14.35f, 13.5f, 14.22f, 13.5f, 14.15f, 13.63f)
                lineTo(13.15f, 15.36f)
                curveTo(13.09f, 15.47f, 13.11f, 15.6f, 13.21f, 15.68f)
                lineTo(14.27f, 16.5f)
                curveTo(14.25f, 16.67f, 14.24f, 16.83f, 14.24f, 17f)
                curveTo(14.24f, 17.17f, 14.25f, 17.33f, 14.27f, 17.5f)
                lineTo(13.21f, 18.32f)
                curveTo(13.12f, 18.4f, 13.09f, 18.53f, 13.15f, 18.64f)
                lineTo(14.15f, 20.37f)
                curveTo(14.21f, 20.5f, 14.34f, 20.5f, 14.46f, 20.5f)
                lineTo(15.7f, 20f)
                curveTo(15.96f, 20.18f, 16.24f, 20.35f, 16.55f, 20.47f)
                lineTo(16.74f, 21.79f)
                curveTo(16.76f, 21.91f, 16.86f, 22f, 17f, 22f)
                horizontalLineTo(19f)
                curveTo(19.11f, 22f, 19.22f, 21.91f, 19.24f, 21.79f)
                lineTo(19.43f, 20.47f)
                curveTo(19.73f, 20.34f, 20f, 20.18f, 20.27f, 20f)
                lineTo(21.5f, 20.5f)
                curveTo(21.63f, 20.5f, 21.76f, 20.5f, 21.83f, 20.37f)
                lineTo(22.83f, 18.64f)
                curveTo(22.89f, 18.53f, 22.86f, 18.4f, 22.77f, 18.32f)
                lineTo(21.7f, 17.5f)
                curveTo(21.72f, 17.33f, 21.74f, 17.17f, 21.74f, 17f)
                curveTo(21.74f, 16.83f, 21.73f, 16.67f, 21.7f, 16.5f)
                lineTo(22.76f, 15.68f)
                curveTo(22.85f, 15.6f, 22.88f, 15.47f, 22.82f, 15.36f)
                lineTo(21.82f, 13.63f)
                curveTo(21.76f, 13.5f, 21.63f, 13.5f, 21.5f, 13.5f)
                lineTo(20.27f, 14f)
                curveTo(20f, 13.82f, 19.73f, 13.65f, 19.42f, 13.53f)
                lineTo(19.23f, 12.21f)
                curveTo(19.22f, 12.09f, 19.11f, 12f, 19f, 12f)
                horizontalLineTo(17f)
                moveTo(10f, 14f)
                curveTo(5.58f, 14f, 2f, 15.79f, 2f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(11.68f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 17f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.64f, 14.09f)
                curveTo(11.11f, 14.03f, 10.56f, 14f, 10f, 14f)
                moveTo(18f, 15.5f)
                curveTo(18.83f, 15.5f, 19.5f, 16.17f, 19.5f, 17f)
                curveTo(19.5f, 17.83f, 18.83f, 18.5f, 18f, 18.5f)
                curveTo(17.16f, 18.5f, 16.5f, 17.83f, 16.5f, 17f)
                curveTo(16.5f, 16.17f, 17.17f, 15.5f, 18f, 15.5f)
                close()
            }
        }.build()

        return _AccountCog!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCog: ImageVector? = null
