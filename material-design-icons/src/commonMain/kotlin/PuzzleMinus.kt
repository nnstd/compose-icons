package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PuzzleMinus: ImageVector
    get() {
        if (_PuzzleMinus != null) {
            return _PuzzleMinus!!
        }
        _PuzzleMinus = ImageVector.Builder(
            name = "PuzzleMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.04f, 19.61f)
                curveTo(12.67f, 18.55f, 11.68f, 17.8f, 10.5f, 17.8f)
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
                curveTo(23f, 13.82f, 22.94f, 14.12f, 22.83f, 14.39f)
                curveTo(21.79f, 13.53f, 20.46f, 13f, 19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
                curveTo(13f, 19.2f, 13f, 19.41f, 13.04f, 19.61f)
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _PuzzleMinus!!
    }

@Suppress("ObjectPropertyName")
private var _PuzzleMinus: ImageVector? = null
