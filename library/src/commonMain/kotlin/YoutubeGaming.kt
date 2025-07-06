package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.YoutubeGaming: ImageVector
    get() {
        if (_YoutubeGaming != null) {
            return _YoutubeGaming!!
        }
        _YoutubeGaming = ImageVector.Builder(
            name = "YoutubeGaming",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                verticalLineTo(8f)
                lineTo(17f, 5f)
                lineTo(12f, 8f)
                lineTo(7f, 5f)
                lineTo(2f, 8f)
                verticalLineTo(13f)
                lineTo(12f, 19f)
                lineTo(22f, 13f)
                moveTo(9f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                moveTo(15f, 13f)
                curveTo(14.45f, 13f, 14f, 12.55f, 14f, 12f)
                reflectiveCurveTo(14.45f, 11f, 15f, 11f)
                reflectiveCurveTo(16f, 11.45f, 16f, 12f)
                reflectiveCurveTo(15.55f, 13f, 15f, 13f)
                moveTo(18f, 11f)
                curveTo(17.45f, 11f, 17f, 10.55f, 17f, 10f)
                reflectiveCurveTo(17.45f, 9f, 18f, 9f)
                reflectiveCurveTo(19f, 9.45f, 19f, 10f)
                reflectiveCurveTo(18.55f, 11f, 18f, 11f)
                close()
            }
        }.build()

        return _YoutubeGaming!!
    }

@Suppress("ObjectPropertyName")
private var _YoutubeGaming: ImageVector? = null
