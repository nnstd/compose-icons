package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PuzzleStarOutline: ImageVector
    get() {
        if (_PuzzleStarOutline != null) {
            return _PuzzleStarOutline!!
        }
        _PuzzleStarOutline = ImageVector.Builder(
            name = "PuzzleStarOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.2f, 22f)
                verticalLineTo(21.7f)
                curveTo(13.2f, 20.21f, 12f, 19f, 10.5f, 19f)
                curveTo(9f, 19f, 7.8f, 20.21f, 7.8f, 21.7f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(16.2f)
                horizontalLineTo(2.3f)
                curveTo(3.79f, 16.2f, 5f, 15f, 5f, 13.5f)
                reflectiveCurveTo(3.79f, 10.8f, 2.3f, 10.8f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                curveTo(2f, 5.9f, 2.9f, 5f, 4f, 5f)
                horizontalLineTo(7.04f)
                curveTo(7.28f, 3.3f, 8.74f, 2f, 10.5f, 2f)
                reflectiveCurveTo(13.72f, 3.3f, 13.96f, 5f)
                horizontalLineTo(17f)
                curveTo(18.11f, 5f, 19f, 5.9f, 19f, 7f)
                verticalLineTo(10.04f)
                curveTo(20.45f, 10.25f, 21.61f, 11.34f, 21.91f, 12.76f)
                curveTo(21.05f, 12.28f, 20.06f, 12f, 19f, 12f)
                curveTo(18.89f, 12f, 18.78f, 12f, 18.67f, 12f)
                curveTo(18.61f, 12f, 18.56f, 12f, 18.5f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(5.5f)
                curveTo(12f, 4.67f, 11.33f, 4f, 10.5f, 4f)
                reflectiveCurveTo(9f, 4.67f, 9f, 5.5f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(9.12f)
                curveTo(5.76f, 9.8f, 7f, 11.5f, 7f, 13.5f)
                reflectiveCurveTo(5.75f, 17.2f, 4f, 17.88f)
                verticalLineTo(20f)
                horizontalLineTo(6.12f)
                curveTo(6.8f, 18.25f, 8.5f, 17f, 10.5f, 17f)
                curveTo(11.43f, 17f, 12.29f, 17.28f, 13f, 17.74f)
                curveTo(13f, 17.83f, 13f, 17.91f, 13f, 18f)
                curveTo(13f, 19.54f, 13.58f, 20.94f, 14.54f, 22f)
                horizontalLineTo(13.2f)
                moveTo(19f, 20.09f)
                lineTo(16.5f, 21.58f)
                lineTo(17.18f, 18.77f)
                lineTo(15f, 16.89f)
                lineTo(17.87f, 16.64f)
                lineTo(19f, 14f)
                lineTo(20.11f, 16.64f)
                lineTo(23f, 16.89f)
                lineTo(20.8f, 18.77f)
                lineTo(21.45f, 21.58f)
                lineTo(19f, 20.09f)
            }
        }.build()

        return _PuzzleStarOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PuzzleStarOutline: ImageVector? = null
