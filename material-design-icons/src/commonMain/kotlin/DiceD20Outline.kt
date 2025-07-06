package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiceD20Outline: ImageVector
    get() {
        if (_DiceD20Outline != null) {
            return _DiceD20Outline!!
        }
        _DiceD20Outline = ImageVector.Builder(
            name = "DiceD20Outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16.5f)
                curveTo(21f, 16.88f, 20.79f, 17.21f, 20.47f, 17.38f)
                lineTo(12.57f, 21.82f)
                curveTo(12.41f, 21.94f, 12.21f, 22f, 12f, 22f)
                curveTo(11.79f, 22f, 11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(3.53f, 17.38f)
                curveTo(3.21f, 17.21f, 3f, 16.88f, 3f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3f, 7.12f, 3.21f, 6.79f, 3.53f, 6.62f)
                lineTo(11.43f, 2.18f)
                curveTo(11.59f, 2.06f, 11.79f, 2f, 12f, 2f)
                curveTo(12.21f, 2f, 12.41f, 2.06f, 12.57f, 2.18f)
                lineTo(20.47f, 6.62f)
                curveTo(20.79f, 6.79f, 21f, 7.12f, 21f, 7.5f)
                verticalLineTo(16.5f)
                moveTo(12f, 4.15f)
                lineTo(5f, 8.09f)
                verticalLineTo(15.91f)
                lineTo(12f, 19.85f)
                lineTo(19f, 15.91f)
                verticalLineTo(8.09f)
                lineTo(12f, 4.15f)
                moveTo(14.93f, 8.27f)
                arcTo(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 10.84f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 14.9f, 16.35f, 16.05f, 14.93f, 16.05f)
                curveTo(13.5f, 16.05f, 12.36f, 14.9f, 12.36f, 13.5f)
                verticalLineTo(10.84f)
                arcTo(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.93f, 8.27f)
                moveTo(14.92f, 9.71f)
                curveTo(14.34f, 9.71f, 13.86f, 10.18f, 13.86f, 10.77f)
                verticalLineTo(13.53f)
                curveTo(13.86f, 14.12f, 14.34f, 14.6f, 14.92f, 14.6f)
                curveTo(15.5f, 14.6f, 16f, 14.12f, 16f, 13.53f)
                verticalLineTo(10.77f)
                curveTo(16f, 10.18f, 15.5f, 9.71f, 14.92f, 9.71f)
                moveTo(11.45f, 14.76f)
                verticalLineTo(15.96f)
                lineTo(6.31f, 15.93f)
                verticalLineTo(14.91f)
                curveTo(6.31f, 14.91f, 9.74f, 11.58f, 9.75f, 10.57f)
                curveTo(9.75f, 9.33f, 8.73f, 9.46f, 8.73f, 9.46f)
                curveTo(8.73f, 9.46f, 7.75f, 9.5f, 7.64f, 10.71f)
                lineTo(6.14f, 10.76f)
                curveTo(6.14f, 10.76f, 6.18f, 8.26f, 8.83f, 8.26f)
                curveTo(11.2f, 8.26f, 11.23f, 10.04f, 11.23f, 10.5f)
                curveTo(11.23f, 12.18f, 8.15f, 14.77f, 8.15f, 14.77f)
                lineTo(11.45f, 14.76f)
                close()
            }
        }.build()

        return _DiceD20Outline!!
    }

@Suppress("ObjectPropertyName")
private var _DiceD20Outline: ImageVector? = null
