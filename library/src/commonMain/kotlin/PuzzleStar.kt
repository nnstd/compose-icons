package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PuzzleStar: ImageVector
    get() {
        if (_PuzzleStar != null) {
            return _PuzzleStar!!
        }
        _PuzzleStar = ImageVector.Builder(
            name = "PuzzleStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 20.09f)
                lineTo(21.45f, 21.58f)
                lineTo(20.8f, 18.77f)
                lineTo(23f, 16.89f)
                lineTo(20.11f, 16.64f)
                lineTo(19f, 14f)
                lineTo(17.87f, 16.64f)
                lineTo(15f, 16.89f)
                lineTo(17.18f, 18.77f)
                lineTo(16.5f, 21.58f)
                lineTo(19f, 20.09f)
                moveTo(23f, 13.5f)
                curveTo(23f, 13.5f, 23f, 13.5f, 23f, 13.53f)
                curveTo(21.94f, 12.58f, 20.54f, 12f, 19f, 12f)
                curveTo(15.69f, 12f, 13f, 14.69f, 13f, 18f)
                curveTo(13f, 18.34f, 13.04f, 18.67f, 13.09f, 19f)
                horizontalLineTo(12.75f)
                curveTo(12.27f, 18.27f, 11.44f, 17.8f, 10.5f, 17.8f)
                curveTo(9f, 17.8f, 7.8f, 19f, 7.8f, 20.5f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(16.2f)
                horizontalLineTo(3.5f)
                curveTo(5f, 16.2f, 6.2f, 15f, 6.2f, 13.5f)
                reflectiveCurveTo(5f, 10.8f, 3.5f, 10.8f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                curveTo(2f, 5.9f, 2.9f, 5f, 4f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(3.5f)
                curveTo(8f, 2.12f, 9.12f, 1f, 10.5f, 1f)
                reflectiveCurveTo(13f, 2.12f, 13f, 3.5f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                curveTo(18.1f, 5f, 19f, 5.89f, 19f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(20.5f)
                curveTo(21.88f, 11f, 23f, 12.12f, 23f, 13.5f)
                close()
            }
        }.build()

        return _PuzzleStar!!
    }

@Suppress("ObjectPropertyName")
private var _PuzzleStar: ImageVector? = null
