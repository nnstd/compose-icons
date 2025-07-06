package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.YoutubeStudio: ImageVector
    get() {
        if (_YoutubeStudio != null) {
            return _YoutubeStudio!!
        }
        _YoutubeStudio = ImageVector.Builder(
            name = "YoutubeStudio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 15f)
                lineTo(15f, 12f)
                lineTo(10f, 9f)
                verticalLineTo(15f)
                moveTo(19.45f, 13f)
                lineTo(21.56f, 14.63f)
                curveTo(21.78f, 14.78f, 21.81f, 15f, 21.66f, 15.28f)
                lineTo(19.64f, 18.75f)
                curveTo(19.5f, 18.97f, 19.31f, 19.03f, 19.03f, 18.94f)
                lineTo(16.55f, 17.95f)
                curveTo(15.89f, 18.42f, 15.33f, 18.75f, 14.86f, 18.94f)
                lineTo(14.5f, 21.56f)
                curveTo(14.42f, 21.84f, 14.27f, 22f, 14f, 22f)
                horizontalLineTo(10f)
                curveTo(9.73f, 22f, 9.58f, 21.84f, 9.5f, 21.56f)
                lineTo(9.14f, 18.94f)
                curveTo(8.55f, 18.69f, 8f, 18.36f, 7.45f, 17.95f)
                lineTo(4.97f, 18.94f)
                curveTo(4.69f, 19.03f, 4.5f, 18.97f, 4.36f, 18.75f)
                lineTo(2.34f, 15.28f)
                curveTo(2.19f, 15f, 2.22f, 14.78f, 2.44f, 14.63f)
                lineTo(4.55f, 13f)
                curveTo(4.5f, 12.77f, 4.5f, 12.44f, 4.5f, 12f)
                curveTo(4.5f, 11.56f, 4.5f, 11.23f, 4.55f, 11f)
                lineTo(2.44f, 9.38f)
                curveTo(2.22f, 9.22f, 2.19f, 9f, 2.34f, 8.72f)
                lineTo(4.36f, 5.25f)
                curveTo(4.5f, 5.03f, 4.69f, 4.97f, 4.97f, 5.06f)
                lineTo(7.45f, 6.05f)
                curveTo(8.11f, 5.58f, 8.67f, 5.25f, 9.14f, 5.06f)
                lineTo(9.5f, 2.44f)
                curveTo(9.58f, 2.16f, 9.73f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(14.27f, 2f, 14.42f, 2.16f, 14.5f, 2.44f)
                lineTo(14.86f, 5.06f)
                curveTo(15.45f, 5.31f, 16f, 5.64f, 16.55f, 6.05f)
                lineTo(19.03f, 5.06f)
                curveTo(19.31f, 4.97f, 19.5f, 5.03f, 19.64f, 5.25f)
                lineTo(21.66f, 8.72f)
                curveTo(21.81f, 9f, 21.78f, 9.22f, 21.56f, 9.38f)
                lineTo(19.45f, 11f)
                curveTo(19.5f, 11.23f, 19.5f, 11.56f, 19.5f, 12f)
                curveTo(19.5f, 12.44f, 19.5f, 12.77f, 19.45f, 13f)
                close()
            }
        }.build()

        return _YoutubeStudio!!
    }

@Suppress("ObjectPropertyName")
private var _YoutubeStudio: ImageVector? = null
