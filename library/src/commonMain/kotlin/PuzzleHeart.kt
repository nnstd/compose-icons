package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PuzzleHeart: ImageVector
    get() {
        if (_PuzzleHeart != null) {
            return _PuzzleHeart!!
        }
        _PuzzleHeart = ImageVector.Builder(
            name = "PuzzleHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 22.3f)
                lineTo(18.4f, 21.8f)
                curveTo(16.4f, 19.9f, 15f, 18.7f, 15f, 17.2f)
                curveTo(15f, 16f, 16f, 15f, 17.2f, 15f)
                curveTo(17.9f, 15f, 18.6f, 15.3f, 19f, 15.8f)
                curveTo(19.4f, 15.3f, 20.1f, 15f, 20.8f, 15f)
                curveTo(22f, 15f, 23f, 15.9f, 23f, 17.2f)
                curveTo(23f, 18.7f, 21.6f, 19.9f, 19.6f, 21.8f)
                lineTo(19f, 22.3f)
                moveTo(20.5f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                curveTo(19f, 5.89f, 18.1f, 5f, 17f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                curveTo(13f, 2.12f, 11.88f, 1f, 10.5f, 1f)
                reflectiveCurveTo(8f, 2.12f, 8f, 3.5f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                curveTo(2.9f, 5f, 2f, 5.9f, 2f, 7f)
                verticalLineTo(10.8f)
                horizontalLineTo(3.5f)
                curveTo(5f, 10.8f, 6.2f, 12f, 6.2f, 13.5f)
                reflectiveCurveTo(5f, 16.2f, 3.5f, 16.2f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(7.8f)
                verticalLineTo(20.5f)
                curveTo(7.8f, 19f, 9f, 17.8f, 10.5f, 17.8f)
                curveTo(11.44f, 17.8f, 12.27f, 18.27f, 12.75f, 19f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 18.67f, 13f, 18.34f, 13f, 18f)
                curveTo(13f, 14.69f, 15.69f, 12f, 19f, 12f)
                curveTo(20.54f, 12f, 21.94f, 12.58f, 23f, 13.53f)
                curveTo(23f, 13.5f, 23f, 13.5f, 23f, 13.5f)
                curveTo(23f, 12.12f, 21.88f, 11f, 20.5f, 11f)
                close()
            }
        }.build()

        return _PuzzleHeart!!
    }

@Suppress("ObjectPropertyName")
private var _PuzzleHeart: ImageVector? = null
