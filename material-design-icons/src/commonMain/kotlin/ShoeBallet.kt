package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShoeBallet: ImageVector
    get() {
        if (_ShoeBallet != null) {
            return _ShoeBallet!!
        }
        _ShoeBallet = ImageVector.Builder(
            name = "ShoeBallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.78f, 11.97f)
                curveTo(12.27f, 8.54f, 10.86f, 2f, 7.53f, 2f)
                reflectiveCurveTo(2.8f, 8.54f, 2.28f, 11.97f)
                curveTo(2.07f, 13.42f, 2f, 14.89f, 2.16f, 16.35f)
                curveTo(2.5f, 19.39f, 3.55f, 20.84f, 4.27f, 21.5f)
                curveTo(4.64f, 21.83f, 5.11f, 22f, 5.6f, 22f)
                horizontalLineTo(9.47f)
                curveTo(9.96f, 22f, 10.43f, 21.83f, 10.8f, 21.5f)
                curveTo(11.5f, 20.84f, 12.55f, 19.39f, 12.91f, 16.35f)
                curveTo(13.08f, 14.89f, 13f, 13.42f, 12.78f, 11.97f)
                moveTo(7.53f, 4f)
                curveTo(7.89f, 3.87f, 8.59f, 4.73f, 9.27f, 6.31f)
                lineTo(4.58f, 10.33f)
                curveTo(5.41f, 6.26f, 6.94f, 3.79f, 7.53f, 4f)
                moveTo(9.75f, 13f)
                horizontalLineTo(5.31f)
                curveTo(5.1f, 13f, 4.92f, 12.92f, 4.76f, 12.81f)
                lineTo(10f, 8.33f)
                curveTo(10.29f, 9.35f, 10.56f, 10.5f, 10.75f, 11.83f)
                curveTo(10.84f, 12.44f, 10.37f, 13f, 9.75f, 13f)
                moveTo(21.78f, 11.97f)
                curveTo(21.27f, 8.54f, 19.86f, 2f, 16.53f, 2f)
                curveTo(15.04f, 2f, 13.94f, 3.32f, 13.13f, 5.08f)
                curveTo(13.5f, 6.04f, 13.84f, 7.14f, 14.13f, 8.37f)
                lineTo(19.31f, 12.81f)
                curveTo(19.15f, 12.92f, 18.97f, 13f, 18.75f, 13f)
                horizontalLineTo(14.92f)
                curveTo(15.04f, 14.27f, 15.03f, 15.45f, 14.89f, 16.59f)
                curveTo(14.62f, 18.87f, 14f, 20.45f, 13.32f, 21.53f)
                curveTo(13.68f, 21.84f, 14.13f, 22f, 14.6f, 22f)
                horizontalLineTo(18.47f)
                curveTo(18.96f, 22f, 19.43f, 21.83f, 19.8f, 21.5f)
                curveTo(20.5f, 20.84f, 21.55f, 19.39f, 21.91f, 16.35f)
                curveTo(22.08f, 14.89f, 22f, 13.42f, 21.78f, 11.97f)
                moveTo(14.8f, 6.31f)
                curveTo(15.5f, 4.73f, 16.18f, 3.87f, 16.53f, 4f)
                curveTo(17.13f, 3.79f, 18.65f, 6.26f, 19.5f, 10.33f)
                lineTo(14.8f, 6.31f)
                close()
            }
        }.build()

        return _ShoeBallet!!
    }

@Suppress("ObjectPropertyName")
private var _ShoeBallet: ImageVector? = null
