package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FootballAustralian: ImageVector
    get() {
        if (_FootballAustralian != null) {
            return _FootballAustralian!!
        }
        _FootballAustralian = ImageVector.Builder(
            name = "FootballAustralian",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 7.5f)
                curveTo(9.17f, 5.87f, 11.29f, 4.69f, 13.37f, 4.18f)
                curveTo(18f, 3f, 21f, 6f, 19.82f, 10.63f)
                curveTo(19.31f, 12.71f, 18.13f, 14.83f, 16.5f, 16.5f)
                curveTo(14.83f, 18.13f, 12.71f, 19.31f, 10.63f, 19.82f)
                curveTo(6f, 21f, 3f, 18f, 4.18f, 13.37f)
                curveTo(4.69f, 11.29f, 5.87f, 9.17f, 7.5f, 7.5f)
                moveTo(10.62f, 11.26f)
                lineTo(10.26f, 11.62f)
                lineTo(12.38f, 13.74f)
                lineTo(12.74f, 13.38f)
                lineTo(10.62f, 11.26f)
                moveTo(11.62f, 10.26f)
                lineTo(11.26f, 10.62f)
                lineTo(13.38f, 12.74f)
                lineTo(13.74f, 12.38f)
                lineTo(11.62f, 10.26f)
                moveTo(9.62f, 12.26f)
                lineTo(9.26f, 12.62f)
                lineTo(11.38f, 14.74f)
                lineTo(11.74f, 14.38f)
                lineTo(9.62f, 12.26f)
                moveTo(12.63f, 9.28f)
                lineTo(12.28f, 9.63f)
                lineTo(14.4f, 11.75f)
                lineTo(14.75f, 11.4f)
                lineTo(12.63f, 9.28f)
                moveTo(8.63f, 13.28f)
                lineTo(8.28f, 13.63f)
                lineTo(10.4f, 15.75f)
                lineTo(10.75f, 15.4f)
                lineTo(8.63f, 13.28f)
                moveTo(13.63f, 8.28f)
                lineTo(13.28f, 8.63f)
                lineTo(15.4f, 10.75f)
                lineTo(15.75f, 10.4f)
                lineTo(13.63f, 8.28f)
                close()
            }
        }.build()

        return _FootballAustralian!!
    }

@Suppress("ObjectPropertyName")
private var _FootballAustralian: ImageVector? = null
